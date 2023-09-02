package com.cat;

import lombok.Getter;

import static java.lang.System.*;

public class LogWithSystemLogger {
    @Getter
    private Logger logger = System.getLogger(LogWithSystemLogger.class.getName());
}
