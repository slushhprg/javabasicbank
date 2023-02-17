public class account {
    
    private int number;
    private String name;
    private double Balance;
    
    // getters and setters : done;  constructors : done; 
       

    public account(int number, String name){
        this.number = number;
        this.name = name;     
    }
    public account(int number, String name, double initialDeposit){
        this.number = number;
        this.name = name;
         deposit(initialDeposit);     
    }
    
    public int getNumber(){
          return number;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public double getBalance(){
        return Balance;
    }
    
    public void deposit(double amount) {
         Balance += amount;
    }
    
    public void withdraw(double amount){
        Balance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
                + number
                + ", Name "
                + name
                + ", Balance = $ "
                + String.format("%.2f", Balance);
    }

}
