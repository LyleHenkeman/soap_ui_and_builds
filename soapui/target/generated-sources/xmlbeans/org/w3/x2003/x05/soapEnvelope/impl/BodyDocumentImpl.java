/*
 * An XML document type.
 * Localname: Body
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.BodyDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one Body(@http://www.w3.org/2003/05/soap-envelope) element.
 *
 * This is a complex type.
 */
public class BodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.BodyDocument
{
    private static final long serialVersionUID = 1L;
    
    public BodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Body");
    
    
    /**
     * Gets the "Body" element
     */
    public org.w3.x2003.x05.soapEnvelope.Body getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Body target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Body" element
     */
    public void setBody(org.w3.x2003.x05.soapEnvelope.Body body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Body target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Body)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Body)get_store().add_element_user(BODY$0);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "Body" element
     */
    public org.w3.x2003.x05.soapEnvelope.Body addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Body target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Body)get_store().add_element_user(BODY$0);
            return target;
        }
    }
}
