public class Driver {
  public static void main(String[] args){
   Animal a1 = new Animal("Meow", 1, "Matcha");
   a1.speak();
   System.out.println();

   Bird b1 = new Bird("Chirp", 5, "Ava", 10.9, "red");
   b1.speak();
   System.out.println();

   Animal a2 = new Bird("tweet", 4, "Max", 4, "black");
   Animal a3 = new Animal("Moo", 7, "Lola");
   Bird b3 = new Bird("Whistle", 9, "Chris", 7, "yellow");

   a1.speak();
   a2.speak();
   b1.speak();
   b3.speak();
  }
}
