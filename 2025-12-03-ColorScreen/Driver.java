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
}
