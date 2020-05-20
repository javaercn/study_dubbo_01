package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 * 		1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 * 		2）、配置服务提供者
 *
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * @author lfy
 *
 */
//@com.alibaba.dubbo.config.annotation.Service()//配置超时的那些数据
@Service
public class OrderServiceImpl implements OrderService {
	/**
	 * 1.将服务提供者注册到注册中心(暴露服务)
	 *  （1）导入dubbo依赖（2.6.2）
	 *  (2)配置服务提供者
	 *
	 * 2.让服务消费者去注册中心订阅提供者的服务地址
	 */

	//@Resource
	@Reference(loadbalance = "roundrobin")  //从远程服务中发现对象
	UserService userService;

	@HystrixCommand(fallbackMethod = "hello")
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("the user id is "+userId);
		//1、查询用户的收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
	public List<UserAddress> hello(String userId) {
		// TODO Auto-generated method stub
		System.out.println(userId);
		return Arrays.asList(new UserAddress());
	}
	
	

}
