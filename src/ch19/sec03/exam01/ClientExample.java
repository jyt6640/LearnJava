package ch19.sec03.exam01;

import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
    static void main() {
        try {
            Socket socket = new Socket("localhost", 50001);

            System.out.println("[클라이언트] 연결 성공");

            //Socket 닫기
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
        } catch (UnknownHostException e) {
            //IP 표기 방법이 잘못되었을 경우
            System.out.println("[클라이언트] 서버 주소를 확인할 수 없습니다.");
        } catch (Exception e) {
            // 해당 포트의 서버에 연결할수 없는 경우
            System.out.println("[클라이언트] 서버 연결에 실패했습니다.");
        }

    }
}
