/*
 * XML Type:  service-impl-beanType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceImplBeanType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML service-impl-beanType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ServiceImplBeanTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ServiceImplBeanType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceImplBeanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EJBLINK$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-link");
    private static final javax.xml.namespace.QName SERVLETLINK$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "servlet-link");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "ejb-link" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLinkType getEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().find_element_user(EJBLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb-link" element
     */
    public boolean isSetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLINK$0) != 0;
        }
    }
    
    /**
     * Sets the "ejb-link" element
     */
    public void setEjbLink(com.sun.java.xml.ns.j2Ee.EjbLinkType ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().find_element_user(EJBLINK$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().add_element_user(EJBLINK$0);
            }
            target.set(ejbLink);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-link" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLinkType addNewEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLinkType)get_store().add_element_user(EJBLINK$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb-link" element
     */
    public void unsetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLINK$0, 0);
        }
    }
    
    /**
     * Gets the "servlet-link" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletLinkType getServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletLinkType)get_store().find_element_user(SERVLETLINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "servlet-link" element
     */
    public boolean isSetServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLETLINK$2) != 0;
        }
    }
    
    /**
     * Sets the "servlet-link" element
     */
    public void setServletLink(com.sun.java.xml.ns.j2Ee.ServletLinkType servletLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletLinkType)get_store().find_element_user(SERVLETLINK$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ServletLinkType)get_store().add_element_user(SERVLETLINK$2);
            }
            target.set(servletLink);
        }
    }
    
    /**
     * Appends and returns a new empty "servlet-link" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletLinkType addNewServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletLinkType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletLinkType)get_store().add_element_user(SERVLETLINK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "servlet-link" element
     */
    public void unsetServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLETLINK$2, 0);
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
