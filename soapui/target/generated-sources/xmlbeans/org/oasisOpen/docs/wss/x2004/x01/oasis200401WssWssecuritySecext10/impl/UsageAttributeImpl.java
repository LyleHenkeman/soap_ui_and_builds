/*
 * An XML attribute type.
 * Localname: Usage
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsageAttribute
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one Usage(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) attribute.
 *
 * This is a complex type.
 */
public class UsageAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsageAttribute
{
    private static final long serialVersionUID = 1L;
    
    public UsageAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USAGE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Usage");
    
    
    /**
     * Gets the "Usage" attribute
     */
    public java.util.List getUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "Usage" attribute
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage xgetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage)get_store().find_attribute_user(USAGE$0);
            return target;
        }
    }
    
    /**
     * True if has "Usage" attribute
     */
    public boolean isSetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USAGE$0) != null;
        }
    }
    
    /**
     * Sets the "Usage" attribute
     */
    public void setUsage(java.util.List usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USAGE$0);
            }
            target.setListValue(usage);
        }
    }
    
    /**
     * Sets (as xml) the "Usage" attribute
     */
    public void xsetUsage(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage usage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage)get_store().find_attribute_user(USAGE$0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.TUsage)get_store().add_attribute_user(USAGE$0);
            }
            target.set(usage);
        }
    }
    
    /**
     * Unsets the "Usage" attribute
     */
    public void unsetUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USAGE$0);
        }
    }
}
