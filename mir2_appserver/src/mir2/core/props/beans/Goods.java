/**
 * miragine.com
 * @author mudsong@gmail.com
 */
package mir2.core.props.beans;

import java.util.Date;

import mir2.common.db.JdoEntityImpl;

/**
 * 
 */
public class Goods extends JdoEntityImpl {
	
	/**
	 * ID
	 */
	private Long id;

	/**
	 * 创建日期
	 */
	private Date createDate;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
