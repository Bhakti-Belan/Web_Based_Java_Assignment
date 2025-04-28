package com.bookshop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bookshop.entity.Author;
import com.bookshop.entity.Book;
import com.bookshop.util.HibrenateUtils;

public class AuthorDao {

	public boolean save(Author author)
	{
		boolean status=false;
		try(SessionFactory factory=HibrenateUtils.getSessionFactory();
			Session session=factory.openSession()) {
			Transaction tx=session.beginTransaction();
			session.persist(author);
			tx.commit();
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	public List<Author> findAll()
	{
		List<Author> authors=null;
		try (SessionFactory factory = HibrenateUtils.getSessionFactory();
	             Session session = factory.openSession()) {
	        	session.beginTransaction();
	        	String hql = "from Author";
	            Query<Author> query = session.createQuery(hql, Author.class);
	            authors = query.list();
                
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return authors;
}
	public Author findByNameandEmail(String name,String email)
	{ 
		Author author=null;
		try(SessionFactory factory=HibrenateUtils.getSessionFactory();
			Session session=factory.openSession()) {
			
			String hql="select a from Author a where a.name=:authName and a.email=:authEmail";
			Query<Author> authorObj=session.createQuery(hql,Author.class);
			authorObj.setParameter("authName", name);
			authorObj.setParameter("authEmail", email);
			
			author=authorObj.uniqueResult();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return author;
		
	}


}
