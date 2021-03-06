package com.SQLhrms.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TaskStoringData_2 {

	// display the information from nationality table,
	// but display id �nationality id�, name = �nationality�

	String Username = "syntax_hrm";
	String Password = "syntaxhrm123";
	String dbUrl = "jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getAndStoreData() throws SQLException {
		Connection con = DriverManager.getConnection(dbUrl, Username, Password);
		System.out.println("DB connection is successful");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select id as Nationality_ID ,name as Nationality_Name from ohrm_nationality");
		// as ile alais yapmak burada calismiyor yani tabllara isim veremiyoruz bu
		// sekilde

		ResultSetMetaData rsMetaData = rs.getMetaData();

		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> mapData;

		while (rs.next()) {
			mapData = new LinkedHashMap<>();
			for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {

				mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
				// System.out.println(mapData); // for one by one print
			}

			listData.add(mapData); // Storing our map inside our list
		}

		System.out.println(listData);
	}
}
