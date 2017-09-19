/*
 * XML Type:  configuration
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.Configuration
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig.impl;
/**
 * An XML configuration(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.monitorConfig.Configuration
{
    private static final long serialVersionUID = 1L;
    
    public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "comment");
    private static final javax.xml.namespace.QName LOGFILE$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "logFile");
    private static final javax.xml.namespace.QName LOGDURATION$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "logDuration");
    private static final javax.xml.namespace.QName CLEANUPTIMEOUTSECONDS$6 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "cleanupTimeoutSeconds");
    private static final javax.xml.namespace.QName MANINTHEMIDDLE$8 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "manInTheMiddle");
    
    
    /**
     * Gets the "comment" element
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "comment" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.Comment xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Comment target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Comment)get_store().find_element_user(COMMENT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "comment" element
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "comment" element
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$0);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "comment" element
     */
    public void xsetComment(org.wsI.testing.x2003.x03.monitorConfig.Comment comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.Comment target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.Comment)get_store().find_element_user(COMMENT$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.Comment)get_store().add_element_user(COMMENT$0);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "comment" element
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$0, 0);
        }
    }
    
    /**
     * Gets the "logFile" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.LogFile getLogFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.LogFile target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.LogFile)get_store().find_element_user(LOGFILE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "logFile" element
     */
    public void setLogFile(org.wsI.testing.x2003.x03.monitorConfig.LogFile logFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.LogFile target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.LogFile)get_store().find_element_user(LOGFILE$2, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.LogFile)get_store().add_element_user(LOGFILE$2);
            }
            target.set(logFile);
        }
    }
    
    /**
     * Appends and returns a new empty "logFile" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.LogFile addNewLogFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.LogFile target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.LogFile)get_store().add_element_user(LOGFILE$2);
            return target;
        }
    }
    
    /**
     * Gets the "logDuration" element
     */
    public int getLogDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGDURATION$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "logDuration" element
     */
    public org.apache.xmlbeans.XmlInt xgetLogDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LOGDURATION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "logDuration" element
     */
    public void setLogDuration(int logDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGDURATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGDURATION$4);
            }
            target.setIntValue(logDuration);
        }
    }
    
    /**
     * Sets (as xml) the "logDuration" element
     */
    public void xsetLogDuration(org.apache.xmlbeans.XmlInt logDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LOGDURATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LOGDURATION$4);
            }
            target.set(logDuration);
        }
    }
    
    /**
     * Gets the "cleanupTimeoutSeconds" element
     */
    public int getCleanupTimeoutSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEANUPTIMEOUTSECONDS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cleanupTimeoutSeconds" element
     */
    public org.apache.xmlbeans.XmlInt xgetCleanupTimeoutSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLEANUPTIMEOUTSECONDS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cleanupTimeoutSeconds" element
     */
    public void setCleanupTimeoutSeconds(int cleanupTimeoutSeconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLEANUPTIMEOUTSECONDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLEANUPTIMEOUTSECONDS$6);
            }
            target.setIntValue(cleanupTimeoutSeconds);
        }
    }
    
    /**
     * Sets (as xml) the "cleanupTimeoutSeconds" element
     */
    public void xsetCleanupTimeoutSeconds(org.apache.xmlbeans.XmlInt cleanupTimeoutSeconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLEANUPTIMEOUTSECONDS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CLEANUPTIMEOUTSECONDS$6);
            }
            target.set(cleanupTimeoutSeconds);
        }
    }
    
    /**
     * Gets the "manInTheMiddle" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect getManInTheMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect)get_store().find_element_user(MANINTHEMIDDLE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manInTheMiddle" element
     */
    public boolean isSetManInTheMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANINTHEMIDDLE$8) != 0;
        }
    }
    
    /**
     * Sets the "manInTheMiddle" element
     */
    public void setManInTheMiddle(org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect manInTheMiddle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect)get_store().find_element_user(MANINTHEMIDDLE$8, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect)get_store().add_element_user(MANINTHEMIDDLE$8);
            }
            target.set(manInTheMiddle);
        }
    }
    
    /**
     * Appends and returns a new empty "manInTheMiddle" element
     */
    public org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect addNewManInTheMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect target = null;
            target = (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect)get_store().add_element_user(MANINTHEMIDDLE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "manInTheMiddle" element
     */
    public void unsetManInTheMiddle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANINTHEMIDDLE$8, 0);
        }
    }
}
