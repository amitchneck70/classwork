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
  //sleep helper


  }
