/*
 * XML Type:  RestParameters
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestParametersConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RestParameters(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RestParametersConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RestParametersConfig
{
    private static final long serialVersionUID = 1L;
    
    public RestParametersConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameter");
    
    
    /**
     * Gets a List of "parameter" elements
     */
    public java.util.List<com.eviware.soapui.config.RestParameterConfig> getParameterList()
    {
        final class ParameterList extends java.util.AbstractList<com.eviware.soapui.config.RestParameterConfig>
        {
            public com.eviware.soapui.config.RestParameterConfig get(int i)
                { return RestParametersConfigImpl.this.getParameterArray(i); }
            
            public com.eviware.soapui.config.RestParameterConfig set(int i, com.eviware.soapui.config.RestParameterConfig o)
            {
                com.eviware.soapui.config.RestParameterConfig old = RestParametersConfigImpl.this.getParameterArray(i);
                RestParametersConfigImpl.this.setParameterArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestParameterConfig o)
                { RestParametersConfigImpl.this.insertNewParameter(i).set(o); }
            
            public com.eviware.soapui.config.RestParameterConfig remove(int i)
            {
                com.eviware.soapui.config.RestParameterConfig old = RestParametersConfigImpl.this.getParameterArray(i);
                RestParametersConfigImpl.this.removeParameter(i);
                return old;
            }
            
            public int size()
                { return RestParametersConfigImpl.this.sizeOfParameterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParameterList();
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RestParameterConfig[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RestParameterConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RestParameterConfig>();
            get_store().find_all_element_users(PARAMETER$0, targetList);
            com.eviware.soapui.config.RestParameterConfig[] result = new com.eviware.soapui.config.RestParameterConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public com.eviware.soapui.config.RestParameterConfig getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParameterConfig target = null;
            target = (com.eviware.soapui.config.RestParameterConfig)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$0);
        }
    }
    
    /**
     * Sets array of all "parameter" element
     */
    public void setParameterArray(com.eviware.soapui.config.RestParameterConfig[] parameterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, com.eviware.soapui.config.RestParameterConfig parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParameterConfig target = null;
            target = (com.eviware.soapui.config.RestParameterConfig)get_store().find_element_user(PARAMETER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public com.eviware.soapui.config.RestParameterConfig insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParameterConfig target = null;
            target = (com.eviware.soapui.config.RestParameterConfig)get_store().insert_element_user(PARAMETER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public com.eviware.soapui.config.RestParameterConfig addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParameterConfig target = null;
            target = (com.eviware.soapui.config.RestParameterConfig)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$0, i);
        }
    }
}
