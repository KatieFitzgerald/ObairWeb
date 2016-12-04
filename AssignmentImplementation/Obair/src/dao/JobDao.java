package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import business.Job;

public class JobDao extends Dao {
	
	public Job requestJob(Job job) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
                
        try {
            con = this.getConnection();
            
            String query = "INSERT INTO job (description, location) VALUES (?, ?)";
            
            ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                        
            ps.setString(1, job.getDescription());
            ps.setString(2, job.getLocation());
           
            int id = ps.executeUpdate();
            
            job.setId(id);
            
            
        } catch (SQLException e) {
        	
            e.printStackTrace();
            
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
            	e.printStackTrace();            
            	}
        }
        
        return job;
    }
	
}