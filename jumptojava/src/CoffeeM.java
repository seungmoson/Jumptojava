import java.util.HashMap;
import java.util.Map;

public class CoffeeM {
    //커피자판기
    //속성: 제품명, 가격, 잔액,
    Map<String, Integer> itemlist = new HashMap<>();
    int money = 0;

    //기능: 판별, 제품등록, 잔돈입금, 출금
    // 제품등록 리턴: void 이름: insertItem 입력값: 제품명, 가격
    public void insertItem(String name, int price) {
        itemlist.put(name, price);
    }
    // 제품수정 리턴: void 이름: updatItem
    public void deleteItem0(String name) {
        itemlist.remove(name);
    }

    // 잔액넣기
    public int insertItem(int money) {
        return this.money += money;
    }

    // 잔액출금
    public int  withdrawMoney(int money) {
        if(this.money >= money) {
            this.money -= money;
            return money;
        }else {
            money = this.money;
            return money;
        }
    }
    // 판매
    public void sellItem(String name,int inputMoney){
        if(itemlist.containsKey(name)){
            int price = itemlist.get(name);
            if(inputMoney < price){
                System.out.println("금액이 부족합니다.");
            } else {
                this.money += inputMoney;
                this.money -= inputMoney-price;
                System.out.println("잔액은 "+ (inputMoney-price) + "원 입니다.");
            }
        }

    }
}
