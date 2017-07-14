package com.example.preedaphongr.projecttest.model;

import java.util.List;

/**
 * Created by preedaphong.r on 13/07/2560.
 */

public class SearchResponse {
    private List<Restaurant> restaurantList;



    public List<Restaurant> getRestaurantsList() {
        return restaurantList;
    }

    public void setRestaurantsList(List<Restaurant> restaurantsList) {
        this.restaurantList = restaurantsList;
    }
}
