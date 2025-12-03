import java.util.Random;
public class ColorDemo{
  public static final String CLEAR_SCREEN = "\u001b [2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static final String RESET = "\u001b[0m";
  public static final String[] COLORS = {
   "\u001b[31m", //Red
   "\u001b[32m",//Green
   "\u001b[33m",//yellow
   "\u001b[34m",//blue
   "\u001b[35m"//magenta
  };
 //go to specified cursor pos
  public static void go(int r, int c){
   System.out.print("\u001b[" + r + ";" +c+ "f");
  }
  //color function
  public static void color(int foreground,  int background){
   System.out.print("\u001b[" + foreground + ";" + (background +10)+"m"); 
  }
  //sleep helper milliseconds
  public static void sleep(int ms){
    try{
       Thread.sleep(ms);
     } catch (Exception e){}
    }
  public static  void main(String[] args){
    Random rng = new Random();
    int rows = 10;
    int cols = 30;
    System.out.print(CLEAR_SCREEN + HIDE_CURSOR);
   for(int t=0; t<20;t++){ //refresh
     for(int r =1;r<=rows;r++){
       for(int c = 1;c<=cols;c++){
       go(r,c);   
       int foreground = 31 + rng.nextInt(6); //red -> cyan
       int background = 40 + rng.nextInt(6);//backgrounds 40-45
       color(foreground, background);
       System.out.print("*");//test if forground and background acc work
       System.out.print(RESET);
      }
     }
     sleep(200);
   }
   System.out.print(SHOW_CURSOR+ RESET);
   }
} 
