/*
 * Copyright 2021 Layotto Authors
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mosn.layotto.examples.uds;

import io.grpc.netty.shaded.io.netty.channel.unix.DomainSocketAddress;
import io.mosn.layotto.v1.RuntimeClientBuilder;
import spec.sdk.runtime.v1.client.RuntimeClient;

public class Demo {

    public static void main(String[] args) {
        DomainSocketAddress udsAddress = new DomainSocketAddress("/tmp/client-proxy.sock");
        RuntimeClient client = new RuntimeClientBuilder()
            .withUdsSocket(udsAddress)
            .build();

        String resp = client.sayHello("helloworld");
        if (!"greeting, helloworld".equals(resp)) {
            throw new RuntimeException("Unexpected result:" + resp);
        }
        System.out.println(resp);
    }
}
