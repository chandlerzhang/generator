<#assign packageParent = pojo.getPackageName()>
${pojo.getPackageDeclaration().replace(";",".manager;")}
<#assign classbody>
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
<#assign entityName = declarationName?uncap_first>
@${pojo.importType("org.springframework.stereotype.Service")}
@${pojo.importType("org.springframework.transaction.annotation.Transactional")}
public class ${declarationName}Manager {
	@${pojo.importType("org.springframework.beans.factory.annotation.Autowired")}
	private ${declarationName}Dao ${entityName}Dao;

	// ${declarationName} Manager //
	@Transactional(readOnly = true)
	public ${declarationName} get${declarationName}(Long id) {
		return ${entityName}Dao.get(id);
	}

	@Transactional(readOnly = true)
	public List<${declarationName}> getAll${declarationName}() {
		return ${entityName}Dao.getAll();
	}
	
	public void save${declarationName}(${declarationName} ${entityName}) {
		${entityName}Dao.save(${entityName});
	}

	public void delete${declarationName}(Long id) {
		${entityName}Dao.delete(id);
	}
}
</#assign>

${pojo.generateImports()}
import java.util.List;
import ${pojo.getQualifiedDeclarationName().replace(packageParent,packageParent + ".entity")};
import ${packageParent}.dao.${declarationName}Dao;

${classbody}
