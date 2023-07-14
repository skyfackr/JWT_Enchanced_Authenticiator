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
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
@EqualsAndHashCode
public class PayloadId {
    /**
     * 客户端rsa public
     */
    private String clientRSAPublicKey;
    /**
     * 自定义凭证
     * 设计上这个字段可以为空。然而在目前的构建中，这个字段是必须的。因此在为空时，getter会返回"EMPTY"字符串
     */
    @EqualsAndHashCode.Exclude
    private String credential;
    /**
     * 客户端rsa private密钥
     */
    private String clientRSAPrivateKey;

    /**
     * 获得{@link PayloadId#credential} 如果为空则返回"EMPTY"
     *
     * @return {@link String}
     */
    @EqualsAndHashCode.Include
    public String getCredential() {
        return (!Objects.isNull(credential)&&!credential.isBlank())?credential:"EMPTY";
    }
}
