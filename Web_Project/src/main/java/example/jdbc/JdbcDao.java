package example.jdbc;

import java.util.Collection;

public interface JdbcDao<T,K> {
   Collection<T> getAll();//get all the objects of the specific type
   T getOne(K key);//get one object of te specific type based upon its identity
   void add(T t);// add a new record into the existing table
   void update(T t);//update the existing record
   void delete(K key);
}
//This is a generic interface which provides a basic template for performing
//CRUD operations.
