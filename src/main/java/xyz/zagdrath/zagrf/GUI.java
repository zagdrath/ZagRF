/* Copyright (c) 2022 Cody Wellman. All rights reserved. */
/* This work is licensed under the terms of the MIT license */
/* found in the root directory of this project. */

package xyz.zagdrath.zagrf;

// Java imports
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import xyz.zagdrath.zagrf.units.Frequency;

public class GUI {

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

        /***************************/
        /*** Frequency selection ***/
        /***************************/

        JLabel freqLabel = new JLabel("Frequency");
        JFormattedTextField freqField = new JFormattedTextField(0.0);
        double currentFreq = (double) freqField.getValue();
        freqField.setColumns(8);

        /***********************/
        /*** Units selection ***/
        /***********************/

        JLabel unitsLabel = new JLabel("Units");
        String[] freqUnits = { "mHz", "Hz", "kHz", "MHz", "GHz", "THz" };
        JComboBox unitsChoice = new JComboBox(freqUnits);
        String currentUnits = (String) unitsChoice.getSelectedItem();

        if (currentUnits == "mHz") {
            Math.units = Frequency.mHz;
        } else if (currentUnits == "Hz") {
            Math.units = Frequency.Hz;
        } else if (currentUnits == "kHz") {
            Math.units = Frequency.kHz;
        } else if (currentUnits == "MHz") {
            Math.units = Frequency.MHz;
        } else if (currentUnits == "GHz") {
            Math.units = Frequency.GHz;
        } else if (currentUnits == "THz") {
            Math.units = Frequency.THz;
        }

        /*********************/
        /*** Period output ***/
        /*********************/

        JLabel periodLabel = new JLabel("Period");
        JFormattedTextField periodField = new JFormattedTextField(0.0);
        periodField.setEditable(false);
        periodField.setColumns(8);

        /**********************/
        /*** Perform action ***/
        /**********************/

        JButton freqToPeriodButton = new JButton("Go");
        freqToPeriodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                periodField.setValue(Math.freqToPeriod(currentFreq));
            }
        });

        freqToPeriodPanel.add(freqLabel);
        freqToPeriodPanel.add(freqField);

        freqToPeriodPanel.add(unitsLabel);
        freqToPeriodPanel.add(unitsChoice);

        freqToPeriodPanel.add(periodLabel);
        freqToPeriodPanel.add(periodField);

        freqToPeriodPanel.add(freqToPeriodButton);

        // Add stuff to main window
        mainWindow.getContentPane().add(BorderLayout.CENTER, freqToPeriodPanel);
        mainWindow.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainWindow.setVisible(true);

        // Math.freqToPeriod(1, MHz);

        System.out.println(Frequency.MHz);
    }
}
