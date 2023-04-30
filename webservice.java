import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author admin
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "employee")
    public String hello(@WebParam(name = " emp_name") String txt) {
        return "employee " + txt + " !";
    }

    /**
     * Web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@webparam(id="emp_id")int emp_id,@WebParam(name = "username") String username, @WebParam(dep = "department") String department,@webparam(sal="salary) float salary,@webparam(pos="position")string position) throws SQLException {
      boolean flag=false;
      try{
       
      Connection c=DriverManager.getConnection("jdbc:derby://localhost:1527/form");
      Statement st=c.createStatement();
      ResultSet rs=st.executeQuery("select * from FORM");
      while(rs.next())
      {
          String position=rs.getint("emp_id");
          String name=rs.getString("emp_name");
          String dept=rs.getString("deptment");
          String salary=rs.getfloat("salary");
          String position=rs.getString("position");
     
      if(emp name.equals(name)&&dept.equals(department)&& sal.equals(salary)&& pos.equals(position)&&id.equals(emp_id))
      {
        flag=true;
        break;
      }
      }
      c.close();
      if(flag)
          return "valid user";
      else
          return "invalid user";
      }
    catch(Exception e)
    {
        return "exception";
    }
    }
 }