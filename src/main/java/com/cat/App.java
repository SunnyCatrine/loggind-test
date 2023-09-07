package com.cat;


//import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
//@Slf4j
public class App {

    public static void main( String[] args ) {

        LogWithJavaUtil logWithJavaUtil = new LogWithJavaUtil();
        logWithJavaUtil.getLogger().info("kopek var");

        LogWithSystemLogger logWithSystemLogger = new LogWithSystemLogger();
        logWithSystemLogger.getLogger().log(System.Logger.Level.INFO, "Cuma gunu pazar var");

//        LogWithLog4j2 logWithLog4j2 = new LogWithLog4j2();
//        logWithLog4j2.getLogger().info("oretmenevi var ya");

//        LogWithLogback logWithLogback = new LogWithLogback();
//        logWithLogback.getLogger().info("Inaniyorum");

//        LogWithJBossLogManager logWithJBossLogManager = new LogWithJBossLogManager();
//        logWithJBossLogManager.getLogger().info("kafayi mi yedin");

//        LogWithCommonLoggingFasad logWithCommonLoggingFasad = new LogWithCommonLoggingFasad();
//        logWithCommonLoggingFasad.getLog().info("Yaprak kirilmis");

        LogWithJBossLoggingFasad logWithJBossLoggingFasad = new LogWithJBossLoggingFasad();
        logWithJBossLoggingFasad.getLogger().info("Yaylaya bir dolmus var");

//        log.info("her sey iyi");
//        System.out.println("Hello World!");
//        log.trace("cok guzel");
//        log.warn("dikkat ol");
    }
}
