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
package spec.sdk.runtime.v1.domain.sequencer;

public class SequencerOptions {

    private AutoIncrement option;

    public AutoIncrement getOption() {
        return option;
    }

    public enum AutoIncrement {
        WEAK(0),
        STRONG(1);
        private final Integer value;

        AutoIncrement(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    public void setOption(AutoIncrement option) {
        this.option = option;
    }
}
