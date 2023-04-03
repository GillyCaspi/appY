package com.handler;

import com.AppSettings;
import com.db.ReceivedVehiclesTable;
import com.db.VehicleTable;
import com.client.VehicleClientSocket;
import com.google.gson.Gson;
import com.model.Car;
import com.model.Motorcycle;
import com.model.Vehicle;

public class VehicleService {


    public static Vehicle addNewVehicle() {
        Vehicle vehicle = VehicleFactory.createNewVehicle("white");
        VehicleTable.getInstance().put(vehicle.getPlateNumber(), vehicle);
        return vehicle;
    }

    public static void sendVehicleViaSocket(Vehicle v) {
        VehicleClientSocket.sendVehicleViaSocket(v);
    }


    public static void addVehicleToReceivedVehicleList(String json) {
        try {
            if (AppSettings.appName == AppSettings.AppName.appY) {
                Car car = new Gson().fromJson(json, Car.class);
                ReceivedVehiclesTable.getInstance().put(car.getPlateNumber(), car);
            } else {
                Motorcycle motorcycle = new Gson().fromJson(json, Motorcycle.class);
                ReceivedVehiclesTable.getInstance().put(motorcycle.getPlateNumber(), motorcycle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
