package com.company;

public class lenghtoflastword {
    public int countlength(String string) {
        int temp = 0, i = string.length()-1;
        while((temp==0 || string.charAt(i) != ' ') && i >=0){
            if(string.charAt(i) != ' ') temp++;
            i--;
        } return temp;
    }
}
