package bg.softuni.fundamentals.OBJECTandCLASSES;

public class Demo {
    //How to represent a student in Java: firstName, lastName, averageScore
    // създаваме клас, за да имаме шаблон за обекта
    static class Student {
        String firstName;
        String secondName;
        double averageScore;
        String mail;

        //конструктор :
        Student(String fName, String lName, double averageSc) {
            firstName = fName;
            secondName = lName;
            averageScore = averageSc;
        }//getter-и и setter-и за достъпване на стойностите или сетване на нови

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setAverageScore(double averageScore) {
            this.averageScore = averageScore;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getFirstName() {
            return firstName;
        }

        public double getAverageScore() {
            return averageScore;
        }

        public String getSecondName() {
            return secondName;
        }
        public void info() {
            String message = String.format("First Name:%s%nAverageScore: %.2f", getFirstName(), getSecondName(), getAverageScore());
        }
    }
    public static void main(String[] args) {
        //създаваме инстанция на обекта на този клас-->student
      Student st1 = new Student("Milena","Petrova",5.75);
      Student st2 = new Student("Radoslav", "Petrov", 5.75);
      //  st1.averageScore = 4;//може да сетва нова стойност на променливата
        //по-добре обаче с гетъри и сетъри


        System.out.println(st1.getFirstName());
        System.out.println(st1.getSecondName());
        System.out.println(st1.getAverageScore());


        System.out.println(st2.getFirstName());
        System.out.println(st2.getSecondName());
        System.out.println(st2.getAverageScore());


    }

}
