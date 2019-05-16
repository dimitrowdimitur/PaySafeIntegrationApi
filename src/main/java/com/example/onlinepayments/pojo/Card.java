package com.example.onlinepayments.pojo;

public class Card {
    String cardNum;
    CardExpiry cardExpiry;

    /**
     * @return
     */
    public CardExpiry getCardExpiry() {
        return cardExpiry;
    }

    /**
     * @param cardExpiry
     */
    public void setCardExpiry(CardExpiry cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    /**
     * @return
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * @param cardNum
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

}
