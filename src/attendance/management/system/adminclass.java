package attendance.management.system;

public class adminclass extends User{
    private static String firstname;
    private static String lastname;
    private static String pass;
    private static String id;
    
    public void getFirstName(String Firstname){
        firstname = Firstname;
    }
    
    public void getLastName(String Lastname){
        lastname = Lastname;
    }
    
    public void getPass(String Pass){
        pass = Pass;
    }
    
    public void getID(String ID){
        id = ID;
    }
    
    //Using in admin register
    String fullname(){
        return(firstname+" "+lastname);
    }

    //UserID generated
    String ID(){
        return(firstname+" "+lastname+pass);
    }
    
    String attendance(){
        return(id+intake+"."+day+"-"+month+"-"+year);
    }
    
}
