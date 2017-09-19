/*
 * An XML document type.
 * Localname: ServiceName
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.ServiceNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata.impl;
/**
 * A document containing one ServiceName(@http://www.w3.org/2007/05/addressing/metadata) element.
 *
 * This is a complex type.
 */
public class ServiceNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.ServiceNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICENAME$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "ServiceName");
    
    
    /**
     * Gets the "ServiceName" element
     */
    public org.w3.x2007.x05.addressing.metadata.ServiceNameType getServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.ServiceNameType target = null;
            target = (org.w3.x2007.x05.addressing.metadata.ServiceNameType)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceName" element
     */
    public void setServiceName(org.w3.x2007.x05.addressing.metadata.ServiceNameType serviceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.ServiceNameType target = null;
            target = (org.w3.x2007.x05.addressing.metadata.ServiceNameType)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                target = (org.w3.x2007.x05.addressing.metadata.ServiceNameType)get_store().add_element_user(SERVICENAME$0);
            }
            target.set(serviceName);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceName" element
     */
    public org.w3.x2007.x05.addressing.metadata.ServiceNameType addNewServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.ServiceNameType target = null;
            target = (org.w3.x2007.x05.addressing.metadata.ServiceNameType)get_store().add_element_user(SERVICENAME$0);
            return target;
        }
    }
}
