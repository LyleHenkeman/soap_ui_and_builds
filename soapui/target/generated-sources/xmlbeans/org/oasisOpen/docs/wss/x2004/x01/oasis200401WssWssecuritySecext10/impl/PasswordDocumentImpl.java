/*
 * An XML document type.
 * Localname: Password
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one Password(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class PasswordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordDocument
{
    private static final long serialVersionUID = 1L;
    
    public PasswordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSWORD$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Password");
    
    
    /**
     * Gets the "Password" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString)get_store().find_element_user(PASSWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Password" element
     */
    public void setPassword(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString)get_store().find_element_user(PASSWORD$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString)get_store().add_element_user(PASSWORD$0);
            }
            target.set(password);
        }
    }
    
    /**
     * Appends and returns a new empty "Password" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString addNewPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString)get_store().add_element_user(PASSWORD$0);
            return target;
        }
    }
}
