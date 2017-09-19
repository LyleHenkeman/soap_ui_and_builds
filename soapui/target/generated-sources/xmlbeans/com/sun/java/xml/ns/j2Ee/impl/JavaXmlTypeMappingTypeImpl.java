/*
 * XML Type:  java-xml-type-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML java-xml-type-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class JavaXmlTypeMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType
{
    private static final long serialVersionUID = 1L;
    
    public JavaXmlTypeMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JAVATYPE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "java-type");
    private static final javax.xml.namespace.QName ROOTTYPEQNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "root-type-qname");
    private static final javax.xml.namespace.QName ANONYMOUSTYPEQNAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "anonymous-type-qname");
    private static final javax.xml.namespace.QName QNAMESCOPE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "qname-scope");
    private static final javax.xml.namespace.QName VARIABLEMAPPING$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "variable-mapping");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "java-type" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType getJavaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().find_element_user(JAVATYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "java-type" element
     */
    public void setJavaType(com.sun.java.xml.ns.j2Ee.JavaTypeType javaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().find_element_user(JAVATYPE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().add_element_user(JAVATYPE$0);
            }
            target.set(javaType);
        }
    }
    
    /**
     * Appends and returns a new empty "java-type" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType addNewJavaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().add_element_user(JAVATYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "root-type-qname" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getRootTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(ROOTTYPEQNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "root-type-qname" element
     */
    public boolean isSetRootTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOTTYPEQNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "root-type-qname" element
     */
    public void setRootTypeQname(com.sun.java.xml.ns.j2Ee.XsdQNameType rootTypeQname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(ROOTTYPEQNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(ROOTTYPEQNAME$2);
            }
            target.set(rootTypeQname);
        }
    }
    
    /**
     * Appends and returns a new empty "root-type-qname" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewRootTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(ROOTTYPEQNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "root-type-qname" element
     */
    public void unsetRootTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOTTYPEQNAME$2, 0);
        }
    }
    
    /**
     * Gets the "anonymous-type-qname" element
     */
    public com.sun.java.xml.ns.j2Ee.String getAnonymousTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(ANONYMOUSTYPEQNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anonymous-type-qname" element
     */
    public boolean isSetAnonymousTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANONYMOUSTYPEQNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "anonymous-type-qname" element
     */
    public void setAnonymousTypeQname(com.sun.java.xml.ns.j2Ee.String anonymousTypeQname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(ANONYMOUSTYPEQNAME$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(ANONYMOUSTYPEQNAME$4);
            }
            target.set(anonymousTypeQname);
        }
    }
    
    /**
     * Appends and returns a new empty "anonymous-type-qname" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewAnonymousTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(ANONYMOUSTYPEQNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "anonymous-type-qname" element
     */
    public void unsetAnonymousTypeQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANONYMOUSTYPEQNAME$4, 0);
        }
    }
    
    /**
     * Gets the "qname-scope" element
     */
    public com.sun.java.xml.ns.j2Ee.QnameScopeType getQnameScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.QnameScopeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.QnameScopeType)get_store().find_element_user(QNAMESCOPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "qname-scope" element
     */
    public void setQnameScope(com.sun.java.xml.ns.j2Ee.QnameScopeType qnameScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.QnameScopeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.QnameScopeType)get_store().find_element_user(QNAMESCOPE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.QnameScopeType)get_store().add_element_user(QNAMESCOPE$6);
            }
            target.set(qnameScope);
        }
    }
    
    /**
     * Appends and returns a new empty "qname-scope" element
     */
    public com.sun.java.xml.ns.j2Ee.QnameScopeType addNewQnameScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.QnameScopeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.QnameScopeType)get_store().add_element_user(QNAMESCOPE$6);
            return target;
        }
    }
    
    /**
     * Gets a List of "variable-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.VariableMappingType> getVariableMappingList()
    {
        final class VariableMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.VariableMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.VariableMappingType get(int i)
                { return JavaXmlTypeMappingTypeImpl.this.getVariableMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.VariableMappingType set(int i, com.sun.java.xml.ns.j2Ee.VariableMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.VariableMappingType old = JavaXmlTypeMappingTypeImpl.this.getVariableMappingArray(i);
                JavaXmlTypeMappingTypeImpl.this.setVariableMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.VariableMappingType o)
                { JavaXmlTypeMappingTypeImpl.this.insertNewVariableMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.VariableMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.VariableMappingType old = JavaXmlTypeMappingTypeImpl.this.getVariableMappingArray(i);
                JavaXmlTypeMappingTypeImpl.this.removeVariableMapping(i);
                return old;
            }
            
            public int size()
                { return JavaXmlTypeMappingTypeImpl.this.sizeOfVariableMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VariableMappingList();
        }
    }
    
    /**
     * Gets array of all "variable-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.VariableMappingType[] getVariableMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.VariableMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.VariableMappingType>();
            get_store().find_all_element_users(VARIABLEMAPPING$8, targetList);
            com.sun.java.xml.ns.j2Ee.VariableMappingType[] result = new com.sun.java.xml.ns.j2Ee.VariableMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "variable-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.VariableMappingType getVariableMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.VariableMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.VariableMappingType)get_store().find_element_user(VARIABLEMAPPING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "variable-mapping" element
     */
    public int sizeOfVariableMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIABLEMAPPING$8);
        }
    }
    
    /**
     * Sets array of all "variable-mapping" element
     */
    public void setVariableMappingArray(com.sun.java.xml.ns.j2Ee.VariableMappingType[] variableMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(variableMappingArray, VARIABLEMAPPING$8);
        }
    }
    
    /**
     * Sets ith "variable-mapping" element
     */
    public void setVariableMappingArray(int i, com.sun.java.xml.ns.j2Ee.VariableMappingType variableMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.VariableMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.VariableMappingType)get_store().find_element_user(VARIABLEMAPPING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(variableMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variable-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.VariableMappingType insertNewVariableMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.VariableMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.VariableMappingType)get_store().insert_element_user(VARIABLEMAPPING$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variable-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.VariableMappingType addNewVariableMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.VariableMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.VariableMappingType)get_store().add_element_user(VARIABLEMAPPING$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "variable-mapping" element
     */
    public void removeVariableMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIABLEMAPPING$8, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
}
