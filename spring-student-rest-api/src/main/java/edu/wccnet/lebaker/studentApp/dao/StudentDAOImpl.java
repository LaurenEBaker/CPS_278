package edu.wccnet.lebaker.studentApp.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.wccnet.lebaker.studentApp.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query<Student> query=session.createQuery("from Student order by lastName",
				Student.class);
	
		return query.getResultList() ;
	}
	
	@Override
	public void saveStudent(Student theStudent) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theStudent);
	}
	
	@Override
	public Student getStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Student.class, id);
	}
	
	@Override
	public void deleteStudent(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(Student.class);
	}

}
