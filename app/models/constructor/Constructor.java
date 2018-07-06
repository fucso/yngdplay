package models.constructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import models.AbstractMasterModel;

@Entity
public class Constructor extends AbstractMasterModel {

	@Column(length=50, nullable=false)
	public String constructorName;

	@ManyToOne(cascade = CascadeType.ALL)
	public int constructorType;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="ColorPalette")
	public int displayColor;
}
