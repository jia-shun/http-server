package org.js;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 启动SocketServer服务器
 * Created by JiaShun on 2018/7/3.
 */

public class Server {
    private ServerSocket server;
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 启动Socket服务
     */
    public void start(){
        try {
            server = new ServerSocket(8080);
            this.receive();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 接收客户端
     */
    private void receive(){
        try {
            Socket client = server.accept();
            StringBuilder builder = new StringBuilder();
            String msg = null;
            byte[] data = new byte[2048];
            int len = client.getInputStream().read(data);
            //接收客户端的请求信息
            String requestInfo = new String(data,0,len).trim();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
//            while((msg=reader.readLine()).length() > 0){
//                builder.append(msg);
//                builder.append("\r\n");
//                if(null == msg){
//                    break;
//                }
//            }
//            //接收客户端的请求信息
//            String requestInfo = builder.toString().trim();
            System.out.println(requestInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop(){}
}
