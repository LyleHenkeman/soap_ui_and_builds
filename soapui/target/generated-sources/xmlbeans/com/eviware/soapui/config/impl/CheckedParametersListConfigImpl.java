/*
 * XML Type:  CheckedParametersList
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.CheckedParametersListConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML CheckedParametersList(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class CheckedParametersListConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.CheckedParametersListConfig
{
    private static final long serialVersionUID = 1L;
    
    public CheckedParametersListConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    
    
    /**
     * Gets a List of "parameters" elements
     */
    public java.util.List<com.eviware.soapui.config.CheckedParameterConfig> getParametersList()
    {
        final class ParametersList extends java.util.AbstractList<com.eviware.soapui.config.CheckedParameterConfig>
        {
            public com.eviware.soapui.config.CheckedParameterConfig get(int i)
                { return CheckedParametersListConfigImpl.this.getParametersArray(i); }
            
            public com.eviware.soapui.config.CheckedParameterConfig set(int i, com.eviware.soapui.config.CheckedParameterConfig o)
            {
                com.eviware.soapui.config.CheckedParameterConfig old = CheckedParametersListConfigImpl.this.getParametersArray(i);
                CheckedParametersListConfigImpl.this.setParametersArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.CheckedParameterConfig o)
                { CheckedParametersListConfigImpl.this.insertNewParameters(i).set(o); }
            
            public com.eviware.soapui.config.CheckedParameterConfig remove(int i)
            {
                com.eviware.soapui.config.CheckedParameterConfig old = CheckedParametersListConfigImpl.this.getParametersArray(i);
                CheckedParametersListConfigImpl.this.removeParameters(i);
                return old;
            }
            
            public int size()
                { return CheckedParametersListConfigImpl.this.sizeOfParametersArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParametersList();
        }
    }
    
    /**
     * Gets array of all "parameters" elements
     * @deprecated
     */
    public com.eviware.soapui.config.CheckedParameterConfig[] getParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.CheckedParameterConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.CheckedParameterConfig>();
            get_store().find_all_element_users(PARAMETERS$0, targetList);
            com.eviware.soapui.config.CheckedParameterConfig[] result = new com.eviware.soapui.config.CheckedParameterConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameters" element
     */
    public com.eviware.soapui.config.CheckedParameterConfig getParametersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParameterConfig target = null;
            target = (com.eviware.soapui.config.CheckedParameterConfig)get_store().find_element_user(PARAMETERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameters" element
     */
    public int sizeOfParametersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$0);
        }
    }
    
    /**
     * Sets array of all "parameters" element
     */
    public void setParametersArray(com.eviware.soapui.config.CheckedParameterConfig[] parametersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parametersArray, PARAMETERS$0);
        }
    }
    
    /**
     * Sets ith "parameters" element
     */
    public void setParametersArray(int i, com.eviware.soapui.config.CheckedParameterConfig parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParameterConfig target = null;
            target = (com.eviware.soapui.config.CheckedParameterConfig)get_store().find_element_user(PARAMETERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameters);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameters" element
     */
    public com.eviware.soapui.config.CheckedParameterConfig insertNewParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParameterConfig target = null;
            target = (com.eviware.soapui.config.CheckedParameterConfig)get_store().insert_element_user(PARAMETERS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameters" element
     */
    public com.eviware.soapui.config.CheckedParameterConfig addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.CheckedParameterConfig target = null;
            target = (com.eviware.soapui.config.CheckedParameterConfig)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameters" element
     */
    public void removeParameters(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$0, i);
        }
    }
}
