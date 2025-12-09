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
  // battle
  while(player.getHP()> 0 && enemy.getHP() > 0){ //keep going until someone dies
   System.out.println("\nPlayer: " + player.getName() + " " + player.getHP() + "/"+
   player.getmaxHP()+"HP, " + player.getSpecial() + "/" + player.getSpecialMax()+
   " " + player.getSpecialName()); 
   System.out.println("Enemy: " + enemy.getName() + " " + enemy.getHP() + "/"+ 
   enemy.getmaxHP()+"HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax()+ 
   " " + enemy.getSpecialName());  
   System.out.println("\nType: (a)ttack / (sp)ecial / (su)pport / quit"); 
  String action = userInput.nextLine().toLowerCase();
  if(action.equals("a") || action.equals("attack")){
    System.out.println(player.attack(enemy));  
  } else if(action.equals("sp") || action.equals("special")){
    System.out.println(player.specialAttack(enemy));
  } else if(action.equals("su") || action.equals("support")){ 
    System.out.println(player.support()); 
  } else if (action.equals("quit")){
   System.out.println("player has quit the game");
   break;
 } else {
   System.out.println("invalid  input, try again");
  continue;
 }
 if (enemy.getHP() > 0){
  int enemyAction = random.nextInt(3);
  if(enemyAction ==0){ 
  System.out.println(enemy.attack(player));
  } else if (enemyAction == 1){
   System.out.println(enemy.specialAttack(player));
 }else{
  System.out.println (enemy.support());
  }
 }
  if(player.getHP() <= 0){
   System.out.println("\n" + player.getName() + " has been defeated");
  }else if (enemy.getHP() <= 0){
   System.out.println("\n" + enemy.getName() +  "has been defeated");
 }
}
userInput.close();
}
}
