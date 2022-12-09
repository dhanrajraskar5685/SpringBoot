package com.example.demo.dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void showStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("In Dao Layer" + student);
		Session session = sf.openSession();
		session.saveOrUpdate(student);
		
		
		File file = new File("D:\\npkey.txt");
		student.setFname(file.getName());
		student.setDpath(file.getAbsolutePath());

		Path path = Paths.get(file.getAbsolutePath());
		byte[] fbyte;
		try {
			fbyte = Files.readAllBytes(path);
			student.setFdata(fbyte);
			session.saveOrUpdate(student);
			session.beginTransaction().commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public List<Student> getAllData(String uname, String upass) {

		List<Student> list = new ArrayList<Student>();
		Session session = sf.openSession();
		if (uname.equals("dhanraj") && upass.equals("dhanraj")) {

			Query<Student> query = session.createQuery("from Student");
			list = query.getResultList();

			return list;

		} else {
			try {
				Query<Student> query = session.createQuery("from Student where uname= :un and upass= :up");
				query.setParameter("un", uname);
				query.setParameter("up", upass);
				Student student = query.getSingleResult();

			} catch (Exception e) {
				System.out.println("invalid password");
			}
		}
		return list;

	}

	@Override
	public Student getSingleStudent(int sid) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Student student = session.get(Student.class, sid);
		return student;
	}

	@Override
	public List<Student> getCheckUpdate(Student student) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		session.beginTransaction();
		session.update(student);
		session.getTransaction().commit();

		Query<Student> query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		return list;
	}

	@Override
	public List<Student> afterdelete(int sid) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		session.delete(session.get(Student.class, sid));
		Query<Student> query = session.createQuery("from Student");
		List<Student> list = query.getResultList();

		return list;
	}

	

}
