package com.crop_deal.crop_service.controller;

import com.crop_deal.crop_service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CropController {

    @Autowired
    public Client client;

    @GetMapping("/crop")
    String getCrop() {
        return "crop";
    }

    @GetMapping("/owner/{id}/{name}")
    String getOwner(@PathVariable int id, @PathVariable String name) {
        return client.addFarmer(id, name);
    }

}
