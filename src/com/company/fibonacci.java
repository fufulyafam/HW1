package com.company;

public class fibonacci {
    public int countfibonacci(int n) {
        /**non-recursive method
         * int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            System.out.print(a + " + ");
            int next = a + b;
            a = b;
            b = next;
        }
        return a;
    } */


            if (n == 0){
                return 0;
            }
            if (n == 1){
                return 1;
            }
            else
                return countfibonacci(n - 1) + countfibonacci(n - 2);
            }
}
