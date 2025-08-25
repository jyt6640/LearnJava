package ch04;

public class four {
    public static void main(String[] args) {
        //1~100 3의 배수 총합
            int sum = 0;
            for(int i=1; i<=100; i++){
                if(i%3==0){
                    sum += i;
                }
            }
            System.out.println("1~100 3의 배수 총합: " + sum);
    }
}

