package com.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan({"com.blog.mapper"})
@EnableSwagger2
public class AppRun {

    public static void main(String[] args) {

        SpringApplication.run(AppRun.class,args);

    }

}
