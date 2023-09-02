package com.cat;


import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App {

    public static void main( String[] args ) {

        LogWithJavaUtil logWithJavaUtil = new LogWithJavaUtil();
        logWithJavaUtil.getLogger().info("kopek var");

//        log.info("her sey iyi");
//        System.out.println("Hello World!");
//        log.trace("cok guzel");
//        log.warn("dikkat ol");
    }
}
