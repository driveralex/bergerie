package fr.esisar.aqualink.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity

@Table(name="Espece")
public class Espece implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true)
	private Long idEspece;
	private String nom;
	private String localisation;
	
	@OneToMany(mappedBy="espece")
	private List<Poisson> poissons;

	public Espece() {
		super();
	}

	public Espece(Long idEspece, String nom, String localisation, List<Poisson> poissons) {
		super();
		this.idEspece = idEspece;
		this.nom = nom;
		this.localisation = localisation;
		this.poissons = poissons;
	}

	public Long getIdEspece() {
		return idEspece;
	}

	public void setIdEspece(Long idEspece) {
		this.idEspece = idEspece;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public List<Poisson> getPoissons() {
		return poissons;
	}

	public void setPoissons(List<Poisson> poissons) {
		this.poissons = poissons;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEspece == null) ? 0 : idEspece.hashCode());
		result = prime * result + ((localisation == null) ? 0 : localisation.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((poissons == null) ? 0 : poissons.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Espece other = (Espece) obj;
		if (idEspece == null) {
			if (other.idEspece != null)
				return false;
		} else if (!idEspece.equals(other.idEspece))
			return false;
		if (localisation == null) {
			if (other.localisation != null)
				return false;
		} else if (!localisation.equals(other.localisation))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (poissons == null) {
			if (other.poissons != null)
				return false;
		} else if (!poissons.equals(other.poissons))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Espece [idEspece=" + idEspece + ", nom=" + nom + ", localisation=" + localisation + ", poissons="
				+ poissons + "]";
	}
	
}
