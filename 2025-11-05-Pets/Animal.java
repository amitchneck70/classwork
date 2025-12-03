public class Animal{
// instance variables (characteristics of all animals)
private String noise;
private int age;
private String name;
// constructor initialize Animal obj w given values
public Animal(String noise, int age, String name){
this.noise = noise;
this.age = age;
this.name = name;
}
//prints info abt animal
public void speak(){
System.out.println("My name is " + getName() + ".");
System.out.println("I am  " +age+ " years old.");
System.out.println("I say " + getNoise()+ ".");
}
  //getter, lets other classes access private String name
public String getName(){
return name;
}
  // getter, let other class get noise
public String getNoise(){
  return noise;
 }
}
