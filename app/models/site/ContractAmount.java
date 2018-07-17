/**
 * @author hosoki
 * 現場の請負金額のモデル。
 * 追加工事などで、一つの現場に対して複数回請負金額が発生する場合があるので
 * 現場モデルとは別に管理する。
 */
package models.site;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import models.AbstractModel;
import models.site.Site;

@Entity
public class ContractAmount extends AbstractModel{

    /**
     * この請負金額の対象となる現場。
     */
	@ManyToOne(cascade = CascadeType.ALL, optional=false)
	public Site site;
	
	@Column(nullable=false)
	public int price;
	
	/**
	 * 工事の請負日。または請負金額が決定した日。
	 */
	@Column(nullable=false)
	public Date contractedDate;
	
	/**
	 * この請負金額の支払予定日。
	 */
	@Column(nullable=false)
	public Date paymentDueDate;
	
	/**
	 * この請負金額が実際に支払われた日。
	 */
	public Date payidDate;

}
