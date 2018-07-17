/**
 * @author hosoki
 * すべてのモデルで共通となるカラム、機能を持つ抽象モデル。
 */
package models;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.UpdatedTimestamp;

@MappedSuperclass
public abstract class AbstractModel extends Model {

	/**
	 * PrimaryKey, AutoIncrement
	 */
	@Id
	public int id;

	/**
	 * モデルの登録日
	 */
	@CreatedTimestamp
	public Date createAt;

	/**
	 * モデルの更新日
	 */
	@UpdatedTimestamp
	public Date updateAt;
}
