package ch03.sec01;

public class BitShiftExample2 {
    public static void main(String[] args) {
        int value = 772;

        //우측으로 3byte 이동하고 끝 1바이트만 읽음
        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

        //우측으로 2byte 이동하고 끝 1바이트만 읽음
        byte byte2 = (byte) (value >>> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번째 바이트 부호 없는 값: " + int2);

        //우측으로 1byte 이동하고 끝 1바이트만 읽음
        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값: " + int3);

        //끝 1바이트만 읽음
        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번쨰 바이트 부호 없는 값: " + int4);
    }
}
