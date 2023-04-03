package com;

import com.handler.Job;
import com.server.FrontendServer;
import com.server.VehicleServerSocket;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        System.out.println("start " + AppSettings.appName);
        new VehicleServerSocket().start();
//        new FrontendServer().start();
        Timer timer = Job.startJob();
    }

}
