package com.domain;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author ChengJianLong
 */
public class LogDomain {
    private static final Logger logger = LoggerFactory.getLogger(LogDomain.class);
    private static int index = 0;

    public static void printLog() {
        logger.error("log domain error print {}", index++);
        logger.warn("log domain warn print {}", index++);
        logger.info("log domain info print {}", index++);
        logger.debug("log domain debug print {}", index++);
        logger.trace("log domain trace print {}", index++);
    }
}
