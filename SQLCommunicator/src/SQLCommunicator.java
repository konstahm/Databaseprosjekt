/**
 * Created by konstantin on 14.03.17.
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

    public class SQLCommunicator {

        public SQLCommunicator() {
            // TODO Auto-generated constructor stub
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("mortestu");
            dataSource.setPassword("aXXo1212");
            dataSource.setServerName("mysql.stud.ntnu.no");
            dataSource.setDatabaseName("mortestu");
            getBestResult(dataSource);
        }

        private static void getBestResult(MysqlDataSource source){
            try {
            Connection connection = (Connection) source.getConnection();
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Treningsøkt WHERE prestasjon == MAX(VAL(prestasjon))");
            resultSet.next();
            String foundType = resultSet.getString(1);
            System.out.println(foundType);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        //public void submitInfo(int temp, string persForm, int prestasjon, string notat){

            //ID
            //temp
            //personligForm
            //temperatur
            // prestasjon
            //notat
            //MalID
        //}

    }