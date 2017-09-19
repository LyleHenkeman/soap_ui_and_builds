/*
 * An XML document type.
 * Localname: fault
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.FaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * A document containing one fault(@http://schemas.xmlsoap.org/wsdl/soap/) element.
 *
 * This is a complex type.
 */
public class FaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.FaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "fault");
    
    
    /**
     * Gets the "fault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TFault getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TFault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fault" element
     */
    public void setFault(org.xmlsoap.schemas.wsdl.soap.TFault fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TFault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.TFault)get_store().add_element_user(FAULT$0);
            }
            target.set(fault);
        }
    }
    
    /**
     * Appends and returns a new empty "fault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TFault addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TFault)get_store().add_element_user(FAULT$0);
            return target;
        }
    }
}
