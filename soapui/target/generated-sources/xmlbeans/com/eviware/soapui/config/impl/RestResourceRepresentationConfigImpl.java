/*
 * XML Type:  RestResourceRepresentation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestResourceRepresentationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestResourceRepresentation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestResourceRepresentationConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RestResourceRepresentationConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestResourceRepresentationConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATYPE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mediaType");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "status");
    private static final javax.xml.namespace.QName PARAMS$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "params");
    private static final javax.xml.namespace.QName ELEMENT$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "element");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "description");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "mediaType" element
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" element
     */
    public org.apache.xmlbeans.XmlString xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediaType" element
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATYPE$0);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" element
     */
    public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATYPE$0);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.util.List getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public com.eviware.soapui.config.StatusCodesTypeConfig xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StatusCodesTypeConfig target = null;
            target = (com.eviware.soapui.config.StatusCodesTypeConfig)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.util.List status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setListValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(com.eviware.soapui.config.StatusCodesTypeConfig status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StatusCodesTypeConfig target = null;
            target = (com.eviware.soapui.config.StatusCodesTypeConfig)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StatusCodesTypeConfig)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "params" element
     */
    public com.eviware.soapui.config.RestParametersConfig getParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().find_element_user(PARAMS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "params" element
     */
    public void setParams(com.eviware.soapui.config.RestParametersConfig params)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().find_element_user(PARAMS$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RestParametersConfig)get_store().add_element_user(PARAMS$4);
            }
            target.set(params);
        }
    }
    
    /**
     * Appends and returns a new empty "params" element
     */
    public com.eviware.soapui.config.RestParametersConfig addNewParams()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().add_element_user(PARAMS$4);
            return target;
        }
    }
    
    /**
     * Gets the "element" element
     */
    public javax.xml.namespace.QName getElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "element" element
     */
    public org.apache.xmlbeans.XmlQName xgetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(ELEMENT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "element" element
     */
    public void setElement(javax.xml.namespace.QName element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENT$6);
            }
            target.setQNameValue(element);
        }
    }
    
    /**
     * Sets (as xml) the "element" element
     */
    public void xsetElement(org.apache.xmlbeans.XmlQName element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(ELEMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(ELEMENT$6);
            }
            target.set(element);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public com.eviware.soapui.config.RestResourceRepresentationTypeConfig.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.RestResourceRepresentationTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public com.eviware.soapui.config.RestResourceRepresentationTypeConfig xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationTypeConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationTypeConfig)get_store().find_attribute_user(TYPE$12);
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
            return get_store().find_attribute_user(TYPE$12) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(com.eviware.soapui.config.RestResourceRepresentationTypeConfig.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$12);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(com.eviware.soapui.config.RestResourceRepresentationTypeConfig type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationTypeConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationTypeConfig)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RestResourceRepresentationTypeConfig)get_store().add_attribute_user(TYPE$12);
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
            get_store().remove_attribute(TYPE$12);
        }
    }
}
