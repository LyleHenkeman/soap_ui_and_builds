/*
 * XML Type:  Include
 * Namespace: http://www.w3.org/2004/08/xop/include
 * Java type: org.w3.x2004.x08.xop.include.Include
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2004.x08.xop.include.impl;
/**
 * An XML Include(@http://www.w3.org/2004/08/xop/include).
 *
 * This is a complex type.
 */
public class IncludeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2004.x08.xop.include.Include
{
    private static final long serialVersionUID = 1L;
    
    public IncludeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HREF$0 = 
        new javax.xml.namespace.QName("", "href");
    
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$0);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$0);
            }
            target.set(href);
        }
    }
}
