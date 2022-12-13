package ma.fstt.entities;




import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "histcarburant")
public class HistCarburant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_histcar;
	private Long id_car;
	private Long id_sta;
	private Date date;
	private Double prix;
	public Long getId_histcar() {
		return id_histcar;
	}
	public void setId_histcar(Long id_histcar) {
		this.id_histcar = id_histcar;
	}
	public Long getId_car() {
		return id_car;
	}
	public void setId_car(Long id_car) {
		this.id_car = id_car;
	}
	public Long getId_sta() {
		return id_sta;
	}
	public void setId_sta(Long id_sta) {
		this.id_sta = id_sta;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public HistCarburant(Long id_histcar, Long id_car, Long id_sta, Date date, Double prix) {
		super();
		this.id_histcar = id_histcar;
		this.id_car = id_car;
		this.id_sta = id_sta;
		this.date = date;
		this.prix = prix;
	}
	public HistCarburant() {
		super();
		// TODO Auto-generated constructor stu
	}
	@Override
	public String toString() {
		return "HistCarburant [id_histcar=" + id_histcar + ", id_car=" + id_car + ", id_sta=" + id_sta + ", date="
				+ date + ", prix=" + prix + "]";
	}
}
