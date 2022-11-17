package com.bitswilp.scalableservices.commonlibrary.communicationmodels;

public class Hospital {
    private String id;
    private String name;
    private String address;
    private GPSCoordinates gpsCoordinates;

    public Hospital(String id, String name, String address, GPSCoordinates gpsCoordinates) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gpsCoordinates = gpsCoordinates;
    }

    public Hospital(String id, String name, String address, String gpsCoordinates) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gpsCoordinates = new GPSCoordinates(gpsCoordinates);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GPSCoordinates getGpsCoordinates() {
        return gpsCoordinates;
    }

    public void setGpsCoordinates(GPSCoordinates gpsCoordinates) {
        this.gpsCoordinates = gpsCoordinates;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gpsCoordinates=" + gpsCoordinates +
                '}';
    }
}