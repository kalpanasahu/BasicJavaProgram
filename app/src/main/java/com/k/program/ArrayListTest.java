package com.k.program;

import java.util.ArrayList;
import java.util.List;

/*Interview question
* create arraylist and add ,print
*
*
* */
public class ArrayListTest {
    public static void main(String[] arg){
        List<String> lst=new ArrayList<String>();
        lst.add("kalpana");
        lst.add("sahu");
        for(String str:lst){
            System.out.print(" name "+str);
        }
    }
}
