package spec.sdk.runtime.v1.domain;

import spec.sdk.runtime.v1.domain.secret.GetBulkSecretRequest;
import spec.sdk.runtime.v1.domain.secret.GetBulkSecretResponse;
import spec.sdk.runtime.v1.domain.secret.GetSecretRequest;
import spec.sdk.runtime.v1.domain.secret.GetSecretResponse;

public interface SecretRuntime {

    GetSecretResponse getSecret(GetSecretRequest req);

    GetBulkSecretResponse getBulkSecret(GetBulkSecretRequest req);
}
