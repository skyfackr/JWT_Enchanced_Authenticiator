package wang.skycloud.JWTEA.Client.PreRequest.Exceptions;

import lombok.RequiredArgsConstructor;
import wang.skycloud.JWTEA.Client.PreRequest.PreRequestPayload;

/**
 * payload包含空字段异常
 *
 * @author sky
 * @date 2023/07/14
 * @see wang.skycloud.JWTEA.Client.PreRequest.PreRequestPayload,wang.skycloud.JWTEA.Client.PreRequest.PayloadId
 */
public class PayloadContainsNullException extends PreRequestException{
    private final PreRequestPayload payload;


    public PayloadContainsNullException(PreRequestPayload payload)
    {
        super(payload.toString());
        this.payload = payload;
    }
}
