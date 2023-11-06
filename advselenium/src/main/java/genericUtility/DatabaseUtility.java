package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.mysql.jdbc.Driver;

public class DatabaseUtility implements IAutoConstants
{
	Driver dbdriver;
	Connection connection;
	Statement statement;
	ResultSet result;
	public void establishingConnections()
	{
		try
		{
       	  dbdriver=new Driver();
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			DriverManager.registerDriver(dbdriver);
		} catch(SQLException e1)
		{
			e1.printStackTrace();
		}
		try
		{
			connection=DriverManager.getConnection(DATABASE_URL,DATABASE_UN,DATABASE_PWD);
		}catch(SQLException e2)
		{
			e2.printStackTrace();
		}
		
	}
	/**
	 * This method is used to read data from database
	 * @param String DBquery
	 * 
	 */
	public ArrayList readingDatafromDB(String query,String columnname)
	{
		ArrayList list=new ArrayList();
		try
		{
			statement=connection.createStatement();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			result=statement.executeQuery(query);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			while(result.next())
			{
				try
				{
					list.add(result.getString(columnname));
				} catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}
	public void closingConnection()
	{
		try
		{
			connection.close();
		} catch(SQLException e) 
		{
		   e.printStackTrace();
		}
	}
		
}
