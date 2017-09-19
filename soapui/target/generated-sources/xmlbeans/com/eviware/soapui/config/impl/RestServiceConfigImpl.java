/*
 * XML Type:  RestService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestService(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestServiceConfigImpl extends com.eviware.soapui.config.impl.InterfaceConfigImpl implements com.eviware.soapui.config.RestServiceConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestServiceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "resource");
    private static final javax.xml.namespace.QName INFERREDSCHEMA$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "inferredSchema");
    private static final javax.xml.namespace.QName DEFINITIONURL$4 = 
        new javax.xml.namespace.QName("", "definitionUrl");
    private static final javax.xml.namespace.QName BASEPATH$6 = 
        new javax.xml.namespace.QName("", "basePath");
    private static final javax.xml.namespace.QName WADLVERSION$8 = 
        new javax.xml.namespace.QName("", "wadlVersion");
    
    
    /**
     * Gets a List of "resource" elements
     */
    public java.util.List<com.eviware.soapui.config.RestResourceConfig> getResourceList()
    {
        final class ResourceList extends java.util.AbstractList<com.eviware.soapui.config.RestResourceConfig>
        {
            public com.eviware.soapui.config.RestResourceConfig get(int i)
                { return RestServiceConfigImpl.this.getResourceArray(i); }
            
            public com.eviware.soapui.config.RestResourceConfig set(int i, com.eviware.soapui.config.RestResourceConfig o)
            {
                com.eviware.soapui.config.RestResourceConfig old = RestServiceConfigImpl.this.getResourceArray(i);
                RestServiceConfigImpl.this.setResourceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestResourceConfig o)
                { RestServiceConfigImpl.this.insertNewResource(i).set(o); }
            
            public com.eviware.soapui.config.RestResourceConfig remove(int i)
            {
                com.eviware.soapui.config.RestResourceConfig old = RestServiceConfigImpl.this.getResourceArray(i);
                RestServiceConfigImpl.this.removeResource(i);
                return old;
            }
            
            public int size()
                { return RestServiceConfigImpl.this.sizeOfResourceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceList();
        }
    }
    
    /**
     * Gets array of all "resource" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RestResourceConfig[] getResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RestResourceConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RestResourceConfig>();
            get_store().find_all_element_users(RESOURCE$0, targetList);
            com.eviware.soapui.config.RestResourceConfig[] result = new com.eviware.soapui.config.RestResourceConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource" element
     */
    public com.eviware.soapui.config.RestResourceConfig getResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceConfig target = null;
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().find_element_user(RESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource" element
     */
    public int sizeOfResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCE$0);
        }
    }
    
    /**
     * Sets array of all "resource" element
     */
    public void setResourceArray(com.eviware.soapui.config.RestResourceConfig[] resourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceArray, RESOURCE$0);
        }
    }
    
    /**
     * Sets ith "resource" element
     */
    public void setResourceArray(int i, com.eviware.soapui.config.RestResourceConfig resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceConfig target = null;
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().find_element_user(RESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    public com.eviware.soapui.config.RestResourceConfig insertNewResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceConfig target = null;
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().insert_element_user(RESOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    public com.eviware.soapui.config.RestResourceConfig addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceConfig target = null;
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().add_element_user(RESOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource" element
     */
    public void removeResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCE$0, i);
        }
    }
    
    /**
     * Gets the "inferredSchema" element
     */
    public java.lang.String getInferredSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFERREDSCHEMA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inferredSchema" element
     */
    public org.apache.xmlbeans.XmlString xgetInferredSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFERREDSCHEMA$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "inferredSchema" element
     */
    public boolean isSetInferredSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFERREDSCHEMA$2) != 0;
        }
    }
    
    /**
     * Sets the "inferredSchema" element
     */
    public void setInferredSchema(java.lang.String inferredSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFERREDSCHEMA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFERREDSCHEMA$2);
            }
            target.setStringValue(inferredSchema);
        }
    }
    
    /**
     * Sets (as xml) the "inferredSchema" element
     */
    public void xsetInferredSchema(org.apache.xmlbeans.XmlString inferredSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFERREDSCHEMA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INFERREDSCHEMA$2);
            }
            target.set(inferredSchema);
        }
    }
    
    /**
     * Unsets the "inferredSchema" element
     */
    public void unsetInferredSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFERREDSCHEMA$2, 0);
        }
    }
    
    /**
     * Gets the "definitionUrl" attribute
     */
    public java.lang.String getDefinitionUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITIONURL$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "definitionUrl" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefinitionUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFINITIONURL$4);
            return target;
        }
    }
    
    /**
     * True if has "definitionUrl" attribute
     */
    public boolean isSetDefinitionUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFINITIONURL$4) != null;
        }
    }
    
    /**
     * Sets the "definitionUrl" attribute
     */
    public void setDefinitionUrl(java.lang.String definitionUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITIONURL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFINITIONURL$4);
            }
            target.setStringValue(definitionUrl);
        }
    }
    
    /**
     * Sets (as xml) the "definitionUrl" attribute
     */
    public void xsetDefinitionUrl(org.apache.xmlbeans.XmlString definitionUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFINITIONURL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFINITIONURL$4);
            }
            target.set(definitionUrl);
        }
    }
    
    /**
     * Unsets the "definitionUrl" attribute
     */
    public void unsetDefinitionUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFINITIONURL$4);
        }
    }
    
    /**
     * Gets the "basePath" attribute
     */
    public java.lang.String getBasePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEPATH$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "basePath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBasePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BASEPATH$6);
            return target;
        }
    }
    
    /**
     * True if has "basePath" attribute
     */
    public boolean isSetBasePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASEPATH$6) != null;
        }
    }
    
    /**
     * Sets the "basePath" attribute
     */
    public void setBasePath(java.lang.String basePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASEPATH$6);
            }
            target.setStringValue(basePath);
        }
    }
    
    /**
     * Sets (as xml) the "basePath" attribute
     */
    public void xsetBasePath(org.apache.xmlbeans.XmlString basePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BASEPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BASEPATH$6);
            }
            target.set(basePath);
        }
    }
    
    /**
     * Unsets the "basePath" attribute
     */
    public void unsetBasePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASEPATH$6);
        }
    }
    
    /**
     * Gets the "wadlVersion" attribute
     */
    public java.lang.String getWadlVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLVERSION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wadlVersion" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWadlVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLVERSION$8);
            return target;
        }
    }
    
    /**
     * True if has "wadlVersion" attribute
     */
    public boolean isSetWadlVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WADLVERSION$8) != null;
        }
    }
    
    /**
     * Sets the "wadlVersion" attribute
     */
    public void setWadlVersion(java.lang.String wadlVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WADLVERSION$8);
            }
            target.setStringValue(wadlVersion);
        }
    }
    
    /**
     * Sets (as xml) the "wadlVersion" attribute
     */
    public void xsetWadlVersion(org.apache.xmlbeans.XmlString wadlVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WADLVERSION$8);
            }
            target.set(wadlVersion);
        }
    }
    
    /**
     * Unsets the "wadlVersion" attribute
     */
    public void unsetWadlVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WADLVERSION$8);
        }
    }
}
