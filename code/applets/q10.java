// 10. Create an applet in Java to draw an arc.

import java.applet.Applet;
import java.awt.Graphics;

public class q10 extends Applet {
   public void init() {
      System.out.println("init function");
   }

   public void start() {
      System.out.println("start function");
   }

   public void paint(Graphics g) {
      g.setColor(java.awt.Color.red);
      g.drawArc(270, 150, 100, 100, 30, 270);
   }

   public void stop() {
      System.out.println("stop function");
   }

   public void destroy() {
      System.out.println("destroy function");
   }
}

// <applet code="q10.class" width="500" height="500"></applet>

/*
OUTPUT

init function
start function
(stop and destroy messages appear in console when applet is closed)
*/
