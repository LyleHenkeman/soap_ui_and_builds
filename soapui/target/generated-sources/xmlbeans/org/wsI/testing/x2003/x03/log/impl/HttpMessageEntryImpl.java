/*
 * XML Type:  httpMessageEntry
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.HttpMessageEntry
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * An XML httpMessageEntry(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public class HttpMessageEntryImpl extends org.wsI.testing.x2003.x03.log.impl.TcpLogImpl implements org.wsI.testing.x2003.x03.log.HttpMessageEntry
{
    private static final long serialVersionUID = 1L;
    
    public HttpMessageEntryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTTPHEADERS$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "httpHeaders");
    
    
    /**
     * Gets the "httpHeaders" element
     */
    public java.lang.String getHttpHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTTPHEADERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "httpHeaders" element
     */
    public org.apache.xmlbeans.XmlString xgetHttpHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTTPHEADERS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "httpHeaders" element
     */
    public boolean isSetHttpHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTTPHEADERS$0) != 0;
        }
    }
    
    /**
     * Sets the "httpHeaders" element
     */
    public void setHttpHeaders(java.lang.String httpHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTTPHEADERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HTTPHEADERS$0);
            }
            target.setStringValue(httpHeaders);
        }
    }
    
    /**
     * Sets (as xml) the "httpHeaders" element
     */
    public void xsetHttpHeaders(org.apache.xmlbeans.XmlString httpHeaders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HTTPHEADERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HTTPHEADERS$0);
            }
            target.set(httpHeaders);
        }
    }
    
    /**
     * Unsets the "httpHeaders" element
     */
    public void unsetHttpHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTTPHEADERS$0, 0);
        }
    }
}
