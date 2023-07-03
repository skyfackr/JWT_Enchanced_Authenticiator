package wang.skycloud.JWTEA.Client;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.StreamHandler;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

@Log
class ConstantTest {
    //private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(ConstantTest.class.getName());

    @Test
    void getSupported_Request_Version() {
        log.entering(ConstantTest.class.getName(),"getSupported_Request_Version");
        Iterable<String> srv=Constant.getSupported_Request_Version();
        log.fine("srv="+srv.toString());
        List<String> srvl=new ArrayList<String>((Collection<? extends String>) srv);
        String org=srvl.get(0);
        srvl.set(0,"114514.1919810");
        log.fine("srvl="+srvl.toString());
        assertEquals(org,Constant.getSupported_Request_Version().iterator().next());
        log.exiting(ConstantTest.class.getName(),"getSupported_Request_Version");
    }

    @BeforeAll
    static void beforeAll() {
//        System.out.println("?");
//        System.err.println("???");
//        log.entering(ConstantTest.class.getName(),"beforeAll");
//        Handler handler=new java.util.logging.StreamHandler(System.out,new java.util.logging.SimpleFormatter());
//        log.addHandler(handler);
        log.addHandler(new java.util.logging.ConsoleHandler());
        Arrays.stream(log.getHandlers()).forEach(h->h.setLevel(Level.FINE));
        log.setLevel(Level.FINE);
        log.fine("debug log set to console");
    }

    @Test
    void getCTVER() {
        log.fine("CTVER="+Constant.getCTVER());
    }
    @AfterEach
    void afterEach() {
        Arrays.stream(log.getHandlers()).peek(Handler::flush);
    }
}