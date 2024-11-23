package DAO;
import java.sql.Connection;
import Entity.*;
import java.util.List;

public interface ApplicantDAO {
	public void insertApplicant(Connection connection,Applicant applicant);
	public List<Applicant> getApplicants(Connection connection);
	
}