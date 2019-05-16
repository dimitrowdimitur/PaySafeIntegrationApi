package com.example.onlinepayments.util;

import org.springframework.stereotype.Component;

@Component
public class StringConcatenationUtil {

    /**
     * @param s1
     * @param s2
     * @return
     */
    public String concat(String s1, String s2){
        return s1.concat(s2);
    }
}
