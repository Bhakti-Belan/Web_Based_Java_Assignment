package example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class DepartmentDao implements JdbcDao<Department,Integer>{

	@Override
	public Collection<Department> getAll() {
		Collection<Department> allDepartments=new ArrayList<>();
		try(Connection dbConnection=JdbcUtils.buildConnection();
			Statement stmt=dbConnection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from dept"))
		{
			while(rs.next())
			{
				int deptNo=rs.getInt(1);
				String dName=rs.getString(2);
				String loc=rs.getString(3);
				Department dept=new Department(deptNo,dName,loc);
				allDepartments.add(dept);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return allDepartments;
	}

	@Override
	public Department getOne(Integer deptNo) {
		Department foundDept=null;
		String sqlQuery="select * from dept where deptno=?";
		try(Connection dbConnection=JdbcUtils.buildConnection();
			PreparedStatement pstmt=dbConnection.prepareStatement(sqlQuery))
		{
			pstmt.setInt(1, deptNo);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
		 foundDept=new Department(rs.getInt(1),rs.getString(2),rs.getString(3));
			
		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return foundDept;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		     
	}

	@Override
	public void add(Department dept) {
		String query="insert into dept values(?,?,?)";
		try(Connection dbConnection=JdbcUtils.buildConnection();
				PreparedStatement pstmt=dbConnection.prepareStatement(query))
		{
			pstmt.setInt(1,dept.getDeptNo());
			pstmt.setString(2, dept.getName());
			pstmt.setString(3,dept.getLoc());
			int updateCount =pstmt.executeUpdate();
			System.out.println(updateCount+" record inserted");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Department dept) {
		String query="update dept set dname=?,loc=? where deptno=? ";
		try(Connection conn=JdbcUtils.buildConnection();
			PreparedStatement pstmt=conn.prepareStatement(query))
		{
			pstmt.setString(1, dept.getName());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptNo());
			int updates=pstmt.executeUpdate();
			System.out.println(updates+" Department Updated");
		}
		catch(Exception e)
		{
			
		}
		
	}

	@Override
	public void delete(Integer rno) {
		String query="delete from dept where deptno=?";
		try(Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(query))
		{
			pstmt.setInt(1, rno);
			int updates=pstmt.executeUpdate();
			if(updates==0)
				System.out.println("Department With Given Id Does Not Exists!!");
			else
		     System.out.println(updates+" Department deleted");
			
		}
		catch(Exception e)
		{
			
		}
		
	}


}
