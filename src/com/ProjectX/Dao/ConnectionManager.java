package com.ProjectX.Dao;
import java.util.*;
import java.lang.*;
import com.ProjectX.Dao.*;
//import com.ProjectX.Dao.Object.ObjectInterface;


//// Get the datastax driver cluser as it is more efficient using binary 
//import com.datastax.driver.core.Cluster;
//import com.datastax.driver.core.Host;
//import com.datastax.driver.core.Metadata;
//import com.datastax.driver.core.Session;
//
//
//
//// Make it as factory where we can use multiple type of the DataBasses
//// Nice Article on Cassandra -> https://dzone.com/articles/connecting-cassandra-java
//// Check this as well when coding DB Manager :-> http://www.baeldung.com/cassandra-with-java (This uses Maven)
//
//
///**
// * Class used for connecting to Cassandra database.
// */
//class CassandraConnector
//{
//   /** Cassandra Cluster. */
//   private Cluster cluster;
//   /** Cassandra Session. */
//   private Session session;
//   /**
//    * Connect to Cassandra Cluster specified by provided node IP
//    * address and port number.
//    *
//    * @param node Cluster node IP address.
//    * @param port Port of cluster host.
//    */
//   public void connect(final String node, final int port)
//   {
//      this.cluster = Cluster.builder().addContactPoint(node).withPort(port).build();
//      final Metadata metadata = cluster.getMetadata();
//      out.printf("Connected to cluster: %s\n", metadata.getClusterName());
//      for (final Host host : metadata.getAllHosts())
//      {
//         out.printf("Datacenter: %s; Host: %s; Rack: %s\n",
//            host.getDatacenter(), host.getAddress(), host.getRack());
//      }
//      session = cluster.connect();
//   }
//   /**
//    * Provide my Session.
//    *
//    * @return My session.
//    */
//   public Session getSession()
//   {
//      return this.session;
//   }
//   /** Close cluster. */
//   public void close()
//   {
//      cluster.close();
//   }
//}
//
//
//
//
//

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;  

public class ConnectionManager {
	//private Connection
	
	// Hibernate related objects as a persistance 
	private Configuration m_cfg;
	private SessionFactory m_factory;
	private Session m_session;
	private Transaction m_transaction;
	
	public ConnectionManager(){
		
	}
	
	public String getSomeValue(String inputValue){
		return "I gotchu Man ->"+inputValue;
	}
	
	ConnectionManager(String admin, String password){
		
	}
	
//	public ArrayList<ObjectInterface> getObjectWithinRange(double maxLatitute, double maxLongitute, double minLatitute, double minLongitute){
//		//TODO : Create hibernate connection and query objects
//		
//		return null;
//	}
	
	public String getLogin(String a_UserName, String a_Password){
		
		return null;
	}
	
	public String getLogin(String a_UserHashCode){
		
		// Call HiberNate here and access the database
		System.out.println("get Login a_UserHashCode "+a_UserHashCode);
		m_cfg = new Configuration();
		m_cfg.configure("hibernate.cfg.xml");
		m_factory = m_cfg.buildSessionFactory();  
		m_session = m_factory.openSession();  
		
		
		m_transaction = m_session.beginTransaction();  
		
		String qry = "FROM Employee";
		
		Query query = m_session.createQuery(qry);
		
		List list = query.getResultList();
		
//		Employee e1=new Employee();  
//	   // e1.setUser_id(1002);
//	    e1.setPassword(a_UserHashCode);
////	    e1.setId(115);  
////	    e1.setFirstName("sonoo");  
////	    e1.setLastName("jaiswal");  
////	      
//	    m_session.persist(e1);//persisting the object  
	    
	    m_session.persist(query);
	      
	    m_transaction.commit();//transaction is committed  
	    m_session.close();  
		
	    System.out.println(" After Session Close a_UserHashCode "+a_UserHashCode);
	    
	    System.out.println(" Output List has  "+list.size());
	    
	    for(int i = 0; i < list.size(); i++){
	    	 System.out.println(" Query Results  "+list.get(i));
	    }
		
		
		Map<String, Boolean> m_userDB = new HashMap<String, Boolean>();
		m_userDB.put("Prem", true);
		m_userDB.put("Ana", true);
		m_userDB.put("Rakesh", true);
		
		if(m_userDB.containsKey(a_UserHashCode)){
			return a_UserHashCode;
		} else {
			return null;
		}
	}
	
//	public String getService(ObjectInterface.ObjectType a_Service  /*  Try putting Generic Object*/){
//		
//		return null;
//	}
}
