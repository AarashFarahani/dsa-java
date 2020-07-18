package codingame.shadows.of.the.knight;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // the location of the next window Batman should jump to.
            if(bombDir.contains("U")) {
                H = Y0;
                Y0 = (Y0 - 1) / 2;
            }
            if(bombDir.contains("D")) {
                Y0 = (H + Y0 + 1) / 2;
            }
            if(bombDir.contains("L")) {
                W = X0;
                X0 = (X0 - 1) / 2;
            }
            if(bombDir.contains("R")) {
                X0 = (W + X0 + 1) / 2;
            }

            System.out.println(String.format("%s %s", X0, Y0));
        }
    }

    private static int nextY(int y, String dir) {
        if(dir.contains("U"))
            y--;
        if(dir.contains("D"))
            y++;

        return y;
    }

    private static int nextX(int x, String dir) {
        if(dir.contains("R"))
            x++;
        if(dir.contains("L"))
            x--;

        return x;
    }
}