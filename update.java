
import java.sql.DriverManager;

public class update implements jdbc {

public static void main (String args[]){

try{

Class.forName("oracla.jdbc.driver.OracleDriver");
Connect con = DriverManager.get.COnnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
System.out.println("connection established succesfully");
}
catch(Exception e){
System.err.println(e);
}
}
}