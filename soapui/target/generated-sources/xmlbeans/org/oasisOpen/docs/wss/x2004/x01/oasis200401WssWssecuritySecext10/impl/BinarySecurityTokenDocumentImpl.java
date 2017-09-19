/*
 * An XML document type.
 * Localname: BinarySecurityToken
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one BinarySecurityToken(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class BinarySecurityTokenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenDocument
{
    private static final long serialVersionUID = 1L;
    
    public BinarySecurityTokenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINARYSECURITYTOKEN$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "BinarySecurityToken");
    
    
    /**
     * Gets the "BinarySecurityToken" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType getBinarySecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType)get_store().find_element_user(BINARYSECURITYTOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BinarySecurityToken" element
     */
    public void setBinarySecurityToken(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType binarySecurityToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType)get_store().find_element_user(BINARYSECURITYTOKEN$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType)get_store().add_element_user(BINARYSECURITYTOKEN$0);
            }
            target.set(binarySecurityToken);
        }
    }
    
    /**
     * Appends and returns a new empty "BinarySecurityToken" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType addNewBinarySecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.BinarySecurityTokenType)get_store().add_element_user(BINARYSECURITYTOKEN$0);
            return target;
        }
    }
}
