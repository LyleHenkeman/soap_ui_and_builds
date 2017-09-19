/*
 * An XML document type.
 * Localname: SecurityTokenReference
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one SecurityTokenReference(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class SecurityTokenReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityTokenReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYTOKENREFERENCE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "SecurityTokenReference");
    
    
    /**
     * Gets the "SecurityTokenReference" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType getSecurityTokenReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType)get_store().find_element_user(SECURITYTOKENREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SecurityTokenReference" element
     */
    public void setSecurityTokenReference(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType securityTokenReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType)get_store().find_element_user(SECURITYTOKENREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType)get_store().add_element_user(SECURITYTOKENREFERENCE$0);
            }
            target.set(securityTokenReference);
        }
    }
    
    /**
     * Appends and returns a new empty "SecurityTokenReference" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType addNewSecurityTokenReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.SecurityTokenReferenceType)get_store().add_element_user(SECURITYTOKENREFERENCE$0);
            return target;
        }
    }
}
