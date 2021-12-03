package com.javaHibernateProject;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {

	public static void main(String[] args) {
		SessionFactory 	factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Sehirler.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			/*SELECT
			List<Sehirler> sehirler = session.createQuery("from Sehirler s where s.s_id='43' or s.s_id='06'").getResultList();
			
			for(Sehirler sehir:sehirler) {
				System.out.println(sehir.getS_adi());
			}*/
			
			/*INSERT
			Sehirler sehir = new Sehirler();
			sehir.setS_adi("Polatlý");
			sehir.setS_plaka(82);
			sehir.setS_aciklama("");
			
			session.save(sehir);*/
			
		
			/*UPDATE
			Sehirler sehir = session.get(Sehirler.class, 83);
			sehir.setS_plaka(83);
			
			session.save(sehir);*/
			
			
			/*DELETE
			Sehirler sehir = session.get(Sehirler.class, 83);
			session.delete(sehir);*/
			
			
			session.getTransaction().commit();
		
		}
		finally {
		}
			factory.close();
		

	}

}
