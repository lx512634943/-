package com.sojpt.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BasePartnerkinds<M extends BasePartnerkinds<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setKinds(java.lang.String kinds) {
		set("kinds", kinds);
	}
	
	public java.lang.String getKinds() {
		return getStr("kinds");
	}

}
