/*
 * XML Type:  environment
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.Environment
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log.impl;
/**
 * An XML environment(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public class EnvironmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.log.Environment
{
    private static final long serialVersionUID = 1L;
    
    public EnvironmentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNTIME$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "runtime");
    private static final javax.xml.namespace.QName OPERATINGSYSTEM$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "operatingSystem");
    private static final javax.xml.namespace.QName XMLPARSER$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/log/", "xmlParser");
    
    
    /**
     * Gets the "runtime" element
     */
    public org.wsI.testing.x2003.x03.log.NameVersionPair getRuntime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().find_element_user(RUNTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "runtime" element
     */
    public void setRuntime(org.wsI.testing.x2003.x03.log.NameVersionPair runtime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().find_element_user(RUNTIME$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().add_element_user(RUNTIME$0);
            }
            target.set(runtime);
        }
    }
    
    /**
     * Appends and returns a new empty "runtime" element
     */
    public org.wsI.testing.x2003.x03.log.NameVersionPair addNewRuntime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().add_element_user(RUNTIME$0);
            return target;
        }
    }
    
    /**
     * Gets the "operatingSystem" element
     */
    public org.wsI.testing.x2003.x03.log.NameVersionPair getOperatingSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().find_element_user(OPERATINGSYSTEM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operatingSystem" element
     */
    public void setOperatingSystem(org.wsI.testing.x2003.x03.log.NameVersionPair operatingSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().find_element_user(OPERATINGSYSTEM$2, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().add_element_user(OPERATINGSYSTEM$2);
            }
            target.set(operatingSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "operatingSystem" element
     */
    public org.wsI.testing.x2003.x03.log.NameVersionPair addNewOperatingSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().add_element_user(OPERATINGSYSTEM$2);
            return target;
        }
    }
    
    /**
     * Gets the "xmlParser" element
     */
    public org.wsI.testing.x2003.x03.log.NameVersionPair getXmlParser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().find_element_user(XMLPARSER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "xmlParser" element
     */
    public void setXmlParser(org.wsI.testing.x2003.x03.log.NameVersionPair xmlParser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().find_element_user(XMLPARSER$4, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().add_element_user(XMLPARSER$4);
            }
            target.set(xmlParser);
        }
    }
    
    /**
     * Appends and returns a new empty "xmlParser" element
     */
    public org.wsI.testing.x2003.x03.log.NameVersionPair addNewXmlParser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.log.NameVersionPair target = null;
            target = (org.wsI.testing.x2003.x03.log.NameVersionPair)get_store().add_element_user(XMLPARSER$4);
            return target;
        }
    }
}
