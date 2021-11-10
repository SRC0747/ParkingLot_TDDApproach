package com.bridgelabz_parkinglot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    ParkingLotSystem parkingLotSystem = null;
    Object vehicle = null;

    @BeforeEach
    public void setUp() throws Exception {
        vehicle = new Object();
        parkingLotSystem = new ParkingLotSystem();
    }

    @Test
    public void givenAVehicle_WhenParked_ShouldReturnTrue() {
        //ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        boolean isParked = parkingLotSystem.park(new Object());
        Assertions.assertTrue(isParked);
    }
}