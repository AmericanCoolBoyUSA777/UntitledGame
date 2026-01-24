package org.vlg;

import javax.swing.*;
import java.awt.*;

public class Controls extends JPanel {
    public Controls(Game game) {
        setLayout(new FlowLayout());
        add(new Button("1x", new ImageIcon("assets/supper.jpg"), game::addObject));
        add(new Button("2x", new ImageIcon("assets/supper.jpg"), () -> {
        }));
    }
}

