package org.hacker.mvc.model.base;

import org.hacker.core.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDbModel<M extends BaseDbModel<M>> extends BaseModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setClassName(java.lang.String className) {
		set("class_name", className);
	}

	public java.lang.String getClassName() {
		return get("class_name");
	}

	public void setDescribe(java.lang.String describe) {
		set("describe", describe);
	}

	public java.lang.String getDescribe() {
		return get("describe");
	}

	public void setIsSynDb(java.lang.Boolean isSynDb) {
		set("is_syn_db", isSynDb);
	}

	public java.lang.Boolean getIsSynDb() {
		return get("is_syn_db");
	}

	public void setIsSynCode(java.lang.Boolean isSynCode) {
		set("is_syn_code", isSynCode);
	}

	public java.lang.Boolean getIsSynCode() {
		return get("is_syn_code");
	}

	public void setProjectId(java.lang.Integer id) {
	  set("project_id", id);
	}

	public java.lang.Integer getProjectId() {
	  return get("project_id");
	}
}
