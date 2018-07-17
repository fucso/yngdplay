/**
 * @author hosoki
 * すべてのマスターモデルで共通となるカラム、機能を持つ抽象モデル。
 */
package models;

import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractMasterModel extends AbstractModel {

    /**
     * モデルの非表示日。
     * トランザクションと紐づいたモデルをデータベースから削除してしまうと、
     * 参照先が不明なトランザクションが発生してしまうので、
     * そういったモデルは削除ではなく非表示にして対応する。
     * 表示/非表示 の boolean でも問題ないが、今後の拡張性のため非表示実施日を登録する。
     * この値が Null なら非表示になっていないことを表す。
     */
	public Date hiddenAt;
}
