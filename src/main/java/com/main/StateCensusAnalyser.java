package com.main;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class StateCensusAnalyser {


    public void analyseCensusData() throws FileNotFoundException {
        String path1 = "C:\\Users\\prata\\IndiaStateCensusData.csv";
        String path2 = "C:\\Users\\prata\\IndiaStateCode.csv";
        String line = "";
        String splits =",";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        try{
            while ((line = bufferedReader.readLine()) != null){
                String [] data = line.split(splits);
                System.out.println("State: "+data[0]+", Population: "+data[1]+", Area: "+data[2]+", Density: "+data[3]);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to Indian census simulation extended program");
    }
}
