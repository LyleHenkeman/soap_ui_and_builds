/*
 * XML Type:  tOperation
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.TOperation
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * An XML tOperation(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public class TOperationImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.soap.TOperation
{
    private static final long serialVersionUID = 1L;
    
    public TOperationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPACTION$0 = 
        new javax.xml.namespace.QName("", "soapAction");
    private static final javax.xml.namespace.QName STYLE$2 = 
        new javax.xml.namespace.QName("", "style");
    
    
    /**
     * Gets the "soapAction" attribute
     */
    public java.lang.String getSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapAction" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SOAPACTION$0);
            return target;
        }
    }
    
    /**
     * True if has "soapAction" attribute
     */
    public boolean isSetSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPACTION$0) != null;
        }
    }
    
    /**
     * Sets the "soapAction" attribute
     */
    public void setSoapAction(java.lang.String soapAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPACTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPACTION$0);
            }
            target.setStringValue(soapAction);
        }
    }
    
    /**
     * Sets (as xml) the "soapAction" attribute
     */
    public void xsetSoapAction(org.apache.xmlbeans.XmlAnyURI soapAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SOAPACTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SOAPACTION$0);
            }
            target.set(soapAction);
        }
    }
    
    /**
     * Unsets the "soapAction" attribute
     */
    public void unsetSoapAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPACTION$0);
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
