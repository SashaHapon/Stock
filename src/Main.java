import com.stock.Goods;
import com.stock.Stock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Goods goods = new Goods();
        Scanner in = new Scanner(System.in);
        System.out.print("Write size of stock: ");
        int size = in.nextInt();
        stock.setSizeOfStock(size);
        stock.setArrayOfGoods(goods.filledStock(stock.getSizeOfStock()));
        stock.getOneGood(1);
        System.out.println("Full prise is: " + stock.getFullPrice());
    }
}