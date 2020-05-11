/*
 * nama : apriani magfira
 * stambuk : 13020180058
 * tanggal/waktu : 10 mei 2020 : 21.30 
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;


public class ServiceJdbc {
    private Connection connection;
    private PreparedStatement statement;
    
    private Connection getConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "");
        } catch (Exception e) {
            Logger.getLogger(ServiceJdbc.class.getName()).log(Level.SEVERE, null, e);
        }
        return connection;
    }
    public void save(Employee e){
        try {
            statement = getConnection().prepareStatement("insert into employee values(?, ?, ?)");
            statement.setString(1, e.getId());
            statement.setString(2, e.getName());
            statement.setString(3, e.getNation());
            statement.executeUpdate();
            getConnection().close();
        } catch (Exception ex) {
            Logger.getLogger(ServiceJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(Employee e){
        try {
            statement = getConnection().prepareStatement("update employee set name=?, nation=? where id=?");
            statement.setString(1, e.getName());
            statement.setString(2, e.getNation());
            statement.setString(3, e.getId());
            statement.executeUpdate();
            getConnection().close();
        } catch (Exception ex) {
            Logger.getLogger(ServiceJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void delete(Employee e){
        try {
            statement = getConnection().prepareStatement("delete from employee where id=?");
            statement.setString(1, e.getId());
            statement.executeUpdate();
            getConnection().close();
        } catch (Exception ex) {
            Logger.getLogger(ServiceJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Employee> getEmployees(){
        try {
            statement = getConnection().prepareStatement("select * from employee");
            ResultSet rs = statement.executeQuery();
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {                
                Employee e = new Employee();
                e.setId(rs.getString("id"));
                e.setName(rs.getString("name"));
                e.setNation(rs.getString("nation"));
                employees.add(e);
            }
            return employees;
        } catch (Exception e) {
            Logger.getLogger(ServiceJdbc.class.getName()).log(Level.SEVERE, null, e);
        }
        return new ArrayList<>();
    }
}
