/*
 * An XML document type.
 * Localname: Timestamp
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.impl;
/**
 * A document containing one Timestamp(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd) element.
 *
 * This is a complex type.
 */
public class TimestampDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimestampDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESTAMP$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Timestamp");
    
    
    /**
     * Gets the "Timestamp" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Timestamp" element
     */
    public void setTimestamp(org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType)get_store().find_element_user(TIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType)get_store().add_element_user(TIMESTAMP$0);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Appends and returns a new empty "Timestamp" element
     */
    public org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType addNewTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType target = null;
            target = (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecurityUtility10.TimestampType)get_store().add_element_user(TIMESTAMP$0);
            return target;
        }
    }
}
