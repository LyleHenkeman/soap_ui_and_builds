/*
 * XML Type:  hexBinary
 * Namespace: http://www.w3.org/2005/05/xmlmime
 * Java type: org.w3.x2005.x05.xmlmime.HexBinary
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.x05.xmlmime.impl;
/**
 * An XML hexBinary(@http://www.w3.org/2005/05/xmlmime).
 *
 * This is an atomic type that is a restriction of org.w3.x2005.x05.xmlmime.HexBinary.
 */
public class HexBinaryImpl extends org.apache.xmlbeans.impl.values.JavaHexBinaryHolderEx implements org.w3.x2005.x05.xmlmime.HexBinary
{
    private static final long serialVersionUID = 1L;
    
    public HexBinaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected HexBinaryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CONTENTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "contentType");
    
    
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
    public org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType xgetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType target = null;
            target = (org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType)get_store().find_attribute_user(CONTENTTYPE$0);
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
    public void xsetContentType(org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType target = null;
            target = (org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType)get_store().find_attribute_user(CONTENTTYPE$0);
            if (target == null)
            {
                target = (org.w3.x2005.x05.xmlmime.ContentTypeAttribute.ContentType)get_store().add_attribute_user(CONTENTTYPE$0);
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
