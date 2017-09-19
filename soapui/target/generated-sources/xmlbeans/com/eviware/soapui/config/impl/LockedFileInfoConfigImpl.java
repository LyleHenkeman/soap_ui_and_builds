/*
 * XML Type:  LockedFileInfo
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.LockedFileInfoConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML LockedFileInfo(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class LockedFileInfoConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.LockedFileInfoConfig
{
    private static final long serialVersionUID = 1L;
    
    public LockedFileInfoConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNER$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "owner");
    private static final javax.xml.namespace.QName DATE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "date");
    
    
    /**
     * Gets the "owner" element
     */
    public java.lang.String getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "owner" element
     */
    public org.apache.xmlbeans.XmlString xgetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "owner" element
     */
    public void setOwner(java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$0);
            }
            target.setStringValue(owner);
        }
    }
    
    /**
     * Sets (as xml) the "owner" element
     */
    public void xsetOwner(org.apache.xmlbeans.XmlString owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNER$0);
            }
            target.set(owner);
        }
    }
    
    /**
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlDate xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$2);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlDate date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATE$2);
            }
            target.set(date);
        }
    }
}
