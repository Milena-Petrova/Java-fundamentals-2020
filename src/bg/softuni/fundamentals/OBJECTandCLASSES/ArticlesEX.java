package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.Scanner;

public class ArticlesEX {
    static class Article {//Описваме полетата на класа
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {//Създаваме си конструктора
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public String getTitle() {//правим си гетъри сетъри на полетата, за да ги достъпваме и променяме
            return title;
        }
        public String getContent() {
            return content;
        }
        public String getAuthor() {
            return author;
        }
        public void renameTitle(String title) {
            this.title = title;
        }
        public void editContent(String content) {
            this.content = content;
        }
        public void changeAuthor(String author) {
            this.author = author;
        }
        //custom method toString -> печата по зададен от нас начин, иначе Java си има дифолт метод
        public String toString(){
          return String.format(("%s - %s: %s"),getTitle(),getContent(),getAuthor());
        }
    }
    public static void main(String[] args) {//След като сме създали класа, си разписваме програмата
        Scanner scanner = new Scanner(System.in);
        String[]data = scanner.nextLine().split(", ");//сплит по точка и запета
        String title = data[0];
        String content = data[1];
        String author = data[2];

        Article article = new Article(title,content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            switch (command) {
                case "Edit":
                    article.editContent(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.renameTitle(input[1]);
                    break;
            }

        }
        System.out.println(article.toString());
    }
}
