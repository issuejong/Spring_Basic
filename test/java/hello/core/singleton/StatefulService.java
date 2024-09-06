package hello.core.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 필드

    //지역 변수로 받을 수 있게끔 해줌
    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
        return price;
    }

    public int getPrice() {
        return price;
    }
}
