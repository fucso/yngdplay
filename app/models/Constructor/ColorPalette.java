package models.Constructor;

import javax.persistence.Column;
import javax.persistence.Entity;

import models.AbstractModel;

@Entity
public class ColorPalette extends AbstractModel {

	@Column(length=6, nullable=false)
	public String colorCode;
}
