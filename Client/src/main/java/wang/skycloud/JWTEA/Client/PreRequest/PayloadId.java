package wang.skycloud.JWTEA.Client.PreRequest;

import lombok.*;

import java.util.Objects;

/**
 * 有效负载id
 * <br>
 * see {@link PreRequestPayload#id}
 *
 * @author sky
 * @date 2023/07/03
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PayloadId {
    /**
     * 客户端rsa public
     */
    private String clientRSAPublicKey;
    /**
     * 自定义凭证
     */
    private String credential;

    /**
     * 获得{@link PayloadId#credential} 如果为空则返回"EMPTY"
     *
     * @return {@link String}
     */
    public String getCredential() {
        return (!Objects.isNull(credential)&&!credential.isBlank())?credential:"EMPTY";
    }
}
