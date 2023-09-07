package com.cat;

import lombok.Getter;
import org.jboss.logging.Logger;

public class LogWithJBossLoggingFasad {
    @Getter
    private Logger logger = Logger.getLogger(LogWithCommonLoggingFasad.class.getName());
}
