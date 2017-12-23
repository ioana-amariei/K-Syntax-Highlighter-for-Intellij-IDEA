package com.kplugin.old;

import javax.swing.*;
import java.io.*;

/**
 * Created by AMI on 2017-12-19.
 */
public class FileManipulation {
    private String filename;

    public FileManipulation(String filename){
        this.filename = filename;
    }

    public void createFile(){
        try {
            String pathFile = "C:\\" + filename;
            File file = new File(pathFile);

            boolean fileIsCreated = file.createNewFile();
            if (fileIsCreated){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception cccurred:");
            e.printStackTrace();
        }
    }

    public void writeFile(){

    }
}
