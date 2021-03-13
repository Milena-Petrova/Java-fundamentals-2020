package bg.softuni.fundamentals.RegEX;

import java.util.Scanner;
/*
A valid ticket should have exactly 20 characters. The winning symbols are '@', '#', '$' and '^'.
But in order for a ticket to be a winner the symbol
should uninterruptedly repeat for at least 6 times in both the tickets left half and the tickets right half.
 */
public class WinningTicket_more_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "[\\\\@]{6,}|[\\\\$]{6,}|[\\\\#]{6,}|[\\\\^]{6,}";

    }
}
