/*
 * An XML document type.
 * Localname: UsernameToken
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one UsernameToken(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class UsernameTokenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsernameTokenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERNAMETOKEN$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "UsernameToken");
    
    
    /**
     * Gets the "UsernameToken" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType getUsernameToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType)get_store().find_element_user(USERNAMETOKEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UsernameToken" element
     */
    public void setUsernameToken(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType usernameToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType)get_store().find_element_user(USERNAMETOKEN$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType)get_store().add_element_user(USERNAMETOKEN$0);
            }
            target.set(usernameToken);
        }
    }
    
    /**
     * Appends and returns a new empty "UsernameToken" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType addNewUsernameToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.UsernameTokenType)get_store().add_element_user(USERNAMETOKEN$0);
            return target;
        }
    }
}
