// 3. Create an applet in Java to draw a circle.

import java.applet.Applet;
import java.awt.Graphics;

public class q3 extends Applet {
   public void init() {
      System.out.println("init function");
   }

   public void start() {
      System.out.println("start function");
   }

   public void paint(Graphics g) {
      g.setColor(java.awt.Color.red);
      g.drawOval(70, 200, 40, 40);  // Draw circle outline
      g.fillOval(70, 200, 40, 40);  // Fill the circle with red color
   }

   public void stop() {
      System.out.println("stop function");
   }

   public void destroy() {
      System.out.println("destroy function");
   }
}

/*
   <applet code="q3.class" width="500" height="500"></applet>

   OUTPUT 

   🖥️ On Console:
   init function
   start function
   (later when closed)
   stop function
   destroy function

   
*/
