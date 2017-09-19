/*
 * An XML document type.
 * Localname: soapui-actions
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapuiActionsDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one soapui-actions(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SoapuiActionsDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapuiActionsDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapuiActionsDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPUIACTIONS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "soapui-actions");
    
    
    /**
     * Gets the "soapui-actions" element
     */
    public com.eviware.soapui.config.SoapUIActionsConfig getSoapuiActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionsConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionsConfig)get_store().find_element_user(SOAPUIACTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapui-actions" element
     */
    public void setSoapuiActions(com.eviware.soapui.config.SoapUIActionsConfig soapuiActions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionsConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionsConfig)get_store().find_element_user(SOAPUIACTIONS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SoapUIActionsConfig)get_store().add_element_user(SOAPUIACTIONS$0);
            }
            target.set(soapuiActions);
        }
    }
    
    /**
     * Appends and returns a new empty "soapui-actions" element
     */
    public com.eviware.soapui.config.SoapUIActionsConfig addNewSoapuiActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionsConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionsConfig)get_store().add_element_user(SOAPUIACTIONS$0);
            return target;
        }
    }
}
