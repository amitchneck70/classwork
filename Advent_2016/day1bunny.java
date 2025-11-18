import java.util.*;
import java.io.*;
public class day1bunny{
  public static void main(String[] args)throws Exception {
   Scanner sc = new Scanner(new File("day1.txt"));
   String line = sc.nextLine();
  sc.close();
   String[] moves = line.split(",\\s*");
   List <String> visited = new ArrayList<>();
  int x = 0, y = 0, dir = 0;
  visited.add("0,0");
  for(String move: moves){
    dir = (dir +(move.charAt(0) == 'R'? 1:3))%4;
    int dist = Integer.parseInt(move.substring(1));
    for(int i =0; i<dist;i++){
     if(dir == 0) y++;
     if(dir == 1) x++;
     if(dir == 2) y--;
    if(dir ==3) x--;
   String pos = x+","+ y;
   if(visited.contains(pos)){
     System.out.println(Math.abs(x)+Math.abs(y));
     return;
     }
     visited.add(pos);
       }
      } 
     }
    }
