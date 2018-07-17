/**
 * @author hosoki
 * ゼネコンの表示色として登録可能な色のモデル
 * 表示色は現在人工入力でのみ使用。
 */
package models.constructor;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import models.AbstractModel;

@Entity
public class ColorPalette extends AbstractModel {

	/**
	 * 6桁のRGBコード
	 */
	@Column(length=6, nullable=false)
	public String colorCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<Constructor> constructors = new ArrayList<Constructor>();
}
