/*
 * An XML document type.
 * Localname: KeyIdentifier
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one KeyIdentifier(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class KeyIdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyIdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "KeyIdentifier");
    
    
    /**
     * Gets the "KeyIdentifier" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType getKeyIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType)get_store().find_element_user(KEYIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeyIdentifier" element
     */
    public void setKeyIdentifier(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType keyIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType)get_store().find_element_user(KEYIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType)get_store().add_element_user(KEYIDENTIFIER$0);
            }
            target.set(keyIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyIdentifier" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType addNewKeyIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.KeyIdentifierType)get_store().add_element_user(KEYIDENTIFIER$0);
            return target;
        }
    }
}
