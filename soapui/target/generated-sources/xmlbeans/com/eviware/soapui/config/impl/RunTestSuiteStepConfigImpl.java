/*
 * XML Type:  RunTestSuiteStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RunTestSuiteStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RunTestSuiteStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RunTestSuiteStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RunTestSuiteStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public RunTestSuiteStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETTESTSUITE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetTestSuite");
    private static final javax.xml.namespace.QName PROPERTIES$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    private static final javax.xml.namespace.QName RETURNPROPERTIES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "returnProperties");
    
    
    /**
     * Gets the "targetTestSuite" element
     */
    public java.lang.String getTargetTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTESTSUITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetTestSuite" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTESTSUITE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetTestSuite" element
     */
    public void setTargetTestSuite(java.lang.String targetTestSuite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTESTSUITE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETTESTSUITE$0);
            }
            target.setStringValue(targetTestSuite);
        }
    }
    
    /**
     * Sets (as xml) the "targetTestSuite" element
     */
    public void xsetTargetTestSuite(org.apache.xmlbeans.XmlString targetTestSuite)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTESTSUITE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETTESTSUITE$0);
            }
            target.set(targetTestSuite);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$2);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$2);
            return target;
        }
    }
    
    /**
     * Gets the "returnProperties" element
     */
    public com.eviware.soapui.config.StringListConfig getReturnProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(RETURNPROPERTIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "returnProperties" element
     */
    public void setReturnProperties(com.eviware.soapui.config.StringListConfig returnProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(RETURNPROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(RETURNPROPERTIES$4);
            }
            target.set(returnProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "returnProperties" element
     */
    public com.eviware.soapui.config.StringListConfig addNewReturnProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(RETURNPROPERTIES$4);
            return target;
        }
    }
}
