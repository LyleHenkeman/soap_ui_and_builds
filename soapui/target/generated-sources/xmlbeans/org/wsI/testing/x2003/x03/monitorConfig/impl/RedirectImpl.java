/*
 * XML Type:  redirect
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.Redirect
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig.impl;
/**
 * An XML redirect(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public class RedirectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.monitorConfig.Redirect
{
    private static final long serialVersionUID = 1L;
    
    public RedirectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "comment");
    private static final javax.xml.namespace.QName LISTENPORT$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "listenPort");
    private static final javax.xml.namespace.QName SCHEMEANDHOSTPORT$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "schemeAndHostPort");
    private static final javax.xml.namespace.QName MAXCONNECTIONS$6 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "maxConnections");
    private static final javax.xml.namespace.QName READTIMEOUTSECONDS$8 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/monitorConfig/", "readTimeoutSeconds");
    
    
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
     * Gets the "listenPort" element
     */
    public int getListenPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTENPORT$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "listenPort" element
     */
    public org.apache.xmlbeans.XmlInt xgetListenPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LISTENPORT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "listenPort" element
     */
    public void setListenPort(int listenPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTENPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTENPORT$2);
            }
            target.setIntValue(listenPort);
        }
    }
    
    /**
     * Sets (as xml) the "listenPort" element
     */
    public void xsetListenPort(org.apache.xmlbeans.XmlInt listenPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LISTENPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LISTENPORT$2);
            }
            target.set(listenPort);
        }
    }
    
    /**
     * Gets the "schemeAndHostPort" element
     */
    public java.lang.String getSchemeAndHostPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMEANDHOSTPORT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemeAndHostPort" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSchemeAndHostPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SCHEMEANDHOSTPORT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "schemeAndHostPort" element
     */
    public void setSchemeAndHostPort(java.lang.String schemeAndHostPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEMEANDHOSTPORT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEMEANDHOSTPORT$4);
            }
            target.setStringValue(schemeAndHostPort);
        }
    }
    
    /**
     * Sets (as xml) the "schemeAndHostPort" element
     */
    public void xsetSchemeAndHostPort(org.apache.xmlbeans.XmlAnyURI schemeAndHostPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SCHEMEANDHOSTPORT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SCHEMEANDHOSTPORT$4);
            }
            target.set(schemeAndHostPort);
        }
    }
    
    /**
     * Gets the "maxConnections" element
     */
    public int getMaxConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXCONNECTIONS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxConnections" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaxConnections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXCONNECTIONS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maxConnections" element
     */
    public void setMaxConnections(int maxConnections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXCONNECTIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXCONNECTIONS$6);
            }
            target.setIntValue(maxConnections);
        }
    }
    
    /**
     * Sets (as xml) the "maxConnections" element
     */
    public void xsetMaxConnections(org.apache.xmlbeans.XmlInt maxConnections)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXCONNECTIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXCONNECTIONS$6);
            }
            target.set(maxConnections);
        }
    }
    
    /**
     * Gets the "readTimeoutSeconds" element
     */
    public int getReadTimeoutSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(READTIMEOUTSECONDS$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "readTimeoutSeconds" element
     */
    public org.apache.xmlbeans.XmlInt xgetReadTimeoutSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(READTIMEOUTSECONDS$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "readTimeoutSeconds" element
     */
    public void setReadTimeoutSeconds(int readTimeoutSeconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(READTIMEOUTSECONDS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(READTIMEOUTSECONDS$8);
            }
            target.setIntValue(readTimeoutSeconds);
        }
    }
    
    /**
     * Sets (as xml) the "readTimeoutSeconds" element
     */
    public void xsetReadTimeoutSeconds(org.apache.xmlbeans.XmlInt readTimeoutSeconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(READTIMEOUTSECONDS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(READTIMEOUTSECONDS$8);
            }
            target.set(readTimeoutSeconds);
        }
    }
}
