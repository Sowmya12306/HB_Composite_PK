package in.ineuron.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.ineuron.model.StudentDetails;
import in.ineuron.model.StudentPKId;
import in.ineuron.util.HibernateUtil;

public class CompositeKeyApp {
	public static void main(String[] args) {
		Session session=null;
		boolean flag=false;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		
		try {
			session = HibernateUtil.getSession();
			
			if(session!=null) {
				transaction = session.beginTransaction();
			}
			if(transaction!=null)
			{
				StudentPKId stdId = new StudentPKId(19, "9927689089");
			
			StudentDetails stdDetails = new StudentDetails(stdId, "Liyam", 20, "Kerala");
			StudentPKId id = (StudentPKId) session.save(stdDetails);
			System.out.println("The generated value is "+ id);
//			
			flag = true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if(flag ==true) {
				transaction.commit(); // stored in DB through ORM
			}
			else transaction.rollback();
			HibernateUtil.closeSession(session);
		}
		
	}

}
