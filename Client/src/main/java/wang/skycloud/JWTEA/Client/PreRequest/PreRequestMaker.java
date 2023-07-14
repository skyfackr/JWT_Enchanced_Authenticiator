package wang.skycloud.JWTEA.Client.PreRequest;

import wang.skycloud.JWTEA.Client.Enum.EncryptAlgorithms;
import wang.skycloud.JWTEA.Client.Enum.SignatureAlgorithms;

import java.util.Date;

/**
 * 预请求制造器
 *
 * @author sky
 * @date 2023/07/14
 * @see PreRequestPayload,PreRequestPackager,PayloadId
 */
public class PreRequestMaker {
    public static PreRequestPayload create(){
        return new PreRequestPayload(new PayloadId());
    }
    public static PreRequestPayload makePreRequest(
            String clientRSAPublicKey,
            String credential,
            String clientRSAPrivateKey,
            String serverRSAPublicKeyId,
            String serverRSAPublicKey,
            EncryptAlgorithms idEncryptAlgorithm,
            int salt,
            Date timestamp,
            SignatureAlgorithms signAlgorithm
    ){
        PreRequestPayload payload=create();
        PayloadId id = payload.getId();

        id.setCredential(credential);
        id.setClientRSAPublicKey(clientRSAPublicKey);
        id.setClientRSAPrivateKey(clientRSAPrivateKey);

        payload.setServerRSAId(serverRSAPublicKeyId);
        payload.setServerRSA(serverRSAPublicKey);
        payload.setIdAlgo(idEncryptAlgorithm);
        payload.setSalt(salt);
        payload.setTimestamp(timestamp);
        payload.setSignAlgo(signAlgorithm);

        return payload;
    }
    public static PreRequestPayload makePreRequestWithCurrentTime(
            String clientRSAPublicKey,
            String credential,
            String clientRSAPrivateKey,
            String serverRSAPublicKeyId,
            String serverRSAPublicKey,
            EncryptAlgorithms idEncryptAlgorithm,
            int salt,
            SignatureAlgorithms signAlgorithm
    ){
        PreRequestPayload payload = makePreRequest(
                clientRSAPublicKey,
                credential,
                clientRSAPrivateKey,
                serverRSAPublicKeyId,
                serverRSAPublicKey,
                idEncryptAlgorithm,
                salt,
                null,
                signAlgorithm
        );
        payload.setCurrentTimeAsStamp();
        return payload;
    }
    
}
