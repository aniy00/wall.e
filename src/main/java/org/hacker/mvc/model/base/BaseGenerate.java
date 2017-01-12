package org.hacker.mvc.model.base;

import org.hacker.core.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGenerate<M extends BaseGenerate<M>> extends BaseModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setPackage(java.lang.String _package) {
		set("package", _package);
	}

	public java.lang.String getPackage() {
		return get("package");
	}

	public void setModuleName(java.lang.String moduleName) {
		set("module_name", moduleName);
	}

	public java.lang.String getModuleName() {
		return get("module_name");
	}

	public void setCodeStyle(java.lang.String codeStyle) {
		set("code_style", codeStyle);
	}

	public java.lang.String getCodeStyle() {
		return get("code_style");
	}

	public void setWModelId(java.lang.Integer wModelId) {
		set("w_model_id", wModelId);
	}

	public java.lang.Integer getWModelId() {
		return get("w_model_id");
	}

}