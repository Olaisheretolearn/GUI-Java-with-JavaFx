package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    public JFrame window;
    public JTextArea textArea;
    JScrollPane scrollPane;

    //puts the bar on there
    JMenuBar menubar;

    //puts each menu options
    JMenu menuFile, menuEdit , menuFormat , menuColor;
    JMenuItem iNew, iOpen , iSave , iSaveAs , iExit;

    FunctionFile file = new FunctionFile(this);



    //main class to call the instance of the class
    public static void main(String[] args) {
        new GUI();
    }

    //constructor
    public GUI(){
        createWindow();
        createtextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
    }



    public  void  createWindow(){
        window = new JFrame("notePad");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createtextArea(){
        textArea = new JTextArea();
       scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        window.add(scrollPane);
    }

    public void createMenuBar(){
        menubar = new JMenuBar();
        window.setJMenuBar(menubar);

        menuFile = new JMenu("File");
        menuEdit = new JMenu("Edit");
        menuFormat = new JMenu("Format");
        menuColor = new JMenu("Color");

        menubar.add(menuFile);
      menubar.add(menuEdit);
        menubar.add(menuFormat);
        menubar.add(menuColor);
    }

    public void createFileMenu(){
        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);

        iOpen = new JMenuItem("Open");
        menuFile.add(iOpen);

        iSave = new JMenuItem("Save");
        menuFile.add(iSave);

        iSaveAs = new JMenuItem("Save As");
        menuFile.add(iSaveAs);

        iExit = new JMenuItem("Exit");
        menuFile.add(iExit);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String command  = e.getActionCommand();
        switch(command){
            case "New" : file.newFile(); break;
        }
    }
}