package com.example.thejasnanjunda.maps;

import java.io.Serializable;

/**
 * Created by Thejas Nanjunda on 09-04-2018.
 */

public class Coordinates implements Serializable {
    double lat,lng;

    public Coordinates() {
    }

    public Coordinates(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
