package com.example.onlinepayments.pojo;

public class CardExpiry {
    private int month;
    private int year;

    public CardExpiry(int month, int year) {
        this.month = month;
        this.year = year;
    }

    /**
     * @return
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }
}
