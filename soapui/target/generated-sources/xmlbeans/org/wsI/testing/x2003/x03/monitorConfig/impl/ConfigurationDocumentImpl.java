/*
 * An XML document type.
 * Localname: configuration
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.ConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig.impl;
/**
 * A document containing one configuration(@http://www.ws-i.org/testing/2003/03/monitorConfig/) element.
 *
 * This is a complex type.
 */
public class ConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.monitorConfig.ConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "configuration");
    
    
    /**
     * Gets the "configuration" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Configuration target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "configuration" element
     */
    public boolean isNilConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Configuration target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.wsI.testing.x2003.x03.monitorConfig.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Configuration target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().add_element_user(CONFIGURATION$0);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Configuration target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().add_element_user(CONFIGURATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "configuration" element
     */
    public void setNilConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Configuration target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().add_element_user(CONFIGURATION$0);
            }
            target.setNil();
        }
    }
}
