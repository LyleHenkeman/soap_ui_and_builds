/*
 * An XML document type.
 * Localname: urlReplacement
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * A document containing one urlReplacement(@http://schemas.xmlsoap.org/wsdl/http/) element.
 *
 * This is a complex type.
 */
public class UrlReplacementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument
{
    private static final long serialVersionUID = 1L;
    
    public UrlReplacementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URLREPLACEMENT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/http/", "urlReplacement");
    
    
    /**
     * Gets the "urlReplacement" element
     */
    public org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement getUrlReplacement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement target = null;
            target = (org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement)get_store().find_element_user(URLREPLACEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "urlReplacement" element
     */
    public void setUrlReplacement(org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement urlReplacement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement target = null;
            target = (org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement)get_store().find_element_user(URLREPLACEMENT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement)get_store().add_element_user(URLREPLACEMENT$0);
            }
            target.set(urlReplacement);
        }
    }
    
    /**
     * Appends and returns a new empty "urlReplacement" element
     */
    public org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement addNewUrlReplacement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement target = null;
            target = (org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement)get_store().add_element_user(URLREPLACEMENT$0);
            return target;
        }
    }
    /**
     * An XML urlReplacement(@http://schemas.xmlsoap.org/wsdl/http/).
     *
     * This is a complex type.
     */
    public static class UrlReplacementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.UrlReplacementDocument.UrlReplacement
    {
        private static final long serialVersionUID = 1L;
        
        public UrlReplacementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
