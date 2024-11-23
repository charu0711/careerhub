package DAO;
import DAO.JobListingDAO;
import Entity.JobListing;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;	
import java.util.*;

public class JobListingmpl implements JobListingDAO {
	
	public void JobListing(Connection connection,JobListing job)
	{
		String query="INSERT INTO JOBS (JobID, CompanyID, JobTitle, JobDescription,JobLocation, Salary, JobType, PostedDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		
		try(PreparedStatement stmt=connection.prepareStatement(query))
		{
			stmt.setInt(1, job.getJobID());
            stmt.setInt(2, job.getCompanyID());
            stmt.setString(3, job.getJobTitle());
            stmt.setString(4, job.getJobDescription());
            stmt.setDouble(5, job.getSalary());
            stmt.setString(6, job.getJobType());
            stmt.setString(7, job.getPostedDate()); 
            stmt.setString(8, job.getJobLocation());

            stmt.executeUpdate();
            System.out.println("Job listing inserted successfully!");
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}
	}
	
	public List<JobListing> getJobListing(Connection connection)
	{
		List<JobListing> Jl = new ArrayList<>();
		String query="SELECT * FROM JOBS";
		
		try(Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery(query);)
		{
			while(rs.next())
			{
				JobListing job=new JobListing(
						rs.getInt("jobID"),
		                rs.getInt("companyID"),
		                rs.getString("jobTitle"),
		                rs.getString("jobDescription"),
		                rs.getString("jobLocation"),
		                rs.getDouble("salary"), 
		                rs.getString("jobType"),
		                rs.getString("postedDate")
						);
				
				Jl.add(job);
			}
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}
		
		return Jl;

}

	@Override
	public void insertJobListing(Connection connection, JobListing job) {
		
		
	}
	public List<JobListing> getJobsBySalaryRange(double minSalary, double maxSalary) {
		List<JobListing> jobs = new ArrayList<>();
		return jobs;
	}
	public List<JobListing> getAllJobListings() {
		List<JobListing> gl = new ArrayList<>();
		return gl;
	}
}
