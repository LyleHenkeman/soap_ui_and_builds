/*
 * XML Type:  DataSinkStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DataSinkStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DataSinkStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DataSinkStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DataSinkStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public DataSinkStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASINK$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dataSink");
    private static final javax.xml.namespace.QName SKIPONEMPTY$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "skipOnEmpty");
    private static final javax.xml.namespace.QName SHARED$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "shared");
    private static final javax.xml.namespace.QName PROPERTIES$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    
    
    /**
     * Gets the "dataSink" element
     */
    public com.eviware.soapui.config.DataSinkConfig getDataSink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataSinkConfig target = null;
            target = (com.eviware.soapui.config.DataSinkConfig)get_store().find_element_user(DATASINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSink" element
     */
    public void setDataSink(com.eviware.soapui.config.DataSinkConfig dataSink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataSinkConfig target = null;
            target = (com.eviware.soapui.config.DataSinkConfig)get_store().find_element_user(DATASINK$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DataSinkConfig)get_store().add_element_user(DATASINK$0);
            }
            target.set(dataSink);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSink" element
     */
    public com.eviware.soapui.config.DataSinkConfig addNewDataSink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataSinkConfig target = null;
            target = (com.eviware.soapui.config.DataSinkConfig)get_store().add_element_user(DATASINK$0);
            return target;
        }
    }
    
    /**
     * Gets the "skipOnEmpty" element
     */
    public boolean getSkipOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKIPONEMPTY$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "skipOnEmpty" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSkipOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SKIPONEMPTY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "skipOnEmpty" element
     */
    public void setSkipOnEmpty(boolean skipOnEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKIPONEMPTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKIPONEMPTY$2);
            }
            target.setBooleanValue(skipOnEmpty);
        }
    }
    
    /**
     * Sets (as xml) the "skipOnEmpty" element
     */
    public void xsetSkipOnEmpty(org.apache.xmlbeans.XmlBoolean skipOnEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SKIPONEMPTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SKIPONEMPTY$2);
            }
            target.set(skipOnEmpty);
        }
    }
    
    /**
     * Gets the "shared" element
     */
    public boolean getShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "shared" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHARED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shared" element
     */
    public void setShared(boolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHARED$4);
            }
            target.setBooleanValue(shared);
        }
    }
    
    /**
     * Sets (as xml) the "shared" element
     */
    public void xsetShared(org.apache.xmlbeans.XmlBoolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHARED$4);
            }
            target.set(shared);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$6, 0);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PROPERTIES$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$6);
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
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PROPERTIES$6);
            return target;
        }
    }
}
