package models.constructor;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import models.AbstractModel;

@Entity
public class ConstructorType extends AbstractModel {

	@Column(length=50, nullable=false)
	public String typeName;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<Constructor> constructors = new ArrayList<Constructor>();

}
