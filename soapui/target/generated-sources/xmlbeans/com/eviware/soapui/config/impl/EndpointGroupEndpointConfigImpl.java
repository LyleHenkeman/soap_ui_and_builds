/*
 * XML Type:  EndpointGroupEndpoint
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.EndpointGroupEndpointConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML EndpointGroupEndpoint(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.EndpointGroupEndpointConfig.
 */
public class EndpointGroupEndpointConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.EndpointGroupEndpointConfig
{
    private static final long serialVersionUID = 1L;
    
    public EndpointGroupEndpointConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected EndpointGroupEndpointConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("", "interface");
    
    
    /**
     * Gets the "interface" attribute
     */
    public java.lang.String getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERFACE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interface" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERFACE$0);
            return target;
        }
    }
    
    /**
     * True if has "interface" attribute
     */
    public boolean isSetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERFACE$0) != null;
        }
    }
    
    /**
     * Sets the "interface" attribute
     */
    public void setInterface(java.lang.String xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERFACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERFACE$0);
            }
            target.setStringValue(xinterface);
        }
    }
    
    /**
     * Sets (as xml) the "interface" attribute
     */
    public void xsetInterface(org.apache.xmlbeans.XmlString xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERFACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INTERFACE$0);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Unsets the "interface" attribute
     */
    public void unsetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERFACE$0);
        }
    }
}
