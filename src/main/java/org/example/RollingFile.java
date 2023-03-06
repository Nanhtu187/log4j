package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Tu Nguyen
 * @date 9:45 AM 3/6/2023
 */
public class RollingFile {
    private static final Logger LOG = LogManager.getLogger();

    public static void main(String[] args) {
        LOG.debug("debug");
        LOG.trace("trace");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error");
        LOG.fatal("fatal");
    }
}
