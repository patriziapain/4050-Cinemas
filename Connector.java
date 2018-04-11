import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector{

	private String databaseName;
	private Connection connection;
	private boolean connected;
	
	public Connector(String databaseName){
		
		this.databaseName = databaseName;
		connected = false;
		
		connect();
	} //DBConnector
	
	/*
	 * connect to the specified database
	 */
	void connect(){
		
		String url = "jdbc:mysql://localhost:3306/" + databaseName;
		String user = "root";
		String password = "root";
		
		try{
			//this will load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");
		
			if(connection == null){	
				connection = DriverManager.getConnection(url, user, password);
				setConnected(true);
			} //if
		} //try
		catch(Exception e){
			e.printStackTrace();
		} //catch
	} //connect
	
	private void setConnected(boolean status){
		
		connected = status;
	} //setConnected
	
	public boolean connected(){
		
		return connected;
	} //connected
	
	public Connection getConnection(){
	
		return connection;
	} //getConnection
	
	/*
	 * attempt to close connection
	 */
	public void closeConnection(){
		try{
			if(connection != null){
				connection.close();
				setConnected(false);
			} //if		
		} //try
		catch (SQLException e){
			e.printStackTrace();
		}
	} //closeConnection
} //DBConnector
