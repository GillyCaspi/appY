package com.client;

import com.AppSettings;
import com.model.Vehicle;
import com.google.gson.Gson;
import io.socket.client.IO;
import io.socket.client.Socket;

import java.net.URISyntaxException;

public class VehicleClientSocket {

    private static boolean connected = false;
    static Socket socket = null;

    private static void initialConnection() {
        try {
            socket = IO.socket("http://localhost:" + AppSettings.clientPort);
            socket.on(Socket.EVENT_CONNECT, args -> System.out.println("Connected to server"));
            socket.connect();
            connected = true;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void sendVehicleViaSocket(Vehicle v) {
        if (!connected) {
            initialConnection();
        }
        socket.emit("newItem", new Gson().toJson(v));
        System.out.println("object sent: " + v);
    }
}
