package DAO;
import java.sql.Connection;
import Entity.*;
import java.util.List;


public interface JobApplicationDAO {
	public void insertJobApplication(Connection connection,JobApplication application);
	public List<JobApplication> getJobApplication(Connection connection);
}
