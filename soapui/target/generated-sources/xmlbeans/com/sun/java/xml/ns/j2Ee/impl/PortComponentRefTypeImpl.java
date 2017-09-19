/*
 * XML Type:  port-component-refType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.PortComponentRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML port-component-refType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class PortComponentRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.PortComponentRefType
{
    private static final long serialVersionUID = 1L;
    
    public PortComponentRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEENDPOINTINTERFACE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-endpoint-interface");
    private static final javax.xml.namespace.QName PORTCOMPONENTLINK$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "port-component-link");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-endpoint-interface" element
     */
    public void setServiceEndpointInterface(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceEndpointInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$0);
            }
            target.set(serviceEndpointInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$0);
            return target;
        }
    }
    
    /**
     * Gets the "port-component-link" element
     */
    public com.sun.java.xml.ns.j2Ee.String getPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(PORTCOMPONENTLINK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "port-component-link" element
     */
    public boolean isSetPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTCOMPONENTLINK$2) != 0;
        }
    }
    
    /**
     * Sets the "port-component-link" element
     */
    public void setPortComponentLink(com.sun.java.xml.ns.j2Ee.String portComponentLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(PORTCOMPONENTLINK$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(PORTCOMPONENTLINK$2);
            }
            target.set(portComponentLink);
        }
    }
    
    /**
     * Appends and returns a new empty "port-component-link" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(PORTCOMPONENTLINK$2);
            return target;
        }
    }
    
    /**
     * Unsets the "port-component-link" element
     */
    public void unsetPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTCOMPONENTLINK$2, 0);
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
