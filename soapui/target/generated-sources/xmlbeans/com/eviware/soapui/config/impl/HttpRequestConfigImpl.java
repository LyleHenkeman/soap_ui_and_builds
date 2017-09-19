/*
 * XML Type:  HttpRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.HttpRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML HttpRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class HttpRequestConfigImpl extends com.eviware.soapui.config.impl.AbstractRequestConfigImpl implements com.eviware.soapui.config.HttpRequestConfig
{
    private static final long serialVersionUID = 1L;
    
    public HttpRequestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    private static final javax.xml.namespace.QName MEDIATYPE$2 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName METHOD$4 = 
        new javax.xml.namespace.QName("", "method");
    private static final javax.xml.namespace.QName POSTQUERYSTRING$6 = 
        new javax.xml.namespace.QName("", "postQueryString");
    private static final javax.xml.namespace.QName DOWNLOADINCLUDEDRESOURCES$8 = 
        new javax.xml.namespace.QName("", "downloadIncludedResources");
    private static final javax.xml.namespace.QName MULTIVALUEDELIMITER$10 = 
        new javax.xml.namespace.QName("", "multiValueDelimiter");
    
    
    /**
     * Gets the "parameters" element
     */
    public com.eviware.soapui.config.RestParametersConfig getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameters" element
     */
    public void setParameters(com.eviware.soapui.config.RestParametersConfig parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RestParametersConfig)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public com.eviware.soapui.config.RestParametersConfig addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "mediaType" attribute
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$2);
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
            return get_store().find_attribute_user(MEDIATYPE$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIATYPE$2);
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
            get_store().remove_attribute(MEDIATYPE$2);
        }
    }
    
    /**
     * Gets the "method" attribute
     */
    public java.lang.String getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$4) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(java.lang.String method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$4);
            }
            target.setStringValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(org.apache.xmlbeans.XmlString method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$4);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$4);
        }
    }
    
    /**
     * Gets the "postQueryString" attribute
     */
    public boolean getPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTQUERYSTRING$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "postQueryString" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(POSTQUERYSTRING$6);
            return target;
        }
    }
    
    /**
     * True if has "postQueryString" attribute
     */
    public boolean isSetPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTQUERYSTRING$6) != null;
        }
    }
    
    /**
     * Sets the "postQueryString" attribute
     */
    public void setPostQueryString(boolean postQueryString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTQUERYSTRING$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTQUERYSTRING$6);
            }
            target.setBooleanValue(postQueryString);
        }
    }
    
    /**
     * Sets (as xml) the "postQueryString" attribute
     */
    public void xsetPostQueryString(org.apache.xmlbeans.XmlBoolean postQueryString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(POSTQUERYSTRING$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(POSTQUERYSTRING$6);
            }
            target.set(postQueryString);
        }
    }
    
    /**
     * Unsets the "postQueryString" attribute
     */
    public void unsetPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTQUERYSTRING$6);
        }
    }
    
    /**
     * Gets the "downloadIncludedResources" attribute
     */
    public boolean getDownloadIncludedResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOWNLOADINCLUDEDRESOURCES$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "downloadIncludedResources" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDownloadIncludedResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DOWNLOADINCLUDEDRESOURCES$8);
            return target;
        }
    }
    
    /**
     * True if has "downloadIncludedResources" attribute
     */
    public boolean isSetDownloadIncludedResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOWNLOADINCLUDEDRESOURCES$8) != null;
        }
    }
    
    /**
     * Sets the "downloadIncludedResources" attribute
     */
    public void setDownloadIncludedResources(boolean downloadIncludedResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOWNLOADINCLUDEDRESOURCES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOWNLOADINCLUDEDRESOURCES$8);
            }
            target.setBooleanValue(downloadIncludedResources);
        }
    }
    
    /**
     * Sets (as xml) the "downloadIncludedResources" attribute
     */
    public void xsetDownloadIncludedResources(org.apache.xmlbeans.XmlBoolean downloadIncludedResources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DOWNLOADINCLUDEDRESOURCES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DOWNLOADINCLUDEDRESOURCES$8);
            }
            target.set(downloadIncludedResources);
        }
    }
    
    /**
     * Unsets the "downloadIncludedResources" attribute
     */
    public void unsetDownloadIncludedResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOWNLOADINCLUDEDRESOURCES$8);
        }
    }
    
    /**
     * Gets the "multiValueDelimiter" attribute
     */
    public java.lang.String getMultiValueDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIVALUEDELIMITER$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "multiValueDelimiter" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMultiValueDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MULTIVALUEDELIMITER$10);
            return target;
        }
    }
    
    /**
     * True if has "multiValueDelimiter" attribute
     */
    public boolean isSetMultiValueDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MULTIVALUEDELIMITER$10) != null;
        }
    }
    
    /**
     * Sets the "multiValueDelimiter" attribute
     */
    public void setMultiValueDelimiter(java.lang.String multiValueDelimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIVALUEDELIMITER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MULTIVALUEDELIMITER$10);
            }
            target.setStringValue(multiValueDelimiter);
        }
    }
    
    /**
     * Sets (as xml) the "multiValueDelimiter" attribute
     */
    public void xsetMultiValueDelimiter(org.apache.xmlbeans.XmlString multiValueDelimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MULTIVALUEDELIMITER$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MULTIVALUEDELIMITER$10);
            }
            target.set(multiValueDelimiter);
        }
    }
    
    /**
     * Unsets the "multiValueDelimiter" attribute
     */
    public void unsetMultiValueDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MULTIVALUEDELIMITER$10);
        }
    }
}
