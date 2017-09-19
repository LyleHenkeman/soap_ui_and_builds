/*
 * An XML document type.
 * Localname: urlEncoded
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * A document containing one urlEncoded(@http://schemas.xmlsoap.org/wsdl/http/) element.
 *
 * This is a complex type.
 */
public class UrlEncodedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument
{
    private static final long serialVersionUID = 1L;
    
    public UrlEncodedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URLENCODED$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/http/", "urlEncoded");
    
    
    /**
     * Gets the "urlEncoded" element
     */
    public org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded getUrlEncoded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded target = null;
            target = (org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded)get_store().find_element_user(URLENCODED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "urlEncoded" element
     */
    public void setUrlEncoded(org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded urlEncoded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded target = null;
            target = (org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded)get_store().find_element_user(URLENCODED$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded)get_store().add_element_user(URLENCODED$0);
            }
            target.set(urlEncoded);
        }
    }
    
    /**
     * Appends and returns a new empty "urlEncoded" element
     */
    public org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded addNewUrlEncoded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded target = null;
            target = (org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded)get_store().add_element_user(URLENCODED$0);
            return target;
        }
    }
    /**
     * An XML urlEncoded(@http://schemas.xmlsoap.org/wsdl/http/).
     *
     * This is a complex type.
     */
    public static class UrlEncodedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.UrlEncodedDocument.UrlEncoded
    {
        private static final long serialVersionUID = 1L;
        
        public UrlEncodedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
