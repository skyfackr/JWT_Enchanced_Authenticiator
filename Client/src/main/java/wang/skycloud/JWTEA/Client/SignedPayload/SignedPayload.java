package wang.skycloud.JWTEA.Client.SignedPayload;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * 已签名的请求 由{@link wang.skycloud.JWTEA.Client.PreRequest.PreRequestPayload}生成
 *
 * @author sky
 * @date 2023/07/03
 */
@Getter
@ToString
@NonNull
public record SignedPayload(
        String version,
        String id,
        String serverRSAPublicKeyId,
        String idEncryptAlgorithm,
        int salt,
        String timestamp,
        String signAlgorithm,
        String signature
        ) {
}
