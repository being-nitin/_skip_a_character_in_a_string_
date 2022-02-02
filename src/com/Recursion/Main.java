package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// remove all the 'a' from the string.
        String p = " ";
        String up = "baaccd";
        skip(p,up);
        System.out.println(skip1(up));

    }
    /* way first. . . . in this we will not return a string rather it we will put the modified string in
       the argumant and will return it in main condition.
    */

    public static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    /*
    Way second in this we will not return a string instead odf returning we will recursively call it,
    till it gets empty.
     */
    public static String skip1(String up){
        if(up.isEmpty()) {
            return " ";
        }
         char ch = up.charAt(0);
            if (ch == 'a') {
                return skip1(up.substring(1));
            } else {
                return ch + skip1(up.substring(1));
            }
        }
}
