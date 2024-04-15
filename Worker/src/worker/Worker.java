
package worker;


public class Worker {

    private String name;
    private String birthDate;
    private String endDate;
    
    public Worker(){
        
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        
    }
    
    public int getAge(){
        int birth  = Integer.parseInt(birthDate);
        int age = 2024 - birth;
        return age;
    }
    
    public double collectPay(){
        
        return 0.0;
    }
    
    public void terminate(String endDate){
        this.endDate = endDate;
    }
    

}
