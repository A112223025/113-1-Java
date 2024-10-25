package edu.shu.Angela.src;
import java.util.Scanner;
import edu.shu.Angela.*;

public class CardApp {

    public static void main(String[] args) {
        CashCard[] cards ={
                new CashCard("A001", 500, 0);
                new CashCard("A002", 300, 0);
                new CashCard("A003", 1000, 1);
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
