package JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) {

        try {
            DBConnection.open();
            Statement st=DBConnection.statement;
            Countries ct=new Countries("IR","IRAN",1);
            if(!st.execute(ct.selectCountry())) {
                st.executeUpdate(ct.insertCountry());
            }else {
                st.executeUpdate(ct.updateCountry("Habib"));
            }
            ResultSet result=st.executeQuery(ct.selectCountry());
            while (result.next()){
                String countyId=result.getString("COUNTRY_ID");
                String countyName=result.getString("COUNTRY_NAME");
                Integer regionId=result.getInt("REGION_ID");
                ct=new Countries(countyId,countyName,regionId);
            }
            System.out.println(ct.toString());//Countries{countryId='IR', countryName='Habib', regionId=1}


            PreparedStatement preparedStatement=DBConnection.connection.prepareStatement(ct.deleteCountry());
            preparedStatement.setString(1,ct.getCountryId());
            preparedStatement.executeUpdate();

            String q="select * from COUNTRIES c where c.COUNTRY_NAME=?";
            preparedStatement=DBConnection.connection.prepareStatement(q);
            preparedStatement.setString(1,"Habib");
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String countyId=resultSet.getString(1);
                String countyName=resultSet.getString(2);
                Integer regionId=resultSet.getInt(3);
                Countries c=new Countries(countyId,countyName,regionId);
                System.out.println(c.toString());
            }
            /*
            Countries{countryId='DE', countryName='Habib', regionId=1}
            Countries{countryId='DK', countryName='Habib', regionId=1}
            Countries{countryId='FR', countryName='Habib', regionId=1}
            Countries{countryId='IT', countryName='Habib', regionId=1}
            Countries{countryId='NL', countryName='Habib', regionId=1}
            Countries{countryId='UK', countryName='Habib', regionId=1}
             */
            preparedStatement.close();
            DBConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
