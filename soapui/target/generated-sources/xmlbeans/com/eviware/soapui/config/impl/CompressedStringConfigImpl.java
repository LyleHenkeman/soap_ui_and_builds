/*
 * XML Type:  CompressedString
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.CompressedStringConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML CompressedString(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.CompressedStringConfig.
 */
public class CompressedStringConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.CompressedStringConfig
{
    private static final long serialVersionUID = 1L;
    
    public CompressedStringConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CompressedStringConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName COMPRESSION$0 = 
        new javax.xml.namespace.QName("", "compression");
    
    
    /**
     * Gets the "compression" attribute
     */
    public java.lang.String getCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "compression" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPRESSION$0);
            return target;
        }
    }
    
    /**
     * True if has "compression" attribute
     */
    public boolean isSetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPRESSION$0) != null;
        }
    }
    
    /**
     * Sets the "compression" attribute
     */
    public void setCompression(java.lang.String compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPRESSION$0);
            }
            target.setStringValue(compression);
        }
    }
    
    /**
     * Sets (as xml) the "compression" attribute
     */
    public void xsetCompression(org.apache.xmlbeans.XmlString compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPRESSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPRESSION$0);
            }
            target.set(compression);
        }
    }
    
    /**
     * Unsets the "compression" attribute
     */
    public void unsetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPRESSION$0);
        }
    }
}
