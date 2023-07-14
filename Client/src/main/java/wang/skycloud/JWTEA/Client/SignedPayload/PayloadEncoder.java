package wang.skycloud.JWTEA.Client.SignedPayload;

/**
 * 将{@link SignedPayload}编码为标准可发送请求
 *
 * @author sky
 * @date 2023/07/03
 */
public class PayloadEncoder {
    private static final String encoding= "UTF-8";
    /**
     * 编码为可发送的请求
     *
     * @param payload 有效载荷
     * @return {@link String}
     */
    public static String encode(SignedPayload payload) {
        //TODO: encode not implemented created at 2023/7/3 17:31
        throw new RuntimeException("encode not implemented");
    }
}
