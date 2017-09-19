/*
 * XML Type:  SensitiveInformation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SensitiveInformationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SensitiveInformation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SensitiveInformationConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.SensitiveInformationConfig
{
    private static final long serialVersionUID = 1L;
    
    public SensitiveInformationConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "configuration");
    private static final javax.xml.namespace.QName LEVEL$2 = 
        new javax.xml.namespace.QName("", "level");
    
    
    /**
     * Gets the "configuration" element
     */
    public org.apache.xmlbeans.XmlAnySimpleType getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.apache.xmlbeans.XmlAnySimpleType configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(CONFIGURATION$0);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_element_user(CONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public java.lang.String getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$2);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$2) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(java.lang.String level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$2);
            }
            target.setStringValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlString level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVEL$2);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$2);
        }
    }
}
