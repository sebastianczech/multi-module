package com.sebastianczech.multimodule.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class InfoScheduledTask {

    private static final Logger log = LoggerFactory.getLogger(InfoScheduledTask.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        log.info("SCHEDULED TASK - INFO - {}", dateFormat.format(new Date()));
    }

}
