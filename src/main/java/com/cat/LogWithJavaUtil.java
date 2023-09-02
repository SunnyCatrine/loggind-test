package com.cat;

import lombok.Getter;

import java.util.logging.Logger;

public class LogWithJavaUtil {
    @Getter
    private Logger logger = Logger.getLogger(LogWithJavaUtil.class.getName());

}
