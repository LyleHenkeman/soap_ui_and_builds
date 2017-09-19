/*
 * An XML document type.
 * Localname: Expires
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.ExpiresDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.impl;
/**
 * A document containing one Expires(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class ExpiresDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.ExpiresDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExpiresDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPIRES$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Expires");
    
    
    /**
     * Gets the "Expires" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime getExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime)get_store().find_element_user(EXPIRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Expires" element
     */
    public void setExpires(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime expires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime)get_store().find_element_user(EXPIRES$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime)get_store().add_element_user(EXPIRES$0);
            }
            target.set(expires);
        }
    }
    
    /**
     * Appends and returns a new empty "Expires" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime addNewExpires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.AttributedDateTime)get_store().add_element_user(EXPIRES$0);
            return target;
        }
    }
}
