/*
 * XML Type:  TestOnDemandTestSuite
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandTestSuiteConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandTestSuite(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.TestOnDemandTestSuiteConfig.
 */
public class TestOnDemandTestSuiteConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.TestOnDemandTestSuiteConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandTestSuiteConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TestOnDemandTestSuiteConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ENCTYPE$0 = 
        new javax.xml.namespace.QName("", "enctype");
    
    
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
}
