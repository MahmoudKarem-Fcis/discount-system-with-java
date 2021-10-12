/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beauty.saloon;

import java.util.Scanner;

/**
 *
 * @author inbrief
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    double firstprice;

    double discprice;
    double total_price;
    
    double counttotal = 0 ;
    
    double serv_dis_prem = 0.2;
    double serv_dis_gold = 0.15;
    double serv_dis_silver = 0.1;

    double prodc_dis_prem;
    double prodc_dis_gold;
    double prodc_dis_silver;

    public void Dscount() {
        prodc_dis_prem = 0.1;
        prodc_dis_gold = 0.1;
        prodc_dis_silver = 0.1;
    }

    Scanner reader = new Scanner(System.in);

    public double get_serv_dis_rate(String type) {

        switch (type) {
            case "premium":
                System.out.println("please enter item or service price");
                firstprice = reader.nextDouble();
                discprice = firstprice * serv_dis_prem;

                total_price = firstprice - discprice;
                
                counttotal = counttotal + total_price ;
                return total_price;

            case "gold":
                System.out.println("please enter item or service price");
                firstprice = reader.nextDouble();
                discprice = firstprice * serv_dis_gold;

                total_price = firstprice - discprice;
                
                counttotal = counttotal + total_price ;
                
                return total_price;
                

            case "silver":
                System.out.println("please enter item or service price");
                firstprice = reader.nextDouble();
                discprice = firstprice * serv_dis_silver;

                total_price = firstprice - discprice;
                
                counttotal = counttotal + total_price ;
                
                return total_price;
                
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }

    public double get_prodc_dis_rate(String type) {
        switch (type) {
            case "premium":
                System.out.println("please enter item or service price");
                firstprice = reader.nextDouble();
                discprice = firstprice * prodc_dis_prem;
                
                counttotal = counttotal + total_price ;
                
                return discprice;

            case "gold":
                System.out.println("please enter item or service price");
                firstprice = reader.nextDouble();
                discprice = firstprice * prodc_dis_gold;
                
                counttotal = counttotal + total_price ;
                
                return discprice;
                
            case "silver":
                System.out.println("please enter item or service price");
                firstprice = reader.nextDouble();
                discprice = firstprice * prodc_dis_silver;
                
                counttotal = counttotal + total_price ;
                
                return discprice;
                
            default:
                throw new IllegalArgumentException("wrong product type specified");
        }
    }

    public void setitemprice(double price) {

        firstprice = price;

    }

    public double getitemprice() {

        return firstprice;

    }

}
