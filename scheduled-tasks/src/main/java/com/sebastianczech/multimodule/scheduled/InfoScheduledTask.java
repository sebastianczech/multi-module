package com.sebastianczech.multimodule.scheduled;

import org.springframework.scheduling.annotation.Scheduled;

public class InfoScheduledTask {

    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
    }

}
