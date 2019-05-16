package com.example.onlinepayments.client;

import com.example.onlinepayments.pojo.EnrollmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaySafeClient {

    @Autowired
    private RestTemplate restTemplate;


    private final String baseUrl;
    private final String enrollmentEndpoint;
    private final String verifyEndpoint;

    /**
     * @param baseUrl
     * @param enrollmentEndpoint
     * @param verifyEndpoint
     */
    @Autowired
    public PaySafeClient(@Value(value = "${paysafe.service.baseurl}") final String baseUrl,
                         @Value(value = "${paysafe.service.enrollmentendpoint}") final String enrollmentEndpoint,
                         @Value(value = "${paysafe.service.verifyendopoint}") final String verifyEndpoint){
        this.baseUrl = baseUrl;
        this.enrollmentEndpoint = enrollmentEndpoint;
        this.verifyEndpoint = verifyEndpoint;
    }

    /**
     * Makes call to PaySafe api enrollment lookup
     *
     * @param inputRequest
     * @param userName
     * @param password
     * @param accountId
     * @return
     */
    public String enroll(EnrollmentDetails inputRequest, String userName, String password, String accountId){
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor(userName, password));
        return restTemplate.postForObject(baseUrl.concat(enrollmentEndpoint),
                inputRequest, String.class, accountId);
    }

    /**
     * Makes call to PaySafe api for verification
     *
     * @return
     */
    public String verify(){
        return restTemplate.getForObject(baseUrl.concat(verifyEndpoint), String.class);
    }
}
