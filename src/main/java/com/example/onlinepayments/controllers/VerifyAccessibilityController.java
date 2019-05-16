package com.example.onlinepayments.controllers;

import com.example.onlinepayments.client.PaySafeClient;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyAccessibilityController {

    @Autowired
    private PaySafeClient paySafeClient;

    /**
     * @return
     */
    @ApiOperation(value = "Call PaySafe Api for verification: https://developer.paysafe.com/en/classic-apis/3ds/typical-api-calls/verify-that-the-service-is-accessible/", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping(value = "/verify", produces = "application/json")
    public String verify(){
        return paySafeClient.verify();
    }
}
