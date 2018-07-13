package models.constructor;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import models.AbstractModel;

@Entity
public class ColorPalette extends AbstractModel {

	@Column(length=6, nullable=false)
	public String colorCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<Constructor> constructors = new ArrayList<Constructor>();
}
