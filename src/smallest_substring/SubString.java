/*
 * 
 */
package smallest_substring;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SubString {
    public static void main(String[] args) {
        String s="abcda";
        char ch[]=s.toCharArray();
        String subString="";
        Set<Character> hm = new HashSet<>(); 
        for (int i=0;i<ch.length;i++) { 
            hm.add(ch[i]);
        } 
        Iterator iter=hm.iterator();
        while(iter.hasNext()){
            subString=subString+iter.next();
        }
        System.out.println(subString);
    } 
  
} 
  
            