package com.bridgelabz_parkinglot;

/**
 * Check whether the vehicle can be parked in the Parking Lot
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 10-11-2021
 */

public class ParkingLotSystem {
    private Object vehicle;

    public ParkingLotSystem(){
    }

    /**
     * Check the vehicle is parked
     * @param vehicle is used to check whether vehicle is parked
     * @return true if the vehicle is parked
     */
    public boolean park(Object vehicle) {
        if (this.vehicle != null)
            return false;
        this.vehicle = vehicle;
        return true;
    }

    public boolean unPark(Object vehicle) {
        if(this.vehicle.equals(vehicle)){
            this.vehicle = null;
            return true;
        }
        return false;
    }
}
