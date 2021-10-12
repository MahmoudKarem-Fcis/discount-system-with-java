/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beauty.saloon;

import java.util.Scanner;

/**
 *
 * @author mahmoud karem
 */
public class visit {

    public static void main(String[] args) {

        String custname;
        String membertype;
        double totalprice;
        int input;
        
        String serv_or_prod ;

        double normalprice = 1;
        
        double prod_normalprice ;
        double sumnormalprice = 0;

        customer newcust = new customer();
        Discount newdisc = new Discount();

        Scanner reader = new Scanner(System.in);

        System.out.println("please enter your name");
        custname = reader.next();
        newcust.setname(custname);
        
        System.out.println("are you need to pay for :");
        System.out.println("1-services" +"\n"+ "2-products");
        
        serv_or_prod =reader.next();
        
        
        if(serv_or_prod.equals("services"))
        {
        System.out.println("please enter membership type if not member press 'n' ");
        System.out.println("1- premium" + "\n" + "2- gold" + "\n" + "3- silver");
        
        
        membertype = reader.next();
        
        if (membertype.equals("premium") || membertype.equals("gold") || membertype.equals("silver") ) {
            
            newcust.setmembertype(membertype);

            while (true) {
                switch (membertype) {
                    case "premium":
                        totalprice = newdisc.get_serv_dis_rate("premium");

                        System.out.println("Costumer Name:" + custname + " "
                                + "\n" + "Discount Rate:" + newdisc.serv_dis_prem * 100 + "%" + "\n"
                                + "Discounted Price:" + totalprice + "\n" + "totalprice" + newdisc.counttotal);

                        break;
                    case "gold":
                        totalprice = newdisc.get_serv_dis_rate("gold");

                        System.out.println("Costumer Name:" + custname + " "
                                + "\n" + "Discount Rate:" + newdisc.serv_dis_gold * 100 + "%" + "\n"
                                + "Discounted Price:" + totalprice + "\n" + "totalprice" + newdisc.counttotal);

                        break;
                    case "silver":
                        totalprice = newdisc.get_serv_dis_rate("silver");

                        System.out.println("Costumer Name:" + custname + " "
                                + "\n" + "Discount Rate:" + newdisc.serv_dis_silver * 100 + "%" + "\n"
                                + "Discounted Price:" + totalprice + "\n" + "totalprice" + newdisc.counttotal);

                        break;
                    default:
                        throw new IllegalArgumentException("wrong product type specified");
                }

                System.out.println("do you need to make another payment chose 1 for yes 2 for no ");
                System.out.println("1- yes" + "\n" + "2- no");

                input = reader.nextInt();

                if (input == 1) {
                    continue;
                } else {
                    System.out.println("totla price is : " + newdisc.counttotal);
                    break;
                }

            }

        } else {
            while (true) {
                System.out.println("2-please enter item or service price");
                normalprice = reader.nextDouble();
                
                sumnormalprice = sumnormalprice + normalprice;
                System.out.println("Costumer Name:" + custname + " " + "\n" + "totalprice " + sumnormalprice);
                System.out.println("do you need to make another payment chose 1 for yes 2 for no");
                System.out.println("1- yes" + "\n" + "2- no");

                input = reader.nextInt();

                if (input == 1) {
                    continue;
                } else {
                    System.out.println("totla price is : " + sumnormalprice);
                    break;
                }
            }
        }
        }
        else if(serv_or_prod.equals("products"))
        {
            while (true) {
                System.out.println("3-please enter proudect price");
                normalprice = reader.nextDouble();
                
                prod_normalprice = normalprice * 0.1;
                
                sumnormalprice = sumnormalprice + (normalprice - prod_normalprice) ;
               
                System.out.println("Costumer Name:" + custname + " " + "\n" + "totalprice " + sumnormalprice);
                System.out.println("do you need to make another payment chose 1 for yes 2 for no");
                System.out.println("1- yes" + "\n" + "2- no");

                input = reader.nextInt();

                if (input == 1) {
                    continue;
                } else {
                    System.out.println("totla price is : " + sumnormalprice);
                    break;
                }
            }
        }
    }

}
