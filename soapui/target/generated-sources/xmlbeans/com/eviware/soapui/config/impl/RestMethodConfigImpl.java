/*
 * XML Type:  RestMethod
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestMethodConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestMethod(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestMethodConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.RestMethodConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestMethodConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    private static final javax.xml.namespace.QName REPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "representation");
    private static final javax.xml.namespace.QName REQUEST$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "request");
    private static final javax.xml.namespace.QName METHOD$6 = 
        new javax.xml.namespace.QName("", "method");
    private static final javax.xml.namespace.QName WADLID$8 = 
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
     * Gets a List of "representation" elements
     */
    public java.util.List<com.eviware.soapui.config.RestResourceRepresentationConfig> getRepresentationList()
    {
        final class RepresentationList extends java.util.AbstractList<com.eviware.soapui.config.RestResourceRepresentationConfig>
        {
            public com.eviware.soapui.config.RestResourceRepresentationConfig get(int i)
                { return RestMethodConfigImpl.this.getRepresentationArray(i); }
            
            public com.eviware.soapui.config.RestResourceRepresentationConfig set(int i, com.eviware.soapui.config.RestResourceRepresentationConfig o)
            {
                com.eviware.soapui.config.RestResourceRepresentationConfig old = RestMethodConfigImpl.this.getRepresentationArray(i);
                RestMethodConfigImpl.this.setRepresentationArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestResourceRepresentationConfig o)
                { RestMethodConfigImpl.this.insertNewRepresentation(i).set(o); }
            
            public com.eviware.soapui.config.RestResourceRepresentationConfig remove(int i)
            {
                com.eviware.soapui.config.RestResourceRepresentationConfig old = RestMethodConfigImpl.this.getRepresentationArray(i);
                RestMethodConfigImpl.this.removeRepresentation(i);
                return old;
            }
            
            public int size()
                { return RestMethodConfigImpl.this.sizeOfRepresentationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RepresentationList();
        }
    }
    
    /**
     * Gets array of all "representation" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig[] getRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RestResourceRepresentationConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RestResourceRepresentationConfig>();
            get_store().find_all_element_users(REPRESENTATION$2, targetList);
            com.eviware.soapui.config.RestResourceRepresentationConfig[] result = new com.eviware.soapui.config.RestResourceRepresentationConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "representation" element
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig getRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().find_element_user(REPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "representation" element
     */
    public int sizeOfRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATION$2);
        }
    }
    
    /**
     * Sets array of all "representation" element
     */
    public void setRepresentationArray(com.eviware.soapui.config.RestResourceRepresentationConfig[] representationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(representationArray, REPRESENTATION$2);
        }
    }
    
    /**
     * Sets ith "representation" element
     */
    public void setRepresentationArray(int i, com.eviware.soapui.config.RestResourceRepresentationConfig representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().find_element_user(REPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representation" element
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig insertNewRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().insert_element_user(REPRESENTATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representation" element
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig addNewRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().add_element_user(REPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "representation" element
     */
    public void removeRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATION$2, i);
        }
    }
    
    /**
     * Gets a List of "request" elements
     */
    public java.util.List<com.eviware.soapui.config.RestRequestConfig> getRequestList()
    {
        final class RequestList extends java.util.AbstractList<com.eviware.soapui.config.RestRequestConfig>
        {
            public com.eviware.soapui.config.RestRequestConfig get(int i)
                { return RestMethodConfigImpl.this.getRequestArray(i); }
            
            public com.eviware.soapui.config.RestRequestConfig set(int i, com.eviware.soapui.config.RestRequestConfig o)
            {
                com.eviware.soapui.config.RestRequestConfig old = RestMethodConfigImpl.this.getRequestArray(i);
                RestMethodConfigImpl.this.setRequestArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestRequestConfig o)
                { RestMethodConfigImpl.this.insertNewRequest(i).set(o); }
            
            public com.eviware.soapui.config.RestRequestConfig remove(int i)
            {
                com.eviware.soapui.config.RestRequestConfig old = RestMethodConfigImpl.this.getRequestArray(i);
                RestMethodConfigImpl.this.removeRequest(i);
                return old;
            }
            
            public int size()
                { return RestMethodConfigImpl.this.sizeOfRequestArray(); }
            
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
    public com.eviware.soapui.config.RestRequestConfig[] getRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RestRequestConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RestRequestConfig>();
            get_store().find_all_element_users(REQUEST$4, targetList);
            com.eviware.soapui.config.RestRequestConfig[] result = new com.eviware.soapui.config.RestRequestConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "request" element
     */
    public com.eviware.soapui.config.RestRequestConfig getRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().find_element_user(REQUEST$4, i);
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
            return get_store().count_elements(REQUEST$4);
        }
    }
    
    /**
     * Sets array of all "request" element
     */
    public void setRequestArray(com.eviware.soapui.config.RestRequestConfig[] requestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(requestArray, REQUEST$4);
        }
    }
    
    /**
     * Sets ith "request" element
     */
    public void setRequestArray(int i, com.eviware.soapui.config.RestRequestConfig request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().find_element_user(REQUEST$4, i);
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
    public com.eviware.soapui.config.RestRequestConfig insertNewRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().insert_element_user(REQUEST$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "request" element
     */
    public com.eviware.soapui.config.RestRequestConfig addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestRequestConfig target = null;
            target = (com.eviware.soapui.config.RestRequestConfig)get_store().add_element_user(REQUEST$4);
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
            get_store().remove_element(REQUEST$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$6);
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
            return get_store().find_attribute_user(METHOD$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$6);
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
            get_store().remove_attribute(METHOD$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$8);
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
            return get_store().find_attribute_user(WADLID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WADLID$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WADLID$8);
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
            get_store().remove_attribute(WADLID$8);
        }
    }
}
