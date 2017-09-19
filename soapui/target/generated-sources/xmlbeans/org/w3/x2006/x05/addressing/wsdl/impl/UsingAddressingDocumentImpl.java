/*
 * An XML document type.
 * Localname: UsingAddressing
 * Namespace: http://www.w3.org/2006/05/addressing/wsdl
 * Java type: org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2006.x05.addressing.wsdl.impl;
/**
 * A document containing one UsingAddressing(@http://www.w3.org/2006/05/addressing/wsdl) element.
 *
 * This is a complex type.
 */
public class UsingAddressingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsingAddressingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USINGADDRESSING$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2006/05/addressing/wsdl", "UsingAddressing");
    
    
    /**
     * Gets the "UsingAddressing" element
     */
    public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing getUsingAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().find_element_user(USINGADDRESSING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UsingAddressing" element
     */
    public void setUsingAddressing(org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing usingAddressing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().find_element_user(USINGADDRESSING$0, 0);
            if (target == null)
            {
                target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().add_element_user(USINGADDRESSING$0);
            }
            target.set(usingAddressing);
        }
    }
    
    /**
     * Appends and returns a new empty "UsingAddressing" element
     */
    public org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing addNewUsingAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing target = null;
            target = (org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing)get_store().add_element_user(USINGADDRESSING$0);
            return target;
        }
    }
    /**
     * An XML UsingAddressing(@http://www.w3.org/2006/05/addressing/wsdl).
     *
     * This is a complex type.
     */
    public static class UsingAddressingImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2006.x05.addressing.wsdl.UsingAddressingDocument.UsingAddressing
    {
        private static final long serialVersionUID = 1L;
        
        public UsingAddressingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
