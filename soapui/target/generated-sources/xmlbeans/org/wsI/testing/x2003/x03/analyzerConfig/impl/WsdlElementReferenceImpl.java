/*
 * XML Type:  wsdlElementReference
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML wsdlElementReference(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference.
 */
public class WsdlElementReferenceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference
{
    private static final long serialVersionUID = 1L;
    
    public WsdlElementReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected WsdlElementReferenceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName NAMESPACE$2 = 
        new javax.xml.namespace.QName("", "namespace");
    private static final javax.xml.namespace.QName PARENTELEMENTNAME$4 = 
        new javax.xml.namespace.QName("", "parentElementName");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$2);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$2);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$2);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Gets the "parentElementName" attribute
     */
    public java.lang.String getParentElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENTELEMENTNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parentElementName" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetParentElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PARENTELEMENTNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "parentElementName" attribute
     */
    public boolean isSetParentElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARENTELEMENTNAME$4) != null;
        }
    }
    
    /**
     * Sets the "parentElementName" attribute
     */
    public void setParentElementName(java.lang.String parentElementName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENTELEMENTNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENTELEMENTNAME$4);
            }
            target.setStringValue(parentElementName);
        }
    }
    
    /**
     * Sets (as xml) the "parentElementName" attribute
     */
    public void xsetParentElementName(org.apache.xmlbeans.XmlNCName parentElementName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PARENTELEMENTNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PARENTELEMENTNAME$4);
            }
            target.set(parentElementName);
        }
    }
    
    /**
     * Unsets the "parentElementName" attribute
     */
    public void unsetParentElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARENTELEMENTNAME$4);
        }
    }
}
