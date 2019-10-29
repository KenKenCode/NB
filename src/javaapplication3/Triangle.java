
package javaapplication3;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Triangle implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("This is the triangle program");
        Scanner readinput1 = new Scanner (System.in);
        System.out.println("Input side 1");
        int side1 = readinput1.nextInt();
        System.out.println("Input side 2");
        int side2 = readinput1.nextInt();
        System.out.println("Input side 3");
        int side3 = readinput1.nextInt();
        int totalsides = side1 + side2 + side3;
        System.out.println("Total sides are: " + totalsides);
        System.exit(0);
    }
}


