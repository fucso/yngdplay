package models.constructor;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import models.AbstractMasterModel;
import models.site.Site;

@Entity
public class Constructor extends AbstractMasterModel {

	@Column(length=50, nullable=false)
	public String constructorName;

	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public ConstructorType constructorType;

	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public ColorPalette displayColor;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<Site> sites = new ArrayList<Site>();
}
