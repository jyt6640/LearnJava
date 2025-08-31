package ch13.Q2;

public class ContainerExample {
    static void main() {
        Container<String> container1 = new Container<>();
        container1.set("홍길동");
        String name = container1.get();
        System.out.println("name: " + name);

        Container<Integer> container2 = new Container<>();
        container2.set(6);
        int value = container2.get();
        System.out.println("value: " + value);
    }
}
