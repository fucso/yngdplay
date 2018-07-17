/**
 * @author hosoki
 * 柳田工務店がゼネコンより依頼されて施工している現場のモデル。
 */
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

	/**
	 * 依頼元となるゼネコン。
	 */
	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public Constructor constractor;

	/**
	 * 基本運搬費。
	 * この現場への自社分トラックの稼働1台につきこの金額の経費が発生する。
	 */
	@Column(nullable=false)
	public int transportCost;

	/**
	 * 現場の開始日。
	 */
	@Column(nullable=false)
	public Date startAt;

	/**
	 * 現場の終了日。未終了の場合は Null になる。
	 */
	public Date finishAt;

}
