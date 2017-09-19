/*
 * An XML document type.
 * Localname: soapui-factories
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapuiFactoriesDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one soapui-factories(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SoapuiFactoriesDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapuiFactoriesDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapuiFactoriesDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPUIFACTORIES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "soapui-factories");
    
    
    /**
     * Gets the "soapui-factories" element
     */
    public com.eviware.soapui.config.SoapUIFactoriesConfig getSoapuiFactories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoriesConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoriesConfig)get_store().find_element_user(SOAPUIFACTORIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapui-factories" element
     */
    public void setSoapuiFactories(com.eviware.soapui.config.SoapUIFactoriesConfig soapuiFactories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoriesConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoriesConfig)get_store().find_element_user(SOAPUIFACTORIES$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SoapUIFactoriesConfig)get_store().add_element_user(SOAPUIFACTORIES$0);
            }
            target.set(soapuiFactories);
        }
    }
    
    /**
     * Appends and returns a new empty "soapui-factories" element
     */
    public com.eviware.soapui.config.SoapUIFactoriesConfig addNewSoapuiFactories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIFactoriesConfig target = null;
            target = (com.eviware.soapui.config.SoapUIFactoriesConfig)get_store().add_element_user(SOAPUIFACTORIES$0);
            return target;
        }
    }
}
