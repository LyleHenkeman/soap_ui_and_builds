/*
 * An XML document type.
 * Localname: Envelope
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.EnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one Envelope(@http://www.w3.org/2003/05/soap-envelope) element.
 *
 * This is a complex type.
 */
public class EnvelopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.EnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Envelope");
    
    
    /**
     * Gets the "Envelope" element
     */
    public org.w3.x2003.x05.soapEnvelope.Envelope getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Envelope target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Envelope)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
    public void setEnvelope(org.w3.x2003.x05.soapEnvelope.Envelope envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Envelope target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Envelope)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Envelope)get_store().add_element_user(ENVELOPE$0);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public org.w3.x2003.x05.soapEnvelope.Envelope addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Envelope target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Envelope)get_store().add_element_user(ENVELOPE$0);
            return target;
        }
    }
}
