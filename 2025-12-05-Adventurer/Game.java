import java.util.Scanner;
public class Game{
  public static void main(String [] args){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter name for CodeWarrior");
    String CodeWarriorName = userInput.nextLine();
  Adventurer enemy = new CodeWarrior(CodeWarriorName, CodeWarriorHp);
  Adventurer player = new Barbarian(BarbName, Barbhp);
  }
}
