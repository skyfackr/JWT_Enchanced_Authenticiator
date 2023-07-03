package wang.skycloud.JWTEA.Client.PreRequest.Cipher;

import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.ClientKeyNotPairException;
import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.InvalidClientKeyException;
import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.InvalidServerKeyException;

/**
 * 加密组件接口
 *
 * @author sky
 * @date 2023/07/03
 */
public interface ICipher {
    /**
     * 加载客户端密钥
     *
     * @param pubKey 公钥
     * @param priKey 密钥
     * @throws InvalidClientKeyException 无效客户端密钥异常
     * @throws ClientKeyNotPairException 客户端密钥不配对异常
     */
    void loadClientKey(String pubKey,String priKey) throws InvalidClientKeyException, ClientKeyNotPairException;

    /**
     * 加载服务器密钥
     *
     * @param pubKey 公钥
     * @throws InvalidServerKeyException 无效服务器密钥异常
     */
    void loadServerKey(String pubKey) throws InvalidServerKeyException;

    /**
     * 加密 使用{@link wang.skycloud.JWTEA.Client.PreRequest.PayloadId#clientRSAPrivateKey}
     *
     * @param payload 加密文本 需要提前按照规范转换 不会检测格式
     * @return {@link String}
     */
    @SuppressWarnings("JavadocReference")
    String encrypt(String payload);

    /**
     * 签名 使用{@link wang.skycloud.JWTEA.Client.PreRequest.PreRequestPayload#serverRSA}
     *
     * @param payload 加密文本 需要提前按照规范转换 不会检测格式
     * @return {@link String}
     */
    @SuppressWarnings("JavadocReference")
    String sign(String payload);
}
