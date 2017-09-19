/*
 * XML Type:  operationType
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.OperationType
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * An XML operationType(@http://schemas.xmlsoap.org/wsdl/http/).
 *
 * This is a complex type.
 */
public class OperationTypeImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.http.OperationType
{
    private static final long serialVersionUID = 1L;
    
    public OperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
