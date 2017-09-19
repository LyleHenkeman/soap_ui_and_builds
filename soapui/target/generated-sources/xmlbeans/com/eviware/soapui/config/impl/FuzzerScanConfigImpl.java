/*
 * XML Type:  FuzzerScan
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.FuzzerScanConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML FuzzerScan(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class FuzzerScanConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.FuzzerScanConfig
{
    private static final long serialVersionUID = 1L;
    
    public FuzzerScanConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMAL$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "minimal");
    private static final javax.xml.namespace.QName MAXIMAL$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "maximal");
    private static final javax.xml.namespace.QName NUMBEROFREQUEST$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "numberOfRequest");
    
    
    /**
     * Gets the "minimal" element
     */
    public int getMinimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMAL$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minimal" element
     */
    public org.apache.xmlbeans.XmlInt xgetMinimal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINIMAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minimal" element
     */
    public void setMinimal(int minimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMAL$0);
            }
            target.setIntValue(minimal);
        }
    }
    
    /**
     * Sets (as xml) the "minimal" element
     */
    public void xsetMinimal(org.apache.xmlbeans.XmlInt minimal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINIMAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINIMAL$0);
            }
            target.set(minimal);
        }
    }
    
    /**
     * Gets the "maximal" element
     */
    public int getMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximal" element
     */
    public org.apache.xmlbeans.XmlInt xgetMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXIMAL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "maximal" element
     */
    public void setMaximal(int maximal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMAL$2);
            }
            target.setIntValue(maximal);
        }
    }
    
    /**
     * Sets (as xml) the "maximal" element
     */
    public void xsetMaximal(org.apache.xmlbeans.XmlInt maximal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAXIMAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAXIMAL$2);
            }
            target.set(maximal);
        }
    }
    
    /**
     * Gets the "numberOfRequest" element
     */
    public int getNumberOfRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFREQUEST$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberOfRequest" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFREQUEST$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numberOfRequest" element
     */
    public void setNumberOfRequest(int numberOfRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFREQUEST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFREQUEST$4);
            }
            target.setIntValue(numberOfRequest);
        }
    }
    
    /**
     * Sets (as xml) the "numberOfRequest" element
     */
    public void xsetNumberOfRequest(org.apache.xmlbeans.XmlInt numberOfRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFREQUEST$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFREQUEST$4);
            }
            target.set(numberOfRequest);
        }
    }
}
