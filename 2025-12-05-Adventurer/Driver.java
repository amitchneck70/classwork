public class Driver{
  public static void main(String[] args){
    Adventurer player1 = new Barbarian("Ira", 20);
    Adventurer player2 = new Barbarian("Alison", 20);
    //battle
    System.out.println(player1.attack(player2));
    System.out.println(player2.support());
    System.out.println(player1.specialAttack(player2));
    System.out.println(player2.specialAttack(player1));
   //stats after attacks/support
   System.out.println("post-battle statistics");
   System.out.println(player1.getName() + " HP: " + player1.getHP()+ ","+player1.getSpecialName()+ ": "+
    player1.getSpecial());
   System.out.println(player2.getName() + " HP: " + player2.getHP()+ ","+player2.getSpecialName()+ ": "+
     player2.getSpecial());
             }
          }
