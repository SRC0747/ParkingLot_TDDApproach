package com.bridgelabz_parkinglot;

/**
 * Check and throws an Exception while parking the car when the ParkingLot is full
 *
 * @author Sampriti Roy Chowdhury
 * @version 0.0.1
 * @since 10-11-2021
 */

public class ParkingLotException extends Exception{
    public ParkingLotException(String message) {
        super(message);
    }
}
