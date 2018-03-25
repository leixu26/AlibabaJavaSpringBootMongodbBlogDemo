package com.frankxulei;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Package: com.frankxulei 
 * @ClassName: Application  
 * @Description: Java Spring Data实战阿里云Mongodb 
 * @author: Frank Xu Lei 
 * @Date : 2018-3-26 
*/
@SpringBootApplication
public class Application implements CommandLineRunner {

	/**
	 * 主函数 执行入口
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

	 
}