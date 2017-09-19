/*
 * An XML document type.
 * Localname: binding
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.BindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * A document containing one binding(@http://schemas.xmlsoap.org/wsdl/http/) element.
 *
 * This is a complex type.
 */
public class BindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.BindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public BindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINDING$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/http/", "binding");
    
    
    /**
     * Gets the "binding" element
     */
    public org.xmlsoap.schemas.wsdl.http.BindingType getBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.BindingType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.BindingType)get_store().find_element_user(BINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "binding" element
     */
    public void setBinding(org.xmlsoap.schemas.wsdl.http.BindingType binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.BindingType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.BindingType)get_store().find_element_user(BINDING$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.http.BindingType)get_store().add_element_user(BINDING$0);
            }
            target.set(binding);
        }
    }
    
    /**
     * Appends and returns a new empty "binding" element
     */
    public org.xmlsoap.schemas.wsdl.http.BindingType addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.BindingType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.BindingType)get_store().add_element_user(BINDING$0);
            return target;
        }
    }
}
