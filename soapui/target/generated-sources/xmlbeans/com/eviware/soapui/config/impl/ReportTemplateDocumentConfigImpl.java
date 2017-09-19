/*
 * An XML document type.
 * Localname: reportTemplate
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ReportTemplateDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one reportTemplate(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class ReportTemplateDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ReportTemplateDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public ReportTemplateDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTEMPLATE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportTemplate");
    
    
    /**
     * Gets the "reportTemplate" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig getReportTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTemplate" element
     */
    public void setReportTemplate(com.eviware.soapui.config.ReportTemplateConfig reportTemplate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().find_element_user(REPORTTEMPLATE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().add_element_user(REPORTTEMPLATE$0);
            }
            target.set(reportTemplate);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTemplate" element
     */
    public com.eviware.soapui.config.ReportTemplateConfig addNewReportTemplate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTemplateConfig target = null;
            target = (com.eviware.soapui.config.ReportTemplateConfig)get_store().add_element_user(REPORTTEMPLATE$0);
            return target;
        }
    }
}
