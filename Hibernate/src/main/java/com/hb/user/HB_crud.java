package com.hb.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HB_crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		//*************		Insertion	**************************
				/*
				 * User user1 = new User(); 
				 * user1.setName("Kabir");
				 * user1.setEmail("kabir@gmail.com"); 
				 * user1.setPassword("k123");
				 * user1.setCity("Latur"); 
				 * user1.setGender("Male");
				 
				
					User user2 = new User(3,"Nikita","nik@gmail.com","n123","Pune","Female"); 
				
		try
		{
			session.save(user2);
			transaction.commit();
			System.out.println("User Added successfully");
		}
		catch(Exception e)
		{
			transaction.rollback();
			e.printStackTrace();
			System.out.println("User Not Added ");

		}*/
		
		
		//*************		Selection	**************************
		
		
		/*
		 * try { User user = session.get(User.class, 7); 
		 * if(user!=null) {
		 * 
		 * System.out.println(user.getId()); 
		 * System.out.println(user.getName());
		 * System.out.println(user.getEmail()); 
		 * System.out.println(user.getPassword());
		 * System.out.println(user.getCity());
		 * System.out.println(user.getGender());
		 * }
		 * else
		 *  {
		 *   System.out.println("User Not found"); 
		 *   } 
		 *   } 
		 *   catch(Exception e) 
		 *   {
		 * e.printStackTrace(); 
		 * }
		 */
		
		
		//*************		Updation	**************************
		/*
		 * try 
		 * {
		 *  User user = session.get(User.class, 3); 
		 *  user.setCity("Mumbai");
		 * session.saveOrUpdate(user); 
		 * transaction.commit();
		 * System.out.println("User Updated successfully"); 
		 * }
		 *  catch(Exception e) 
		 *  {
		 * transaction.rollback(); 
		 * e.printStackTrace();
		 * System.out.println("User Not Updated "); 
		 * }
		 */
		
		//*************		Deletion	**************************

		/*
		 * try 
		 * {
		 *  User user = session.get(User.class, 3); 
		 *  user.setId(2);
		 * session.delete(user); 
		 * transaction.commit();
		 * System.out.println("User Deleted successfully"); 
		 * } catch(Exception e) {
		 * transaction.rollback(); 
		 * e.printStackTrace();
		 * System.out.println("User Not Deleted "); 
		 * }
		 */
		 
	}

}
