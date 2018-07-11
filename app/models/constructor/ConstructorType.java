package models.constructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import models.AbstractModel;

@Entity
public class ConstructorType extends AbstractModel {

	@Column(length=50, nullable=false)
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Constructor")
	public String typeName;

}
