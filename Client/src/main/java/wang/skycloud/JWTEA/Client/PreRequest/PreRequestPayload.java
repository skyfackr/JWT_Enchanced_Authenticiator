package wang.skycloud.JWTEA.Client.PreRequest;

import lombok.*;
import lombok.experimental.FieldNameConstants;
import wang.skycloud.JWTEA.Client.Enum.EncryptAlgorithms;
import wang.skycloud.JWTEA.Client.Enum.SignatureAlgorithms;
import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.PayloadContainsNullException;
import wang.skycloud.JWTEA.Client.SignedPayload.SignedPayload;

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
     * 这是一个assert方法，验证失败会抛出异常，通过则会返回自身
     *
     * @throws PayloadContainsNullException 有效负载包含空
     */
    public PreRequestPayload verifyPayload() throws PayloadContainsNullException
    {
        if (!isPayloadFulfilled()) throw new PayloadContainsNullException(this);
        return this;
    }

    /**
     * 设置时间戳为调用时间
     */
    public void setCurrentTimeAsStamp()
    {
        this.setTimestamp(new Date());
    }

    /**
     * payload是否已经填充完毕
     *
     * @return boolean
     */
    @SuppressWarnings("ConstantValue")
    public boolean isPayloadFulfilled()
    {
        //check non null
        if (
                getVersion()==null||
                        getId()==null||
                        getServerRSAId()==null||
                        getServerRSA()==null||
                        getIdAlgo()==null||
                        getSalt()==0||
                        getTimestamp()==null||
                        getSignAlgo()==null
        ) return false;
        //check string non empty and non blank
        if (

                getVersion().isBlank()||
                        getServerRSAId().isBlank() ||
                        getServerRSA().isBlank()
        ) return false;
        //check id non null
        if (
                id.getClientRSAPublicKey() == null ||
                        id.getCredential() == null ||
                        id.getClientRSAPrivateKey() == null
        ) return false;
        //check id string non empty and non blank
        if (
                id.getClientRSAPublicKey().isBlank() ||
                        id.getCredential().isBlank() ||
                        id.getClientRSAPrivateKey().isBlank()
        ) return false;
        return true;
    }
}
