/*
 * An XML document type.
 * Localname: webservices
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebservicesDocument
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * A document containing one webservices(@http://java.sun.com/xml/ns/j2ee) element.
 *
 * This is a complex type.
 */
public class WebservicesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WebservicesDocument
{
    private static final long serialVersionUID = 1L;
    
    public WebservicesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBSERVICES$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "webservices");
    
    
    /**
     * Gets the "webservices" element
     */
    public com.sun.java.xml.ns.j2Ee.WebservicesType getWebservices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebservicesType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebservicesType)get_store().find_element_user(WEBSERVICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webservices" element
     */
    public void setWebservices(com.sun.java.xml.ns.j2Ee.WebservicesType webservices)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebservicesType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebservicesType)get_store().find_element_user(WEBSERVICES$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WebservicesType)get_store().add_element_user(WEBSERVICES$0);
            }
            target.set(webservices);
        }
    }
    
    /**
     * Appends and returns a new empty "webservices" element
     */
    public com.sun.java.xml.ns.j2Ee.WebservicesType addNewWebservices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebservicesType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebservicesType)get_store().add_element_user(WEBSERVICES$0);
            return target;
        }
    }
}
