public class ArrayTest{
public static void main(String [] args){
 int anArray = new int[11];
System.out.print("part 2: ");
System.out.println(anArray);
for(int i = 0;i<anArray.length;i++){
anArray[i] = 100 + (i*10);
}
System.out.print("part 4: ");
System.out.println(anArray[0] + ", " + anArray[5]+", " + anArray[10]);
System.out.print("part 5: ");
for(int i = 0; i < anArray.length; i++){
System.oit.print(anArray[i] + " ");
}
System.out.println();
}
}
