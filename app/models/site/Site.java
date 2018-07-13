package models.site;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.AbstractMasterModel;
import models.constructor.Constructor;

@Entity
public class Site extends AbstractMasterModel{

	@Column(length=50)
	public String siteName;

	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public Constructor constractor;

	@Column(nullable=false)
	public int transportCost;

	@Column(nullable=false)
	public Date startAt;

	public Date finishAt;

}
