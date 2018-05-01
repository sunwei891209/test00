package cn.com.yusys.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@Controller
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@Configuration
public class HelloApplication {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("sunwei nb");
        return "hello sunwei";
    }

    /*@Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter  = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return converter;
    }*/

    public static void main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
    }

}
