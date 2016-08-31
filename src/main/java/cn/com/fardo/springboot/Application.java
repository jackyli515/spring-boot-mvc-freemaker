/**
 * 
 */
package cn.com.fardo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author lmq
 *
 */
@SpringBootApplication
@EnableScheduling//启用定时任务的配置
@EnableAsync//让@Async注解能够生效
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class,args);
	}

}
