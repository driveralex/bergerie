package fr.esisar.aqualink.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="poisson")
public class Poisson implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true)
	private Long idPoisson;
	private LocalDate dateAjout;
	private String sexe;
	
	@ManyToOne
	private Espece especes;
	
	private String statutVente;
	private Double prix;
	
	@ManyToOne
	private Aquarium aquarium;
	
	
}
