package com.jyothi.oslobysykkel.models;

import java.util.List;

public class Station {

    private long id;

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    private Availability availability;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
