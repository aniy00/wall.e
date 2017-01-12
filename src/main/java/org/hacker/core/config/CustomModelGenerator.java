package org.hacker.core.config;

import com.jfinal.plugin.activerecord.generator.ModelGenerator;
import com.jfinal.plugin.activerecord.generator.TableMeta;

public class CustomModelGenerator extends ModelGenerator{
	
	public CustomModelGenerator(String modelPackageName, String baseModelPackageName, String modelOutputDir) {
		super(modelPackageName, baseModelPackageName, modelOutputDir);
		this.importTemplate =
				"import org.hacker.core.plugin.Table;%n%n" + 
				"import %s.%s;%n%n";
		
		this.classDefineTemplate =
		"/**%n" +
		" * Generated by JFinal.%n" +
		" */%n" +
		"@SuppressWarnings(\"serial\")%n" +
		"@Table(tableName=\"%s\")%n" +
		"public class %s extends %s<%s> {%n";
	}

	@Override
	protected void genClassDefine(TableMeta tableMeta, StringBuilder ret) {
		ret.append(String.format(classDefineTemplate, tableMeta.name, tableMeta.modelName, tableMeta.baseModelName, tableMeta.modelName));
	}
}