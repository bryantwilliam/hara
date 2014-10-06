package com.sturdyhelmetgames.hara.rest;

import com.sturdyhelmetgames.hara.items.Light;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by antti on 06/10/14.
 */
@RestController
public class LightController {

    @RequestMapping("/light/{id}")
    public Light light(@PathVariable("id") int id) {
        return new Light(1, "Hello world");
    }

}
