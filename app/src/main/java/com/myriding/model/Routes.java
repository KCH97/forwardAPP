package com.myriding.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Routes {
    @SerializedName("routeValue")
    @Expose
    private List<RouteValue> routeValue = null;
    @SerializedName("routeMongoValue")
    @Expose
    private List<RouteMongoValue> routeMongoValue = null;
    @SerializedName("routeLikeValue")
    @Expose
    private Integer routeLikeStatus;

    public List<RouteValue> getRouteValue() {
        return routeValue;
    }

    public void setRouteValue(List<RouteValue> routeValue) {
        this.routeValue = routeValue;
    }

    public List<RouteMongoValue> getRouteMongoValue() {
        return routeMongoValue;
    }

    public void setRouteMongoValue(List<RouteMongoValue> routeMongoValue) {
        this.routeMongoValue = routeMongoValue;
    }

    public Integer getRouteLikeStatus() {
        return routeLikeStatus;
    }

    public void setRouteLikeStatus(Integer routeLikeStatus) {
        this.routeLikeStatus = routeLikeStatus;
    }
}
