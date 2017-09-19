/*
 * An XML document type.
 * Localname: mimeXml
 * Namespace: http://schemas.xmlsoap.org/wsdl/mime/
 * Java type: org.xmlsoap.schemas.wsdl.mime.MimeXmlDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.mime.impl;
/**
 * A document containing one mimeXml(@http://schemas.xmlsoap.org/wsdl/mime/) element.
 *
 * This is a complex type.
 */
public class MimeXmlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.mime.MimeXmlDocument
{
    private static final long serialVersionUID = 1L;
    
    public MimeXmlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMEXML$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/mime/", "mimeXml");
    
    
    /**
     * Gets the "mimeXml" element
     */
    public org.xmlsoap.schemas.wsdl.mime.TMimeXml getMimeXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TMimeXml target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TMimeXml)get_store().find_element_user(MIMEXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mimeXml" element
     */
    public void setMimeXml(org.xmlsoap.schemas.wsdl.mime.TMimeXml mimeXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TMimeXml target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TMimeXml)get_store().find_element_user(MIMEXML$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.mime.TMimeXml)get_store().add_element_user(MIMEXML$0);
            }
            target.set(mimeXml);
        }
    }
    
    /**
     * Appends and returns a new empty "mimeXml" element
     */
    public org.xmlsoap.schemas.wsdl.mime.TMimeXml addNewMimeXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.TMimeXml target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.TMimeXml)get_store().add_element_user(MIMEXML$0);
            return target;
        }
    }
}
