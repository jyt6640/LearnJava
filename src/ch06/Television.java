package ch06;

public class Television {
    static String company = "MyCompony";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }
}
