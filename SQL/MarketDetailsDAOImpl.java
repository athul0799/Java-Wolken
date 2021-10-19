package jdbc;


	import java.sql.DriverManager;
	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.PreparedStatement;

	
	
	
	public class MarketDetailsDAOImpl implements MarketDetailsDAO{
		boolean result = false;
		Connection connection = null;
		PreparedStatement statement = null;

		public boolean save(MarketDetailsDTO dto) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "athul123");
				statement = connection.prepareStatement("insert into market_details value (?,?,?,?)");
				statement.setInt(1, dto.getId());
				statement.setString(2, dto.getName());
				statement.setString(3, dto.getLocation());
				statement.setInt(4, dto.getNoOfShops());
				result = statement.execute();
				if(result)
					result = false;
				else
					result = true;
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
			return result;
		}
		
		
		
		
		public boolean update(MarketDetailsDTO dto) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "athul123");
				statement = connection.prepareStatement("update market_details set market_name = ?, location = ?, no_of_shops = ? where id = ?");
				statement.setString(1, dto.getName());
				statement.setString(2, dto.getLocation());
				statement.setInt(3, dto.getNoOfShops());
				statement.setInt(4, dto.getId());
				result = statement.execute();
				if(result)
					result = false;
				else
					result = true;
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
			return result;
		}
		
		


		public void getByLocation(MarketDetailsDTO dto) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "athul123");
				statement = connection.prepareStatement("select * from market_details where location = ?");
				statement.setString(1, dto.getLocation());
				ResultSet result = statement.executeQuery();
				while(result.next()) {
					System.out.println(result.getInt(1)+result.getString(2)++result.getString(3)+result.getInt(4));
				}
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		
		
		

		public void getAll() {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "athul123");
				statement = connection.prepareStatement("select * from market_details");
				ResultSet rs = statement.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
				}
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
		}

		

		
		
		public boolean delete(MarketDetailsDTO dto) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "athul123");
				statement = connection.prepareStatement("delete from market_details where id = ?");
				statement.setInt(1, dto.getId());
				result = statement.execute();
				if(result)
					result = false;
				else
					result = true;
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			} finally {
				try {
					statement.close();
					connection.close();
				} catch (SQLException e) {
					System.err.println(e.getMessage());
				}
			}
			return result;
		}
	}
