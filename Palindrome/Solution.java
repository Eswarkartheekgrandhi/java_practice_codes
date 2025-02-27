/* Check a string is palindrome or not
 * Input: pop
 * Output: true
 * 
 * Input: Papa
 * Output: false
 */

import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean res = isPalindrome(str);
        System.out.println(res);
    }
    public static Boolean isPalindrome(String str){
        // str = str.toLowerCase();
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}