package dev.paie.entite;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COTISATION")
public class Cotisation {
	
	/**id : Integer*/
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**code : String*/
	@Column(name = "CODE", length = 20, nullable = true)
	private String code;
	/**libelle : String*/
	@Column(name = "LIBELLE", length = 50)
	private String libelle;
	/**tauxSalarial : BigDecimal*/
	@Column(name = "TAUX_SALARIAL", precision = 8, scale = 6)
	private BigDecimal tauxSalarial;
	/**tauxPatronal : BigDecimal*/
	@Column(name = "TAUX_PATRONAL", precision = 8, scale = 6)
	private BigDecimal tauxPatronal;
	
	public Cotisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cotisation(Integer id, String code, String libelle, BigDecimal tauxSalarial, BigDecimal tauxPatronal) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.tauxSalarial = tauxSalarial;
		this.tauxPatronal = tauxPatronal;
	}
	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/** Getter
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/** Setter
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/** Getter
	 * @return the tauxSalarial
	 */
	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}
	/** Setter
	 * @param tauxSalarial the tauxSalarial to set
	 */
	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}
	/** Getter
	 * @return the tauxPatronal
	 */
	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}
	/** Setter
	 * @param tauxPatronal the tauxPatronal to set
	 */
	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}
}
