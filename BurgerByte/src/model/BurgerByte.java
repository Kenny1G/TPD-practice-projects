package model;

import java.util.LinkedList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private boolean isOpen;
    private List<Employee> staff;

    public BurgerByte(String locn, Manager manager) {
        location = locn;
        this.manager = manager;
        staff = new LinkedList<>();
    }

    // getters
    public String getLocation() { return location; }
    public Manager getManager() { return manager; }
    public List<Employee> getStaff() {return staff;}
    public boolean isOpen() { return isOpen; }

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    public void openRestaurant() {
        isOpen = true;
    }

    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    public void closeRestaurant() {
        isOpen = false;
        for (Employee e : staff) {
            e.leaveWork();
        }
        manager.leaveWork();
    }

    public void addStaff(Employee e) {
        staff.add(e);
    }

    public void removeStaff(Employee e) {
        if(staff.contains(e)){
            staff.remove(e);
        }
    }

    // EFFECTS: computes wages for all employees, prints them out in this format
    //          Name: ______, Salary: _______ for each employee
    public void computeStaffWages() {
        for (Employee e : staff) {
            System.out.println("Name: " + e.getName() +", Salary: " + e.computeWage());
        }
        System.out.println("Name: " + manager.getName() +", Salary: " + manager.computeWage());
    }


}