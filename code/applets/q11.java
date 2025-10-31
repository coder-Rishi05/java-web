// 11. Create an applet in Java to change the background color.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="ColorChangeApplet" width="400" height="300"></applet>
*/

public class ColorChangeApplet extends Applet implements ActionListener {
    Button redButton, greenButton, blueButton, yellowButton;

    public void init() {
        // Initialize buttons
        redButton = new Button("Red");
        greenButton = new Button("Green");
        blueButton = new Button("Blue");
        yellowButton = new Button("Yellow");

        // Add buttons to the applet
        add(redButton);
        add(greenButton);
        add(blueButton);
        add(yellowButton);

        // Add action listeners
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        yellowButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Change background color based on button clicked
        if (e.getSource() == redButton)
            setBackground(Color.red);
        else if (e.getSource() == greenButton)
            setBackground(Color.green);
        else if (e.getSource() == blueButton)
            setBackground(Color.blue);
        else if (e.getSource() == yellowButton)
            setBackground(Color.yellow);

        repaint();
    }
}

/*
 OUTPUT 
Initially: Default background (usually gray)
Buttons Displayed: Red | Green | Blue | Yellow

When a button is clicked:
→ The applet background color changes to that color.

Example:
Click "Red"  → Background turns red
Click "Blue" → Background turns blue
Click "Green" → Background turns green
Click "Yellow" → Background turns yellow

*/
