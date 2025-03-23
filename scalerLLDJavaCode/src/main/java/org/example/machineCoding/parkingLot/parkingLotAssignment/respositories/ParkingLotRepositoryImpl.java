package org.example.machineCoding.parkingLot.parkingLotAssignment.respositories;


import org.example.machineCoding.parkingLot.parkingLotAssignment.models.Gate;
import org.example.machineCoding.parkingLot.parkingLotAssignment.models.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLotRepositoryImpl implements ParkingLotRepository{

    private final List<ParkingLot> parkingLotList = new ArrayList<>();
    @Override
    public Optional<ParkingLot> getParkingLotByGateId(long gateId) {
        for(ParkingLot parkingLot: parkingLotList){
            List<Gate> gates = parkingLot.getGates();
            for(Gate gate: gates){
                if(gate.getId()==gateId){
                    return Optional.of(parkingLot);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<ParkingLot> getParkingLotById(long id) {
        for(ParkingLot parkingLot: parkingLotList){
            if(parkingLot.getId()==id){
                return Optional.of(parkingLot);
            }
        }
        return Optional.empty();
    }

    @Override
    public ParkingLot save(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
        return parkingLot;
    }
}