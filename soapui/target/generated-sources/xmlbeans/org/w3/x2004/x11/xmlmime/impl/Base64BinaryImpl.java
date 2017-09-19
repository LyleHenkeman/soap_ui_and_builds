/*
 * XML Type:  base64Binary
 * Namespace: http://www.w3.org/2004/11/xmlmime
 * Java type: org.w3.x2004.x11.xmlmime.Base64Binary
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2004.x11.xmlmime.impl;
/**
 * An XML base64Binary(@http://www.w3.org/2004/11/xmlmime).
 *
 * This is an atomic type that is a restriction of org.w3.x2004.x11.xmlmime.Base64Binary.
 */
public class Base64BinaryImpl extends org.apache.xmlbeans.impl.values.JavaBase64HolderEx implements org.w3.x2004.x11.xmlmime.Base64Binary
{
    private static final long serialVersionUID = 1L;
    
    public Base64BinaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected Base64BinaryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2004/11/xmlmime", "contentType");
    
    
    /**
     * Gets the "contentType" attribute
     */
    public java.lang.String getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "contentType" attribute
     */
    public boolean isSetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTENTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "contentType" attribute
     */
    public void setContentType(java.lang.String contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENTTYPE$0);
            }
            target.setStringValue(contentType);
        }
    }
    
    /**
     * Sets (as xml) the "contentType" attribute
     */
    public void xsetContentType(org.apache.xmlbeans.XmlString contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTENTTYPE$0);
            }
            target.set(contentType);
        }
    }
    
    /**
     * Unsets the "contentType" attribute
     */
    public void unsetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTENTTYPE$0);
        }
    }
}
