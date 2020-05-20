package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther:xue
 * @Date:2020/4/29 16:23
 */

/**
 * 整和dubbo的步骤
 * 1.倒入依赖
 *      1）导入dubbo-starter
 *      2）倒入dubbo的其他依赖
 *
 *
 * Sprigboot与Dubbo整合的三种方式
 * 1.导入dubbo-starter，在application.properties的配置文件中配置属性，使用@com.alibaba.dubbo.config.annotation.Service
 *   暴露服务，使用@Reference引用和服务，开启@EnableDubbo（这个注解的主要功能是将dubbp放入Spring容器中，和一些配置绑定
 *   也可以在配置文件中 dubbo.scan.base-packages=com.atguigu.gmall 配置包扫描）
 * 2.入dubbo-starter,保留dubbo xml配置文件的方式,使用@ImportResource(locations = "classpath:provider.xml")倒入配置文件
 *
 * 3.使用注解API的方式，让将每一个组件手动创建到容器中
 */

@SpringBootApplication
@EnableDubbo   //开启基于注解的dubbo功能
@EnableHystrix//开启服务容错
//@ImportResource(locations = "classpath:provider.xml")
//@EnableDubbo(scanBasePackages = "com.atguigu.gmall")
public class BootUserServiceProvider {
    public static void main(String[] args){
        SpringApplication.run(BootUserServiceProvider.class, args);

    }
}
