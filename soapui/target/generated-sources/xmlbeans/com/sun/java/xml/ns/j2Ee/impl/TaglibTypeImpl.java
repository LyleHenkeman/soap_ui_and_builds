/*
 * XML Type:  taglibType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.TaglibType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML taglibType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class TaglibTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.TaglibType
{
    private static final long serialVersionUID = 1L;
    
    public TaglibTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAGLIBURI$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "taglib-uri");
    private static final javax.xml.namespace.QName TAGLIBLOCATION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "taglib-location");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "taglib-uri" element
     */
    public com.sun.java.xml.ns.j2Ee.String getTaglibUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(TAGLIBURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taglib-uri" element
     */
    public void setTaglibUri(com.sun.java.xml.ns.j2Ee.String taglibUri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(TAGLIBURI$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(TAGLIBURI$0);
            }
            target.set(taglibUri);
        }
    }
    
    /**
     * Appends and returns a new empty "taglib-uri" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewTaglibUri()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(TAGLIBURI$0);
            return target;
        }
    }
    
    /**
     * Gets the "taglib-location" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType getTaglibLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(TAGLIBLOCATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "taglib-location" element
     */
    public void setTaglibLocation(com.sun.java.xml.ns.j2Ee.PathType taglibLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(TAGLIBLOCATION$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(TAGLIBLOCATION$2);
            }
            target.set(taglibLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "taglib-location" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType addNewTaglibLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(TAGLIBLOCATION$2);
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
