/*
 * An XML document type.
 * Localname: Embedded
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.impl;
/**
 * A document containing one Embedded(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class EmbeddedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedDocument
{
    private static final long serialVersionUID = 1L;
    
    public EmbeddedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMBEDDED$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Embedded");
    
    
    /**
     * Gets the "Embedded" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType getEmbedded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType)get_store().find_element_user(EMBEDDED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Embedded" element
     */
    public void setEmbedded(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType embedded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType)get_store().find_element_user(EMBEDDED$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType)get_store().add_element_user(EMBEDDED$0);
            }
            target.set(embedded);
        }
    }
    
    /**
     * Appends and returns a new empty "Embedded" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType addNewEmbedded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.EmbeddedType)get_store().add_element_user(EMBEDDED$0);
            return target;
        }
    }
}
