/*
 * XML Type:  tDocumented
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TDocumented
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.impl;
/**
 * An XML tDocumented(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TDocumentedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.TDocumented
{
    private static final long serialVersionUID = 1L;
    
    public TDocumentedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "documentation");
    
    
    /**
     * Gets the "documentation" element
     */
    public org.xmlsoap.schemas.wsdl.TDocumentation getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TDocumentation target = null;
            target = (org.xmlsoap.schemas.wsdl.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "documentation" element
     */
    public boolean isSetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.xmlsoap.schemas.wsdl.TDocumentation documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TDocumentation target = null;
            target = (org.xmlsoap.schemas.wsdl.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            }
            target.set(documentation);
        }
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.xmlsoap.schemas.wsdl.TDocumentation addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TDocumentation target = null;
            target = (org.xmlsoap.schemas.wsdl.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "documentation" element
     */
    public void unsetDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$0, 0);
        }
    }
}
