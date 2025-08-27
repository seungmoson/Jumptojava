import java.util.ArrayList;

public class MoneyCheck {
    public static void main(String[] args) {
        ArrayList<String> porket =  new ArrayList<>();
        porket.add("2000");
        porket.add("card");
//        int money = 2000;
//        boolean hascard = true;
        String moneyString = porket.get(porket.indexOf("2000"));
        int money = Integer.parseInt(moneyString);
        if ( money >= 3000 || porket.contains("card")) {
            System.out.println("택시타세요.");
        }
        else {
            System.out.println("걸어가세요.");
        }
    }
}
