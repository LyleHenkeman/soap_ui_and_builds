/*
 * XML Type:  Attachment
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AttachmentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Attachment(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class AttachmentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.AttachmentConfig
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName CONTENTTYPE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "contentType");
    private static final javax.xml.namespace.QName SIZE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "size");
    private static final javax.xml.namespace.QName TEMPFILENAME$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tempFilename");
    private static final javax.xml.namespace.QName CONTENTID$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "contentId");
    private static final javax.xml.namespace.QName PART$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "part");
    private static final javax.xml.namespace.QName URL$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "url");
    private static final javax.xml.namespace.QName DATA$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "data");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "id");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "contentType" element
     */
    public java.lang.String getContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentType" element
     */
    public org.apache.xmlbeans.XmlString xgetContentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contentType" element
     */
    public void setContentType(java.lang.String contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTTYPE$2);
            }
            target.setStringValue(contentType);
        }
    }
    
    /**
     * Sets (as xml) the "contentType" element
     */
    public void xsetContentType(org.apache.xmlbeans.XmlString contentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTTYPE$2);
            }
            target.set(contentType);
        }
    }
    
    /**
     * Gets the "size" element
     */
    public long getSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$4, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "size" element
     */
    public org.apache.xmlbeans.XmlLong xgetSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SIZE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "size" element
     */
    public void setSize(long size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$4);
            }
            target.setLongValue(size);
        }
    }
    
    /**
     * Sets (as xml) the "size" element
     */
    public void xsetSize(org.apache.xmlbeans.XmlLong size)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(SIZE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(SIZE$4);
            }
            target.set(size);
        }
    }
    
    /**
     * Gets the "tempFilename" element
     */
    public java.lang.String getTempFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPFILENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tempFilename" element
     */
    public org.apache.xmlbeans.XmlString xgetTempFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPFILENAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "tempFilename" element
     */
    public boolean isSetTempFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPFILENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "tempFilename" element
     */
    public void setTempFilename(java.lang.String tempFilename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPFILENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPFILENAME$6);
            }
            target.setStringValue(tempFilename);
        }
    }
    
    /**
     * Sets (as xml) the "tempFilename" element
     */
    public void xsetTempFilename(org.apache.xmlbeans.XmlString tempFilename)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPFILENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPFILENAME$6);
            }
            target.set(tempFilename);
        }
    }
    
    /**
     * Unsets the "tempFilename" element
     */
    public void unsetTempFilename()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPFILENAME$6, 0);
        }
    }
    
    /**
     * Gets the "contentId" element
     */
    public java.lang.String getContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentId" element
     */
    public org.apache.xmlbeans.XmlString xgetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "contentId" element
     */
    public boolean isSetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTID$8) != 0;
        }
    }
    
    /**
     * Sets the "contentId" element
     */
    public void setContentId(java.lang.String contentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTID$8);
            }
            target.setStringValue(contentId);
        }
    }
    
    /**
     * Sets (as xml) the "contentId" element
     */
    public void xsetContentId(org.apache.xmlbeans.XmlString contentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTID$8);
            }
            target.set(contentId);
        }
    }
    
    /**
     * Unsets the "contentId" element
     */
    public void unsetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTID$8, 0);
        }
    }
    
    /**
     * Gets the "part" element
     */
    public java.lang.String getPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PART$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "part" element
     */
    public org.apache.xmlbeans.XmlString xgetPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PART$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "part" element
     */
    public void setPart(java.lang.String part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PART$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PART$10);
            }
            target.setStringValue(part);
        }
    }
    
    /**
     * Sets (as xml) the "part" element
     */
    public void xsetPart(org.apache.xmlbeans.XmlString part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PART$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PART$10);
            }
            target.set(part);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$12) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$12);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$12);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$12, 0);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public byte[] getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "data" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DATA$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$14) != 0;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(byte[] data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$14);
            }
            target.setByteArrayValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlBase64Binary data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DATA$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DATA$14);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$14, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$16);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$16);
            }
            target.set(id);
        }
    }
}
