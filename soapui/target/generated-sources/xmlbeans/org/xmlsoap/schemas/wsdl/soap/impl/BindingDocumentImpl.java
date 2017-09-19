/*
 * An XML document type.
 * Localname: binding
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.BindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * A document containing one binding(@http://schemas.xmlsoap.org/wsdl/soap/) element.
 *
 * This is a complex type.
 */
public class BindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.BindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public BindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINDING$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "binding");
    
    
    /**
     * Gets the "binding" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TBinding getBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TBinding)get_store().find_element_user(BINDING$0, 0);
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
    public void setBinding(org.xmlsoap.schemas.wsdl.soap.TBinding binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TBinding)get_store().find_element_user(BINDING$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.TBinding)get_store().add_element_user(BINDING$0);
            }
            target.set(binding);
        }
    }
    
    /**
     * Appends and returns a new empty "binding" element
     */
    public org.xmlsoap.schemas.wsdl.soap.TBinding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.TBinding)get_store().add_element_user(BINDING$0);
            return target;
        }
    }
}
