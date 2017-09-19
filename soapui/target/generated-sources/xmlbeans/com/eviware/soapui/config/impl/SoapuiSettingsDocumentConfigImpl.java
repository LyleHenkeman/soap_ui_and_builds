/*
 * An XML document type.
 * Localname: soapui-settings
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapuiSettingsDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one soapui-settings(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class SoapuiSettingsDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapuiSettingsDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapuiSettingsDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPUISETTINGS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "soapui-settings");
    
    
    /**
     * Gets the "soapui-settings" element
     */
    public com.eviware.soapui.config.SettingsConfig getSoapuiSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingsConfig target = null;
            target = (com.eviware.soapui.config.SettingsConfig)get_store().find_element_user(SOAPUISETTINGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapui-settings" element
     */
    public void setSoapuiSettings(com.eviware.soapui.config.SettingsConfig soapuiSettings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingsConfig target = null;
            target = (com.eviware.soapui.config.SettingsConfig)get_store().find_element_user(SOAPUISETTINGS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SettingsConfig)get_store().add_element_user(SOAPUISETTINGS$0);
            }
            target.set(soapuiSettings);
        }
    }
    
    /**
     * Appends and returns a new empty "soapui-settings" element
     */
    public com.eviware.soapui.config.SettingsConfig addNewSoapuiSettings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SettingsConfig target = null;
            target = (com.eviware.soapui.config.SettingsConfig)get_store().add_element_user(SOAPUISETTINGS$0);
            return target;
        }
    }
}
