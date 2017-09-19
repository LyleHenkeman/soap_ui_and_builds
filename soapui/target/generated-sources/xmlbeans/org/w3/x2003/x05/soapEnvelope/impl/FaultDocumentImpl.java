/*
 * An XML document type.
 * Localname: Fault
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.FaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one Fault(@http://www.w3.org/2003/05/soap-envelope) element.
 *
 * This is a complex type.
 */
public class FaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.FaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULT$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "Fault");
    
    
    /**
     * Gets the "Fault" element
     */
    public org.w3.x2003.x05.soapEnvelope.Fault getFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Fault target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Fault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Fault" element
     */
    public void setFault(org.w3.x2003.x05.soapEnvelope.Fault fault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Fault target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Fault)get_store().find_element_user(FAULT$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.Fault)get_store().add_element_user(FAULT$0);
            }
            target.set(fault);
        }
    }
    
    /**
     * Appends and returns a new empty "Fault" element
     */
    public org.w3.x2003.x05.soapEnvelope.Fault addNewFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.Fault target = null;
            target = (org.w3.x2003.x05.soapEnvelope.Fault)get_store().add_element_user(FAULT$0);
            return target;
        }
    }
}
