package com.pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDeletion {

	public static void main(String[] args) {
		
		//for delete operation //
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeHibernate");
				EntityManager em=emf.createEntityManager();
				EntityTransaction tr=em.getTransaction();
				tr.begin();
				
				Employee emp=em.find(Employee.class, 8);
				if(emp !=null){
				em.remove(emp);
				System.out.println("employee details deleted successfully");
				}
				else{
				System.out.println("there is no employee with id");
				}
				tr.commit();	
	}

}
