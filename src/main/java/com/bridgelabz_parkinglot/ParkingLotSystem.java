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
     * Check the vehicle is parked or not and throws an exception while the ParkingLot is full
     * @param vehicle is used to check whether vehicle is parked
     * @return an exception message of ParkingLot is full or Park the vehicle
     */
    public void park(Object vehicle) throws ParkingLotException{
        if (this.vehicle != null)
            throw new ParkingLotException("Parking Lot is full.");
        this.vehicle = vehicle;
        //return true;
    }

    /**
     * Check whether the ParkingLot is empty or not and unPark the vehicle which is already parked
     * @param vehicle is used to check whether ParkingLot is empty or to unPark the vehicle
     * @return false if ParkingLot is empty or true when unPark the parked vehicle
     */
    public boolean unPark(Object vehicle) {
        if (vehicle == null) return false;
        if(this.vehicle.equals(vehicle)){
            this.vehicle = null;
            return true;
        }
        return false;
    }

    /**
     * Check to ask whether the corresponding vehicle is parked or not in the ParkingLot
     * @param vehicle is used to check whether the vehicle is parked or not
     * @return true is parked otherwise false
     */
    public boolean isVehicleParked(Object vehicle) {
        if (this.vehicle.equals(vehicle))
            return true;
        return false;
    }
}
