/*
 * XML Type:  uddiReference
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.UddiReference
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML uddiReference(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is a complex type.
 */
public class UddiReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.analyzerConfig.UddiReference
{
    private static final long serialVersionUID = 1L;
    
    public UddiReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UDDIKEY$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "uddiKey");
    private static final javax.xml.namespace.QName INQUIRYURL$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "inquiryURL");
    private static final javax.xml.namespace.QName WSDLELEMENT$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "wsdlElement");
    private static final javax.xml.namespace.QName SERVICELOCATION$6 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "serviceLocation");
    
    
    /**
     * Gets the "uddiKey" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.UddiKey getUddiKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiKey target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey)get_store().find_element_user(UDDIKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "uddiKey" element
     */
    public void setUddiKey(org.wsI.testing.x2003.x03.analyzerConfig.UddiKey uddiKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiKey target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey)get_store().find_element_user(UDDIKEY$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey)get_store().add_element_user(UDDIKEY$0);
            }
            target.set(uddiKey);
        }
    }
    
    /**
     * Appends and returns a new empty "uddiKey" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.UddiKey addNewUddiKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiKey target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey)get_store().add_element_user(UDDIKEY$0);
            return target;
        }
    }
    
    /**
     * Gets the "inquiryURL" element
     */
    public java.lang.String getInquiryURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INQUIRYURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inquiryURL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetInquiryURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INQUIRYURL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "inquiryURL" element
     */
    public void setInquiryURL(java.lang.String inquiryURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INQUIRYURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INQUIRYURL$2);
            }
            target.setStringValue(inquiryURL);
        }
    }
    
    /**
     * Sets (as xml) the "inquiryURL" element
     */
    public void xsetInquiryURL(org.apache.xmlbeans.XmlAnyURI inquiryURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(INQUIRYURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(INQUIRYURL$2);
            }
            target.set(inquiryURL);
        }
    }
    
    /**
     * Gets the "wsdlElement" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference getWsdlElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().find_element_user(WSDLELEMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdlElement" element
     */
    public boolean isSetWsdlElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLELEMENT$4) != 0;
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
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().find_element_user(WSDLELEMENT$4, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().add_element_user(WSDLELEMENT$4);
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
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference)get_store().add_element_user(WSDLELEMENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdlElement" element
     */
    public void unsetWsdlElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLELEMENT$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICELOCATION$6, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SERVICELOCATION$6, 0);
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
            return get_store().count_elements(SERVICELOCATION$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICELOCATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICELOCATION$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SERVICELOCATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SERVICELOCATION$6);
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
            get_store().remove_element(SERVICELOCATION$6, 0);
        }
    }
}
