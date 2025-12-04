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
    for(int row = 2; row < 30;row++){
      Text.go(row,1); //start @ row 2 column one bc top and bottom take up first
      Text.color(Text.BRIGHT, Text.YELLOW); // bright yellow
      Text.go(row,80); //right column
      Text.color(Text.BRIGHT, Text.GREEN);
      System.out.print("#");
    }
  }
        
}

