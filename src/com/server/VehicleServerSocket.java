package com.server;

import com.AppSettings;
import com.handler.VehicleService;
import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.DataListener;

public class VehicleServerSocket extends Thread {


    public VehicleServerSocket() {
    }

    @Override
    public void run() {
        Configuration config = new Configuration();
        config.setHostname("localhost");
        config.setPort(AppSettings.serverPort);
        SocketIOServer server = new SocketIOServer(config);
        server.addEventListener("newItem", String.class, new DataListener<String>() {
            @Override
            public void onData(SocketIOClient socketIOClient, String s, AckRequest ackRequest) throws Exception {
                System.out.println("Received message: " + s);
                VehicleService.addVehicleToReceivedVehicleList(s);
            }
        });
        server.start();
    }


}
