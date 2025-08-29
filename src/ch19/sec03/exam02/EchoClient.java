package ch19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    static void main() {
        try {
            Socket socket = new Socket("localhost", 50001);

            System.out.println("[클라이언트] 연결 성공");

            //-------------------------------------------------------------------------
            /*
            //데이터 보내기
            String sendMessage = "나는 자바가 좋아~";
            OutputStream os = socket.getOutputStream();
            byte[] bytes = sendMessage.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            //데이터 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[1024];
            int readByteCount = is.read(bytes);
            String message = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("[클라이언트] 데이터 받음: " + message);
            */
            //-------------------------------------------------------------------------
            //데이터 보내기
            String sendMessage = "나는 자바가 좋아~";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(sendMessage);
            dos.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            //데이터 받기
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String message = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음: " + message);
            //-------------------------------------------------------------------------

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
