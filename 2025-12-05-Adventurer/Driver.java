public class Driver{
  public static void main(String[] args){
    Adventurer player1 = new Warrior("Ira", 20);
    Adventurer player2 = new Warrior("Alison", 20);
    //battle
    System.out.println(p1.attack(p2));
    System.out.println(p2.support());
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2.specialAttack(p1));
   //stats after attacks/support
   System.out.println("post-battle statistics");
   System.out.println(p1.getName() + "HP: " + p1.getHP()+ ","+p1.getSpecialName()+ ": "+
    p1.getSpecial()); 
   System.out.println(p2.getName() + "HP: " + p2.getHP()+ ","+p2.getSpecialName()+ ": "+
    p2.getSpecial()); 
