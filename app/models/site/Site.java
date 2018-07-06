package models.site;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.AbstractMasterModel;

@Entity
public class Site extends AbstractMasterModel{

	@Column(length=50)
	public String siteName;

	@ManyToOne(cascade = CascadeType.ALL)
	public int constractor;

	@Column(nullable=false)
	public int transportCost;

	@Column(nullable=false)
	public Date startAt;

	public Date finishAt;

}
