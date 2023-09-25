package com.oghamstone.sandbox.springbatch

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class BatchService {
    val log = LoggerFactory.getLogger(javaClass)

    fun triggerJob() {
        log.info("hey")
    }
}