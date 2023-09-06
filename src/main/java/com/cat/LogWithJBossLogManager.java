package com.cat;

import lombok.Getter;

import java.util.logging.Logger;

public class LogWithJBossLogManager {
    @Getter
    private Logger logger = Logger.getLogger(LogWithJBossLogManager.class.getName());
}
