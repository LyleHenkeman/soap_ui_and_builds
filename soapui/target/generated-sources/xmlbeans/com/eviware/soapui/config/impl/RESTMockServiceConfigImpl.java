/*
 * XML Type:  RESTMockService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RESTMockServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RESTMockService(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RESTMockServiceConfigImpl extends com.eviware.soapui.config.impl.BaseMockServiceConfigImpl implements com.eviware.soapui.config.RESTMockServiceConfig
{
    private static final long serialVersionUID = 1L;
    
    public RESTMockServiceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTMOCKACTION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "restMockAction");
    
    
    /**
     * Gets a List of "restMockAction" elements
     */
    public java.util.List<com.eviware.soapui.config.RESTMockActionConfig> getRestMockActionList()
    {
        final class RestMockActionList extends java.util.AbstractList<com.eviware.soapui.config.RESTMockActionConfig>
        {
            public com.eviware.soapui.config.RESTMockActionConfig get(int i)
                { return RESTMockServiceConfigImpl.this.getRestMockActionArray(i); }
            
            public com.eviware.soapui.config.RESTMockActionConfig set(int i, com.eviware.soapui.config.RESTMockActionConfig o)
            {
                com.eviware.soapui.config.RESTMockActionConfig old = RESTMockServiceConfigImpl.this.getRestMockActionArray(i);
                RESTMockServiceConfigImpl.this.setRestMockActionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RESTMockActionConfig o)
                { RESTMockServiceConfigImpl.this.insertNewRestMockAction(i).set(o); }
            
            public com.eviware.soapui.config.RESTMockActionConfig remove(int i)
            {
                com.eviware.soapui.config.RESTMockActionConfig old = RESTMockServiceConfigImpl.this.getRestMockActionArray(i);
                RESTMockServiceConfigImpl.this.removeRestMockAction(i);
                return old;
            }
            
            public int size()
                { return RESTMockServiceConfigImpl.this.sizeOfRestMockActionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RestMockActionList();
        }
    }
    
    /**
     * Gets array of all "restMockAction" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RESTMockActionConfig[] getRestMockActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RESTMockActionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RESTMockActionConfig>();
            get_store().find_all_element_users(RESTMOCKACTION$0, targetList);
            com.eviware.soapui.config.RESTMockActionConfig[] result = new com.eviware.soapui.config.RESTMockActionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "restMockAction" element
     */
    public com.eviware.soapui.config.RESTMockActionConfig getRestMockActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockActionConfig target = null;
            target = (com.eviware.soapui.config.RESTMockActionConfig)get_store().find_element_user(RESTMOCKACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "restMockAction" element
     */
    public int sizeOfRestMockActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTMOCKACTION$0);
        }
    }
    
    /**
     * Sets array of all "restMockAction" element
     */
    public void setRestMockActionArray(com.eviware.soapui.config.RESTMockActionConfig[] restMockActionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(restMockActionArray, RESTMOCKACTION$0);
        }
    }
    
    /**
     * Sets ith "restMockAction" element
     */
    public void setRestMockActionArray(int i, com.eviware.soapui.config.RESTMockActionConfig restMockAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockActionConfig target = null;
            target = (com.eviware.soapui.config.RESTMockActionConfig)get_store().find_element_user(RESTMOCKACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(restMockAction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "restMockAction" element
     */
    public com.eviware.soapui.config.RESTMockActionConfig insertNewRestMockAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockActionConfig target = null;
            target = (com.eviware.soapui.config.RESTMockActionConfig)get_store().insert_element_user(RESTMOCKACTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "restMockAction" element
     */
    public com.eviware.soapui.config.RESTMockActionConfig addNewRestMockAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockActionConfig target = null;
            target = (com.eviware.soapui.config.RESTMockActionConfig)get_store().add_element_user(RESTMOCKACTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "restMockAction" element
     */
    public void removeRestMockAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTMOCKACTION$0, i);
        }
    }
}
