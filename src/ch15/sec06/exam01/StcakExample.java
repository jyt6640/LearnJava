package ch15.sec06.exam01;

import java.util.Stack;

public class StcakExample {
    public static void main(String[] args) {
        //Stack 컬렉션 생성
        Stack<Coin> coinBox = new Stack<Coin>();

        //동전 넣기
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        //동전을 하나씩 꺼내기
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop(); //가장 위에 있는 동전 꺼내기
            System.out.println("꺼낸 동전: " + coin.getValue() + "원");
        }
    }
}
