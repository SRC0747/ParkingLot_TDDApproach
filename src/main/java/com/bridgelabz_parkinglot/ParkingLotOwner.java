package com.bridgelabz_parkinglot;

/**
 * ParkingLotOwner ask the query to ParkingLot to check the capacity of ParkingLot to assure whether it is full or not
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 10-11-2021
 */

public class ParkingLotOwner {
    private boolean isFullCapacity;

    public void capacityIsFull() {
        isFullCapacity = true;
    }

    /**
     * Checks the ParkingLot is full of capacity with vehicles
     * @return the capacity os the ParkingLot
     */
    public boolean IsCapacityFull() {
        return this.isFullCapacity;
    }
}
