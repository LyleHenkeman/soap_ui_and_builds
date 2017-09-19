/*
 * XML Type:  Endpoints
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.EndpointsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Endpoints(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class EndpointsConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.EndpointsConfig
{
    private static final long serialVersionUID = 1L;
    
    public EndpointsConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoint");
    
    
    /**
     * Gets a List of "endpoint" elements
     */
    public java.util.List<java.lang.String> getEndpointList()
    {
        final class EndpointList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return EndpointsConfigImpl.this.getEndpointArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = EndpointsConfigImpl.this.getEndpointArray(i);
                EndpointsConfigImpl.this.setEndpointArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { EndpointsConfigImpl.this.insertEndpoint(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = EndpointsConfigImpl.this.getEndpointArray(i);
                EndpointsConfigImpl.this.removeEndpoint(i);
                return old;
            }
            
            public int size()
                { return EndpointsConfigImpl.this.sizeOfEndpointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndpointList();
        }
    }
    
    /**
     * Gets array of all "endpoint" elements
     * @deprecated
     */
    public java.lang.String[] getEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ENDPOINT$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "endpoint" element
     */
    public java.lang.String getEndpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "endpoint" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetEndpointList()
    {
        final class EndpointList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return EndpointsConfigImpl.this.xgetEndpointArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = EndpointsConfigImpl.this.xgetEndpointArray(i);
                EndpointsConfigImpl.this.xsetEndpointArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { EndpointsConfigImpl.this.insertNewEndpoint(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = EndpointsConfigImpl.this.xgetEndpointArray(i);
                EndpointsConfigImpl.this.removeEndpoint(i);
                return old;
            }
            
            public int size()
                { return EndpointsConfigImpl.this.sizeOfEndpointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndpointList();
        }
    }
    
    /**
     * Gets array of all "endpoint" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ENDPOINT$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "endpoint" element
     */
    public org.apache.xmlbeans.XmlString xgetEndpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "endpoint" element
     */
    public int sizeOfEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINT$0);
        }
    }
    
    /**
     * Sets array of all "endpoint" element
     */
    public void setEndpointArray(java.lang.String[] endpointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endpointArray, ENDPOINT$0);
        }
    }
    
    /**
     * Sets ith "endpoint" element
     */
    public void setEndpointArray(int i, java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) array of all "endpoint" element
     */
    public void xsetEndpointArray(org.apache.xmlbeans.XmlString[]endpointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endpointArray, ENDPOINT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "endpoint" element
     */
    public void xsetEndpointArray(int i, org.apache.xmlbeans.XmlString endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Inserts the value as the ith "endpoint" element
     */
    public void insertEndpoint(int i, java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENDPOINT$0, i);
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Appends the value as the last "endpoint" element
     */
    public void addEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$0);
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint" element
     */
    public org.apache.xmlbeans.XmlString insertNewEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ENDPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint" element
     */
    public org.apache.xmlbeans.XmlString addNewEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDPOINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "endpoint" element
     */
    public void removeEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINT$0, i);
        }
    }
}
