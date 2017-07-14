package com.example.preedaphongr.projecttest.model;

/**
 * Created by preedaphong.r on 13/07/2560.
 */

public class SearchRequest {

    String foodName;

    public SearchRequest(String word) {
        this.foodName = word;
    }

    public String getWord() {
        return foodName;
    }

    public void setWord(String word) {
        this.foodName = word;
    }
}
