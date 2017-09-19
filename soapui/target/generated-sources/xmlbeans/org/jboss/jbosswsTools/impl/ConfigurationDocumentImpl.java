/*
 * An XML document type.
 * Localname: configuration
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * A document containing one configuration(@http://www.jboss.org/jbossws-tools) element.
 *
 * This is a complex type.
 */
public class ConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.ConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "configuration");
    
    
    /**
     * Gets the "configuration" element
     */
    public org.jboss.jbosswsTools.ConfigurationType getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ConfigurationType target = null;
            target = (org.jboss.jbosswsTools.ConfigurationType)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(org.jboss.jbosswsTools.ConfigurationType configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ConfigurationType target = null;
            target = (org.jboss.jbosswsTools.ConfigurationType)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.ConfigurationType)get_store().add_element_user(CONFIGURATION$0);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public org.jboss.jbosswsTools.ConfigurationType addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.ConfigurationType target = null;
            target = (org.jboss.jbosswsTools.ConfigurationType)get_store().add_element_user(CONFIGURATION$0);
            return target;
        }
    }
}
