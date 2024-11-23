package DAO;
import Entity.JobListing;
import java.util.List;
import java.sql.Connection;

public interface JobListingDAO {
	void insertJobListing(Connection connection,JobListing job);
	List<JobListing> getJobListing(Connection connection);
}
