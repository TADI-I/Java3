
package Songore.TB;

import java.io.FileWriter;
import java.io.IOException;

public class PersonalInfo {

    /**
     * @param args the command line arguments
     */
    private String name;
    private String surname;
    private String cellNo;
    private int year, month, day;

    public PersonalInfo() {
    }

    public PersonalInfo(String name, String surname, String cellNo, int year, int month, int day) {
        this.name = name;
        this.surname = surname;
        this.cellNo = cellNo;
        this.year = year;
        this.month = month;
        this.day = day;
    }

   

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }
    
    public String monthName(int month){
        switch(month){
            case 1:
                return "Jan";
           
            case 2:
                return "Feb";
            
             case 3:
                return "Mar";
           
             case 4:
                return "Apr";
           
             case 5:
                return "May";
          
             case 6:
                return "Jun";
            
             case 7:
                return "Jul";
         
             case 8:
                return "Aug";
         
             case 9:
                return "Sep";
          
             case 10:
                return "Oct";
          
             case 11:
                return "Nov";
            
             case 12:
                return "Dec";
                         
        }
        return null;
    }
    
    public String displayInfo(){
        
        String info = "Name: " +name +"\nSurname: "  + surname + "\nCell Number: "+ cellNo +"\nD.O.B: "+ year +"-"+ monthName(
                month)+"-" + day;
        
        return info;
    }
    
    public void writeInfo(){
        try {
            FileWriter myWriter = new FileWriter("personInfo.txt",true);
            myWriter.write("******************************\n"+displayInfo()+"\n******************************\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    

    
}
