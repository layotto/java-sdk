package io.mosn.layotto.springboot;

import io.mosn.layotto.v1.RuntimeClientBuilder;
import io.mosn.layotto.v1.Sequencer;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.sequencer.GetNextIdRequest;
import spec.sdk.runtime.v1.domain.sequencer.SequencerOptions;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class LayottoBeanPostProcessorSequencer implements BeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(LayottoBeanPostProcessorSequencer.class.getName());

    private final EmbeddedValueResolver embeddedValueResolver;
    @Autowired
    private static LayottoProperties layottoConfig;


    LayottoBeanPostProcessorSequencer(ConfigurableBeanFactory beanFactory) {
        embeddedValueResolver = new EmbeddedValueResolver(beanFactory);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        try {
            sequencer(bean.getClass(), bean, embeddedValueResolver);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return bean;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }

    private static void sequencer(Class clazz, Object bean, EmbeddedValueResolver embeddedValueResolver) throws InvocationTargetException, IllegalAccessException {
        if (clazz == null) {
            return;
        }
        sequencer(clazz.getSuperclass(), bean, embeddedValueResolver);
        for (Method method : clazz.getDeclaredMethods()) {
            Sequencer getsequencer = method.getAnnotation(Sequencer.class);
            if (getsequencer == null) {
                continue;
            }
            String storeName = embeddedValueResolver.resolveStringValue(getsequencer.storeName());
            String key = embeddedValueResolver.resolveStringValue(getsequencer.key());
            String options = embeddedValueResolver.resolveStringValue(getsequencer.options());
            if (StringUtils.isNotEmpty(storeName) && StringUtils.isNotEmpty(key)&& StringUtils.isNotEmpty(options)) {

                RuntimeClient layottoRuntime = new RuntimeClientBuilder().withIp(layottoConfig.DEFAULT_IP).
                        withPort(layottoConfig.DEFAULT_PORT)
                        .build();
                GetNextIdRequest getNextIdRequest = new GetNextIdRequest();
                getNextIdRequest.setStoreName(storeName);
                getNextIdRequest.setKey(key);

                SequencerOptions anoptions = new SequencerOptions();
                if(options.equals("STRONG") )
                    anoptions.setOption(SequencerOptions.AutoIncrement.STRONG);
                else if(options.equals("WEAK"))
                    anoptions.setOption(SequencerOptions.AutoIncrement.WEAK);
                getNextIdRequest.setOptions(anoptions);

                long nextId = layottoRuntime.getNextId(getNextIdRequest).getNextId();
                try {
                    method.invoke(bean, nextId);
                } catch (Exception e) {
                    LOGGER.error("layotto sequencer method [{}] err:{ }", method.getName(), e.getMessage());
                    throw e;
                }
                LOGGER.info("NextID:{},options:{}", nextId,options);
            }
        }
    }
}
