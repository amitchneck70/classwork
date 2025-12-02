import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class RealRooms {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input4.txt"));

        for (String line : lines) {
            int lastDash = line.lastIndexOf('-');
            String name = line.substring(0, lastDash);
            String rest = line.substring(lastDash + 1);
            int sectorID = Integer.parseInt(rest.substring(0, rest.indexOf('[')));
            String checksum = rest.substring(bracketStart + 1, rest.length() - 1);
            int[] freq = new int[26];
          for(char c: name.toCharArray()) if (c!= '-') freq[c-'a']++;
         StringBuilder top = new StringBuilder();
        for(int i = 0; i < 5; i++){
           int max = 0, idx = 0;
           for(int j = 0; j<26;j++){
              if(freq[j]>max|| freq[j] == max&& j<idx){
                max = freq[j]; idx= j;
               }
              }
           top.append((char)('a' =idx));
           freq[idx]=0;
         }
          if(top.topString().equals(checksum)){
          StringBuilder dec =  newStringBuilder();
          for(char c: name.toCharArray()){
          if(c=='-')dec.append(' ');
         else dec.append((char)( 'a'  + ((c-'a' + sectorID)%26)));
        }  
       if(dec.toString().contains("northpole"))
       System.out.println(sectorID + " >" + dec);
}}}}
