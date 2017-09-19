/*
 * XML Type:  tAddress
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.TAddress
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * An XML tAddress(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public class TAddressImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.soap.TAddress
{
    private static final long serialVersionUID = 1L;
    
    public TAddressImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("", "location");
    
    
    /**
     * Gets the "location" attribute
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Sets the "location" attribute
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$0);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" attribute
     */
    public void xsetLocation(org.apache.xmlbeans.XmlAnyURI location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LOCATION$0);
            }
            target.set(location);
        }
    }
}
