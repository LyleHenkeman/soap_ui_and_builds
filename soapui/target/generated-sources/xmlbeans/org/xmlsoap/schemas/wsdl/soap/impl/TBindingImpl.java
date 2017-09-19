/*
 * XML Type:  tBinding
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.TBinding
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * An XML tBinding(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public class TBindingImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.soap.TBinding
{
    private static final long serialVersionUID = 1L;
    
    public TBindingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSPORT$0 = 
        new javax.xml.namespace.QName("", "transport");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("", "style");
    
    
    /**
     * Gets the "transport" attribute
     */
    public java.lang.String getTransport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSPORT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "transport" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTransport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TRANSPORT$0);
            return target;
        }
    }
    
    /**
     * Sets the "transport" attribute
     */
    public void setTransport(java.lang.String transport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSPORT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSPORT$0);
            }
            target.setStringValue(transport);
        }
    }
    
    /**
     * Sets (as xml) the "transport" attribute
     */
    public void xsetTransport(org.apache.xmlbeans.XmlAnyURI transport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TRANSPORT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TRANSPORT$0);
            }
            target.set(transport);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.TStyleChoice.Enum getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                return null;
            }
            return (org.xmlsoap.schemas.wsdl.soap.TStyleChoice.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.TStyleChoice xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TStyleChoice target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TStyleChoice)get_store().find_attribute_user(STYLE$2);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$2) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(org.xmlsoap.schemas.wsdl.soap.TStyleChoice.Enum style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$2);
            }
            target.setEnumValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(org.xmlsoap.schemas.wsdl.soap.TStyleChoice style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TStyleChoice target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TStyleChoice)get_store().find_attribute_user(STYLE$2);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.TStyleChoice)get_store().add_attribute_user(STYLE$2);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$2);
        }
    }
}
