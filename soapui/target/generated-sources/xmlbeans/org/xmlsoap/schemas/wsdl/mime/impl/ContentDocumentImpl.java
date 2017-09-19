/*
 * An XML document type.
 * Localname: content
 * Namespace: http://schemas.xmlsoap.org/wsdl/mime/
 * Java type: org.xmlsoap.schemas.wsdl.mime.ContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.mime.impl;
/**
 * A document containing one content(@http://schemas.xmlsoap.org/wsdl/mime/) element.
 *
 * This is a complex type.
 */
public class ContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.mime.ContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/mime/", "content");
    
    
    /**
     * Gets the "content" element
     */
    public org.xmlsoap.schemas.wsdl.mime.ContentType getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.ContentType target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.ContentType)get_store().find_element_user(CONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(org.xmlsoap.schemas.wsdl.mime.ContentType content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.ContentType target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.ContentType)get_store().find_element_user(CONTENT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.mime.ContentType)get_store().add_element_user(CONTENT$0);
            }
            target.set(content);
        }
    }
    
    /**
     * Appends and returns a new empty "content" element
     */
    public org.xmlsoap.schemas.wsdl.mime.ContentType addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.ContentType target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.ContentType)get_store().add_element_user(CONTENT$0);
            return target;
        }
    }
}
