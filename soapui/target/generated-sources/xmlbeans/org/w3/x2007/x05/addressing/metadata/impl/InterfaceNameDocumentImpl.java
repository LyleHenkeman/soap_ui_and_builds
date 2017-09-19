/*
 * An XML document type.
 * Localname: InterfaceName
 * Namespace: http://www.w3.org/2007/05/addressing/metadata
 * Java type: org.w3.x2007.x05.addressing.metadata.InterfaceNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2007.x05.addressing.metadata.impl;
/**
 * A document containing one InterfaceName(@http://www.w3.org/2007/05/addressing/metadata) element.
 *
 * This is a complex type.
 */
public class InterfaceNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2007.x05.addressing.metadata.InterfaceNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACENAME$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2007/05/addressing/metadata", "InterfaceName");
    
    
    /**
     * Gets the "InterfaceName" element
     */
    public org.w3.x2007.x05.addressing.metadata.AttributedQNameType getInterfaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AttributedQNameType target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AttributedQNameType)get_store().find_element_user(INTERFACENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InterfaceName" element
     */
    public void setInterfaceName(org.w3.x2007.x05.addressing.metadata.AttributedQNameType interfaceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AttributedQNameType target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AttributedQNameType)get_store().find_element_user(INTERFACENAME$0, 0);
            if (target == null)
            {
                target = (org.w3.x2007.x05.addressing.metadata.AttributedQNameType)get_store().add_element_user(INTERFACENAME$0);
            }
            target.set(interfaceName);
        }
    }
    
    /**
     * Appends and returns a new empty "InterfaceName" element
     */
    public org.w3.x2007.x05.addressing.metadata.AttributedQNameType addNewInterfaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2007.x05.addressing.metadata.AttributedQNameType target = null;
            target = (org.w3.x2007.x05.addressing.metadata.AttributedQNameType)get_store().add_element_user(INTERFACENAME$0);
            return target;
        }
    }
}
