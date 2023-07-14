package wang.skycloud.JWTEA.Client.PreRequest;

import wang.skycloud.JWTEA.Client.SignedPayload.SignedPayload;

/**
 * 预请求打包器 打包为{@link SignedPayload}
 *
 * @author sky
 * @date 2023/07/14
 */
public class PreRequestPackager {
    private final PreRequestPayload payload;

    private PreRequestPackager(PreRequestPayload payload) {
        this.payload = payload;
    }

    public static SignedPayload packPreRequest(PreRequestPayload payload) {
        PreRequestPackager packager=new PreRequestPackager(payload);
        //TODO: packagePreRequest not implemented created at 2023/7/14 15:35
        throw new RuntimeException("packagePreRequest not implemented");
    }
}
