package wang.skycloud.JWTEA.Client;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.Arrays;

/**
 * 常量
 *
 * @author sky
 * @date 2023/07/03
 */
@Getter
public class Constant {
    /**
     * 客户端版本
     */
    @Getter
    private static final String CTVER="0.1";
    /**
     * 支持请求版本
     */
    private static final String[] Supported_Request_Version=new String[]{"1.0"};

    /**
     * 获取支持请求版本
     *
     * @return {@link Iterable}<{@link String}>
     */
    public static Iterable<String> getSupported_Request_Version() {
        return Arrays.stream(Supported_Request_Version).toList();
    }
}
