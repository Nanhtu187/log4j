package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Console {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        log.debug("debug");
        log.trace("trace");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");
    }
}