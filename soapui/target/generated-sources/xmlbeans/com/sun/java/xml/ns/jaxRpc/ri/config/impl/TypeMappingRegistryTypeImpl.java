/*
 * XML Type:  typeMappingRegistryType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML typeMappingRegistryType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class TypeMappingRegistryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType
{
    private static final long serialVersionUID = 1L;
    
    public TypeMappingRegistryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "import");
    private static final javax.xml.namespace.QName TYPEMAPPING$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "typeMapping");
    private static final javax.xml.namespace.QName ADDITIONALTYPES$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "additionalTypes");
    
    
    /**
     * Gets the "import" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ImportType getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ImportType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ImportType)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "import" element
     */
    public boolean isSetImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0) != 0;
        }
    }
    
    /**
     * Sets the "import" element
     */
    public void setImport(com.sun.java.xml.ns.jaxRpc.ri.config.ImportType ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ImportType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ImportType)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ImportType)get_store().add_element_user(IMPORT$0);
            }
            target.set(ximport);
        }
    }
    
    /**
     * Appends and returns a new empty "import" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ImportType addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ImportType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ImportType)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "import" element
     */
    public void unsetImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, 0);
        }
    }
    
    /**
     * Gets a List of "typeMapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType> getTypeMappingList()
    {
        final class TypeMappingList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType get(int i)
                { return TypeMappingRegistryTypeImpl.this.getTypeMappingArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType old = TypeMappingRegistryTypeImpl.this.getTypeMappingArray(i);
                TypeMappingRegistryTypeImpl.this.setTypeMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType o)
                { TypeMappingRegistryTypeImpl.this.insertNewTypeMapping(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType old = TypeMappingRegistryTypeImpl.this.getTypeMappingArray(i);
                TypeMappingRegistryTypeImpl.this.removeTypeMapping(i);
                return old;
            }
            
            public int size()
                { return TypeMappingRegistryTypeImpl.this.sizeOfTypeMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TypeMappingList();
        }
    }
    
    /**
     * Gets array of all "typeMapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType[] getTypeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType>();
            get_store().find_all_element_users(TYPEMAPPING$2, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "typeMapping" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType getTypeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType)get_store().find_element_user(TYPEMAPPING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "typeMapping" element
     */
    public int sizeOfTypeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEMAPPING$2);
        }
    }
    
    /**
     * Sets array of all "typeMapping" element
     */
    public void setTypeMappingArray(com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType[] typeMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typeMappingArray, TYPEMAPPING$2);
        }
    }
    
    /**
     * Sets ith "typeMapping" element
     */
    public void setTypeMappingArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType typeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType)get_store().find_element_user(TYPEMAPPING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(typeMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "typeMapping" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType insertNewTypeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType)get_store().insert_element_user(TYPEMAPPING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "typeMapping" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType addNewTypeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType)get_store().add_element_user(TYPEMAPPING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "typeMapping" element
     */
    public void removeTypeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEMAPPING$2, i);
        }
    }
    
    /**
     * Gets the "additionalTypes" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType getAdditionalTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType)get_store().find_element_user(ADDITIONALTYPES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "additionalTypes" element
     */
    public boolean isSetAdditionalTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALTYPES$4) != 0;
        }
    }
    
    /**
     * Sets the "additionalTypes" element
     */
    public void setAdditionalTypes(com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType additionalTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType)get_store().find_element_user(ADDITIONALTYPES$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType)get_store().add_element_user(ADDITIONALTYPES$4);
            }
            target.set(additionalTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "additionalTypes" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType addNewAdditionalTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType)get_store().add_element_user(ADDITIONALTYPES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "additionalTypes" element
     */
    public void unsetAdditionalTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALTYPES$4, 0);
        }
    }
}
