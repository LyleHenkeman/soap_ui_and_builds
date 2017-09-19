/*
 * An XML document type.
 * Localname: properties
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.PropertiesDocument
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit.impl;
/**
 * A document containing one properties(@http://eviware.com/soapui/junit) element.
 *
 * This is a complex type.
 */
public class PropertiesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.junit.PropertiesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertiesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTIES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/junit", "properties");
    
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.junit.Properties getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Properties target = null;
            target = (com.eviware.soapui.junit.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.junit.Properties properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Properties target = null;
            target = (com.eviware.soapui.junit.Properties)get_store().find_element_user(PROPERTIES$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.junit.Properties)get_store().add_element_user(PROPERTIES$0);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.junit.Properties addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.junit.Properties target = null;
            target = (com.eviware.soapui.junit.Properties)get_store().add_element_user(PROPERTIES$0);
            return target;
        }
    }
}
