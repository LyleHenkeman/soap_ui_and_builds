/*
 * XML Type:  monitor
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.Monitor
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * An XML monitor(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public class MonitorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.log.Monitor
{
    private static final long serialVersionUID = 1L;
    
    public MonitorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPLEMENTER$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "implementer");
    private static final javax.xml.namespace.QName ENVIRONMENT$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "environment");
    private static final javax.xml.namespace.QName CONFIGURATION$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "configuration");
    private static final javax.xml.namespace.QName VERSION$6 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName RELEASEDATE$8 = 
        new javax.xml.namespace.QName("", "releaseDate");
    
    
    /**
     * Gets the "implementer" element
     */
    public org.wsI.testing.x2003.x03.log.Implementation getImplementer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Implementation target = null;
            target = (org.wsI.testing.x2003.x03.log.Implementation)get_store().find_element_user(IMPLEMENTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "implementer" element
     */
    public void setImplementer(org.wsI.testing.x2003.x03.log.Implementation implementer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Implementation target = null;
            target = (org.wsI.testing.x2003.x03.log.Implementation)get_store().find_element_user(IMPLEMENTER$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.Implementation)get_store().add_element_user(IMPLEMENTER$0);
            }
            target.set(implementer);
        }
    }
    
    /**
     * Appends and returns a new empty "implementer" element
     */
    public org.wsI.testing.x2003.x03.log.Implementation addNewImplementer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Implementation target = null;
            target = (org.wsI.testing.x2003.x03.log.Implementation)get_store().add_element_user(IMPLEMENTER$0);
            return target;
        }
    }
    
    /**
     * Gets the "environment" element
     */
    public org.wsI.testing.x2003.x03.log.Environment getEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Environment target = null;
            target = (org.wsI.testing.x2003.x03.log.Environment)get_store().find_element_user(ENVIRONMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "environment" element
     */
    public void setEnvironment(org.wsI.testing.x2003.x03.log.Environment environment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Environment target = null;
            target = (org.wsI.testing.x2003.x03.log.Environment)get_store().find_element_user(ENVIRONMENT$2, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.Environment)get_store().add_element_user(ENVIRONMENT$2);
            }
            target.set(environment);
        }
    }
    
    /**
     * Appends and returns a new empty "environment" element
     */
    public org.wsI.testing.x2003.x03.log.Environment addNewEnvironment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.Environment target = null;
            target = (org.wsI.testing.x2003.x03.log.Environment)get_store().add_element_user(ENVIRONMENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "configuration" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Configuration target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$4, 0);
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
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$4, 0);
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
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$4, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().add_element_user(CONFIGURATION$4);
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
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().add_element_user(CONFIGURATION$4);
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
            target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().find_element_user(CONFIGURATION$4, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.Configuration)get_store().add_element_user(CONFIGURATION$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$6);
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$6) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$6);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$6);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$6);
        }
    }
    
    /**
     * Gets the "releaseDate" attribute
     */
    public java.util.Calendar getReleaseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASEDATE$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "releaseDate" attribute
     */
    public org.apache.xmlbeans.XmlDate xgetReleaseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(RELEASEDATE$8);
            return target;
        }
    }
    
    /**
     * True if has "releaseDate" attribute
     */
    public boolean isSetReleaseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELEASEDATE$8) != null;
        }
    }
    
    /**
     * Sets the "releaseDate" attribute
     */
    public void setReleaseDate(java.util.Calendar releaseDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASEDATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELEASEDATE$8);
            }
            target.setCalendarValue(releaseDate);
        }
    }
    
    /**
     * Sets (as xml) the "releaseDate" attribute
     */
    public void xsetReleaseDate(org.apache.xmlbeans.XmlDate releaseDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_attribute_user(RELEASEDATE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_attribute_user(RELEASEDATE$8);
            }
            target.set(releaseDate);
        }
    }
    
    /**
     * Unsets the "releaseDate" attribute
     */
    public void unsetReleaseDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELEASEDATE$8);
        }
    }
}
