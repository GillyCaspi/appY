package com.server;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;


public class FrontendServer  extends Thread {

    @Override
    public void run() {
//        Configuration config = new Configuration();
//        config.setHostname("localhost");
//        config.setPort(5003);
//        SocketIOServer server = new SocketIOServer(config);
//
////        server.addNamespace("/socket.io");
//        server.addConnectListener(clientConnection -> {
//            System.out.println("gillyyyyy" + clientConnection);
//            clientConnection.sendEvent("gilly", "clientsocket event");
//        });
////        server.addListeners();
////        server.startAsync();
//        server.start();
//        EngineIoServer mEngineIoServer = new EngineIoServer();
//        SocketIoServer server = new SocketIoServer(mEngineIoServer);
//        SocketIoNamespace namespace = server.namespace("/");
//        namespace.on("connection", new Emitter.Listener() {
//            @Override
//            public void call(Object... args) {
//                SocketIoSocket socket = (SocketIoSocket) args[0];
//                // Do something with socket
//                socket.send("gilly", "bar arg");
//            }
//        });
//        server.addEventListener("gillyMsg", String.class, new DataListener<String>() {
//            @Override
//            public void onData(SocketIOClient client, String data, AckRequest ackRequest) {
//                System.out.println("gillyyyyy22222");
//                client.sendEvent("gillyMsg", "testttttttt222222");
//                // Handle incoming chat message
//                System.out.println("Received message: " + data);
//            }
//        });
//        EngineIoServerOptions engineOptions = EngineIoServerOptions.newFromDefault();
//
//        EngineIoServer engine = new EngineIoServer(engineOptions);
//        SocketIoServerOptions options = SocketIoServerOptions.newFromDefault();
//        SocketIoServer server = new SocketIoServer(engine, options);
//
//        // register the "connection" event listener
//        engine.emit("connection", new Emitter.Listener() {
//            @Override
//            public void call(Object... objects) {
//                engine.
//
//            }
//
//            @Override
//            public void onConnect(SocketIoSocket socket) {
//                // listen for the custom "socketOpen" event emitted by the client
//                socket.on("socketOpen", new DataListener<Object>() {
//                    @Override
//                    public void onData(SocketIoSocket socket, Object data, AckRequest ackRequest) {
//                        // send a message to the client
//                        socket.send("Hello, client!");
//                    }
//                });
//            }
//        }).on();


//
//        EngineIoServerOptions options = EngineIoServerOptions.newFromDefault();
//        EngineIoServer server = new EngineIoServer(options);
//        SocketIoServer socketIoServer = new SocketIOServer.;
//
//        server.on("connection", objects -> {
////            socket.send("Hello client!");
//            EngineIoSocket socket = (EngineIoSocket)objects[0];
//            socket.send(new Packet<>("message", "Hello client!"));
//        });


//        Configuration config = new Configuration();
//        config.setHostname("localhost");
//        config.setPort(5004);
//        SocketIOServer server = new SocketIOServer(config);
//        server.addConnectListener(client -> {
//            System.out.println("Client connected: " + client.getRemoteAddress());
//            System.out.println(client.isChannelOpen() ? "channel open" : "channel disconnect");
//            client.sendEvent("gilly", "Hello, client!");
//        });
//        server.addEventListener("gilly", String.class, new DataListener<String>() {
//            @Override
//            public void onData(SocketIOClient socketIOClient, String s, AckRequest ackRequest) throws Exception {
//                System.out.println("Received message: " + s);
//
//            }
//        });
//        server.start();

//        Configuration config = new Configuration();
//        config.setHostname("localhost");
//        config.setPort(5003);
//        SocketIOServer server = new SocketIOServer(config);
//        server.on("connection", new Emitter.Listener() {
//            @Override
//            public void call(Object... args) {
//
//                Socket client = (Socket)args[0];
////                System.out.println("Client " + client.id() + " connected.");
//
//                // Send a message to the client upon connection
////                JSONObject data = new JSONObject();
//                try {
//                    data.put("message", "Hello from Java server!");
//                    client.emit("messageFromServer", data);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        });




    }


}
