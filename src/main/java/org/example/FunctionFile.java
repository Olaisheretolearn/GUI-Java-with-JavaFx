package org.example;

import org.example.GUI;

public class FunctionFile {
    GUI gui;

    public FunctionFile(GUI gui){
        this.gui = gui; // we can access everything from the GUI class from here
        //classic composition

    }

    public void newFile(){
        // since it was public in GUI , using a instance of the GUI class to access its variables
        gui.textArea.setText(" ");
        gui.window.setTitle("New");
    }

}
