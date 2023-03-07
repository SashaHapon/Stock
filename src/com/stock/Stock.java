package com.stock;

import com.stock.goods.Laptop;
import com.stock.goods.Phone;
import com.stock.goods.TV;

import java.util.Scanner;

public class Stock {
    int eee;
    private int sizeOfStock;
    public void set_sizeOfStock( int size){
       this.sizeOfStock = size;
    }
    public int get_sizeOfStock(){
        return sizeOfStock;
    }

    public  Goods[] arrays(){
        Goods[] array = new Goods[sizeOfStock];
        for (int i = 0; i<sizeOfStock - 1; i++){
            System.out.println("""
                    0 - TV;
                    1 - Laptop;
                    2 - Phone; 
                    """);
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            if (number == 0) {
                TV tv = new TV();
                System.out.println("Name of TV");
                Scanner ff = new Scanner(System.in);
                String name = ff.nextLine();
                tv.setNameOfGood(name);
                System.out.println("Prise of TV");
                String num = ff.nextLine();
                tv.setPriseOfGood(num);
                array[i] = new TV();

            }
            if (number == 1){
                Laptop lap = new Laptop();
                System.out.println("Name of Laptop");
                Scanner ff = new Scanner(System.in);
                String name = ff.nextLine();
                lap.setNameOfGood(name);
                System.out.println("Prise of Laptop");
                String num = ff.nextLine();
                Laptop.setPriseOfGood(num);
                array[i] = new Laptop();
            }
            else{
                Phone phone = new Phone();
                System.out.println("Name of Phone");
                Scanner ff = new Scanner(System.in);
                String name = ff.nextLine();
                phone.setNameOfGood(name);
                System.out.println("Prise of Phone");
                String num = ff.nextLine();
                phone.setPriseOfGood(num);
                array[i] = new Phone();
            }
        }
        return array;
    }
    public void getGoodOfArray(Goods[] arrays){
        System.out.println("What number of stock do u want to see?");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Goods[] f = new Goods[t];
        System.out.println("Name: " + Goods.getNameOfGood() + ", Price: " + Goods.getPriseOfGood());
    }

}
