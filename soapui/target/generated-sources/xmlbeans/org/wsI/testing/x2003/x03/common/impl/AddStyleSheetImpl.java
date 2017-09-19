/*
 * XML Type:  addStyleSheet
 * Namespace: http://www.ws-i.org/testing/2003/03/common/
 * Java type: org.wsI.testing.x2003.x03.common.AddStyleSheet
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.common.impl;
/**
 * An XML addStyleSheet(@http://www.ws-i.org/testing/2003/03/common/).
 *
 * This is a complex type.
 */
public class AddStyleSheetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.common.AddStyleSheet
{
    private static final long serialVersionUID = 1L;
    
    public AddStyleSheetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HREF$0 = 
        new javax.xml.namespace.QName("", "href");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName TITLE$4 = 
        new javax.xml.namespace.QName("", "title");
    private static final javax.xml.namespace.QName MEDIA$6 = 
        new javax.xml.namespace.QName("", "media");
    private static final javax.xml.namespace.QName CHARSET$8 = 
        new javax.xml.namespace.QName("", "charset");
    private static final javax.xml.namespace.QName ALTERNATE$10 = 
        new javax.xml.namespace.QName("", "alternate");
    
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$0);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$0);
            }
            target.set(href);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$4);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$4) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$4);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$4);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$4);
        }
    }
    
    /**
     * Gets the "media" attribute
     */
    public java.lang.String getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIA$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "media" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIA$6);
            return target;
        }
    }
    
    /**
     * True if has "media" attribute
     */
    public boolean isSetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIA$6) != null;
        }
    }
    
    /**
     * Sets the "media" attribute
     */
    public void setMedia(java.lang.String media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIA$6);
            }
            target.setStringValue(media);
        }
    }
    
    /**
     * Sets (as xml) the "media" attribute
     */
    public void xsetMedia(org.apache.xmlbeans.XmlString media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIA$6);
            }
            target.set(media);
        }
    }
    
    /**
     * Unsets the "media" attribute
     */
    public void unsetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIA$6);
        }
    }
    
    /**
     * Gets the "charset" attribute
     */
    public java.lang.String getCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSET$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "charset" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHARSET$8);
            return target;
        }
    }
    
    /**
     * True if has "charset" attribute
     */
    public boolean isSetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHARSET$8) != null;
        }
    }
    
    /**
     * Sets the "charset" attribute
     */
    public void setCharset(java.lang.String charset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHARSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHARSET$8);
            }
            target.setStringValue(charset);
        }
    }
    
    /**
     * Sets (as xml) the "charset" attribute
     */
    public void xsetCharset(org.apache.xmlbeans.XmlString charset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHARSET$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHARSET$8);
            }
            target.set(charset);
        }
    }
    
    /**
     * Unsets the "charset" attribute
     */
    public void unsetCharset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHARSET$8);
        }
    }
    
    /**
     * Gets the "alternate" attribute
     */
    public boolean getAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTERNATE$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "alternate" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALTERNATE$10);
            return target;
        }
    }
    
    /**
     * True if has "alternate" attribute
     */
    public boolean isSetAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALTERNATE$10) != null;
        }
    }
    
    /**
     * Sets the "alternate" attribute
     */
    public void setAlternate(boolean alternate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTERNATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTERNATE$10);
            }
            target.setBooleanValue(alternate);
        }
    }
    
    /**
     * Sets (as xml) the "alternate" attribute
     */
    public void xsetAlternate(org.apache.xmlbeans.XmlBoolean alternate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALTERNATE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALTERNATE$10);
            }
            target.set(alternate);
        }
    }
    
    /**
     * Unsets the "alternate" attribute
     */
    public void unsetAlternate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALTERNATE$10);
        }
    }
}
