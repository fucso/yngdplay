/**
 * @author hosoki
 * 柳田工務店のお客様にあたるゼネコンのモデル。
 * システム内の表示名は「お客様」を使用する。
 */
package models.constructor;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import models.AbstractMasterModel;
import models.site.Site;

@Entity
public class Constructor extends AbstractMasterModel {

	@Column(length=50, nullable=false)
	public String constructorName;

	/**
	 * 分類タイプ。
	 */
	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public ConstructorType constructorType;

	/**
	 * 表示色。現在は人工入力でのみ使用。
	 */
	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public ColorPalette displayColor;
	
	@OneToMany(cascade = CascadeType.ALL)
	public List<Site> sites = new ArrayList<Site>();
}
