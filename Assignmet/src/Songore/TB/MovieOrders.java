
package Songore.TB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tadiw
 */
public class MovieOrders {

    private String movieName;
    private String name;
    private int seats;

    public MovieOrders() {
    }

    public MovieOrders(String movieName,String name, int seats) {
        this.movieName = movieName;
        this.name = name;
        this.seats = seats;
    }
    
    public String MovieInfo(){
        return name+ " has ordered: " + movieName + " for: " + seats + " people/s";
    }
    
    public void writeMovie(){
        try{
            FileWriter writing = new FileWriter("Movie.txt",true);
            writing.write(MovieInfo()+"\n");
            writing.close();
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
             System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public String readMovie(){
        try{
            File reader = new File("Movie.txt");
            Scanner myReader = new Scanner(reader);
            
            while(myReader.hasNextLine()){
                return myReader.nextLine();
            }
            myReader.close();
        }
        catch(Exception e){
            return "File not found";
           // e.printStackTrace();
        }
       return null;
    }
}