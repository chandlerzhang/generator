<#--  /** default constructor */ -->
    public ${pojo.getDeclarationName()}() {
    }
<#if pojo.needsMinimalConstructor()>	<#-- /** minimal constructor */ -->
<#assign propertyList = pojo.getPropertyClosureForMinimalConstructor()>
<#assign xx = propertyList.remove(pojo.getIdentifierProperty())>

    public ${pojo.getDeclarationName()}(Long id<#if !propertyList.isEmpty()>, ${c2j.asParameterList(propertyList, jdk5, pojo)}</#if>) {
<#if pojo.isSubclass() && !pojo.getPropertyClosureForSuperclassMinimalConstructor().isEmpty()>
        super(${c2j.asArgumentList(pojo.getPropertyClosureForSuperclassMinimalConstructor())});        
</#if>
<#foreach field in pojo.getPropertiesForMinimalConstructor()>
        this.${field.name} = ${field.name};
</#foreach>
    }
</#if>