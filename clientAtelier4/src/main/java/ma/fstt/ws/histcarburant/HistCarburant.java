
package ma.fstt.ws.histcarburant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour histCarburant complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="histCarburant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="date" type="{http://Ws.fstt.ma/}date" minOccurs="0"/&gt;
 *         &lt;element name="id_car" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id_histcar" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id_sta" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "histCarburant", propOrder = {
    "date",
    "idCar",
    "idHistcar",
    "idSta",
    "prix"
})
public class HistCarburant {

    protected java.sql.Date date;
    @XmlElement(name = "id_car")
    protected Long idCar;
    @XmlElement(name = "id_histcar")
    protected Long idHistcar;
    @XmlElement(name = "id_sta")
    protected Long idSta;
    protected Double prix;

    public HistCarburant(long l, Long idCar2, Long idSta2, java.sql.Date sQLDate, Double prix2) {
		// TODO Auto-generated constructor stub
    	this.idHistcar=l;
    	this.idCar=idCar2;
    	this.idSta=idSta2;
    	this.date=sQLDate;
    	this.prix=prix2;
    	
	}

	public HistCarburant() {
		// TODO Auto-generated constructor stub
	}

	/**
     * Obtient la valeur de la propri�t� date.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public java.sql.Date getDate() {
        return date;
    }

    /**
     * D�finit la valeur de la propri�t� date.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(java.sql.Date value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propri�t� idCar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCar() {
        return idCar;
    }

    /**
     * D�finit la valeur de la propri�t� idCar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCar(Long value) {
        this.idCar = value;
    }

    /**
     * Obtient la valeur de la propri�t� idHistcar.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdHistcar() {
        return idHistcar;
    }

    /**
     * D�finit la valeur de la propri�t� idHistcar.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdHistcar(Long value) {
        this.idHistcar = value;
    }

    /**
     * Obtient la valeur de la propri�t� idSta.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSta() {
        return idSta;
    }

    /**
     * D�finit la valeur de la propri�t� idSta.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSta(Long value) {
        this.idSta = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrix(Double value) {
        this.prix = value;
    }

}
