package bg.softuni.fundamentals.OBJECTandCLASSES;

import java.util.*;

public class ArticleTwoEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            String line = scanner.nextLine();
            String[] lineAssArray = line.split(", ");
            //    lineAssArray[0]-->title, ;lineAssArray[1]-->content, lineAssArray[2]-->author
            Article article = new Article(lineAssArray[0], lineAssArray[1], lineAssArray[2]);
            articles.add(article);
        }
        String command = scanner.nextLine();
        if (command.equals("title")) {
            articles.sort(Comparator.comparing(Article::getTitle));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        }else if (command.equals("content")) {
            articles.sort(Comparator.comparing(Article::getContent));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(Article::getAuthor));
            System.out.print(articles.toString().replaceAll("[\\[\\],]", ""));
        }
    }
    static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public String toString() {
            return String.format("%s - %s: %s%n", this.title, this.content, this.author);
        }
        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }
    }
}
