package wang.skycloud.JWTEA.Client.PreRequest;

import lombok.*;
import wang.skycloud.JWTEA.Client.Enum.EncryptAlgorithms;
import wang.skycloud.JWTEA.Client.Enum.SignatureAlgorithms;

import java.util.Date;

/**
 * 预请求有效负载存储
 * <br>
 * 参考request template
 *
 * @author sky
 * @date 2023/07/03
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PreRequestPayload {
    /**
     * 版本
     */
    private String version;
    /**
     * id（加密区域）
     */
    private PayloadId id;
    /**
     * 服务器rsaid
     */
    private String serverRSAId;

    /**
     * 服务器rsa
     */
    private String serverRSA;
    /**
     * id加密算法
     */
    private EncryptAlgorithms idAlgo;
    /**
     * 随机数
     */
    private int salt;
    /**
     * 时间戳
     */
    private Date timestamp;
    /**
     * 签名算法
     */
    private SignatureAlgorithms signAlgo;

    /**
     * 验证payload是否为空
     *
     *
     */
    void verifyPayload()
    {
        //TODO: verifyPayload not implemented created at 2023/7/3 16:26
        throw new RuntimeException("verifyPayload not implemented");
    }
}
