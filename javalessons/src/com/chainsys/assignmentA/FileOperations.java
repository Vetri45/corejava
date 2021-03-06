package com.chainsys.assignmentA;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileOperations
{

    public static void main(String[] args) throws IOException {
        
        //createFile();
       // renameFile();
       // AppendToFileUsingFileWriter();
       // deleteFile();
       //ReadFileName();
        moveFile();
        copyFile();
        modifyFile();
    }
    public static void createFile()
    {
    try {  
    // Creating an object of a file  
    File f0 = new File("D:Filek.txt");   
      if (f0.createNewFile()) {  
      System.out.println("File " + f0.getName() + " is created successfully.");  
      } else {  
      System.out.println("File is already exist in the directory.");  
      }  
      } catch (IOException exception) {  
      System.out.println("An unexpected error is occurred.");  
      exception.printStackTrace();  
      }   
    }
    public static void renameFile()
    {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File file = new File("D:Filek.txt");
  
        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("D:FileOperatiggon.txt");
  
        // store the return value of renameTo() method in flag
        boolean flag = file.renameTo(rename);
  
        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println(" Failed");
        }
    }

    public static void AppendToFileUsingFileWriter()
    {
    try(FileWriter fw = new FileWriter("D:Filek.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter out = new PrintWriter(bw))
        {
            out.println("the text");
            //more code
            out.println("more tegsdgdgdsxt");
            //more code
            System.out.println("Added successfully");
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
    public static void deleteFile()
    {
        String fileName = "D:Filek.txt";
        try {
            Files.delete(Paths.get(fileName));
            System.out.println("Deleted file");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
  public static void ReadFileName() throws IOException
   {
     String fileName ="D:Filek.txt";
     File file = new File(fileName);
     FileReader fr = new FileReader(file);
     BufferedReader br = new BufferedReader(fr);
     String line;
     while((line = br.readLine()) != null)
     {
     System.out.println(line);
        }
     }
  public static void moveFile() throws IOException
  {
      File file = new File("D:Filek.txt");
      // renaming the file and moving it to a new location
      if(file.renameTo
         (new File("D:\\temp\\FileOperation.txt")))
      {
          // if file copied successfully then delete the original file
          file.delete();
          System.out.println("File moved successfully");
      }
      else
      {
          System.out.println("Failed to move the file");
      }
  }
  public static void copyFile()throws IOException
  {
   FileInputStream fis = null;
   FileOutputStream fos = null;
       try {
           fis = new FileInputStream("D:\\java.txt");
           fos = new FileOutputStream( "D:\\temp\\myprogram.txt");
         int t;
           while ((t = fis.read()) != -1) 
           {
              fos.write(t);
              }
           System.out.print("copied the file successfully");
          }
   
   finally
   {
      if (fis != null) 
      {
         fis.close();
        }
          if (fos != null) 
          {
             fos.close();
              }
      }
  }
       public static void modifyFile()throws IOException
       {
           String filePath = "D:\\Java Training sw";
           Scanner sc = new Scanner(new File(filePath));
           StringBuffer buffer = new StringBuffer();
           while (sc.hasNextLine()) {
              buffer.append(sc.nextLine()+System.lineSeparator());
           }
           String fileContents = buffer.toString();
           System.out.println("Contents of the file: "+fileContents);
           sc.close();
           System.out.println("Enter the oldline : ");
           String oldLine = "create name of file";
           String newLine = "FILE NAME ";
           fileContents = fileContents.replaceAll(oldLine, newLine);
           FileWriter writer = new FileWriter(filePath);
           System.out.println("");
           System.out.println("new data: "+fileContents);
           writer.append(fileContents);
           writer.flush();
       }
    }