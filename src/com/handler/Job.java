package com.handler;

import com.AppSettings;
import com.handler.VehicleService;
import com.model.Vehicle;

import java.util.Timer;
import java.util.TimerTask;

public class Job {


    public static Timer startJob() {
        Timer timer = new Timer();
         timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Vehicle v = VehicleService.addNewVehicle();
                VehicleService.sendVehicleViaSocket(v);
            }
        }, 0, AppSettings.sleep);
         return timer;

    }
}
