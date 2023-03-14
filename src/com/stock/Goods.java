package com.stock;

import java.util.Scanner;

public class Goods {
    private String companyName;
    private String type;
    private int price;

    public void setCompanyName(String companyName){this.companyName = companyName;}
    public String getCompanyName(){return companyName;}
    public void setType(String companyName){this.type = companyName;}
    public String getType(){return type;}
    public void setPrice(int price){this.price = price;}
    public int getPrice(){return price;}

    public Goods[] filledStock(int sizeOfStock){
        int i = 0;
        Goods[] arrayOfGoods = new Goods[sizeOfStock];
        Goods object = new Goods();
        while (true){
            for (i = 0; i<=sizeOfStock; i++){
                if (i < sizeOfStock){
                    for (int j = 0; j<3; j++) {

                        Scanner in = new Scanner(System.in);
                        switch (j){
                            case 0: {
                                System.out.print("company:");
                                String r = in.nextLine();
                                object.setCompanyName(r);
                                break;}
                            case 1: {
                                System.out.print("model:");
                                String r = in.nextLine();
                                object.setType(r);
                                break;}
                            case 2: {
                                System.out.print("prise:");
                                int r = in.nextInt();
                                object.setPrice(r);
                                } break;
                        }
                        }
                        arrayOfGoods[i] = object;
                }else{
                    System.out.println("Stock is full!");
                    break;
                }
            }
            break;
        }
        return arrayOfGoods;
    }
}
