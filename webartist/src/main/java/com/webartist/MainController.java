package com.webartist;

import com.webartist.domain.*;
import com.webartist.repos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;


@Controller
public class MainController {
    @Autowired
    private ProgramsRepo programsRepo;

    @Autowired
    private OrdersRepo ordersRepo;

    @GetMapping("/")
    public String program(Map<String, Object> model) {
    Iterable<Programs> programs = programsRepo.findAll();
    model.put("programs", programs);
    return "main";
    }


    @GetMapping("/order")
    public String main(
            @AuthenticationPrincipal User user,
            Map<String, Object> model) {
                Iterable<Orders> orders = ordersRepo.findByAuthor(user);
                model.put("orders", orders);
                return "orders";
    }

    @PostMapping("/order")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String date, String time, String adr,String progName, Map<String, Object> model
    ) {
        Orders order = new Orders(date, time, adr, progName,  user);
        ordersRepo.save(order);
        Iterable<Orders> orders = ordersRepo.findByAuthor(user);
        model.put("orders", orders);
        return "orders";
    }






}