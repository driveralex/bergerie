package fr.esisar.aqualink.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="Aquarium")
public class Aquarium implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true)
	private Long idAquarium;
	
	private Double volume;
	
	@OneToMany(mappedBy="aquarium")
	private List<Poisson> poissons;
	
	@OneToMany(mappedBy="aquarium")
	private List<Capteur> capteurs;
	
	@ManyToMany(mappedBy="aquarium")
	private List<Personne> personnes;
	
	@ManyToMany(mappedBy="aquarium")
	private List<ParcAquarium> parcsAquariums;
	
	public Aquarium() {
		super();
	}

	public Aquarium(Long idAquarium, Double volume, List<Poisson> poissons, List<Capteur> capteurs,
			List<Personne> personnes, List<ParcAquarium> parcsAquariums) {
		super();
		this.idAquarium = idAquarium;
		this.volume = volume;
		this.poissons = poissons;
		this.capteurs = capteurs;
		this.personnes = personnes;
		this.parcsAquariums = parcsAquariums;
	}

	public Long getIdAquarium() {
		return idAquarium;
	}

	public void setIdAquarium(Long idAquarium) {
		this.idAquarium = idAquarium;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public List<Poisson> getPoissons() {
		return poissons;
	}

	public void setPoissons(List<Poisson> poissons) {
		this.poissons = poissons;
	}

	public List<Capteur> getCapteurs() {
		return capteurs;
	}

	public void setCapteurs(List<Capteur> capteurs) {
		this.capteurs = capteurs;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public List<ParcAquarium> getParcsAquariums() {
		return parcsAquariums;
	}

	public void setParcsAquariums(List<ParcAquarium> parcsAquariums) {
		this.parcsAquariums = parcsAquariums;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAquarium == null) ? 0 : idAquarium.hashCode());
		result = prime * result + ((poissons == null) ? 0 : poissons.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
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
		Aquarium other = (Aquarium) obj;
		if (idAquarium == null) {
			if (other.idAquarium != null)
				return false;
		} else if (!idAquarium.equals(other.idAquarium))
			return false;
		if (poissons == null) {
			if (other.poissons != null)
				return false;
		} else if (!poissons.equals(other.poissons))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aquarium [idAquarium=" + idAquarium + ", volume=" + volume + ", poissons=" + poissons + "]";
	}	
}
