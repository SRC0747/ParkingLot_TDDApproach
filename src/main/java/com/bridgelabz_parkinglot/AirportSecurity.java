package com.bridgelabz_parkinglot;

public class AirportSecurity implements ParkingLotObserver{
    private boolean isFullCapacity;

    public void capacityIsFull() {
        isFullCapacity = true;
    }

    public boolean IsCapacityFull() {
        return this.isFullCapacity;
    }
}
