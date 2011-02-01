<#assign packageParent = pojo.getPackageName()>
${pojo.getPackageDeclaration().replace(";",".dao;")}
<#assign classbody>
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
<#assign entityName = declarationName?uncap_first>
@${pojo.importType("org.springframework.stereotype.Repository")}
public class ${declarationName}Dao extends ${pojo.importType("org.springside.modules.orm.hibernate.HibernateDao")}<${declarationName}, Long> {
}
</#assign>

${pojo.generateImports()}
import ${pojo.getQualifiedDeclarationName().replace(packageParent,packageParent + ".entity")};

${classbody}
