/*
 * An XML document type.
 * Localname: Header
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.HeaderDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one Header(@http://www.w3.org/2003/05/soap-envelope) element.
 *
 * This is a complex type.
 */
public class HeaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.HeaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Header");
    
    
    /**
     * Gets the "Header" element
     */
    public org.w3.x2003.x05.soapEnvelope.Header getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Header target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Header)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Header" element
     */
    public void setHeader(org.w3.x2003.x05.soapEnvelope.Header header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Header target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Header)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Header)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "Header" element
     */
    public org.w3.x2003.x05.soapEnvelope.Header addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Header target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Header)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
}
