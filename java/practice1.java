import java.util.*;
import java.io.*;
public class practice1   {
   public static void main(String [] args) {
      HashMap map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
      
        //find key from value in HashMap Java - one to one mapping
        Integer intValue=2;
        String strKey = null;
        for(Map.Entry entry: map.entrySet()){
            if(intValue.equals(entry.getValue())){
                strKey = entry.getKey();
                break; //breaking because its one to one map
            }
       }
} }

