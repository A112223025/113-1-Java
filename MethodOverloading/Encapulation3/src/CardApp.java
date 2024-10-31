package edu.shu.main;
import java.util.Scanner;
import edu.shu.chuck.*;

public class CardApp {
    public static void main(String[] args) {
        CashCard[] cards ={
                new CashCard(number:"A001", balance:50),
                new CashCard(number:"A002", balance:300),
                new CashCard(number:"A003", balance:1000, bonus:1),
                new CashCard(number:"A004")
        };
        Scanner inout = new Scanner(System.in);
//        for(CashCard Card : Cards){
//            System.out.printf("")
//        }
        for(int i = 0; i<cards.length; i++){
            System.out.printf("為(%s, %d, %d)儲值:" , cards[i].getNumber(), card[i].getBalance(), card[i].getBonus());
            if(i % 2 ==0){
                card.store(inout.nextInt());
            }
            else {
                cards[i].store(input.next(), input.nextInt());
            }
            System.out.println("明細(%s, %d, %d)%n ", cards[i] .getNumber(), cards[i].getBalance(),card[i].getBonus);
        }


    }
}
