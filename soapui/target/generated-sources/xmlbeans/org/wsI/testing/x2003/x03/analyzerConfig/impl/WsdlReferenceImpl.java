/*
 * XML Type:  wsdlReference
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML wsdlReference(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is a complex type.
 */
public class WsdlReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference
{
    private static final long serialVersionUID = 1L;
    
    public WsdlReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WSDLELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "wsdlElement");
    private static final javax.xml.namespace.QName WSDLURI$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "wsdlURI");
    private static final javax.xml.namespace.QName SERVICELOCATION$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "serviceLocation");
    
    
    /**
     * Gets the "wsdlElement" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference getWsdlElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().find_element_user(WSDLELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "wsdlElement" element
     */
    public void setWsdlElement(org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference wsdlElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().find_element_user(WSDLELEMENT$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().add_element_user(WSDLELEMENT$0);
            }
            target.set(wsdlElement);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdlElement" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference addNewWsdlElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().add_element_user(WSDLELEMENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "wsdlURI" element
     */
    public java.lang.String getWsdlURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLURI$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsdlURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWsdlURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLURI$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "wsdlURI" element
     */
    public void setWsdlURI(java.lang.String wsdlURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLURI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSDLURI$2);
            }
            target.setStringValue(wsdlURI);
        }
    }
    
    /**
     * Sets (as xml) the "wsdlURI" element
     */
    public void xsetWsdlURI(org.apache.xmlbeans.XmlAnyURI wsdlURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLURI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WSDLURI$2);
            }
            target.set(wsdlURI);
        }
    }
    
    /**
     * Gets the "serviceLocation" element
     */
    public java.lang.String getServiceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICELOCATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetServiceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SERVICELOCATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "serviceLocation" element
     */
    public boolean isSetServiceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICELOCATION$4) != 0;
        }
    }
    
    /**
     * Sets the "serviceLocation" element
     */
    public void setServiceLocation(java.lang.String serviceLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICELOCATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICELOCATION$4);
            }
            target.setStringValue(serviceLocation);
        }
    }
    
    /**
     * Sets (as xml) the "serviceLocation" element
     */
    public void xsetServiceLocation(org.apache.xmlbeans.XmlAnyURI serviceLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SERVICELOCATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SERVICELOCATION$4);
            }
            target.set(serviceLocation);
        }
    }
    
    /**
     * Unsets the "serviceLocation" element
     */
    public void unsetServiceLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICELOCATION$4, 0);
        }
    }
}
