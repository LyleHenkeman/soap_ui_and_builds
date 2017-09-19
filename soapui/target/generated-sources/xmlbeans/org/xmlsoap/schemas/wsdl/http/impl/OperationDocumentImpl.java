/*
 * An XML document type.
 * Localname: operation
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.OperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * A document containing one operation(@http://schemas.xmlsoap.org/wsdl/http/) element.
 *
 * This is a complex type.
 */
public class OperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.OperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/http/", "operation");
    
    
    /**
     * Gets the "operation" element
     */
    public org.xmlsoap.schemas.wsdl.http.OperationType getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.OperationType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.OperationType)get_store().find_element_user(OPERATION$0, 0);
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
    public void setOperation(org.xmlsoap.schemas.wsdl.http.OperationType operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.OperationType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.OperationType)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.http.OperationType)get_store().add_element_user(OPERATION$0);
            }
            target.set(operation);
        }
    }
    
    /**
     * Appends and returns a new empty "operation" element
     */
    public org.xmlsoap.schemas.wsdl.http.OperationType addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.OperationType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.OperationType)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
}
