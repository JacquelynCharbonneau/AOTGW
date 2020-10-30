import java.util.Scanner;

public class AOTGW {
    Scanner s = new Scanner(System.in);

    //Either these will be here or in the Character Class
    public String name = "";
    public int currentHP = 0;
    public int maxHP = 0;
    public int amourClass = 0;
    public String class = ""; //Mage, Fighter, Archer to begin with

    //Load
    public void load() {
        //Figure out how to get info from txt, will be stored / created in folder
    }

    //Setup
    //Would like to add some verification eventually!
    public void setUp() {
        System.out.println("Please enter your character's name: ");
        name = s.nextLine();

    }

    //Run


}