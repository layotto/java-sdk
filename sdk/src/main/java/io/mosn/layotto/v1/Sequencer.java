
package io.mosn.layotto.v1;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Sequencer {
    String storeName();

    String key();

    String options();
}