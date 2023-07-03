package wang.skycloud.JWTEA.Client.PreRequest.Cipher;

import wang.skycloud.JWTEA.Client.Enum.EncryptAlgorithms;
import wang.skycloud.JWTEA.Client.Enum.SignatureAlgorithms;

public class CipherAssigner {
    public static IEncryptCipher assignEncrypt(EncryptAlgorithms algorithm) {
        //TODO: assignEncrypt not implemented created at 2023/7/3 17:07
        throw new RuntimeException("assignEncrypt not implemented");
    }
    public static ISignCipher assignSigner(SignatureAlgorithms algorithms)
    {
        //TODO: assignSigner not implemented created at 2023/7/3 17:07
        throw new RuntimeException("assignSigner not implemented");
    }
}
