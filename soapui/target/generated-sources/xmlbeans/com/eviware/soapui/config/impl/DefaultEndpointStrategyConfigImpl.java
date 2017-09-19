/*
 * XML Type:  DefaultEndpointStrategy
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DefaultEndpointStrategyConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DefaultEndpointStrategy(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DefaultEndpointStrategyConfigImpl extends com.eviware.soapui.config.impl.EndpointStrategyConfigImpl implements com.eviware.soapui.config.DefaultEndpointStrategyConfig
{
    private static final long serialVersionUID = 1L;
    
    public DefaultEndpointStrategyConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoint");
    
    
    /**
     * Gets a List of "endpoint" elements
     */
    public java.util.List<com.eviware.soapui.config.EndpointConfig> getEndpointList()
    {
        final class EndpointList extends java.util.AbstractList<com.eviware.soapui.config.EndpointConfig>
        {
            public com.eviware.soapui.config.EndpointConfig get(int i)
                { return DefaultEndpointStrategyConfigImpl.this.getEndpointArray(i); }
            
            public com.eviware.soapui.config.EndpointConfig set(int i, com.eviware.soapui.config.EndpointConfig o)
            {
                com.eviware.soapui.config.EndpointConfig old = DefaultEndpointStrategyConfigImpl.this.getEndpointArray(i);
                DefaultEndpointStrategyConfigImpl.this.setEndpointArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.EndpointConfig o)
                { DefaultEndpointStrategyConfigImpl.this.insertNewEndpoint(i).set(o); }
            
            public com.eviware.soapui.config.EndpointConfig remove(int i)
            {
                com.eviware.soapui.config.EndpointConfig old = DefaultEndpointStrategyConfigImpl.this.getEndpointArray(i);
                DefaultEndpointStrategyConfigImpl.this.removeEndpoint(i);
                return old;
            }
            
            public int size()
                { return DefaultEndpointStrategyConfigImpl.this.sizeOfEndpointArray(); }
            
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
    public com.eviware.soapui.config.EndpointConfig[] getEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.EndpointConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.EndpointConfig>();
            get_store().find_all_element_users(ENDPOINT$0, targetList);
            com.eviware.soapui.config.EndpointConfig[] result = new com.eviware.soapui.config.EndpointConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endpoint" element
     */
    public com.eviware.soapui.config.EndpointConfig getEndpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointConfig)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
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
    public void setEndpointArray(com.eviware.soapui.config.EndpointConfig[] endpointArray)
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
    public void setEndpointArray(int i, com.eviware.soapui.config.EndpointConfig endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointConfig)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint" element
     */
    public com.eviware.soapui.config.EndpointConfig insertNewEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointConfig)get_store().insert_element_user(ENDPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint" element
     */
    public com.eviware.soapui.config.EndpointConfig addNewEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointConfig)get_store().add_element_user(ENDPOINT$0);
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
