package com.db;

import com.model.Vehicle;

import java.util.HashMap;

public class ReceivedVehiclesTable {

    private static HashMap<String, Vehicle> receivedVehicleList = null;

    public static HashMap<String, Vehicle> getInstance(){
        if(receivedVehicleList == null){
            receivedVehicleList = new HashMap<>();
        }
        return receivedVehicleList;
    }

}
