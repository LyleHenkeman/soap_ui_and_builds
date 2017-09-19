/*
 * An XML document type.
 * Localname: NotUnderstood
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.NotUnderstoodDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope.impl;
/**
 * A document containing one NotUnderstood(@http://www.w3.org/2003/05/soap-envelope) element.
 *
 * This is a complex type.
 */
public class NotUnderstoodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2003.x05.soapEnvelope.NotUnderstoodDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotUnderstoodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTUNDERSTOOD$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2003/05/soap-envelope", "NotUnderstood");
    
    
    /**
     * Gets the "NotUnderstood" element
     */
    public org.w3.x2003.x05.soapEnvelope.NotUnderstoodType getNotUnderstood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.NotUnderstoodType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.NotUnderstoodType)get_store().find_element_user(NOTUNDERSTOOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotUnderstood" element
     */
    public void setNotUnderstood(org.w3.x2003.x05.soapEnvelope.NotUnderstoodType notUnderstood)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.NotUnderstoodType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.NotUnderstoodType)get_store().find_element_user(NOTUNDERSTOOD$0, 0);
            if (target == null)
            {
                target = (org.w3.x2003.x05.soapEnvelope.NotUnderstoodType)get_store().add_element_user(NOTUNDERSTOOD$0);
            }
            target.set(notUnderstood);
        }
    }
    
    /**
     * Appends and returns a new empty "NotUnderstood" element
     */
    public org.w3.x2003.x05.soapEnvelope.NotUnderstoodType addNewNotUnderstood()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2003.x05.soapEnvelope.NotUnderstoodType target = null;
            target = (org.w3.x2003.x05.soapEnvelope.NotUnderstoodType)get_store().add_element_user(NOTUNDERSTOOD$0);
            return target;
        }
    }
}
