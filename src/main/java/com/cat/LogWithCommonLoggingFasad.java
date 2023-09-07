package com.cat;

import lombok.Getter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogWithCommonLoggingFasad {
    @Getter
    private Log log = LogFactory.getLog(LogWithCommonLoggingFasad.class.getName());
}
