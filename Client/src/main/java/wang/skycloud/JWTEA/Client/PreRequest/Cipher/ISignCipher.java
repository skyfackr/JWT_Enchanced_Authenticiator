package wang.skycloud.JWTEA.Client.PreRequest.Cipher;

import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.InvalidServerKeyException;

/**
 * 签名组件接口
 *
 * @author sky
 * @date 2023/07/03
 */
public interface ISignCipher {
    /**
     * 签名 使用{@link wang.skycloud.JWTEA.Client.PreRequest.PreRequestPayload#serverRSA}
     *
     * @param payload 加密文本 需要提前按照规范转换 不会检测格式
     * @return {@link String}
     */
    @SuppressWarnings("JavadocReference")
    String sign(String payload);
    /**
     * 加载服务器密钥
     *
     * @param pubKey 公钥
     * @throws InvalidServerKeyException 无效服务器密钥异常
     */
    void loadServerKey(String pubKey) throws InvalidServerKeyException;
}
