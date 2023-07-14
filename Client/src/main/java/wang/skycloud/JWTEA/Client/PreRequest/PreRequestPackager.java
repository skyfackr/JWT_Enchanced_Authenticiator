package wang.skycloud.JWTEA.Client.PreRequest;

import wang.skycloud.JWTEA.Client.PreRequest.Exceptions.PreRequestException;
import wang.skycloud.JWTEA.Client.SignedPayload.SignedPayload;

/**
 * 预请求打包器 打包为{@link SignedPayload}
 *
 * @author sky
 * @date 2023/07/14
 */
public class PreRequestPackager {
    /**
     * 有效载荷
     */
    private final PreRequestPayload payload;

    /**
     * 预请求打包器
     *
     * @param payload 有效载荷
     */
    private PreRequestPackager(PreRequestPayload payload) {
        this.payload = payload;
    }

    /**
     * 包装预请求
     * 将{@link PreRequestPayload}加密以及签名，并封装为{@link SignedPayload}
     *
     * @param payload 已经完成所有数据填充的payload 未完成会导致报错
     * @return {@link SignedPayload}
     * @throws PreRequestException 打包出现异常
     */
    public static SignedPayload packPreRequest(PreRequestPayload payload)throws PreRequestException {
        PreRequestPackager packager=new PreRequestPackager(payload);
        //TODO : packagePreRequest not implemented created at 2023/7/14 15:35
        throw new RuntimeException("packagePreRequest not implemented");
    }
}
