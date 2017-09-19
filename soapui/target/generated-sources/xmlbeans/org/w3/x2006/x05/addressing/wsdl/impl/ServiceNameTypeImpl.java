/*
 * XML Type:  ServiceNameType
 * Namespace: http://www.w3.org/2006/05/addressing/wsdl
 * Java type: org.w3.x2006.x05.addressing.wsdl.ServiceNameType
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2006.x05.addressing.wsdl.impl;
/**
 * An XML ServiceNameType(@http://www.w3.org/2006/05/addressing/wsdl).
 *
 * This is an atomic type that is a restriction of org.w3.x2006.x05.addressing.wsdl.ServiceNameType.
 */
public class ServiceNameTypeImpl extends org.apache.xmlbeans.impl.values.JavaQNameHolderEx implements org.w3.x2006.x05.addressing.wsdl.ServiceNameType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ServiceNameTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ENDPOINTNAME$0 = 
        new javax.xml.namespace.QName("", "EndpointName");
    
    
    /**
     * Gets the "EndpointName" attribute
     */
    public java.lang.String getEndpointName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINTNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndpointName" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetEndpointName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ENDPOINTNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "EndpointName" attribute
     */
    public boolean isSetEndpointName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDPOINTNAME$0) != null;
        }
    }
    
    /**
     * Sets the "EndpointName" attribute
     */
    public void setEndpointName(java.lang.String endpointName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDPOINTNAME$0);
            }
            target.setStringValue(endpointName);
        }
    }
    
    /**
     * Sets (as xml) the "EndpointName" attribute
     */
    public void xsetEndpointName(org.apache.xmlbeans.XmlNCName endpointName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ENDPOINTNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(ENDPOINTNAME$0);
            }
            target.set(endpointName);
        }
    }
    
    /**
     * Unsets the "EndpointName" attribute
     */
    public void unsetEndpointName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDPOINTNAME$0);
        }
    }
}
