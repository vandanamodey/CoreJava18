package com.practice.jdbc;

import java.sql.*;

public class RajatMyJDBCProgram {

    /*
     * MAIN METHOD
     */
    public static void main(String... arg) throws Exception {
    
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //String jdbcOdbcBridgeDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        //String jdbcOdbcConnectionURL = "jdbc:odbc:<DSN Name given in JDBC ODBC Bridge Driver>";

        //String oracleDriver = "oracle.jdbc.driver.OracleDriver";
        //String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";

        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");// Loading a oracleDriver... Step 1
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system", "batch17"); // Step
            stmt = con.createStatement(); // Step 3
            rs = stmt.executeQuery("select * from hr.employees where employee_id = 100"); // Step 4
            while (rs.next()) {
                System.out.println(rs.getString("EMAIL") + " "
                        + rs.getString("EMPLOYEE_ID") + " "
                        + rs.getString("first_name") + " "
                        + rs.getString("last_name"));
            }


        } catch (ClassNotFoundException exp) {
            exp.printStackTrace();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception exp) {
                exp.printStackTrace();
            }
        }
    }
}

