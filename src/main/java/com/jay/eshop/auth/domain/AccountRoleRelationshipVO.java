package com.jay.eshop.auth.domain;

import java.util.Date;

import com.jay.eshop.common.util.AbstractObject;

/**
 * 用户角色关系VO类
 * @author Jay
 *
 */
public class AccountRoleRelationshipVO extends AbstractObject{

	/**
	 * id
	 */
	private Long id;
	/**
	 * 用户账号id
	 */
	private Long accountId;
	/**
	 * 角色id
	 */
	private Long roleId;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	
}
