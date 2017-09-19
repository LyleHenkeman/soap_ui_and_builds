/*
 * XML Type:  TestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestStepConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.TestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIG$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "config");
    private static final javax.xml.namespace.QName REPORTTEMPLATES$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportTemplates");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DISABLED$6 = 
        new javax.xml.namespace.QName("", "disabled");
    
    
    /**
     * Gets the "config" element
     */
    public org.apache.xmlbeans.XmlObject getConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "config" element
     */
    public void setConfig(org.apache.xmlbeans.XmlObject config)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(CONFIG$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONFIG$0);
            }
            target.set(config);
        }
    }
    
    /**
     * Appends and returns a new empty "config" element
     */
    public org.apache.xmlbeans.XmlObject addNewConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(CONFIG$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "reportTemplates" elements
     */
    public java.util.List<com.eviware.soapui.config.ReportTemplateConfig> getReportTemplatesList()
    {
        final class ReportTemplatesList extends java.util.AbstractList<com.eviware.soapui.config.ReportTemplateConfig>
        {
            public com.eviware.soapui.config.ReportTemplateConfig get(int i)
                { return TestStepConfigImpl.this.getReportTemplatesArray(i); }
            
            public com.eviware.soapui.config.ReportTemplateConfig set(int i, com.eviware.soapui.config.ReportTemplateConfig o)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = TestStepConfigImpl.this.getReportTemplatesArray(i);
                TestStepConfigImpl.this.setReportTemplatesArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.ReportTemplateConfig o)
                { TestStepConfigImpl.this.insertNewReportTemplates(i).set(o); }
            
            public com.eviware.soapui.config.ReportTemplateConfig remove(int i)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = TestStepConfigImpl.this.getReportTemplatesArray(i);
                TestStepConfigImpl.this.removeReportTemplates(i);
                return old;
            }
            
            public int size()
                { return TestStepConfigImpl.this.sizeOfReportTemplatesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReportTemplatesList();
        }
    }
    
    /**
     * Gets array of all "reportTemplates" elements
     * @deprecated
     */
    public com.eviware.soapui.config.ReportTemplateConfig[] getReportTemplatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.ReportTemplateConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.ReportTemplateConfig>();
            get_store().find_all_element_users(REPORTTEMPLATES$2, targetList);
            com.eviware.soapui.config.ReportTemplateConfig[] result = new com.eviware.soapui.config.ReportTemplateConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reportTemplates" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig getReportTemplatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reportTemplates" element
     */
    public int sizeOfReportTemplatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTTEMPLATES$2);
        }
    }
    
    /**
     * Sets array of all "reportTemplates" element
     */
    public void setReportTemplatesArray(com.eviware.soapui.config.ReportTemplateConfig[] reportTemplatesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportTemplatesArray, REPORTTEMPLATES$2);
        }
    }
    
    /**
     * Sets ith "reportTemplates" element
     */
    public void setReportTemplatesArray(int i, com.eviware.soapui.config.ReportTemplateConfig reportTemplates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportTemplates);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reportTemplates" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig insertNewReportTemplates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().insert_element_user(REPORTTEMPLATES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reportTemplates" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig addNewReportTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().add_element_user(REPORTTEMPLATES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "reportTemplates" element
     */
    public void removeReportTemplates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTTEMPLATES$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "disabled" attribute
     */
    public boolean getDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$6);
            return target;
        }
    }
    
    /**
     * True if has "disabled" attribute
     */
    public boolean isSetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLED$6) != null;
        }
    }
    
    /**
     * Sets the "disabled" attribute
     */
    public void setDisabled(boolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$6);
            }
            target.setBooleanValue(disabled);
        }
    }
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$6);
            }
            target.set(disabled);
        }
    }
    
    /**
     * Unsets the "disabled" attribute
     */
    public void unsetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLED$6);
        }
    }
}
