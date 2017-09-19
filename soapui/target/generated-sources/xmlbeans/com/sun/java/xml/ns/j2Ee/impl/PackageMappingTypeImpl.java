/*
 * XML Type:  package-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.PackageMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML package-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class PackageMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.PackageMappingType
{
    private static final long serialVersionUID = 1L;
    
    public PackageMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGETYPE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "package-type");
    private static final javax.xml.namespace.QName NAMESPACEURI$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "namespaceURI");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "package-type" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getPackageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(PACKAGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "package-type" element
     */
    public void setPackageType(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType packageType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(PACKAGETYPE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(PACKAGETYPE$0);
            }
            target.set(packageType);
        }
    }
    
    /**
     * Appends and returns a new empty "package-type" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewPackageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(PACKAGETYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "namespaceURI" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdAnyURIType getNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().find_element_user(NAMESPACEURI$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "namespaceURI" element
     */
    public void setNamespaceURI(com.sun.java.xml.ns.j2Ee.XsdAnyURIType namespaceURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().find_element_user(NAMESPACEURI$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().add_element_user(NAMESPACEURI$2);
            }
            target.set(namespaceURI);
        }
    }
    
    /**
     * Appends and returns a new empty "namespaceURI" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdAnyURIType addNewNamespaceURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().add_element_user(NAMESPACEURI$2);
            return target;
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
}
