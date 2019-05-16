package com.example.onlinepayments.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnrollmentDetails {
    private String merchantRefNum;
    private int amount;
    private String currency;
    private String customerIp;
    private String userAgent;
    private String acceptHeader;
    private String merchantUrl;
    private Card card;

    /**
     * @return
     */
    public Card getCard() {
        return card;
    }

    /**
     * @param card
     */
    public void setCard(Card card) {
        this.card = card;
    }

    /**
     * @return
     */
    public String getMerchantRefNum() {
        return merchantRefNum;
    }

    /**
     * @param merchantRefNum
     */
    public void setMerchantRefNum(String merchantRefNum) {
        this.merchantRefNum = merchantRefNum;
    }

    /**
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return
     */
    public String getCustomerIp() {
        return customerIp;
    }

    /**
     * @param customerIp
     */
    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    /**
     * @return
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * @param userAgent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * @return
     */
    public String getAcceptHeader() {
        return acceptHeader;
    }

    /**
     * @param acceptHeader
     */
    public void setAcceptHeader(String acceptHeader) {
        this.acceptHeader = acceptHeader;
    }

    /**
     * @return
     */
    public String getMerchantUrl() {
        return merchantUrl;
    }

    /**
     * @param merchantUrl
     */
    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
    }
}
