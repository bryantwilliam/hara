package com.sturdyhelmetgames.hara.rest;

import com.sturdyhelmetgames.hara.hardware.HardwareService;
import com.sturdyhelmetgames.hara.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by antti on 06/10/14.
 */
@RestController
public class AutomationController {

    @Autowired
    private HardwareService hardwareService;
    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping("/rooms/{roomId}/items/{itemId}/message")
    public String message(@PathVariable("roomId") long roomId, @PathVariable("itemId") long itemId) {
        return "OK!";
    }
}
