/*
 * XML Type:  RestRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestRequestConfigImpl extends com.eviware.soapui.config.impl.AbstractRequestConfigImpl implements com.eviware.soapui.config.RestRequestConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestRequestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    private static final javax.xml.namespace.QName PARAMETERORDER$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameterOrder");
    private static final javax.xml.namespace.QName WADLID$4 = 
        new javax.xml.namespace.QName("", "wadlId");
    private static final javax.xml.namespace.QName FULLPATH$6 = 
        new javax.xml.namespace.QName("", "fullPath");
    private static final javax.xml.namespace.QName MEDIATYPE$8 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName POSTQUERYSTRING$10 = 
        new javax.xml.namespace.QName("", "postQueryString");
    private static final javax.xml.namespace.QName ACCEPT$12 = 
        new javax.xml.namespace.QName("", "accept");
    private static final javax.xml.namespace.QName MULTIVALUEDELIMITER$14 = 
        new javax.xml.namespace.QName("", "multiValueDelimiter");
    
    
    /**
     * Gets the "parameters" element
     */
    public com.eviware.soapui.config.StringToStringMapConfig getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().find_element_user(PARAMETERS$0, 0);
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
    public void setParameters(com.eviware.soapui.config.StringToStringMapConfig parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public com.eviware.soapui.config.StringToStringMapConfig addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringToStringMapConfig target = null;
            target = (com.eviware.soapui.config.StringToStringMapConfig)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "parameterOrder" element
     */
    public com.eviware.soapui.config.StringListConfig getParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(PARAMETERORDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "parameterOrder" element
     */
    public boolean isSetParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERORDER$2) != 0;
        }
    }
    
    /**
     * Sets the "parameterOrder" element
     */
    public void setParameterOrder(com.eviware.soapui.config.StringListConfig parameterOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(PARAMETERORDER$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(PARAMETERORDER$2);
            }
            target.set(parameterOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "parameterOrder" element
     */
    public com.eviware.soapui.config.StringListConfig addNewParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(PARAMETERORDER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "parameterOrder" element
     */
    public void unsetParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERORDER$2, 0);
        }
    }
    
    /**
     * Gets the "wadlId" attribute
     */
    public java.lang.String getWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wadlId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$4);
            return target;
        }
    }
    
    /**
     * True if has "wadlId" attribute
     */
    public boolean isSetWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WADLID$4) != null;
        }
    }
    
    /**
     * Sets the "wadlId" attribute
     */
    public void setWadlId(java.lang.String wadlId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WADLID$4);
            }
            target.setStringValue(wadlId);
        }
    }
    
    /**
     * Sets (as xml) the "wadlId" attribute
     */
    public void xsetWadlId(org.apache.xmlbeans.XmlString wadlId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WADLID$4);
            }
            target.set(wadlId);
        }
    }
    
    /**
     * Unsets the "wadlId" attribute
     */
    public void unsetWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WADLID$4);
        }
    }
    
    /**
     * Gets the "fullPath" attribute
     */
    public java.lang.String getFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPATH$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullPath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLPATH$6);
            return target;
        }
    }
    
    /**
     * True if has "fullPath" attribute
     */
    public boolean isSetFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLPATH$6) != null;
        }
    }
    
    /**
     * Sets the "fullPath" attribute
     */
    public void setFullPath(java.lang.String fullPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLPATH$6);
            }
            target.setStringValue(fullPath);
        }
    }
    
    /**
     * Sets (as xml) the "fullPath" attribute
     */
    public void xsetFullPath(org.apache.xmlbeans.XmlString fullPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FULLPATH$6);
            }
            target.set(fullPath);
        }
    }
    
    /**
     * Unsets the "fullPath" attribute
     */
    public void unsetFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLPATH$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$8);
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
            return get_store().find_attribute_user(MEDIATYPE$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIATYPE$8);
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
            get_store().remove_attribute(MEDIATYPE$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTQUERYSTRING$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(POSTQUERYSTRING$10);
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
            return get_store().find_attribute_user(POSTQUERYSTRING$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTQUERYSTRING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTQUERYSTRING$10);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(POSTQUERYSTRING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(POSTQUERYSTRING$10);
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
            get_store().remove_attribute(POSTQUERYSTRING$10);
        }
    }
    
    /**
     * Gets the "accept" attribute
     */
    public java.lang.String getAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCEPT$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accept" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACCEPT$12);
            return target;
        }
    }
    
    /**
     * True if has "accept" attribute
     */
    public boolean isSetAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCEPT$12) != null;
        }
    }
    
    /**
     * Sets the "accept" attribute
     */
    public void setAccept(java.lang.String accept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCEPT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCEPT$12);
            }
            target.setStringValue(accept);
        }
    }
    
    /**
     * Sets (as xml) the "accept" attribute
     */
    public void xsetAccept(org.apache.xmlbeans.XmlString accept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACCEPT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACCEPT$12);
            }
            target.set(accept);
        }
    }
    
    /**
     * Unsets the "accept" attribute
     */
    public void unsetAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCEPT$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIVALUEDELIMITER$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MULTIVALUEDELIMITER$14);
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
            return get_store().find_attribute_user(MULTIVALUEDELIMITER$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIVALUEDELIMITER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MULTIVALUEDELIMITER$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MULTIVALUEDELIMITER$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MULTIVALUEDELIMITER$14);
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
            get_store().remove_attribute(MULTIVALUEDELIMITER$14);
        }
    }
}
