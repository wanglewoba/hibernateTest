package demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import test2.bean.LJuser;
import utils.HibernateUtils;

public class HibernateDemo {

	@Test
	public void demo1(){
		Session session = HibernateUtils.openSession();
		Transaction tx = session.beginTransaction();
		
		LJuser lu = new LJuser();
		lu.setId(66);
		lu.setAge(22);
		lu.setName("呵呵");
		session.save(lu);
		
		
		tx.commit();
		session.close();
	}
	
	
	   @Test
	    public void demo2(){
	        Session session = HibernateUtils.openSession();
	        Transaction tx = session.beginTransaction();
	        
	        LJuser lu = (LJuser)session.get(LJuser.class, 66);
	        System.out.println(lu); 
	        
	        tx.commit();
	        session.close();
	    }
}
