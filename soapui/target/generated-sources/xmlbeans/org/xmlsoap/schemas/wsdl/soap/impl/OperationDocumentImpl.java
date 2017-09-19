/*
 * An XML document type.
 * Localname: operation
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.OperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * A document containing one operation(@http://schemas.xmlsoap.org/wsdl/soap/) element.
 *
 * This is a complex type.
 */
public class OperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.OperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "operation");
    
    
    /**
     * Gets the "operation" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TOperation getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TOperation)get_store().find_element_user(OPERATION$0, 0);
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
    public void setOperation(org.xmlsoap.schemas.wsdl.soap.TOperation operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TOperation)get_store().find_element_user(OPERATION$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.TOperation)get_store().add_element_user(OPERATION$0);
            }
            target.set(operation);
        }
    }
    
    /**
     * Appends and returns a new empty "operation" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TOperation addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TOperation target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TOperation)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
}
