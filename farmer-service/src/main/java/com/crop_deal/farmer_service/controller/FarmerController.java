package com.crop_deal.farmer_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FarmerController {

    @PostMapping("/addFarmer/{id}/{name}")
    public String addFarmer(@PathVariable int id, @PathVariable String name) {
        return "Farmer name: "+name+" id is: "+id;
    }

}
