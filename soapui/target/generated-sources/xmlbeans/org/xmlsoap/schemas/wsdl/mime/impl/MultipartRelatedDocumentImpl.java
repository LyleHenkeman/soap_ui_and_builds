/*
 * An XML document type.
 * Localname: multipartRelated
 * Namespace: http://schemas.xmlsoap.org/wsdl/mime/
 * Java type: org.xmlsoap.schemas.wsdl.mime.MultipartRelatedDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.mime.impl;
/**
 * A document containing one multipartRelated(@http://schemas.xmlsoap.org/wsdl/mime/) element.
 *
 * This is a complex type.
 */
public class MultipartRelatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.mime.MultipartRelatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultipartRelatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPARTRELATED$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/mime/", "multipartRelated");
    
    
    /**
     * Gets the "multipartRelated" element
     */
    public org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType getMultipartRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType)get_store().find_element_user(MULTIPARTRELATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multipartRelated" element
     */
    public void setMultipartRelated(org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType multipartRelated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType)get_store().find_element_user(MULTIPARTRELATED$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType)get_store().add_element_user(MULTIPARTRELATED$0);
            }
            target.set(multipartRelated);
        }
    }
    
    /**
     * Appends and returns a new empty "multipartRelated" element
     */
    public org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType addNewMultipartRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType target = null;
            target = (org.xmlsoap.schemas.wsdl.mime.MultipartRelatedType)get_store().add_element_user(MULTIPARTRELATED$0);
            return target;
        }
    }
}
