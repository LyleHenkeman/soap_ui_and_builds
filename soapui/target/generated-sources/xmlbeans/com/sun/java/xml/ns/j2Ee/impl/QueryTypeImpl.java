/*
 * XML Type:  queryType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.QueryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML queryType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class QueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.QueryType
{
    private static final long serialVersionUID = 1L;
    
    public QueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName QUERYMETHOD$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "query-method");
    private static final javax.xml.namespace.QName RESULTTYPEMAPPING$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "result-type-mapping");
    private static final javax.xml.namespace.QName EJBQL$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-ql");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(com.sun.java.xml.ns.j2Ee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "query-method" element
     */
    public com.sun.java.xml.ns.j2Ee.QueryMethodType getQueryMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.QueryMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.QueryMethodType)get_store().find_element_user(QUERYMETHOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "query-method" element
     */
    public void setQueryMethod(com.sun.java.xml.ns.j2Ee.QueryMethodType queryMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.QueryMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.QueryMethodType)get_store().find_element_user(QUERYMETHOD$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.QueryMethodType)get_store().add_element_user(QUERYMETHOD$2);
            }
            target.set(queryMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "query-method" element
     */
    public com.sun.java.xml.ns.j2Ee.QueryMethodType addNewQueryMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.QueryMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.QueryMethodType)get_store().add_element_user(QUERYMETHOD$2);
            return target;
        }
    }
    
    /**
     * Gets the "result-type-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ResultTypeMappingType getResultTypeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResultTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResultTypeMappingType)get_store().find_element_user(RESULTTYPEMAPPING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "result-type-mapping" element
     */
    public boolean isSetResultTypeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULTTYPEMAPPING$4) != 0;
        }
    }
    
    /**
     * Sets the "result-type-mapping" element
     */
    public void setResultTypeMapping(com.sun.java.xml.ns.j2Ee.ResultTypeMappingType resultTypeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResultTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResultTypeMappingType)get_store().find_element_user(RESULTTYPEMAPPING$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ResultTypeMappingType)get_store().add_element_user(RESULTTYPEMAPPING$4);
            }
            target.set(resultTypeMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "result-type-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ResultTypeMappingType addNewResultTypeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResultTypeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResultTypeMappingType)get_store().add_element_user(RESULTTYPEMAPPING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "result-type-mapping" element
     */
    public void unsetResultTypeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULTTYPEMAPPING$4, 0);
        }
    }
    
    /**
     * Gets the "ejb-ql" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType getEjbQl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(EJBQL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-ql" element
     */
    public void setEjbQl(com.sun.java.xml.ns.j2Ee.XsdStringType ejbQl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().find_element_user(EJBQL$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(EJBQL$6);
            }
            target.set(ejbQl);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-ql" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdStringType addNewEjbQl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdStringType)get_store().add_element_user(EJBQL$6);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
