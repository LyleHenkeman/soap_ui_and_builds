/*
 * An XML document type.
 * Localname: soapui-listeners
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapuiListenersDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one soapui-listeners(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SoapuiListenersDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapuiListenersDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapuiListenersDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPUILISTENERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "soapui-listeners");
    
    
    /**
     * Gets the "soapui-listeners" element
     */
    public com.eviware.soapui.config.SoapUIListenersConfig getSoapuiListeners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenersConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenersConfig)get_store().find_element_user(SOAPUILISTENERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapui-listeners" element
     */
    public void setSoapuiListeners(com.eviware.soapui.config.SoapUIListenersConfig soapuiListeners)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenersConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenersConfig)get_store().find_element_user(SOAPUILISTENERS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SoapUIListenersConfig)get_store().add_element_user(SOAPUILISTENERS$0);
            }
            target.set(soapuiListeners);
        }
    }
    
    /**
     * Appends and returns a new empty "soapui-listeners" element
     */
    public com.eviware.soapui.config.SoapUIListenersConfig addNewSoapuiListeners()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenersConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenersConfig)get_store().add_element_user(SOAPUILISTENERS$0);
            return target;
        }
    }
}
