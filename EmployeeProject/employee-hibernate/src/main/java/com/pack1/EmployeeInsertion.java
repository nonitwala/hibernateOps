package com.pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsertion {

	public static void main(String[] args) {

		//for create/Insertion operation //
		Employee emp=new Employee();
		
		emp.setEmpName("Niko");
		emp.setDeptName("Development");
		emp.setDeptNo(10);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeHibernate");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		tr.begin();
		em.persist(emp);
		tr.commit();
	}

}
