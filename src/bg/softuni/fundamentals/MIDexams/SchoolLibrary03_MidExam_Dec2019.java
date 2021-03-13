package bg.softuni.fundamentals.MIDexams;
/*On the first line you will receive a String, representing shelf with books in library. Every book is separated with "&".
 On the next lines until you receive "Done" command, you will receive following commands:
•	Add Book | {book name}
o	Add a book at first place in the shelf.
o	If the book already is present on the shelf, ignore the command.
•	Take Book | {book name}
o	Remove the book with the given name only if the book is on the shelf, otherwise ignore this command.
•	Swap Books | {book1} | {book2}
o	If both books are on the shelf, swap their places.
•	Insert Book | {book name}
o	Add a book at the end of the book collection.
•	Check Book | {index}
o	Print the name of the book on the given index the book.
o	If the index is invalid, ignore the command.
Input
•	On the 1st line, you will receive a string, representing book names, separated with "&".
•	On the next lines, until you receive "Done", you will receive commands in the format described above.
Output
•	Print the collection of books joined by ", ".
"{firstBook}, {secondBook}, …{lastBook}"
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary03_MidExam_Dec2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> books = readLineOfNumbers(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] token = command.split(" \\| ");
            switch (token[0]) {
                case "Add Book":
                    addBookAtFirstShelf(books, token[1]);
                    break;
                case "Take Book":
                    takeBook(books, token[1]);
                    break;
                case "Swap Books":
                    swapBooks(books, token[1], token[2]);
                    break;
                case "Insert Book":
                    insertBook(books, token[1]);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(token[1]);
                    checkBook(books, index);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i));
            if(i< books.size()-1){
                System.out.print(", ");
            }
        }
    }
    private static void checkBook(List<String>list,int index){
        if(0<=index&&index< list.size()){
            System.out.println(list.get(index));
        }
    }
    private static void insertBook(List<String>list,String token){
        list.add(token);
    }

    private static void swapBooks(List<String>list, String tokenFirst, String tokenSecond){
        if(list.contains(tokenFirst)&&list.contains(tokenSecond)){
            int indexOfFirstBook = list.indexOf(tokenFirst);
            int indexOfSecondBook = list.indexOf(tokenSecond);
            list.set(indexOfFirstBook,tokenSecond);
            list.set(indexOfSecondBook,tokenFirst);
        }
    }

private static void takeBook(List<String>list,String token){
        if(list.contains(token)){
            list.remove(token);
        }
}
    private static void addBookAtFirstShelf(List<String>list, String token){
        if(!list.contains(token)) {
            list.add(0, token);
        }
    }
    public static List<String> readLineOfNumbers(String line) {
        String[]lineAsStrings = line.split("&");
        List<String >elements = new ArrayList<>();
        //чете с краткия foreach
        for (String s : lineAsStrings) {
            elements.add(s);
        }
        return elements;
    }
}
