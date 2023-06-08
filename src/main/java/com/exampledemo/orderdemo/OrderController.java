package com.exampledemo.orderdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrderController {


    private OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer){
        this.orderProducer = orderProducer;
    }
    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }
    @GetMapping("/send")
    public ResponseEntity<String> gotoKafka(@RequestParam("message") String message){
        orderProducer.sendMessage(message);
        return ResponseEntity.ok("message send to kafka topic");
    }

}
