/*
 * XML Type:  query-methodType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.QueryMethodType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML query-methodType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class QueryMethodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.QueryMethodType
{
    private static final long serialVersionUID = 1L;
    
    public QueryMethodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHODNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-name");
    private static final javax.xml.namespace.QName METHODPARAMS$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-params");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "method-name" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodNameType getMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().find_element_user(METHODNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method-name" element
     */
    public void setMethodName(com.sun.java.xml.ns.j2Ee.MethodNameType methodName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().find_element_user(METHODNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().add_element_user(METHODNAME$0);
            }
            target.set(methodName);
        }
    }
    
    /**
     * Appends and returns a new empty "method-name" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodNameType addNewMethodName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodNameType)get_store().add_element_user(METHODNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "method-params" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamsType getMethodParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().find_element_user(METHODPARAMS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method-params" element
     */
    public void setMethodParams(com.sun.java.xml.ns.j2Ee.MethodParamsType methodParams)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().find_element_user(METHODPARAMS$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().add_element_user(METHODPARAMS$2);
            }
            target.set(methodParams);
        }
    }
    
    /**
     * Appends and returns a new empty "method-params" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodParamsType addNewMethodParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodParamsType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodParamsType)get_store().add_element_user(METHODPARAMS$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
}
