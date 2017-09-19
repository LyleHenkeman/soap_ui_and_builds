/*
 * XML Type:  tHeaderFault
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.THeaderFault
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * An XML tHeaderFault(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public class THeaderFaultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.xmlsoap.schemas.wsdl.soap.THeaderFault
{
    private static final long serialVersionUID = 1L;
    
    public THeaderFaultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("", "message");
    private static final javax.xml.namespace.QName PART$2 = 
        new javax.xml.namespace.QName("", "part");
    private static final javax.xml.namespace.QName USE$4 = 
        new javax.xml.namespace.QName("", "use");
    private static final javax.xml.namespace.QName ENCODINGSTYLE$6 = 
        new javax.xml.namespace.QName("", "encodingStyle");
    private static final javax.xml.namespace.QName NAMESPACE$8 = 
        new javax.xml.namespace.QName("", "namespace");
    
    
    /**
     * Gets the "message" attribute
     */
    public javax.xml.namespace.QName getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGE$0);
            return target;
        }
    }
    
    /**
     * Sets the "message" attribute
     */
    public void setMessage(javax.xml.namespace.QName message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$0);
            }
            target.setQNameValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" attribute
     */
    public void xsetMessage(org.apache.xmlbeans.XmlQName message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(MESSAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(MESSAGE$0);
            }
            target.set(message);
        }
    }
    
    /**
     * Gets the "part" attribute
     */
    public java.lang.String getPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "part" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PART$2);
            return target;
        }
    }
    
    /**
     * Sets the "part" attribute
     */
    public void setPart(java.lang.String part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PART$2);
            }
            target.setStringValue(part);
        }
    }
    
    /**
     * Sets (as xml) the "part" attribute
     */
    public void xsetPart(org.apache.xmlbeans.XmlNMTOKEN part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(PART$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(PART$2);
            }
            target.set(part);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$4);
            if (target == null)
            {
                return null;
            }
            return (org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.UseChoice xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.UseChoice target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.UseChoice)get_store().find_attribute_user(USE$4);
            return target;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$4);
            }
            target.setEnumValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(org.xmlsoap.schemas.wsdl.soap.UseChoice use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.UseChoice target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.UseChoice)get_store().find_attribute_user(USE$4);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.UseChoice)get_store().add_attribute_user(USE$4);
            }
            target.set(use);
        }
    }
    
    /**
     * Gets the "encodingStyle" attribute
     */
    public java.util.List getEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$6);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    public org.xmlsoap.schemas.wsdl.soap.EncodingStyle xgetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.EncodingStyle target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$6);
            return target;
        }
    }
    
    /**
     * True if has "encodingStyle" attribute
     */
    public boolean isSetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCODINGSTYLE$6) != null;
        }
    }
    
    /**
     * Sets the "encodingStyle" attribute
     */
    public void setEncodingStyle(java.util.List encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGSTYLE$6);
            }
            target.setListValue(encodingStyle);
        }
    }
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    public void xsetEncodingStyle(org.xmlsoap.schemas.wsdl.soap.EncodingStyle encodingStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.soap.EncodingStyle target = null;
            target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$6);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().add_attribute_user(ENCODINGSTYLE$6);
            }
            target.set(encodingStyle);
        }
    }
    
    /**
     * Unsets the "encodingStyle" attribute
     */
    public void unsetEncodingStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCODINGSTYLE$6);
        }
    }
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$8);
            return target;
        }
    }
    
    /**
     * True if has "namespace" attribute
     */
    public boolean isSetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMESPACE$8) != null;
        }
    }
    
    /**
     * Sets the "namespace" attribute
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$8);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$8);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Unsets the "namespace" attribute
     */
    public void unsetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMESPACE$8);
        }
    }
}
