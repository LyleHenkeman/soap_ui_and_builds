/*
 * XML Type:  servlet-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServletMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML servlet-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ServletMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ServletMappingType
{
    private static final long serialVersionUID = 1L;
    
    public ServletMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVLETNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "servlet-name");
    private static final javax.xml.namespace.QName URLPATTERN$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "url-pattern");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "servlet-name" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletNameType getServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().find_element_user(SERVLETNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "servlet-name" element
     */
    public void setServletName(com.sun.java.xml.ns.j2Ee.ServletNameType servletName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().find_element_user(SERVLETNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().add_element_user(SERVLETNAME$0);
            }
            target.set(servletName);
        }
    }
    
    /**
     * Appends and returns a new empty "servlet-name" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletNameType addNewServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().add_element_user(SERVLETNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType getUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "url-pattern" element
     */
    public void setUrlPattern(com.sun.java.xml.ns.j2Ee.UrlPatternType urlPattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().add_element_user(URLPATTERN$2);
            }
            target.set(urlPattern);
        }
    }
    
    /**
     * Appends and returns a new empty "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType addNewUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().add_element_user(URLPATTERN$2);
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
