package olx;
import java.sql.*;
public class MailVerification
{
	private String  name; 
	private String  password;
	private String 	id2;
	ResultSet rst;
	private DConnection db=new DConnection();
	public void addAdmin(String name,String password,String id2)
	{	
		db.executeOther("insert into admin(admin_id,password,admin_name) values('"+id2+"','"+password+"','"+name+"')");
		db.close();
	}
	
	public static int Random()
	{
		int x=(int)(Math.random()*1000000);
		return x;
	}
	
}
 