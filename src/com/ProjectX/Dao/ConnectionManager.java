//package com.ProjectX.Dao;
//import java.util.*;
//import java.lang.*;
//
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
public class ConnectionManager {
	//private Connection
	
	ConnectionManager(String admin, String password){
		
	}
}
