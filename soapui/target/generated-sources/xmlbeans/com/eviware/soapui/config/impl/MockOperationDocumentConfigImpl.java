/*
 * An XML document type.
 * Localname: mockOperation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockOperationDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one mockOperation(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class MockOperationDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MockOperationDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockOperationDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOCKOPERATION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mockOperation");
    
    
    /**
     * Gets the "mockOperation" element
     */
    public com.eviware.soapui.config.MockOperationConfig getMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().find_element_user(MOCKOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mockOperation" element
     */
    public void setMockOperation(com.eviware.soapui.config.MockOperationConfig mockOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().find_element_user(MOCKOPERATION$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MockOperationConfig)get_store().add_element_user(MOCKOPERATION$0);
            }
            target.set(mockOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "mockOperation" element
     */
    public com.eviware.soapui.config.MockOperationConfig addNewMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().add_element_user(MOCKOPERATION$0);
            return target;
        }
    }
}
