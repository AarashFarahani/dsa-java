package codingame.power.of.thor;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // A single line providing the move to be made: N NE E SE S SW W or NW
            String direction = "";
            if (initialTy < lightY) {
                direction = "S";
                initialTy++;
            }
            if (initialTy > lightY) {
                direction = "N";
                initialTy--;
            }
            if (initialTx < lightX) {
                direction += "E";
                initialTx++;
            }
            if (initialTx > lightX) {
                direction += "W";
                initialTx--;
            }

            System.out.println(direction);
        }
    }
}