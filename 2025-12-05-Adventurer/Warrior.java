public class Warrior extends Adventurer {
   private int stamina;
   private int maxStamina;
  public Warrior(String name, int hp){
    super(name, hp);
    stamina = 5;
    maxStamina=10;
  }
  @Override 
  public String getSepcialName(){
   return "Stamina";
  }
  @Override 
  public int getSpecial(){
    return stamina;
  }

