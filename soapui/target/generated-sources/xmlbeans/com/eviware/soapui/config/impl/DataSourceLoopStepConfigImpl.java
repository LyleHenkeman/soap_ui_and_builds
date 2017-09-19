/*
 * XML Type:  DataSourceLoopStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DataSourceLoopStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DataSourceLoopStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DataSourceLoopStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DataSourceLoopStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public DataSourceLoopStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName DATASOURCESTEP$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dataSourceStep");
    private static final javax.xml.namespace.QName TARGETSTEP$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetStep");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "dataSourceStep" element
     */
    public java.lang.String getDataSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCESTEP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataSourceStep" element
     */
    public org.apache.xmlbeans.XmlString xgetDataSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASOURCESTEP$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dataSourceStep" element
     */
    public void setDataSourceStep(java.lang.String dataSourceStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCESTEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCESTEP$2);
            }
            target.setStringValue(dataSourceStep);
        }
    }
    
    /**
     * Sets (as xml) the "dataSourceStep" element
     */
    public void xsetDataSourceStep(org.apache.xmlbeans.XmlString dataSourceStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASOURCESTEP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATASOURCESTEP$2);
            }
            target.set(dataSourceStep);
        }
    }
    
    /**
     * Gets the "targetStep" element
     */
    public java.lang.String getTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTEP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetStep" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETSTEP$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetStep" element
     */
    public void setTargetStep(java.lang.String targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTEP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETSTEP$4);
            }
            target.setStringValue(targetStep);
        }
    }
    
    /**
     * Sets (as xml) the "targetStep" element
     */
    public void xsetTargetStep(org.apache.xmlbeans.XmlString targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETSTEP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETSTEP$4);
            }
            target.set(targetStep);
        }
    }
}
