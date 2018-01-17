package cn.cjq.bomb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BombApplication {

	public static void main(String[] args) {
		SpringApplication.run(BombApplication.class, args);
	}
}
