package com.sojpt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseContact<M extends BaseContact<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setSendname(java.lang.String sendname) {
		set("sendname", sendname);
	}
	
	public java.lang.String getSendname() {
		return getStr("sendname");
	}

	public void setTelphone(java.lang.String telphone) {
		set("telphone", telphone);
	}
	
	public java.lang.String getTelphone() {
		return getStr("telphone");
	}

	public void setMessage(java.lang.String message) {
		set("message", message);
	}
	
	public java.lang.String getMessage() {
		return getStr("message");
	}

	public void setSendtime(java.util.Date sendtime) {
		set("sendtime", sendtime);
	}
	
	public java.util.Date getSendtime() {
		return get("sendtime");
	}

}
