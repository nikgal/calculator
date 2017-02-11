package by.galov.calc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DataInput {
    private File file;
    private ArrayList<String> dataList;
    public DataInput(){
        
        this.dataList = new ArrayList<String>();
    }
    public void getData(){
        
        System.out.println("To test simple calc select \" src\\main\\resources\\1.txt \" "
                +"\nsimple calc with memory select \" src\\main\\resources\\2.txt \" "
                +"\nengin calc  select \" src\\main\\resources\\3.txt \" "
                +"\nengin calc with memory select \" src\\main\\resources\\4.txt \" "
                +"\nor choise your file with data "
                + "\nEnter file name: ");
        try{
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            this.file = new File(str);
            scn.close();
        }catch (NoSuchElementException e3){
            System.out.println("Wrong file name. Try again.");
        }
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null){
                dataList.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e1) {  
           System.out.println("File not found!");
        } catch (IOException e2) {
            System.out.println("Error");
        }     
        
    }
    public ArrayList<String> getDataList() {
        return dataList;
    }
    public void setDataList(ArrayList<String> dataList) {
        this.dataList = dataList;
    }
    public String toString(){
        return "input : " + getDataList().toString();
    }
}
