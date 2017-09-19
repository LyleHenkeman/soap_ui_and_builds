/*
 * An XML document type.
 * Localname: body
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.BodyDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * A document containing one body(@http://schemas.xmlsoap.org/wsdl/soap/) element.
 *
 * This is a complex type.
 */
public class BodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.BodyDocument
{
    private static final long serialVersionUID = 1L;
    
    public BodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BODY$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "body");
    
    
    /**
     * Gets the "body" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TBody getBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TBody target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TBody)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "body" element
     */
    public void setBody(org.xmlsoap.schemas.wsdl.soap.TBody body)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TBody target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TBody)get_store().find_element_user(BODY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.TBody)get_store().add_element_user(BODY$0);
            }
            target.set(body);
        }
    }
    
    /**
     * Appends and returns a new empty "body" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TBody addNewBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TBody target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TBody)get_store().add_element_user(BODY$0);
            return target;
        }
    }
}
