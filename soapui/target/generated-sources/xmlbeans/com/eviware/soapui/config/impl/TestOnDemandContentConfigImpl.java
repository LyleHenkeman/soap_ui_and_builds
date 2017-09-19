/*
 * XML Type:  TestOnDemandContent
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandContentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandContent(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.TestOnDemandContentConfig.
 */
public class TestOnDemandContentConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.TestOnDemandContentConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandContentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TestOnDemandContentConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ENCTYPE$0 = 
        new javax.xml.namespace.QName("", "enctype");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "enctype" attribute
     */
    public java.lang.String getEnctype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCTYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "enctype" attribute
     */
    public org.apache.xmlbeans.XmlString xgetEnctype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCTYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "enctype" attribute
     */
    public boolean isSetEnctype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "enctype" attribute
     */
    public void setEnctype(java.lang.String enctype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCTYPE$0);
            }
            target.setStringValue(enctype);
        }
    }
    
    /**
     * Sets (as xml) the "enctype" attribute
     */
    public void xsetEnctype(org.apache.xmlbeans.XmlString enctype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCTYPE$0);
            }
            target.set(enctype);
        }
    }
    
    /**
     * Unsets the "enctype" attribute
     */
    public void unsetEnctype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCTYPE$0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
}
