/*
 * An XML document type.
 * Localname: log
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.LogDocument
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * A document containing one log(@http://www.ws-i.org/testing/2003/03/log/) element.
 *
 * This is a complex type.
 */
public class LogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.log.LogDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOG$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "log");
    
    
    /**
     * Gets the "log" element
     */
    public org.wsI.testing.x2003.x03.log.Log getLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Log target = null;
            target = (org.wsI.testing.x2003.x03.log.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "log" element
     */
    public boolean isNilLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Log target = null;
            target = (org.wsI.testing.x2003.x03.log.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "log" element
     */
    public void setLog(org.wsI.testing.x2003.x03.log.Log log)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Log target = null;
            target = (org.wsI.testing.x2003.x03.log.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.Log)get_store().add_element_user(LOG$0);
            }
            target.set(log);
        }
    }
    
    /**
     * Appends and returns a new empty "log" element
     */
    public org.wsI.testing.x2003.x03.log.Log addNewLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Log target = null;
            target = (org.wsI.testing.x2003.x03.log.Log)get_store().add_element_user(LOG$0);
            return target;
        }
    }
    
    /**
     * Nils the "log" element
     */
    public void setNilLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Log target = null;
            target = (org.wsI.testing.x2003.x03.log.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.Log)get_store().add_element_user(LOG$0);
            }
            target.setNil();
        }
    }
}
