package com.handler;

import com.AppSettings;
import com.model.Car;
import com.model.Motorcycle;
import com.model.Vehicle;
import com.google.gson.Gson;

public class VehicleFactory {

    public static Vehicle createNewVehicle(String color){
        if (AppSettings.appName == AppSettings.AppName.appX) {
            return new Car(color);
        }
        return new Motorcycle(color);
    }


}
