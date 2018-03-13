package com.jyothi.oslobysykkel.models;

import java.util.Date;
import java.util.List;

public class StationMaster {

    private List<Station> stations;

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getRefresh_rate() {
        return refresh_rate;
    }

    public void setRefresh_rate(String refresh_rate) {
        this.refresh_rate = refresh_rate;
    }

    private String updated_at;
    private String refresh_rate;

}
