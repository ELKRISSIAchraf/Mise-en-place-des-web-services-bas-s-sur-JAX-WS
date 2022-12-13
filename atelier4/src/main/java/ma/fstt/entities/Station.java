package ma.fstt.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "station")
public class Station {
		public Station() {
		super();
		// TODO Auto-generated constructor stub
	}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_sta ;
		public Long getId_sta() {
			return id_sta;
		}
		public void setId_sta(Long id_sta) {
			this.id_sta = id_sta;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getVille() {
			return ville;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		private String nom;
		public Station(Long id_sta, String nom, String ville, String adresse) {
			super();
			this.id_sta = id_sta;
			this.nom = nom;
			this.ville = ville;
			this.adresse = adresse;
		}
		@Override
		public String toString() {
			return "Station [id_sta=" + id_sta + ", nom=" + nom + ", ville=" + ville + ", adresse=" + adresse + "]";
		}
		private String ville ;
		private String adresse;
		
}
