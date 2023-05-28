package com.syntax.homeworks.homework25.card;

import java.util.Iterator;
import java.util.LinkedList;

public class CardMain {
    public static void main(String[] args) {

        LinkedList<Card> cardsList = new LinkedList<>();
        cardsList.add(new Card(0.03, "visa"));
        cardsList.add(new Card(0.04, "master"));
        cardsList.add(new Card(0.05, "amex"));

        // Using for loop
        for (int i = 0; i < cardsList.size(); i++) {
            if (cardsList.get(i).getCardType().equalsIgnoreCase("visa")) {
                System.out.println(cardsList.get(i).toString());
                cardsList.get(i).setInterestRate(0.66);
                System.out.println("New interest rate is : " + cardsList.get(i).getInterestRate());
                cardsList.get(i).setCardType("visa platinum");
                System.out.println("New card type is : " + cardsList.get(i).getCardType());
            } else if (cardsList.get(i).getCardType().equalsIgnoreCase("master")) {
                System.out.println(cardsList.get(i).toString());
                cardsList.get(i).setInterestRate(0.77);
                System.out.println("New interest rate is : " + cardsList.get(i).getInterestRate());
                cardsList.get(i).setCardType("master X");
                System.out.println("New card type is : " + cardsList.get(i).getCardType());
            } else if (cardsList.get(i).getCardType().equalsIgnoreCase("amex")) {
                System.out.println(cardsList.get(i).toString());
                cardsList.get(i).setInterestRate(0.88);
                System.out.println("New interest rate is : " + cardsList.get(i).getInterestRate());
                cardsList.get(i).setCardType("amex black");
                System.out.println("New card type is : " + cardsList.get(i).getCardType());
            }
        }

        // Using advanced for loop
        for (Card card : cardsList) {
            if (card.getCardType().equalsIgnoreCase("visa platinum")) { // card object get modified, So work with new attributes
                System.out.println(card);
                card.setInterestRate(0.666);
                System.out.println("New interest rate is : " + card.getInterestRate());
                card.setCardType("visa standard");
                System.out.println("New card type is : " + card.getCardType());
            } else if (card.getCardType().equalsIgnoreCase("master X")) {
                System.out.println(card);
                card.setInterestRate(0.777);
                System.out.println("New interest rate is : " + card.getInterestRate());
                card.setCardType("master Y");
                System.out.println("New card type is : " + card.getCardType());
            } else if (card.getCardType().equalsIgnoreCase("amex black")) {
                System.out.println(card);
                card.setInterestRate(0.888);
                System.out.println("New interest rate is : " + card.getInterestRate());
                card.setCardType("amex white");
                System.out.println("New card type is : " + card.getCardType());
            }
        }

        // Using iterator
        Iterator<Card> cardsIterator = cardsList.iterator();
        while (cardsIterator.hasNext()) {
            Card card1 = cardsIterator.next();
            if (card1.getCardType().equalsIgnoreCase("visa standard")) {
                System.out.println(card1);
                card1.setInterestRate(0.6666);
                System.out.println("New interest rate is : " + card1.getInterestRate());
                card1.setCardType("visa silver");
                System.out.println("New card type is : " + card1.getCardType());
            } else if (card1.getCardType().equalsIgnoreCase("master Y")) {
                System.out.println(card1);
                card1.setInterestRate(0.7777);
                System.out.println("New interest rate is : " + card1.getInterestRate());
                card1.setCardType("master Z");
                System.out.println("New card type is : " + card1.getCardType());
            } else if (card1.getCardType().equalsIgnoreCase("amex white")) {
                System.out.println(card1);
                card1.setInterestRate(0.8888);
                System.out.println("New interest rate is : " + card1.getInterestRate());
                card1.setCardType("amex gold");
                System.out.println("New card type is : " + card1.getCardType());
            }
        }
    }
}
