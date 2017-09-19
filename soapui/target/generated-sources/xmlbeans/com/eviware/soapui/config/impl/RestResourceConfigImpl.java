/*
 * XML Type:  RestResource
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestResourceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestResource(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestResourceConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.RestResourceConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestResourceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    private static final javax.xml.namespace.QName REQUEST$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "request");
    private static final javax.xml.namespace.QName RESOURCE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "resource");
    private static final javax.xml.namespace.QName METHOD$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "method");
    private static final javax.xml.namespace.QName PATH$8 = 
        new javax.xml.namespace.QName("", "path");
    private static final javax.xml.namespace.QName WADLID$10 = 
        new javax.xml.namespace.QName("", "wadlId");
    
    
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
     * Gets a List of "request" elements
     */
    public java.util.List<com.eviware.soapui.config.OldRestRequestConfig> getRequestList()
    {
        final class RequestList extends java.util.AbstractList<com.eviware.soapui.config.OldRestRequestConfig>
        {
            public com.eviware.soapui.config.OldRestRequestConfig get(int i)
                { return RestResourceConfigImpl.this.getRequestArray(i); }
            
            public com.eviware.soapui.config.OldRestRequestConfig set(int i, com.eviware.soapui.config.OldRestRequestConfig o)
            {
                com.eviware.soapui.config.OldRestRequestConfig old = RestResourceConfigImpl.this.getRequestArray(i);
                RestResourceConfigImpl.this.setRequestArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.OldRestRequestConfig o)
                { RestResourceConfigImpl.this.insertNewRequest(i).set(o); }
            
            public com.eviware.soapui.config.OldRestRequestConfig remove(int i)
            {
                com.eviware.soapui.config.OldRestRequestConfig old = RestResourceConfigImpl.this.getRequestArray(i);
                RestResourceConfigImpl.this.removeRequest(i);
                return old;
            }
            
            public int size()
                { return RestResourceConfigImpl.this.sizeOfRequestArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RequestList();
        }
    }
    
    /**
     * Gets array of all "request" elements
     * @deprecated
     */
    public com.eviware.soapui.config.OldRestRequestConfig[] getRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.OldRestRequestConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.OldRestRequestConfig>();
            get_store().find_all_element_users(REQUEST$2, targetList);
            com.eviware.soapui.config.OldRestRequestConfig[] result = new com.eviware.soapui.config.OldRestRequestConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "request" element
     */
    public com.eviware.soapui.config.OldRestRequestConfig getRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OldRestRequestConfig target = null;
            target = (com.eviware.soapui.config.OldRestRequestConfig)get_store().find_element_user(REQUEST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "request" element
     */
    public int sizeOfRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUEST$2);
        }
    }
    
    /**
     * Sets array of all "request" element
     */
    public void setRequestArray(com.eviware.soapui.config.OldRestRequestConfig[] requestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(requestArray, REQUEST$2);
        }
    }
    
    /**
     * Sets ith "request" element
     */
    public void setRequestArray(int i, com.eviware.soapui.config.OldRestRequestConfig request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OldRestRequestConfig target = null;
            target = (com.eviware.soapui.config.OldRestRequestConfig)get_store().find_element_user(REQUEST$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(request);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "request" element
     */
    public com.eviware.soapui.config.OldRestRequestConfig insertNewRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OldRestRequestConfig target = null;
            target = (com.eviware.soapui.config.OldRestRequestConfig)get_store().insert_element_user(REQUEST$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "request" element
     */
    public com.eviware.soapui.config.OldRestRequestConfig addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OldRestRequestConfig target = null;
            target = (com.eviware.soapui.config.OldRestRequestConfig)get_store().add_element_user(REQUEST$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "request" element
     */
    public void removeRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUEST$2, i);
        }
    }
    
    /**
     * Gets a List of "resource" elements
     */
    public java.util.List<com.eviware.soapui.config.RestResourceConfig> getResourceList()
    {
        final class ResourceList extends java.util.AbstractList<com.eviware.soapui.config.RestResourceConfig>
        {
            public com.eviware.soapui.config.RestResourceConfig get(int i)
                { return RestResourceConfigImpl.this.getResourceArray(i); }
            
            public com.eviware.soapui.config.RestResourceConfig set(int i, com.eviware.soapui.config.RestResourceConfig o)
            {
                com.eviware.soapui.config.RestResourceConfig old = RestResourceConfigImpl.this.getResourceArray(i);
                RestResourceConfigImpl.this.setResourceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestResourceConfig o)
                { RestResourceConfigImpl.this.insertNewResource(i).set(o); }
            
            public com.eviware.soapui.config.RestResourceConfig remove(int i)
            {
                com.eviware.soapui.config.RestResourceConfig old = RestResourceConfigImpl.this.getResourceArray(i);
                RestResourceConfigImpl.this.removeResource(i);
                return old;
            }
            
            public int size()
                { return RestResourceConfigImpl.this.sizeOfResourceArray(); }
            
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
            get_store().find_all_element_users(RESOURCE$4, targetList);
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
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().find_element_user(RESOURCE$4, i);
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
            return get_store().count_elements(RESOURCE$4);
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
            arraySetterHelper(resourceArray, RESOURCE$4);
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
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().find_element_user(RESOURCE$4, i);
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
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().insert_element_user(RESOURCE$4, i);
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
            target = (com.eviware.soapui.config.RestResourceConfig)get_store().add_element_user(RESOURCE$4);
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
            get_store().remove_element(RESOURCE$4, i);
        }
    }
    
    /**
     * Gets a List of "method" elements
     */
    public java.util.List<com.eviware.soapui.config.RestMethodConfig> getMethodList()
    {
        final class MethodList extends java.util.AbstractList<com.eviware.soapui.config.RestMethodConfig>
        {
            public com.eviware.soapui.config.RestMethodConfig get(int i)
                { return RestResourceConfigImpl.this.getMethodArray(i); }
            
            public com.eviware.soapui.config.RestMethodConfig set(int i, com.eviware.soapui.config.RestMethodConfig o)
            {
                com.eviware.soapui.config.RestMethodConfig old = RestResourceConfigImpl.this.getMethodArray(i);
                RestResourceConfigImpl.this.setMethodArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestMethodConfig o)
                { RestResourceConfigImpl.this.insertNewMethod(i).set(o); }
            
            public com.eviware.soapui.config.RestMethodConfig remove(int i)
            {
                com.eviware.soapui.config.RestMethodConfig old = RestResourceConfigImpl.this.getMethodArray(i);
                RestResourceConfigImpl.this.removeMethod(i);
                return old;
            }
            
            public int size()
                { return RestResourceConfigImpl.this.sizeOfMethodArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodList();
        }
    }
    
    /**
     * Gets array of all "method" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RestMethodConfig[] getMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RestMethodConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RestMethodConfig>();
            get_store().find_all_element_users(METHOD$6, targetList);
            com.eviware.soapui.config.RestMethodConfig[] result = new com.eviware.soapui.config.RestMethodConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method" element
     */
    public com.eviware.soapui.config.RestMethodConfig getMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestMethodConfig target = null;
            target = (com.eviware.soapui.config.RestMethodConfig)get_store().find_element_user(METHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method" element
     */
    public int sizeOfMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHOD$6);
        }
    }
    
    /**
     * Sets array of all "method" element
     */
    public void setMethodArray(com.eviware.soapui.config.RestMethodConfig[] methodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodArray, METHOD$6);
        }
    }
    
    /**
     * Sets ith "method" element
     */
    public void setMethodArray(int i, com.eviware.soapui.config.RestMethodConfig method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestMethodConfig target = null;
            target = (com.eviware.soapui.config.RestMethodConfig)get_store().find_element_user(METHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(method);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method" element
     */
    public com.eviware.soapui.config.RestMethodConfig insertNewMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestMethodConfig target = null;
            target = (com.eviware.soapui.config.RestMethodConfig)get_store().insert_element_user(METHOD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method" element
     */
    public com.eviware.soapui.config.RestMethodConfig addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestMethodConfig target = null;
            target = (com.eviware.soapui.config.RestMethodConfig)get_store().add_element_user(METHOD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "method" element
     */
    public void removeMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHOD$6, i);
        }
    }
    
    /**
     * Gets the "path" attribute
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$8);
            return target;
        }
    }
    
    /**
     * True if has "path" attribute
     */
    public boolean isSetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATH$8) != null;
        }
    }
    
    /**
     * Sets the "path" attribute
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$8);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" attribute
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$8);
            }
            target.set(path);
        }
    }
    
    /**
     * Unsets the "path" attribute
     */
    public void unsetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATH$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$10);
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
            return get_store().find_attribute_user(WADLID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WADLID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WADLID$10);
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
            get_store().remove_attribute(WADLID$10);
        }
    }
}
