package com.javaHibernateProject;

import javax.persistence.*;


@Entity
@Table(name ="sehirler")
public class Sehirler {
	@Id
	@Column(name ="s_id")
	private int s_id;
	@Column(name ="s_adi")
	private String s_adi;
	@Column(name ="s_plaka")
	private int s_plaka;
	@Column(name ="s_aciklama")
	private String s_aciklama;
		
		
		
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getS_adi() {
			return s_adi;
		}
		public void setS_adi(String s_adi) {
			this.s_adi = s_adi;
		}
		public int getS_plaka() {
			return s_plaka;
		}
		public void setS_plaka(int s_plaka) {
			this.s_plaka = s_plaka;
		}
		public String getS_aciklama() {
			return s_aciklama;
		}
		public void setS_aciklama(String s_aciklama) {
			this.s_aciklama = s_aciklama;
		}
	
}
