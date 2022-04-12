/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zagrf;

// Java imports
import java.awt.*;
import javax.swing.*;

import xyz.zagdrath.zagrf.units.Frequency;
import xyz.zagdrath.zagrf.Math;

public class GUI {

    public static String[] freqUnits = { "mHz", "Hz", "kHz", "MHz", "GHz", "THz" };

    public static void main(String[] args) {
        // Main window
        JFrame mainWindow = new JFrame("ZagRF");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(800, 500);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");

        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);

        // Frequency to period panel
        JPanel freqToPeriodPanel = new JPanel();

        JLabel freqLabel = new JLabel("Frequency");
        JTextField freqField = new JTextField("0.0", 10);
        double freqFieldInput = Double.parseDouble(freqField.getText());

        JLabel unitsLabel = new JLabel("Units");
        JComboBox freqToPeriodComboBox = new JComboBox(freqUnits);

        JButton freqToPeriodButton = new JButton("Go");

        JTextField periodField = new JTextField("0.0", 10);

        freqToPeriodPanel.add(freqLabel);
        freqToPeriodPanel.add(freqField);

        freqToPeriodPanel.add(unitsLabel);
        freqToPeriodPanel.add(freqToPeriodComboBox);

        freqToPeriodPanel.add(freqToPeriodButton);

        freqToPeriodPanel.add(periodField);

        // Add stuff to main window
        mainWindow.getContentPane().add(BorderLayout.CENTER, freqToPeriodPanel);
        mainWindow.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainWindow.setVisible(true);

        // Math.freqToPeriod(1, MHz);

        System.out.println(Frequency.MHz);
    }
}
