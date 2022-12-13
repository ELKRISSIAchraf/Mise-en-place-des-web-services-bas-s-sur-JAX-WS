package ma.fstt.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carburant")
public class Carburant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_car;
	public Long getId_car() {
		return id_car;
	}
	public void setId_car(Long id_car) {
		this.id_car = id_car;
	}
	@Override
	public String toString() {
		return "Carburant [id_car=" + id_car + ", nom=" + nom + ", description=" + description + "]";
	}
	public Carburant(Long id_car, String nom, String description) {
		super();
		this.id_car = id_car;
		this.nom = nom;
		this.description = description;
	}
	public String getNom() {
		return nom;
	}
	public Carburant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String nom;
	private String description;
	
}
