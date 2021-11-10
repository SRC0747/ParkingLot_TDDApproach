package com.bridgelabz_parkinglot;

/**
 * Check whether the vehicle can be parked in the Parking Lot
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 10-11-2021
 */

public class ParkingLotSystem {
    private int currentCapacity;
    private int actualCapacity;
    private Object vehicle;
    private ParkingLotOwner owner;

    public ParkingLotSystem(int actualCapacity) {
        this.currentCapacity = 0;
        this.actualCapacity = actualCapacity;
    }

    /**
     * Check the vehicle is parked or not and throws an exception while the ParkingLot is full
     * @param vehicle is used to check whether vehicle is parked
     * @return an exception message of ParkingLot is full or Park the vehicle
     */
    public void park(Object vehicle) throws ParkingLotException{
        if (this.currentCapacity == this.actualCapacity) {
            owner.capacityIsFull();
            throw new ParkingLotException("ParkingLot is full.");
        }
        this.currentCapacity++;
        this.vehicle = vehicle;
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

    /**
     * Register the ParkingLot Owner who used to ask a query to ParkingLot for checking whether it is full or not
     * @param owner defines the ParkingLot owner
     */
    public void registerOwner(ParkingLotOwner owner) {
        this.owner = owner;
    }

    public void setCapacity(int capacity) {
        this.actualCapacity = capacity;
    }
}
