import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryHandler {

	private Connection connection;
	private PreparedStatement ps;
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void addMovie(int movie_id, String title, String genre, String cast_list, String director, String producer, String description, String trailer_picture ) {
		String query = "INSERT INTO Movie " 
				+ "(movie_id, title, genre, cast_list, director, producer, description, trailer_picture) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			ps = connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ps.setInt(1, movie_id);
			ps.setString(2,  title);
			ps.setString(3,  genre);
			ps.setString(4,  cast_list);
			ps.setString(5,  director);
			ps.setString(6,  producer);
			ps.setString(7,  description);
			ps.setString(8,  trailer_picture);
			ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}//addMovie
	
	public String getMovie(int movie_id) {
		ResultSet rs = null;
		String data = "";
		String query = "SELECT * "
					 + "FROM SE_Project.Movie "
					 + "WHERE movie_id = ?";
		
		try {
			ps = connection.prepareStatement(query);
			ps.setInt(1, movie_id);
			rs = ps.executeQuery();
			
			while(rs.next()){
				data += rs.getInt("movie_id") + " "
					  + rs.getString("title") + " "
					  + rs.getString("genre") + " "
					  + rs.getString("cast_list") + " "
					  + rs.getString("director") + " "
					  + rs.getString("producer") + " "
					  + rs.getString("description") + " "
					  + rs.getString("trailer_picture") + " ";	
			} //while
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return data;
		
	}//getMovie
	
	public void updateMovie(int movie_id, String title, String genre, String cast_list, String director, String producer, String description, String trailer_picture) {
		
		List<String> items = new ArrayList<>();
		String query = "UPDATE Movie "
				     + "SET ";
		
		if(movie_id != -1) items.add("movie_id = '" + movie_id + "'");
		if(!title.equals("")) items.add("title = '" + title + "'");
		if(!genre.equals("")) items.add("genre = '" + genre + "'");
		if(!cast_list.equals("")) items.add("cast_list = '" + cast_list + "'");
		if(!director.equals("")) items.add("director = '" + director + "'");
		if(!producer.equals("")) items.add("producer = '" + producer + "'");
		if(!description.equals("")) items.add("description = '" + description + "'");
		if(!trailer_picture.equals("")) items.add("trailer_picture = '" + trailer_picture + "'");
		
		for(int i = 0; i < items.size(); i++){
			if(i == 0)
				query += items.get(i) + " ";
			else query += ", "  + items.get(i) + " ";
		} //for
		
		query += "WHERE movie_id = ?"; 
		
		try {
			ps = connection.prepareStatement(query);
					
			ps.setInt(1, movie_id);		
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//updateMovie
	
	
	
	public void addNewCustomer(int user_id, String email, String pass, String first_name, String last_name, String phone_number, String address, int rank) {
		String query = "INSERT INTO Users "
				+ "(user_id, email, pass, first_name, last_name, phone_number, address, rank) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			ps = connection.prepareStatement(query);
			ps.setInt(1, user_id);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, first_name);
			ps.setString(5, last_name);
			ps.setString(6, phone_number);
			ps.setString(7, address);
			ps.setInt(8, rank);
			ps.executeUpdate();
			
			User user = new User(user_id, email, pass, first_name, last_name, phone_number, address, rank);
		} catch(SQLException e){
			e.printStackTrace();
		}
	}//addNewCustomer
	
	
	
	/*
	 * returns true if client email/username exists in table and the passwords match
	 */
	public boolean login(String email, String password){
		
		ResultSet rs = null;
		String query = "SELECT rank "
					 + "FROM Users "
					 + "WHERE email = ? AND pass = ?";
		try {
			ps = connection.prepareStatement(query);
			
			ps.setString(1, email);	
			ps.setString(2,  password);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				//System.out.println("HERE" + rs.getInt("rank"));
				
				if (rs.getInt("rank") == 0)
					System.out.println("This user is a customer.");
				else if (rs.getInt("rank") == 1)
					System.out.println("This user is an employee.");
				else if (rs.getInt("rank") == 2)
					System.out.println("This user is a System Administrator.");
				return true;
			}
			else return false;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	} //login
	
	
	
	
}
