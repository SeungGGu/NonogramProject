package com.java.Gameform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NonogramApp {

    private JFrame frame;
    private JPanel gridPanel, mainPanel, rowPanel, colPanel, rowSubPanel, colSubPanel;
    private JButton[][] buttons;
    private JLabel[][] rowLabels, colLabels;
    private int rows = 5;
    private int cols = 5;
    private int[][] rowHints = { {3}, {1}, {3}, {2, 2}, {2} };
    private int[][] colHints = { {1, 1}, {1, 1}, {3}, {3}, {3} };

    public NonogramApp() {
        frame = new JFrame("Nonogram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        mainPanel = new JPanel(new BorderLayout());
        gridPanel = new JPanel(new GridLayout(rows, cols));
        rowPanel = new JPanel(new GridLayout(rows, 1));
        colPanel = new JPanel(new GridLayout(1, cols));
        rowSubPanel = new JPanel(new GridLayout(1, cols));
        colSubPanel = new JPanel(new GridLayout(rows, 1));

        buttons = new JButton[rows][cols];
        rowLabels = new JLabel[rows][];
        colLabels = new JLabel[cols][];

        for (int i = 0; i < rows; i++) {
            rowLabels[i] = new JLabel[rowHints[i].length];
            for (int j = 0; j < rowHints[i].length; j++) {
                rowLabels[i][j] = new JLabel(String.valueOf(rowHints[i][j]));
                rowSubPanel.add(rowLabels[i][j]);
            }
            rowPanel.add(rowSubPanel);
            rowSubPanel = new JPanel(new GridLayout(1, cols));
        }

        for (int i = 0; i < cols; i++) {
            colLabels[i] = new JLabel[colHints[i].length];
            for (int j = 0; j < colHints[i].length; j++) {
                colLabels[i][j] = new JLabel(Integer.toString(colHints[i][j]));
                colSubPanel.add(colLabels[i][j]);
            }
            colPanel.add(colSubPanel);
            colSubPanel = new JPanel(new GridLayout(rows, 1));
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].addActionListener(new ButtonListener(i, j));
                gridPanel.add(buttons[i][j]);
            }
        }

        mainPanel.add(gridPanel, BorderLayout.CENTER);
        mainPanel.add(rowPanel, BorderLayout.WEST);
        mainPanel.add(colPanel, BorderLayout.NORTH);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NonogramApp();
            }
        });
    }

    private class ButtonListener implements ActionListener {
        private int row;
        private int col;

        public ButtonListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void actionPerformed(ActionEvent e) {
            Color toggleColor = buttons[row][col].getBackground() == Color.BLACK ? Color.WHITE : Color.BLACK;
            buttons[row][col].setBackground(toggleColor);
        }
    }
}
