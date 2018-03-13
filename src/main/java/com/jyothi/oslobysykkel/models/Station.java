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


    public class Availability {
        private long bikes;

        private long locks;

        public long getBikes() {
            return bikes;
        }

        public void setBikes(long bikes) {
            this.bikes = bikes;
        }



        public long getLocks() {
            return locks;
        }

        public void setLocks(long locks) {
            this.locks = locks;
        }
    }
}
