/*
 * An XML document type.
 * Localname: mockService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockServiceDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one mockService(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class MockServiceDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MockServiceDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockServiceDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOCKSERVICE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mockService");
    
    
    /**
     * Gets the "mockService" element
     */
    public com.eviware.soapui.config.MockServiceConfig getMockService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().find_element_user(MOCKSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mockService" element
     */
    public void setMockService(com.eviware.soapui.config.MockServiceConfig mockService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().find_element_user(MOCKSERVICE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MockServiceConfig)get_store().add_element_user(MOCKSERVICE$0);
            }
            target.set(mockService);
        }
    }
    
    /**
     * Appends and returns a new empty "mockService" element
     */
    public com.eviware.soapui.config.MockServiceConfig addNewMockService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockServiceConfig target = null;
            target = (com.eviware.soapui.config.MockServiceConfig)get_store().add_element_user(MOCKSERVICE$0);
            return target;
        }
    }
}
