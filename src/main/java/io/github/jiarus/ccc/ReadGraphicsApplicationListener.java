package io.github.jiarus.ccc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jiarus
 */
@Component
public class ReadGraphicsApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    
    public static List<Integer> commitList = new ArrayList<>();
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        
        ClassPathResource classPathResource = new ClassPathResource("graphics/flag");
        List<String[]> calendar = new ArrayList<>();
        int width = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(classPathResource.getInputStream()))) {
            while (reader.ready()) {
                String[] line = reader.readLine().split(" ");
                width = line.length;
                calendar.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < calendar.size(); j++) {
                //ignore some day
                if ("xx".equals(calendar.get(j)[i])) {
                    continue;
                }
                commitList.add(Integer.valueOf(calendar.get(j)[i]));
            }
        }
    }
}