package com.stock;
import com.stock.Goods;
public class Stock {
    private int sizeOfStock;
    private Goods[] arrayOfGoods;
    public void setSizeOfStock(int size) {
        this.sizeOfStock = size;
    }

    public int getSizeOfStock() {
        return sizeOfStock;
    }

    public void setArrayOfGoods(Goods[] array){
        this.arrayOfGoods = array;
    }

    public Goods[] getArrayOfGoods(){
        return arrayOfGoods;
    }

    public Goods getOneGood(int i){
        for (int i1 = 0; i1<=2; i1++){
            switch (i1){
                case 0: System.out.print("company: " + arrayOfGoods[i].getCompanyName()); break;
                case 1: System.out.print(", type: " + arrayOfGoods[i].getType()); break;
                case 2: System.out.print(", prise: " + arrayOfGoods[i].getPrice()); break;
            }
        }
        return null;
    }

    public int getFullPrice(){
        int m = 0;
        for(int i = 0; i<arrayOfGoods.length; i++){
            m += Integer.valueOf(arrayOfGoods[i].getPrice());
        }
        return m;
    }

}