package com.karun.DemoDao;


public class App 
{
    public static void main( String[] args )
    {
    	DaoInterface dao=new DaoImpl();
    	Patient p=new Patient();
    	p.setId(101);
    	p.setName("John");
    	p.setCity("Vijayawada");
    	
    	dao.patientRegistartion(p);
    	//dao.showAllPatient();
    	//dao.deletePatientById(101);
    	//dao.updatePatient(p);
    }
}
