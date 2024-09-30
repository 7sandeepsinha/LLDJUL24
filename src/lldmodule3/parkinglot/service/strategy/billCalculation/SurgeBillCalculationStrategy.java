package lldmodule3.parkinglot.service.strategy.billCalculation;

import lldmodule3.parkinglot.model.constant.ParkingSpotType;
import lldmodule3.parkinglot.model.constant.VehicleType;

public class SurgeBillCalculationStrategy implements BillCalculationStrategy {
    private static final double SURGE_MULTIPLIER_1 = 1; // <50
    private static final double SURGE_MULTIPLIER_2 = 1.5; // >=50 and <75
    private static final double SURGE_MULTIPLIER_3 = 1.8; // >=75 and <90
    private static final double SURGE_MULTIPLIER_4 = 2.5; // >=90


    @Override
    public double generateBillAmount(int numberOfMinutes, VehicleType vehicleType, ParkingSpotType parkingSpotType) {
    }
}
/*
 flow -> calculate cost normally
 bike -> 1rs/min
 time -> 90

 60 mins -> 45 rs
 30 -> 30 * 1 -> 30 rs
 75 rs - base price

 luxury spot -> 75 * 10 -> 750 rs

750 -> base price + luxury fee

70% full -> 1.5

750 * 1.5 -> 1125

final bill -> base + luxury + surge

base -> spotTypeRate -> surge

x -> 10 * x * 1.5
 */