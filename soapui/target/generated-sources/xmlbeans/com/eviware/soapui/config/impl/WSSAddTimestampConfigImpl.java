/*
 * XML Type:  WSSAddTimestamp
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WSSAddTimestampConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WSSAddTimestamp(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WSSAddTimestampConfigImpl extends com.eviware.soapui.config.impl.WSSEntryConfigImpl implements com.eviware.soapui.config.WSSAddTimestampConfig
{
    private static final long serialVersionUID = 1L;
    
    public WSSAddTimestampConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMETOLIVE$0 = 
        new javax.xml.namespace.QName("", "timeToLive");
    
    
    /**
     * Gets the "timeToLive" attribute
     */
    public int getTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETOLIVE$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeToLive" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TIMETOLIVE$0);
            return target;
        }
    }
    
    /**
     * True if has "timeToLive" attribute
     */
    public boolean isSetTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMETOLIVE$0) != null;
        }
    }
    
    /**
     * Sets the "timeToLive" attribute
     */
    public void setTimeToLive(int timeToLive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETOLIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETOLIVE$0);
            }
            target.setIntValue(timeToLive);
        }
    }
    
    /**
     * Sets (as xml) the "timeToLive" attribute
     */
    public void xsetTimeToLive(org.apache.xmlbeans.XmlInt timeToLive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(TIMETOLIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(TIMETOLIVE$0);
            }
            target.set(timeToLive);
        }
    }
    
    /**
     * Unsets the "timeToLive" attribute
     */
    public void unsetTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMETOLIVE$0);
        }
    }
}
