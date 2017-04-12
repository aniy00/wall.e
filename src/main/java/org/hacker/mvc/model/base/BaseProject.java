package org.hacker.mvc.model.base;

import org.hacker.core.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProject<M extends BaseProject<M>> extends BaseModel<M> implements IBean {

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

	public void setPattern(java.lang.String pattern) {
		set("pattern", pattern);
	}

	public java.lang.String getPattern() {
		return get("pattern");
	}

	public void setBaseUrl(java.lang.String baseUrl) {
		set("base_url", baseUrl);
	}

	public java.lang.String getBaseUrl() {
		return get("base_url");
	}

	public void setDbName(java.lang.String dbName) {
		set("db_name", dbName);
	}

	public java.lang.String getDbName() {
		return get("db_name");
	}

	public void setRootPath(java.lang.String rootPath) {
		set("root_path", rootPath);
	}

	public java.lang.String getRootPath() {
		return get("root_path");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}

	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setModifyDate(java.util.Date modifyDate) {
		set("modify_date", modifyDate);
	}

	public java.util.Date getModifyDate() {
		return get("modify_date");
	}

}
