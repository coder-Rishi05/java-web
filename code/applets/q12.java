// 12. Create an applet in Java to draw a rounded rectangle.

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class RoundedRectangleApplet extends Applet {

    public void init() {
        setBackground(Color.white); // Set background color
        System.out.println("init function");
    }

    public void start() {
        System.out.println("start function");
    }

    public void paint(Graphics g) {
        // Draw outlined rounded rectangle
        g.setColor(Color.blue);
        g.drawRoundRect(50, 50, 200, 100, 30, 30);

        // Draw filled rounded rectangle
        g.setColor(Color.cyan);
        g.fillRoundRect(50, 200, 200, 100, 50, 50);
    }

    public void stop() {
        System.out.println("stop function");
    }

    public void destroy() {
        System.out.println("destroy function");
    }
}

/*
<applet code="RoundedRectangleApplet.class" width="400" height="400"></applet>

OUTPUT 

Console:
init function
start function
stop function
destroy function


*/
