package bg.softuni.fundamentals.LISTS;
/*You will be given two hands of cards, which will be integer numbers.
Assume that you have two players. You have to find out the winning deck and respectively the winner.
You start from the beginning of both hands. Compare the cards from the first deck to the cards
 from the second deck. The player, who has bigger card, takes both cards and puts them at the
 back of his hand - the second player's card is last, and the first person's card (the winning one)
 is before it (second to last) and the player with smaller card must remove the card from his deck. If both players'
 cards have the same values - no one wins, and the two cards must be removed from the decks.
 The game is over when one of the decks is left without any cards.
 You have to print the winner on the console and the sum of the left cards:
  "Player {one/two} wins! Sum: {sum}".
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGameEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> cardsOfFirstPlayer = parseList(scanner.nextLine());
        List<Integer> cardsOfSecondPlayer = parseList(scanner.nextLine());
        while (!cardsOfFirstPlayer.isEmpty() && !cardsOfSecondPlayer.isEmpty()) {
            int firstCard = cardsOfFirstPlayer.get(0);
            int secondCard = cardsOfSecondPlayer.get(0);
            cardsOfFirstPlayer.remove(0);
            cardsOfSecondPlayer.remove(0);
            if (firstCard > secondCard) {
                cardsOfFirstPlayer.add(firstCard);
                cardsOfFirstPlayer.add(secondCard);
            } else if (secondCard > firstCard) {
                cardsOfSecondPlayer.add(secondCard);
                cardsOfSecondPlayer.add(firstCard);
            }
        }
            int sum = 0;
            if (!cardsOfFirstPlayer.isEmpty()) {
                for (Integer integer : cardsOfFirstPlayer) {
                    sum += integer;
                }
                System.out.printf("First player wins! Sum: %d", sum);
            } else {
                for (Integer integer : cardsOfSecondPlayer) {
                    sum += integer;
                }
                System.out.printf("Second player wins! Sum: %d", sum);
            }
        }
        private static List<Integer> parseList (String line){
            String[] lineAsString = line.split(" ");
            List<Integer> array = new ArrayList<>();
            for (String s : lineAsString) {
                array.add(Integer.parseInt(s));
            }
            return array;
        }
}

