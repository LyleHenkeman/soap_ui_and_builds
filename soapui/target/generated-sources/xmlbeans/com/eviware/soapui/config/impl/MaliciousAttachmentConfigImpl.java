/*
 * XML Type:  MaliciousAttachment
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MaliciousAttachmentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MaliciousAttachment(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MaliciousAttachmentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MaliciousAttachmentConfig
{
    private static final long serialVersionUID = 1L;
    
    public MaliciousAttachmentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILENAME$0 = 
        new javax.xml.namespace.QName("", "filename");
    private static final javax.xml.namespace.QName SIZE$2 = 
        new javax.xml.namespace.QName("", "size");
    private static final javax.xml.namespace.QName CONTENTTYPE$4 = 
        new javax.xml.namespace.QName("", "contentType");
    private static final javax.xml.namespace.QName ENABLED$6 = 
        new javax.xml.namespace.QName("", "enabled");
    private static final javax.xml.namespace.QName CACHED$8 = 
        new javax.xml.namespace.QName("", "cached");
    
    
    /**
     * Gets the "filename" attribute
     */
    public java.lang.String getFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "filename" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$0);
            return target;
        }
    }
    
    /**
     * True if has "filename" attribute
     */
    public boolean isSetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILENAME$0) != null;
        }
    }
    
    /**
     * Sets the "filename" attribute
     */
    public void setFilename(java.lang.String filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILENAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILENAME$0);
            }
            target.setStringValue(filename);
        }
    }
    
    /**
     * Sets (as xml) the "filename" attribute
     */
    public void xsetFilename(org.apache.xmlbeans.XmlString filename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILENAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILENAME$0);
            }
            target.set(filename);
        }
    }
    
    /**
     * Unsets the "filename" attribute
     */
    public void unsetFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILENAME$0);
        }
    }
    
    /**
     * Gets the "size" attribute
     */
    public long getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" attribute
     */
    public org.apache.xmlbeans.XmlLong xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(SIZE$2);
            return target;
        }
    }
    
    /**
     * True if has "size" attribute
     */
    public boolean isSetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SIZE$2) != null;
        }
    }
    
    /**
     * Sets the "size" attribute
     */
    public void setSize(long size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$2);
            }
            target.setLongValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" attribute
     */
    public void xsetSize(org.apache.xmlbeans.XmlLong size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_attribute_user(SIZE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_attribute_user(SIZE$2);
            }
            target.set(size);
        }
    }
    
    /**
     * Unsets the "size" attribute
     */
    public void unsetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SIZE$2);
        }
    }
    
    /**
     * Gets the "contentType" attribute
     */
    public java.lang.String getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "contentType" attribute
     */
    public boolean isSetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTENTTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "contentType" attribute
     */
    public void setContentType(java.lang.String contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENTTYPE$4);
            }
            target.setStringValue(contentType);
        }
    }
    
    /**
     * Sets (as xml) the "contentType" attribute
     */
    public void xsetContentType(org.apache.xmlbeans.XmlString contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTENTTYPE$4);
            }
            target.set(contentType);
        }
    }
    
    /**
     * Unsets the "contentType" attribute
     */
    public void unsetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTENTTYPE$4);
        }
    }
    
    /**
     * Gets the "enabled" attribute
     */
    public boolean getEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$6);
            return target;
        }
    }
    
    /**
     * True if has "enabled" attribute
     */
    public boolean isSetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLED$6) != null;
        }
    }
    
    /**
     * Sets the "enabled" attribute
     */
    public void setEnabled(boolean enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLED$6);
            }
            target.setBooleanValue(enabled);
        }
    }
    
    /**
     * Sets (as xml) the "enabled" attribute
     */
    public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLED$6);
            }
            target.set(enabled);
        }
    }
    
    /**
     * Unsets the "enabled" attribute
     */
    public void unsetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLED$6);
        }
    }
    
    /**
     * Gets the "cached" attribute
     */
    public boolean getCached()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHED$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cached" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCached()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CACHED$8);
            return target;
        }
    }
    
    /**
     * True if has "cached" attribute
     */
    public boolean isSetCached()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHED$8) != null;
        }
    }
    
    /**
     * Sets the "cached" attribute
     */
    public void setCached(boolean cached)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHED$8);
            }
            target.setBooleanValue(cached);
        }
    }
    
    /**
     * Sets (as xml) the "cached" attribute
     */
    public void xsetCached(org.apache.xmlbeans.XmlBoolean cached)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CACHED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CACHED$8);
            }
            target.set(cached);
        }
    }
    
    /**
     * Unsets the "cached" attribute
     */
    public void unsetCached()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHED$8);
        }
    }
}
