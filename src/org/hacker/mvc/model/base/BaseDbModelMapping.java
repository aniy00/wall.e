package org.hacker.mvc.model.base;

import org.hacker.core.BaseModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseDbModelMapping<M extends BaseDbModelMapping<M>> extends BaseModel<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setMappingSchema(java.lang.String mappingSchema) {
		set("mapping_schema", mappingSchema);
	}

	public java.lang.String getMappingSchema() {
		return get("mapping_schema");
	}

	public void setMappingForeignKey(java.lang.String mappingForeignKey) {
		set("mapping_foreign_key", mappingForeignKey);
	}

	public java.lang.String getMappingForeignKey() {
		return get("mapping_foreign_key");
	}

	public void setMasterId(java.lang.Integer masterId) {
		set("master_id", masterId);
	}

	public java.lang.Integer getMasterId() {
		return get("master_id");
	}

	public void setMasterName(java.lang.String masterName) {
		set("master_name", masterName);
	}

	public java.lang.String getMasterName() {
		return get("master_name");
	}

	public void setSlavesId(java.lang.Integer slavesId) {
		set("slaves_id", slavesId);
	}

	public java.lang.Integer getSlavesId() {
		return get("slaves_id");
	}

	public void setSlavesName(java.lang.String slavesName) {
		set("slaves_name", slavesName);
	}

	public java.lang.String getSlavesName() {
		return get("slaves_name");
	}

}