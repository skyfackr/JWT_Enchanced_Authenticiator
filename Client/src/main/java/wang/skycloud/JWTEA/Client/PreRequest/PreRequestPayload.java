package wang.skycloud.JWTEA.Client.PreRequest;

import lombok.*;
import wang.skycloud.JWTEA.Client.Enum.EncryptAlgorithms;
import wang.skycloud.JWTEA.Client.Enum.SignatureAlgorithms;
import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.PayloadContainsNullException;

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
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
@EqualsAndHashCode
public class PreRequestPayload {
    /**
     * 版本
     */
    private final String version="1.0";
    /**
     * id（加密区域）
     */
    @NonNull
    private final PayloadId id;
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
     * 验证有效载荷
     * 验证payload是否为空
     *
     * @throws PayloadContainsNullException 有效负载包含空
     */
    void verifyPayload() throws PayloadContainsNullException
    {
        if (!isPayloadFulfilled()) throw new PayloadContainsNullException(this);
    }

    /**
     * 设置当前时间戳
     */
    void setCurrentTimeAsStamp()
    {
        //TODO: setCurrentTimeAsStamp not implemented created at 2023/7/14 15:53
        throw new RuntimeException("setCurrentTimeAsStamp not implemented");
    }

    /**
     * payload是否已经填充完毕
     *
     * @return boolean
     */
    public boolean isPayloadFulfilled()
    {
        //TODO: isPayloadFulfilled not implemented created at 2023/7/14 16:16
        throw new RuntimeException("isPayloadFulfilled not implemented");
    }
}
