/*
 * XML Type:  logFile
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.LogFile
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig.impl;
/**
 * An XML logFile(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public class LogFileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.monitorConfig.LogFile
{
    private static final long serialVersionUID = 1L;
    
    public LogFileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDSTYLESHEET$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "addStyleSheet");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("", "location");
    private static final javax.xml.namespace.QName REPLACE$4 = 
        new javax.xml.namespace.QName("", "replace");
    
    
    /**
     * Gets the "addStyleSheet" element
     */
    public org.wsI.testing.x2003.x03.common.AddStyleSheet getAddStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.AddStyleSheet target = null;
            target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().find_element_user(ADDSTYLESHEET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addStyleSheet" element
     */
    public boolean isSetAddStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDSTYLESHEET$0) != 0;
        }
    }
    
    /**
     * Sets the "addStyleSheet" element
     */
    public void setAddStyleSheet(org.wsI.testing.x2003.x03.common.AddStyleSheet addStyleSheet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.AddStyleSheet target = null;
            target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().find_element_user(ADDSTYLESHEET$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().add_element_user(ADDSTYLESHEET$0);
            }
            target.set(addStyleSheet);
        }
    }
    
    /**
     * Appends and returns a new empty "addStyleSheet" element
     */
    public org.wsI.testing.x2003.x03.common.AddStyleSheet addNewAddStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.AddStyleSheet target = null;
            target = (org.wsI.testing.x2003.x03.common.AddStyleSheet)get_store().add_element_user(ADDSTYLESHEET$0);
            return target;
        }
    }
    
    /**
     * Unsets the "addStyleSheet" element
     */
    public void unsetAddStyleSheet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDSTYLESHEET$0, 0);
        }
    }
    
    /**
     * Gets the "location" attribute
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "location" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$2);
            return target;
        }
    }
    
    /**
     * Sets the "location" attribute
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$2);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "location" attribute
     */
    public void xsetLocation(org.apache.xmlbeans.XmlAnyURI location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(LOCATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(LOCATION$2);
            }
            target.set(location);
        }
    }
    
    /**
     * Gets the "replace" attribute
     */
    public boolean getReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPLACE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "replace" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPLACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(REPLACE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "replace" attribute
     */
    public boolean isSetReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPLACE$4) != null;
        }
    }
    
    /**
     * Sets the "replace" attribute
     */
    public void setReplace(boolean replace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPLACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPLACE$4);
            }
            target.setBooleanValue(replace);
        }
    }
    
    /**
     * Sets (as xml) the "replace" attribute
     */
    public void xsetReplace(org.apache.xmlbeans.XmlBoolean replace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REPLACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REPLACE$4);
            }
            target.set(replace);
        }
    }
    
    /**
     * Unsets the "replace" attribute
     */
    public void unsetReplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPLACE$4);
        }
    }
}
