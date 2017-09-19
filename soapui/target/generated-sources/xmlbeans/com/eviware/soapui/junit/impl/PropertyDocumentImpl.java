/*
 * An XML document type.
 * Localname: property
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * A document containing one property(@http://eviware.com/soapui/junit) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "property");
    
    
    /**
     * Gets the "property" element
     */
    public com.eviware.soapui.junit.Property getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(com.eviware.soapui.junit.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.Property)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public com.eviware.soapui.junit.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Property target = null;
            target = (com.eviware.soapui.junit.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
}
