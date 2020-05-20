package com.atguigu.gmall.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:xue
 * @Date:2020/4/29 14:41
 */
@RestController
public class OrderController {

    @Autowired
   private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initorder(@RequestParam("uid") String uid){
        return orderService.initOrder(uid);
    }
}
