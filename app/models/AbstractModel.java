package models;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;

@MappedSuperclass
public abstract class AbstractModel extends Model {

	@Id
	public int id;

	@CreatedTimestamp
	public Date createAt;

	@UpdatedTimestamp
	public Date updateAt;


}
