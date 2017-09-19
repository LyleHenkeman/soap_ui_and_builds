/*
 * An XML document type.
 * Localname: soapui-workspace
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapuiWorkspaceDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one soapui-workspace(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SoapuiWorkspaceDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapuiWorkspaceDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapuiWorkspaceDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPUIWORKSPACE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "soapui-workspace");
    
    
    /**
     * Gets the "soapui-workspace" element
     */
    public com.eviware.soapui.config.WorkspaceConfig getSoapuiWorkspace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceConfig)get_store().find_element_user(SOAPUIWORKSPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapui-workspace" element
     */
    public void setSoapuiWorkspace(com.eviware.soapui.config.WorkspaceConfig soapuiWorkspace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceConfig)get_store().find_element_user(SOAPUIWORKSPACE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WorkspaceConfig)get_store().add_element_user(SOAPUIWORKSPACE$0);
            }
            target.set(soapuiWorkspace);
        }
    }
    
    /**
     * Appends and returns a new empty "soapui-workspace" element
     */
    public com.eviware.soapui.config.WorkspaceConfig addNewSoapuiWorkspace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceConfig)get_store().add_element_user(SOAPUIWORKSPACE$0);
            return target;
        }
    }
}
