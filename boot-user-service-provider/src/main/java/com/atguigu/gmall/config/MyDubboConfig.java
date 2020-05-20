//
//package com.atguigu.gmall.config;
//
//import com.alibaba.dubbo.config.*;
//import com.atguigu.gmall.service.UserService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//
///**
// * @Auther:xue
// * @Date:2020/5/9 9:02
// */
//@Configuration
//public class MyDubboConfig {
//    //<dubbo:application name="boot-user-service-provider"/>
//    /*
//    @Bean
//    public ApplicationConfig applicationConfig(){
//        ApplicationConfig applicationConfig=new ApplicationConfig();
//        applicationConfig.setName("boot-user-service-provider3");
//        return applicationConfig;
//    }
//    */
//    //<dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"/>
//    @Bean
//    public RegistryConfig registryConfig(){
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setProtocol("zookeeper");
//        registryConfig.setAddress("127.0.0.1:2181");
//        return registryConfig;
//    }
//    //<dubbo:protocol name="dubbo" port="20880"/>
//    @Bean
//    public ProtocolConfig protocolConfig(){
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo" );
//        protocolConfig.setPort(20880);
//        return protocolConfig;
//
//    }
//
////    <dubbo:service interface="com.atguigu.gmall.service.UserService"
////    ref="userServiceImpl01">
////		<!--<dubbo:method name="getUserAddressList" timeout="1000"></dubbo:method>-->
////	</dubbo:service
//                         // 要什么写在参数中，如果对象已经放在了容器中，在这里会自动注入进来
//    @Bean
//    public ServiceConfig<UserService> serviceServiceConfig(UserService userService){
//        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
//        serviceConfig.setInterface(UserService.class);
//        serviceConfig.setRef(userService);
//        serviceConfig.setVersion("1.0.0");
//
//        //配置每一个method的信息
//        MethodConfig methodConfig = new MethodConfig();
//        methodConfig.setName("getUserAddressList");
//        methodConfig.setTimeout(1000);
//        //将method的设置关联到sevice中
//        serviceConfig.setMethods(Collections.singletonList(methodConfig));
//        return serviceConfig;
//    }
//
//}
