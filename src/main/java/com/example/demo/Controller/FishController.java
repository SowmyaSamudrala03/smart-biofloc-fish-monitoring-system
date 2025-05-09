package com.example.demo.Controller;

import com.example.demo.Entity.Fish;
import com.example.demo.Service.FishService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class FishController {
    @Autowired
    private FishService fishserv;

    @PostMapping("/sensordata")
    public Fish create(@RequestBody Fish fishname) {
        return fishserv.createFish(fishname);
    }

    @GetMapping("/all")
    public Iterable<Fish> findAllfish() {
        return fishserv.getallFish();
    }
}