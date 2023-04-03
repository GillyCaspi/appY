package com.db;

import com.model.Vehicle;

import java.util.HashMap;

public class VehicleTable {

    private static HashMap<String, Vehicle> myVehicleList = null;

    public static HashMap<String, Vehicle> getInstance(){
        if(myVehicleList == null){
            myVehicleList = new HashMap<>();
        }
        return myVehicleList;
    }

}
