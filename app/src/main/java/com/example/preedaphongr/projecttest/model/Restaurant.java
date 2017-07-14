package com.example.preedaphongr.projecttest.model;

import java.util.List;

/**
 * Created by preedaphong.r on 13/07/2560.
 */

public class Restaurant {
    private String restaurantName;
    private String restaurantImagePath;
    private String restaurantId;
    private String restaurantStatus;
    private String distanceDelivery;
    private String lat;
    private String lng;

    public Restaurant(String restaurantName, String restaurantImagePath, String restaurantId, String restaurantStatus, String distanceDelivery, String lat, String lng) {
        this.restaurantName = restaurantName;
        this.restaurantImagePath = restaurantImagePath;
        this.restaurantId = restaurantId;
        this.restaurantStatus = restaurantStatus;
        this.distanceDelivery = distanceDelivery;
        this.lat = lat;
        this.lng = lng;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantImagePath() {
        return restaurantImagePath;
    }

    public void setRestaurantImagePath(String restaurantImagePath) {
        this.restaurantImagePath = restaurantImagePath;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantStatus() {
        return restaurantStatus;
    }

    public void setRestaurantStatus(String restaurantStatus) {
        this.restaurantStatus = restaurantStatus;
    }

    public String getDistanceDelivery() {
        return distanceDelivery;
    }

    public void setDistanceDelivery(String distanceDelivery) {
        this.distanceDelivery = distanceDelivery;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
