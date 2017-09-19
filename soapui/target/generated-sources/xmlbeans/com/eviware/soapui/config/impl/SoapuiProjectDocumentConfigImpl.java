/*
 * An XML document type.
 * Localname: soapui-project
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapuiProjectDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one soapui-project(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SoapuiProjectDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapuiProjectDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapuiProjectDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPUIPROJECT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "soapui-project");
    
    
    /**
     * Gets the "soapui-project" element
     */
    public com.eviware.soapui.config.ProjectConfig getSoapuiProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ProjectConfig target = null;
            target = (com.eviware.soapui.config.ProjectConfig)get_store().find_element_user(SOAPUIPROJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapui-project" element
     */
    public void setSoapuiProject(com.eviware.soapui.config.ProjectConfig soapuiProject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ProjectConfig target = null;
            target = (com.eviware.soapui.config.ProjectConfig)get_store().find_element_user(SOAPUIPROJECT$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ProjectConfig)get_store().add_element_user(SOAPUIPROJECT$0);
            }
            target.set(soapuiProject);
        }
    }
    
    /**
     * Appends and returns a new empty "soapui-project" element
     */
    public com.eviware.soapui.config.ProjectConfig addNewSoapuiProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ProjectConfig target = null;
            target = (com.eviware.soapui.config.ProjectConfig)get_store().add_element_user(SOAPUIPROJECT$0);
            return target;
        }
    }
}
