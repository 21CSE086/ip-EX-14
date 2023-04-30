import java.sql.SQLException;
public class Newclass {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(operation());
    }
    private static String operation(java.lang.String name, java.lang.String position,java.lang.String dept,java.lang.float salary){
        try{
        webpgm.NewWebService service = new webpgm.NewWebService();
        webpgm.NewWebService port = service;
        return port.operation(name,position,dept,salary);
        }
        catch(Exception e)
        {
        }
    }
}