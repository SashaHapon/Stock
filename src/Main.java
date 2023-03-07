
import com.stock.Stock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nttt;
        System.out.println("Write size of stock: ");
        Scanner in = new Scanner(System.in);
        int Size = in.nextInt();
        Stock stock = new Stock();
        stock.set_sizeOfStock(Size);
        stock.arrays();
        stock.getGoodOfArray(stock.arrays());
    }
    
}
