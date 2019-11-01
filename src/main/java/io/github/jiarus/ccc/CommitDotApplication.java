package io.github.jiarus.ccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhangjiaru
 * @date: 2019-11-01
 * @Time: 11:30
 */
@EnableScheduling
@SpringBootApplication
public class CommitDotApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CommitDotApplication.class, args);
    }
}
