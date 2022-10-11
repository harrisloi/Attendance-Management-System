package attendance.management.system;

public class User {
    public static String ID;
    public static String password;
    public static String first;
    public static String last;
    public static String day;
    public static String month;
    public static String year;
    public static String intake;
    
    User(){  
    }
    void User (String x, String y){
        ID = x;
        password = y;   
    }
    
    String Userlogin(){
        String login = (ID+password);
        return login;
    }
    
    public void setIntake(String Intake){
        intake = Intake;
    }
    
    String getIntake(){
        return intake;
    }
    
    String getUsername(){
        return ID;
    }
    
    public void getPassword(String Password){
        password = Password;
    }
    
    public void getFirst(String firstname){
        first = firstname;
    }
    
    public void getLast(String lastname){
        last = lastname;
    }
    
    public void getDay(String Day){
        day = Day;
    }
    
    public void getMonth(String Month){
        month = Month;
    }
    
    public void getYear(String Year){
        year = Year;
    }
    
    String DOB(){
        return(day+"-"+month+"-"+year);
    } 
    
    String full(){
        return(first+" "+last);
    }

}
