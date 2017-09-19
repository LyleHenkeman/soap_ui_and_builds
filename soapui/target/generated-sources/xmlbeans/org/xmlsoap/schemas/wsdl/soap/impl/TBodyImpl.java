/*
 * XML Type:  tBody
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.TBody
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap.impl;
/**
 * An XML tBody(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public class TBodyImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibilityElementImpl implements org.xmlsoap.schemas.wsdl.soap.TBody
{
    private static final long serialVersionUID = 1L;
    
    public TBodyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTS$0 = 
        new javax.xml.namespace.QName("", "parts");
    private static final javax.xml.namespace.QName ENCODINGSTYLE$2 = 
        new javax.xml.namespace.QName("", "encodingStyle");
    private static final javax.xml.namespace.QName USE$4 = 
        new javax.xml.namespace.QName("", "use");
    private static final javax.xml.namespace.QName NAMESPACE$6 = 
        new javax.xml.namespace.QName("", "namespace");
    
    
    /**
     * Gets the "parts" attribute
     */
    public java.util.List getParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTS$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "parts" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKENS xgetParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKENS target = null;
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(PARTS$0);
            return target;
        }
    }
    
    /**
     * True if has "parts" attribute
     */
    public boolean isSetParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTS$0) != null;
        }
    }
    
    /**
     * Sets the "parts" attribute
     */
    public void setParts(java.util.List parts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTS$0);
            }
            target.setListValue(parts);
        }
    }
    
    /**
     * Sets (as xml) the "parts" attribute
     */
    public void xsetParts(org.apache.xmlbeans.XmlNMTOKENS parts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKENS target = null;
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(PARTS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(PARTS$0);
            }
            target.set(parts);
        }
    }
    
    /**
     * Unsets the "parts" attribute
     */
    public void unsetParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTS$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$2);
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
            target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$2);
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
            return get_store().find_attribute_user(ENCODINGSTYLE$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGSTYLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGSTYLE$2);
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
            target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().find_attribute_user(ENCODINGSTYLE$2);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.wsdl.soap.EncodingStyle)get_store().add_attribute_user(ENCODINGSTYLE$2);
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
            get_store().remove_attribute(ENCODINGSTYLE$2);
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
     * True if has "use" attribute
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USE$4) != null;
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
     * Unsets the "use" attribute
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$6);
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
            return get_store().find_attribute_user(NAMESPACE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$6);
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
            get_store().remove_attribute(NAMESPACE$6);
        }
    }
}
