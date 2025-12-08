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
  @Override
 public void setSpecial(int n){
  stamina = n;
  }
  @Override
  public int getSpecialMax(){
    return maxStamina;
   }
  @Override
  public String attack(Adventurer other){
    other.applyDamage(3);
  return getName() + "attacked" + other.getName();
  }
  @Override
  public String support(Adventurer other){
    other.setHP(other.getHP() + 2);
    return getName() + " supported" + other.getName();
  }
 @Override
 public String support(){
   setHP(getHP() +2);
   return getName() + " supported themself";
  @Override
  public String specialAttack(Adventurer other){
   if(stamina >= 3){
    stamina -= 3;
   other.applyDamage(7);
   return getName() + "  used special attack on " + other.getName();
  }
 return getName() + "does not have enough stamina"; 
 }
}
