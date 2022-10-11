package attendance.management.system;


public class lecturerclass extends User{
    
    //This ID belongs to User class
    String com(){
        return (ID+intake);
    }
    
    String recordattendance(){
        return(ID+intake+"."+day+"-"+month+"-"+year);
    }
}

