// aabbbcc = a2b3c2
// abbccc = a1b2c3

import java.util.*;
public class CharacterFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compressedString(s));
    }
    public static String compressedString(String s){
        if(s==null || s.isEmpty()){
            return "";
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                compressed.append(s.charAt(i)).append(count);
                System.out.println(i);
                count=1;
            }
        }
        compressed.append(s.charAt(s.length()-1)).append(count);
        return compressed.toString();
    }
}