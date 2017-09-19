/*
 * An XML document type.
 * Localname: interface
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.InterfaceDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one interface(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class InterfaceDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.InterfaceDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "interface");
    
    
    /**
     * Gets the "interface" element
     */
    public com.eviware.soapui.config.TestAssertionConfig getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interface" element
     */
    public void setInterface(com.eviware.soapui.config.TestAssertionConfig xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(INTERFACE$0);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Appends and returns a new empty "interface" element
     */
    public com.eviware.soapui.config.TestAssertionConfig addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(INTERFACE$0);
            return target;
        }
    }
}
