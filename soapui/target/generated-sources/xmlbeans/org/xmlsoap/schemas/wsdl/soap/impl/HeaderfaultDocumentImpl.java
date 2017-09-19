/*
 * An XML document type.
 * Localname: headerfault
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.HeaderfaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * A document containing one headerfault(@http://schemas.xmlsoap.org/wsdl/soap/) element.
 *
 * This is a complex type.
 */
public class HeaderfaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.HeaderfaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public HeaderfaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADERFAULT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/soap/", "headerfault");
    
    
    /**
     * Gets the "headerfault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeaderFault getHeaderfault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().find_element_user(HEADERFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "headerfault" element
     */
    public void setHeaderfault(org.xmlsoap.schemas.wsdl.soap.THeaderFault headerfault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().find_element_user(HEADERFAULT$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().add_element_user(HEADERFAULT$0);
            }
            target.set(headerfault);
        }
    }
    
    /**
     * Appends and returns a new empty "headerfault" element
     */
    public org.xmlsoap.schemas.wsdl.soap.THeaderFault addNewHeaderfault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.THeaderFault target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.THeaderFault)get_store().add_element_user(HEADERFAULT$0);
            return target;
        }
    }
}
