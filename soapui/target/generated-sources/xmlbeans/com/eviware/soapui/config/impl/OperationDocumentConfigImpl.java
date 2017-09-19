/*
 * An XML document type.
 * Localname: operation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OperationDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one operation(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class OperationDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.OperationDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public OperationDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operation");
    
    
    /**
     * Gets the "operation" element
     */
    public com.eviware.soapui.config.OperationConfig getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(com.eviware.soapui.config.OperationConfig operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.OperationConfig)get_store().add_element_user(OPERATION$0);
            }
            target.set(operation);
        }
    }
    
    /**
     * Appends and returns a new empty "operation" element
     */
    public com.eviware.soapui.config.OperationConfig addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
}
