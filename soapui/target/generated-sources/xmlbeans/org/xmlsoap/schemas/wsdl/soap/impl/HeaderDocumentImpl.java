/*
 * An XML document type.
 * Localname: header
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * A document containing one header(@http://schemas.xmlsoap.org/wsdl/soap/) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "header");
    
    
    /**
     * Gets the "header" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeader getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeader target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeader)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "header" element
     */
    public void setHeader(org.xmlsoap.schemas.wsdl.soap.THeader header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeader target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeader)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.THeader)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "header" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeader addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeader target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeader)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
}
