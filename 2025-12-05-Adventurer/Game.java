import java.util.Scanner;
import java.util.Random;
public class Game{
  public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    Random random = new Random(); // random obj for the unpredictable moves   
    System.out.println("Enter name for Barbarian");
    String playerName = userInput.nextLine();
    int playerHp = 0;
    while(playerHp <= 0){
     try{
        System.out.println("enter hp for Barbarian");
        playerHp = Integer.parseInt(userInput.nextLine());
        } catch (NumberFormatException e){
        System.out.println("invalid hp, must be greater than zero, enter again ");
       }
     }
    System.out.println("Enter name for CodeWarrior");
    String enemyName = userInput.nextLine();
    int enemyHp=0;
    while(enemyHp <= 0){
     try{
        System.out.println("enter hp for CodeWarrior");
        enemyHp = Integer.parseInt(userInput.nextLine());
        } catch (NumberFormatException e){
        System.out.println("invalid hp, must be greater than zero, enter again ");
       }
     } 
  Adventurer enemy = new CodeWarrior(enemyName, enemyHp);
  Adventurer player = new Barbarian(playerName, playerHp);
  }
}
