import java.util.Scanner;

public class AdventurersOfTheGreenWood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AOTGW game = new AOTGW();

        int choice = 0;
        
        System.out.println("Welcome to the Adventurers of the Green Wood!");
        System.out.println();

        System.out.println("Please choose an option:");
        System.out.println("1 - New Game");
        System.out.println("2 - Load Saved Game");
        System.out.println("3 - Exit");
        choice = s.nextInt();

        switch(choice) {
            case 2:
                game.load();
                game.run();
                break;
            case 1:
                game.setUp();
                game.run();
                break;
            default:
                break;
        }
    }
}