package ch19.sec05.exam02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {
    static void main() {
        try {
            //DatagramSocket 생성
            DatagramSocket datagramSocket = new DatagramSocket();

            //구독하고 싶은 뉴스 주제 보내기
            String data = "정치";
            byte[] bytes = data.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(
                    bytes, bytes.length,
                    new InetSocketAddress("localhost", 50001)
            );
            datagramSocket.send(sendPacket);

            //뉴스 받기
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                datagramSocket.receive(receivePacket);
                String news = new String(receivePacket.getData(), 0,
                        receivePacket.getLength(), "UTF-8");
                System.out.println(news);

                //10번째 뉴스를 받으면 while 문 종료
                if(news.contains("뉴스9")) {
                        break;
                    }
                }
            //DatagramSocket 닫기
            datagramSocket.close();

            } catch (Exception e) { }
    }
}
