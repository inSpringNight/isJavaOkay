package goesHere;

public class ChalAssignEqual {
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

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both okay!");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("Error. bruh");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("What are you doing !?");
        }
    }
}
