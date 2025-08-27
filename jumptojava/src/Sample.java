public class Sample {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public void orderCoffee() {
        CoffeeType coffee = CoffeeType.AMERICANO; // 올바른 호출
        System.out.println("주문하신 커피는 " + coffee + "입니다.");
    }

    public static void main(String[] args) {
        // main 메서드에서 사용하려면 Sample 클래스의 객체를 생성해야 합니다.
        // 또는 아래처럼 정적(static)으로 선언하여 바로 접근할 수 있습니다.
        CoffeeType coffee = CoffeeType.CAFE_LATTE;
    }
}