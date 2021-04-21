package com.company;

import java.util.ArrayList;
import java.util.List;

public class OfficeresManagement {
    private List<Officers> officersList = new ArrayList();

    public void addOfficers(Officers officers){
        officersList.add(officers);
    }
    public void displayOfficersList(){
        for(Officers officers : officersList){
            officers.displayOfficersInfo();
        }
    }
    public void showSalary(){
        for(Officers officers : officersList){
            if(officers.getSalary() >= 8000000){
                officers.displayOfficersInfo();
            }
        }
    }
}
