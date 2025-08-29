package ch19.sec07;

import org.json.JSONObject;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    //필드
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String chatName;

    //메소드: 서버 연결
    public void connect() throws IOException {
        socket = new Socket("localhost", 50001);
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트] 서버에 연결됨");
    }

    //메소드: JSON 받기
    public void receive() {
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    String receiveJson = dis.readUTF();
                    JSONObject root = new JSONObject(receiveJson);
                    String clientIp = root.getString("clientIp");
                    String chatName = root.getString("chatName");
                    String message = root.getString("message");
                    System.out.println("<" + chatName + "@" + clientIp + "> " + message);
                }
            } catch (IOException e) {
                System.out.println("[클라이언트] 서버 연결 끊김");
                System.exit(0);
            }
        });
        thread.start();
    }

    //메소드: JSON 보내기
    public void send(String json) throws IOException {
        dos.writeUTF(json);
        dos.flush();
    }

    //메소드: 서버 연결 종료
    public void unconnect() throws IOException {
        socket.close();
    }

    //메소드: 메인
    static void main() {
        try {
            ChatClient chatClient = new ChatClient();
            chatClient.connect();

            Scanner sc = new Scanner(System.in);
            System.out.println("대화명 입력: ");
            chatClient.chatName = sc.nextLine();
            JSONObject root = new JSONObject();
            root.put("command", "incoming");
            root.put("data", chatClient.chatName);
            String json = root.toString();
            chatClient.send(json);

            chatClient.receive();

            System.out.println("----------------------------------");
            System.out.println("메시지 입력 후 Enter");
            System.out.println("채팅 종료는 q 또는 Q 입력 후 Enter");
            System.out.println("----------------------------------");
            while (true) {
                String message = sc.nextLine();
                if(message.equalsIgnoreCase("q")) {
                    break;
                } else {
                    root = new JSONObject();
                    root.put("command", message);
                    root.put("data", message);
                    json = root.toString();
                    chatClient.send(json);
                }
            }
            sc.close();
            chatClient.unconnect();
        } catch (IOException e) {
            System.out.println("[클라이언트] " + e.getMessage());
        }
    }
}
