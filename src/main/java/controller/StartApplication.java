package controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//包扫描：扫描controller、service
@SpringBootApplication(scanBasePackages = { "controller","service.impl" })
//开启springboot的默认配置
@EnableAutoConfiguration
//配置mapper层扫描
@MapperScan(basePackages = {"mapper"})
public class StartApplication {
	public static void main(String[] args) {
		//spring boot内置了tomcat，因此springboot可以不用发布在外部的tomcat服务器中
		//springboot就是简化了ssm框架的搭建，类似于不用书写ssm的所有配置文件
		SpringApplication.run(StartApplication.class, args);
	}
}
