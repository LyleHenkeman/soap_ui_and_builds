/*
 * XML Type:  RESTMockResponse
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RESTMockResponseConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RESTMockResponse(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RESTMockResponseConfigImpl extends com.eviware.soapui.config.impl.BaseMockResponseConfigImpl implements com.eviware.soapui.config.RESTMockResponseConfig
{
    private static final long serialVersionUID = 1L;
    
    public RESTMockResponseConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPE$0 = 
        new javax.xml.namespace.QName("", "mediaType");
    
    
    /**
     * Gets the "mediaType" attribute
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "mediaType" attribute
     */
    public boolean isSetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIATYPE$0) != null;
        }
    }
    
    /**
     * Sets the "mediaType" attribute
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$0);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIATYPE$0);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Unsets the "mediaType" attribute
     */
    public void unsetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIATYPE$0);
        }
    }
}
