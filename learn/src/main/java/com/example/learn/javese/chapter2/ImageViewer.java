package com.example.learn.javese.chapter2;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/**
 *
 * A program for viewing images.
 * ©version 1.30 2014-02-27
 * author Cay Horstmann
 * 一个窗口运行的java程序
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}


/**
 * a frame with a label to show an image
 */
class ImageViewerFrame extends JFrame {
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // use a label to display the images
        label = new JLabel();
        add(label);

        // set up the file chooser
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // set up the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem openltem = new JMenuItem("0pen");
        menu.add(openltem);
        openltem.addActionListener(event -> {
        // show file chooser dialog
            int result = chooser.showOpenDialog(null);
            // if file selected, set it as icon of the label
            if (result == JFileChooser.APPROVE_OPTION) {
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });
        JMenuItem exitltem = new JMenuItem("Exit");
        menu.add(exitltem);
        exitltem.addActionListener(event -> System.exit(0));
    }
}
