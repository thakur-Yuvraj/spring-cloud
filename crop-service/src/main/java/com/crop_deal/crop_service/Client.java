package com.crop_deal.crop_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name="FARMER-SERVICE")
public interface Client {

    @PostMapping("/addFarmer/{id}/{name}")
    public String addFarmer(@PathVariable int id, @PathVariable String name);
}
