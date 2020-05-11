/*
 * nama : apriani magfira
 * stambuk : 13020180058
 * tanggal/waktu : 10 mei 2020 : 21.30 
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Employee;


public class Service {
    private List<Employee> employees;
    
    //make initiate
    public Service(){
        employees = new ArrayList<>();
    }
    public void save(Employee employee){
        employees.add(employee);
    }
    public void update(Employee employee){
        //make iterable so it can search what data to delete
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if (e.getId().equals(employee.getId())) {
                employees.set(i, employee);
                break;
            }
        }
    }
    public void delete(Employee employee){
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if (e.getId().equals(employee.getId())) {
                employees.remove(i);
                break;
            }
        }
    }
    public List<Employee> getEmployees(){
        return employees;
    }
}
