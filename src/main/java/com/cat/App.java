package com.cat;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import sun.jvm.hotspot.debugger.ThreadContext;

/**
 * Hello world!
 *
 */
@Slf4j
public class App {

    private static final Logger specialLogger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        specialLogger.error("bir sey oldu");
        log.info("her sey iyi");
        System.out.println("Hello World!");
        log.trace("cok guzel");
        log.warn("dikkat ol");
    }
}
