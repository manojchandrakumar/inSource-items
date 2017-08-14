package com.insource.items.person.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.insource.items.common.utils.AbstractDOAImpl;
import com.insource.items.person.dao.PersonDAO;
import com.insource.items.person.model.Person;
import com.mysql.cj.jdbc.PreparedStatement;

@Repository
@Service
public class PersonDAOImpl extends AbstractDOAImpl implements PersonDAO {
	@Autowired
	private DataSource dataSource;

	public Person getPerson(String email) {
		ResultSet results = null;
		Person person = null;
		PreparedStatement ps = null;
		Connection connection = null;
		String sql = "select * from prsn where email = ?";
		try {
			connection = dataSource.getConnection();
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, email);
			results = ps.executeQuery();
			while (results.next()) {
				person = new Person();
				person.setEmail(results.getString("email"));
				person.setDob(results.getDate("dob"));
				person.setCreatedDate(results.getDate("created_date"));
				person.setLastLoginDate(results.getDate("last_login_date"));
				person.setPhone(results.getString("phone"));
				person.setName(results.getString("Name"));
				person.setPassword(results.getString("Password"));
				System.out.println(person.toString());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				results.close();
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occurred while closing resources");
				e.printStackTrace();
			}
		}
		return person;
	}

	@Override
	public boolean addPerson(Person person) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Connection connection = null;
		String sql = "insert into prsn(email,password,name,phone,dob,created_date,last_login_date) values (?,?,?,?,?,?,?)";
		boolean status = false;
		try {
			connection = dataSource.getConnection();
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, person.getEmail());
			ps.setString(2, person.getPassword());
			ps.setString(3, person.getName());
			ps.setString(4, person.getPhone());
			ps.setDate(5, (Date) person.getDob());
			ps.setDate(6, (Date) person.getCreatedDate());
			ps.setDate(7, (Date) person.getLastLoginDate());
			status = ps.execute();

			if (status) {
				System.out.println("User Account Created successfully !");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception occurred while closing resources");
				e.printStackTrace();
			}
		}
		return false;
	}

}
