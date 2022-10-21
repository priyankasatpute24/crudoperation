package com.hibernate.employeedao;



import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.crudoperation.model.Employee;
import com.hibernate.crudoperation.util.EmployeeUtil;


public class EmployeeDao {

//	    public void saveEmployee(Employee employee) {
//	    	
//	    	Transaction trans=null;
//	    	try {
//	    		Session session= EmployeeUtil.getSessionFactory().openSession();
//	    	 trans=session.beginTransaction();
//	    	 session.save(employee);
//	    	 trans.commit();
//	    	}catch(Exception e) {
//	    		if (trans!=null) {
//	    			trans.rollback();
//	    		}
//	    		e.printStackTrace();
//	    	}
//	    }
	    public void updateRecord(String ename,int eid) {
	    	Transaction trans=null;
	    	try {
	    		Session session=EmployeeUtil.getSessionFactory().openSession();
	    		trans = session.beginTransaction();
	    		Query q=session.createQuery("update Employee set ename=:ename where eid=:eid");
	    		q.setParameter("ename", ename);
	    		q.setParameter("eid", eid);
	    		int i=q.executeUpdate();
	    		if(i>0) {
	    			System.out.println("update suceessfully");
	             
	    		}
	    		trans.commit();
	    		
	    	}catch(Exception e) {
	    		if(trans!=null)
	    		{
	    			trans.rollback();
	    		}
	    		e.printStackTrace();
	    	}
	    }
}
