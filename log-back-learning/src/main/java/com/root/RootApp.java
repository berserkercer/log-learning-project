package com.root;

// import ch.qos.logback.classic.LoggerContext;
// import ch.qos.logback.core.util.StatusPrinter;

import com.domain.LogDomain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author ChengJianLong
 */
public class RootApp {
    private static Logger logger = LoggerFactory.getLogger(RootApp.class);

    public static void main(String[] args) {
        // 可通过配置文件，configuration的debug属性开启
        // LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        // StatusPrinter.print(lc);

        logger.debug("info logger");
        LogDomain.printLog();
        logger.debug("info logger end");
    }
}
