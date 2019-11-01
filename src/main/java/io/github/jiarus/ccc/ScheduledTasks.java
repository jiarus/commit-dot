package io.github.jiarus.ccc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ScheduledTasks {
    
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    /**
     * record the day in memory
     */
    private Integer day = 0;
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        Integer commitCount = ReadGraphicsApplicationListener.commitList.get(day);
        
        //commit content
        
        
        //System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
    
}