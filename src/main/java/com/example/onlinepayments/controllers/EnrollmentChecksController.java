package com.example.onlinepayments.controllers;

import com.example.onlinepayments.client.PaySafeClient;
import com.example.onlinepayments.pojo.EnrollmentDetails;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Integration of PaySafe Api", description = "Integrating api to make call to PaySafe enrollment lookup")

public class EnrollmentChecksController {

    @Autowired
    private PaySafeClient paySafeClient;


    /**
     * @param userName
     * @param password
     * @param accountId
     * @param inputRequest
     * @return
     */
    @ApiOperation(value = "Call PaySafe Api for executing enroll lookup: https://developer.paysafe.com/en/classic-apis/3ds/typical-api-calls/perform-an-enrollment-lookup/", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @PostMapping(value = "/enroll", produces = "application/json")
    public String enroll(@ApiParam(value = "Username for PaySafe authorization", required = true) @RequestHeader (value="username") String userName,
                         @ApiParam(value = "Password for PaySafe authorization", required = true) @RequestHeader (value="password") String password,
                         @ApiParam(value = "Account ID for PaySafe authorization", required = true) @RequestHeader (value="account_id") String accountId,
                         @ApiParam(value = "Enrollmment details", required = true) @RequestBody EnrollmentDetails inputRequest){
        return paySafeClient.enroll(inputRequest, userName, password, accountId);
    }
}
