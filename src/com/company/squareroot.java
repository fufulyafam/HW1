package com.company;

public class squareroot {
    public int findsquareroot(int number) {
        //Newton Raphson
        // Formula : root = (n + (x/n))/2, where root = actual root, n = assumed root and
        //number = user input
        if (number == 0) return 0;
        double root, n = number;
        while (true) {
            root = 0.5 * (n + (number / n));
            if (Math.abs(root - n) < 0.5)
                break;
            n = root;
        }
        return (int) root;
    }
}
