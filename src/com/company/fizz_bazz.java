package com.company;

public class fizz_bazz {
    public int count_fizz_buzz(int n)
    {
        if (((n % 3) == 0) && ((n % 5) == 0)){System.out.println(n + " делится на 3 и 5 без остатка");}
            else if (n % 5 == 0) {System.out.println(n + " делится на 5 без остатка");}
                else if (n % 3 == 0) {System.out.println(n + " делится на 3 без остатка");}
                else{ System.out.println("Число " + n + " не делится ни на 3, ни на 5 без остатка!");}
        return n;
    }
}
