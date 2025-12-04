import java.util.Random;
public class Driver{
  public static void main(String[] args){
    System.out.print(Text.CLEAR_SCREEN); //clear terminal screen
    System.out.print(Text.HIDE_CURSOR); //hide cursor while draw
    drawBorder(); //border creation + border color
    int [] numbers = generateRandNum(); //create 4 random ints
    displayNum(numbers); // show the generated random num on the screen with colors
   drawSeparator(); //horizontal line below the numbers
   drawMiddle(); // draw something in the middle
   Text.go(31,0); //move cursor to line 31 so prompt is below screen
     System.out.println(Text.RESET);
  }
  //draw the border
  public static void drawBorder(){
    for(int col = 1; col <= 80; col++){
      Text.go(1,col); //move cursor to top row
      Text.color(Text.BRIGHT, Text.CYAN);
      System.out.print("#"); //print border char, makes it 1 char thick
    }
     for(int col = 1; col <= 80; col++){
      Text.go(30,col); //move cursor to top row
      Text.color(Text.BRIGHT, Text.MAGENTA);
      System.out.print("#"); //print border char, makes it 1 char thick
    }
    for(int row = 2; row < 30;row++){
      Text.go(row,1); //start @ row 2 column one bc top and bottom take up first
      Text.color(Text.BRIGHT, Text.YELLOW); // bright yellow
      System.out.print("#");
     } 
     for(int row = 2; row < 30; row++){
       Text.go(row,80); //right column
      Text.color(Text.BRIGHT, Text.GREEN);
      System.out.print("#");
      }
  }
    public static int[] generateRandNum() {
        Random rand = new Random(); 
        int[] nums = new int[4];    
        for (int i = 0; i < 4; i++) {
            nums[i] = rand.nextInt(100); // rand  num 0-99
        }
        return nums; 
    }
  public static void displayNum(int[] nums){
    int [] pos = {10, 30, 50, 70}; 
    for (int i = 0; i < nums.length; i++) {
      Text.go(2, pos[i]); 
      if (nums[i] < 25) {
        Text.color(Text.BRIGHT, Text.RED); // if number less than 25 its bright red
      } else if (nums[i] > 75) {
        Text.color(Text.BRIGHT, Text.GREEN); // if over 75 bright green
      } else {
        Text.color(Text.WHITE); 
      }
      System.out.print(nums[i]);
    }
  }
  // horiztonal sep
  public static void drawSeparator(){
    Text.go(3,2);
    Text.color(Text.BRIGHT, Text.BLUE); 
    for (int i = 2; i < 80; i++) {
      System.out.print("-");
    }
  }
  public static void drawMiddle(){
    Text.go(15,35);
    Text.color(Text.MAGENTA, Text.YELLOW, Text.BRIGHT); 
    System.out.print("(^u^)"); //its supposed to be a smiley face
  }
}



