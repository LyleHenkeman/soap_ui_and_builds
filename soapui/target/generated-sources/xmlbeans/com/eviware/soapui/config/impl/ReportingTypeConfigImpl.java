/*
 * XML Type:  ReportingType
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ReportingTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML ReportingType(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ReportingTypeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ReportingTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTEMPLATES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportTemplates");
    private static final javax.xml.namespace.QName XMLTEMPLATES$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "xmlTemplates");
    private static final javax.xml.namespace.QName PARAMETERS$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    
    
    /**
     * Gets a List of "reportTemplates" elements
     */
    public java.util.List<com.eviware.soapui.config.ReportTemplateConfig> getReportTemplatesList()
    {
        final class ReportTemplatesList extends java.util.AbstractList<com.eviware.soapui.config.ReportTemplateConfig>
        {
            public com.eviware.soapui.config.ReportTemplateConfig get(int i)
                { return ReportingTypeConfigImpl.this.getReportTemplatesArray(i); }
            
            public com.eviware.soapui.config.ReportTemplateConfig set(int i, com.eviware.soapui.config.ReportTemplateConfig o)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = ReportingTypeConfigImpl.this.getReportTemplatesArray(i);
                ReportingTypeConfigImpl.this.setReportTemplatesArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.ReportTemplateConfig o)
                { ReportingTypeConfigImpl.this.insertNewReportTemplates(i).set(o); }
            
            public com.eviware.soapui.config.ReportTemplateConfig remove(int i)
            {
                com.eviware.soapui.config.ReportTemplateConfig old = ReportingTypeConfigImpl.this.getReportTemplatesArray(i);
                ReportingTypeConfigImpl.this.removeReportTemplates(i);
                return old;
            }
            
            public int size()
                { return ReportingTypeConfigImpl.this.sizeOfReportTemplatesArray(); }
            
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
            get_store().find_all_element_users(REPORTTEMPLATES$0, targetList);
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
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATES$0, i);
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
            return get_store().count_elements(REPORTTEMPLATES$0);
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
            arraySetterHelper(reportTemplatesArray, REPORTTEMPLATES$0);
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
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATES$0, i);
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
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().insert_element_user(REPORTTEMPLATES$0, i);
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
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().add_element_user(REPORTTEMPLATES$0);
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
            get_store().remove_element(REPORTTEMPLATES$0, i);
        }
    }
    
    /**
     * Gets the "xmlTemplates" element
     */
    public com.eviware.soapui.config.XmlTemplatesConfig getXmlTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesConfig)get_store().find_element_user(XMLTEMPLATES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xmlTemplates" element
     */
    public boolean isSetXmlTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLTEMPLATES$2) != 0;
        }
    }
    
    /**
     * Sets the "xmlTemplates" element
     */
    public void setXmlTemplates(com.eviware.soapui.config.XmlTemplatesConfig xmlTemplates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesConfig)get_store().find_element_user(XMLTEMPLATES$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.XmlTemplatesConfig)get_store().add_element_user(XMLTEMPLATES$2);
            }
            target.set(xmlTemplates);
        }
    }
    
    /**
     * Appends and returns a new empty "xmlTemplates" element
     */
    public com.eviware.soapui.config.XmlTemplatesConfig addNewXmlTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesConfig)get_store().add_element_user(XMLTEMPLATES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "xmlTemplates" element
     */
    public void unsetXmlTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLTEMPLATES$2, 0);
        }
    }
    
    /**
     * Gets the "parameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PARAMETERS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parameters" element
     */
    public boolean isSetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$4) != 0;
        }
    }
    
    /**
     * Sets the "parameters" element
     */
    public void setParameters(com.eviware.soapui.config.PropertiesTypeConfig parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(PARAMETERS$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PARAMETERS$4);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(PARAMETERS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "parameters" element
     */
    public void unsetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$4, 0);
        }
    }
}
