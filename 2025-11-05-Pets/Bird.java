public class Bird extends Animal{
  //instance variables, characteristics for Animals that are Birds
  private double height;
  private String color;
  //override method
  public Bird(String noise, int age, String name, double height, String color){
    super(noise, age, name);
    this.height = height;
    this.color = color;
  }
  public void speak(){
    super.speak();
    System.out.println("My feathers are colored " +color + ".");
    System.out.println("I am " + height + " inches tall.");
  }
public String getName(){
  return "The Mighty " + super.getName();
 }
}
