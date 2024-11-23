package DAO;
import Entity.*;
import java.sql.Connection;
import java.util.List;

public interface CompanyDAO {
	 void insertNewCompany(Connection connection,Company company);
	 List<Company> getCompany(Connection connection);
}
