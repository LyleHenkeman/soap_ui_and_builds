/*
 * An XML document type.
 * Localname: address
 * Namespace: http://schemas.xmlsoap.org/wsdl/http/
 * Java type: org.xmlsoap.schemas.wsdl.http.AddressDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.http.impl;
/**
 * A document containing one address(@http://schemas.xmlsoap.org/wsdl/http/) element.
 *
 * This is a complex type.
 */
public class AddressDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.http.AddressDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddressDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/http/", "address");
    
    
    /**
     * Gets the "address" element
     */
    public org.xmlsoap.schemas.wsdl.http.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.AddressType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(org.xmlsoap.schemas.wsdl.http.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.AddressType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.AddressType)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.http.AddressType)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public org.xmlsoap.schemas.wsdl.http.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.http.AddressType target = null;
            target = (org.xmlsoap.schemas.wsdl.http.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
}
