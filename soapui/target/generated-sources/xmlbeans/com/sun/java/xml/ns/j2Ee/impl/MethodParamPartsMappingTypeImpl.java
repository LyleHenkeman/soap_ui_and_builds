/*
 * XML Type:  method-param-parts-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML method-param-parts-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class MethodParamPartsMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType
{
    private static final long serialVersionUID = 1L;
    
    public MethodParamPartsMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMPOSITION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "param-position");
    private static final javax.xml.namespace.QName PARAMTYPE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "param-type");
    private static final javax.xml.namespace.QName WSDLMESSAGEMAPPING$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-message-mapping");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "param-position" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType getParamPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType)get_store().find_element_user(PARAMPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "param-position" element
     */
    public void setParamPosition(com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType paramPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType)get_store().find_element_user(PARAMPOSITION$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType)get_store().add_element_user(PARAMPOSITION$0);
            }
            target.set(paramPosition);
        }
    }
    
    /**
     * Appends and returns a new empty "param-position" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType addNewParamPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdNonNegativeIntegerType)get_store().add_element_user(PARAMPOSITION$0);
            return target;
        }
    }
    
    /**
     * Gets the "param-type" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType getParamType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().find_element_user(PARAMTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "param-type" element
     */
    public void setParamType(com.sun.java.xml.ns.j2Ee.JavaTypeType paramType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().find_element_user(PARAMTYPE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().add_element_user(PARAMTYPE$2);
            }
            target.set(paramType);
        }
    }
    
    /**
     * Appends and returns a new empty "param-type" element
     */
    public com.sun.java.xml.ns.j2Ee.JavaTypeType addNewParamType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JavaTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JavaTypeType)get_store().add_element_user(PARAMTYPE$2);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-message-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType getWsdlMessageMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType)get_store().find_element_user(WSDLMESSAGEMAPPING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdl-message-mapping" element
     */
    public void setWsdlMessageMapping(com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType wsdlMessageMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType)get_store().find_element_user(WSDLMESSAGEMAPPING$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType)get_store().add_element_user(WSDLMESSAGEMAPPING$4);
            }
            target.set(wsdlMessageMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-message-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType addNewWsdlMessageMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType)get_store().add_element_user(WSDLMESSAGEMAPPING$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}
