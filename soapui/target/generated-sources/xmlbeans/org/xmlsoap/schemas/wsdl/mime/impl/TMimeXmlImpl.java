/*
 * XML Type:  tMimeXml
 * Namespace: http://schemas.xmlsoap.org/wsdl/mime/
 * Java type: org.xmlsoap.schemas.wsdl.mime.TMimeXml
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.mime.impl;
/**
 * An XML tMimeXml(@http://schemas.xmlsoap.org/wsdl/mime/).
 *
 * This is a complex type.
 */
public class TMimeXmlImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.mime.TMimeXml
{
    private static final long serialVersionUID = 1L;
    
    public TMimeXmlImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("", "part");
    
    
    /**
     * Gets the "part" attribute
     */
    public java.lang.String getPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "part" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PART$0);
            return target;
        }
    }
    
    /**
     * True if has "part" attribute
     */
    public boolean isSetPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PART$0) != null;
        }
    }
    
    /**
     * Sets the "part" attribute
     */
    public void setPart(java.lang.String part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PART$0);
            }
            target.setStringValue(part);
        }
    }
    
    /**
     * Sets (as xml) the "part" attribute
     */
    public void xsetPart(org.apache.xmlbeans.XmlNMTOKEN part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PART$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(PART$0);
            }
            target.set(part);
        }
    }
    
    /**
     * Unsets the "part" attribute
     */
    public void unsetPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PART$0);
        }
    }
}
