package goesHere;

public class andOperator {
    public static void main(String[] args) {
        System.out.println("Hello, SummerNight");
        boolean isHuman = true;
        if (isHuman == false) {
            System.out.println("You're not a Human");
            System.out.println("Go Away!");
        } else {
            System.out.println("Welcome, Human. We come in peace");
        }

        int topScore = 80;
        if (topScore <= 100){
            System.out.println("Congratulation you've won!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Great from second, less from top");
        }
    }
}
