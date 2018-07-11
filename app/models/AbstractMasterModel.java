package models;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractMasterModel extends AbstractModel {

	public Date hiddenAt;
}
