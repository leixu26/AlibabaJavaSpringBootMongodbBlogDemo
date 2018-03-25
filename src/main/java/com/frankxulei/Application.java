package com.frankxulei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.frankxulei.models.User;
import com.frankxulei.repository.UsersRepository;
/**
 * @Package: com.frankxulei 
 * @ClassName: Application  
 * @Description: Java Spring Data实战阿里云Mongodb 
 * @author: Frank Xu Lei 
 * @Date : 2018-5-4
*/
@SpringBootApplication
public class Application implements CommandLineRunner {

	/**
	 * Spring 自动装配 
	 */
	@Autowired
	private UsersRepository repository;
	/**
	 * 主函数 执行入口
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//repository.deleteAll();
		// fetch all users
		System.out.println("查找所有用户");
		System.out.println("-------------------------------");
		for (User user2 : repository.findAll()) {
			System.out.println(user2.getName());
		}
		 
	}
}