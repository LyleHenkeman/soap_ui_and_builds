/*
 * XML Type:  JMSPropertiesConf
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.JMSPropertiesConfConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML JMSPropertiesConf(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class JMSPropertiesConfConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.JMSPropertiesConfConfig
{
    private static final long serialVersionUID = 1L;
    
    public JMSPropertiesConfConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JMSPROPERTIES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "jmsProperties");
    
    
    /**
     * Gets a List of "jmsProperties" elements
     */
    public java.util.List<com.eviware.soapui.config.JMSPropertyConfig> getJmsPropertiesList()
    {
        final class JmsPropertiesList extends java.util.AbstractList<com.eviware.soapui.config.JMSPropertyConfig>
        {
            public com.eviware.soapui.config.JMSPropertyConfig get(int i)
                { return JMSPropertiesConfConfigImpl.this.getJmsPropertiesArray(i); }
            
            public com.eviware.soapui.config.JMSPropertyConfig set(int i, com.eviware.soapui.config.JMSPropertyConfig o)
            {
                com.eviware.soapui.config.JMSPropertyConfig old = JMSPropertiesConfConfigImpl.this.getJmsPropertiesArray(i);
                JMSPropertiesConfConfigImpl.this.setJmsPropertiesArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.JMSPropertyConfig o)
                { JMSPropertiesConfConfigImpl.this.insertNewJmsProperties(i).set(o); }
            
            public com.eviware.soapui.config.JMSPropertyConfig remove(int i)
            {
                com.eviware.soapui.config.JMSPropertyConfig old = JMSPropertiesConfConfigImpl.this.getJmsPropertiesArray(i);
                JMSPropertiesConfConfigImpl.this.removeJmsProperties(i);
                return old;
            }
            
            public int size()
                { return JMSPropertiesConfConfigImpl.this.sizeOfJmsPropertiesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JmsPropertiesList();
        }
    }
    
    /**
     * Gets array of all "jmsProperties" elements
     * @deprecated
     */
    public com.eviware.soapui.config.JMSPropertyConfig[] getJmsPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.JMSPropertyConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.JMSPropertyConfig>();
            get_store().find_all_element_users(JMSPROPERTIES$0, targetList);
            com.eviware.soapui.config.JMSPropertyConfig[] result = new com.eviware.soapui.config.JMSPropertyConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "jmsProperties" element
     */
    public com.eviware.soapui.config.JMSPropertyConfig getJmsPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertyConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertyConfig)get_store().find_element_user(JMSPROPERTIES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "jmsProperties" element
     */
    public int sizeOfJmsPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JMSPROPERTIES$0);
        }
    }
    
    /**
     * Sets array of all "jmsProperties" element
     */
    public void setJmsPropertiesArray(com.eviware.soapui.config.JMSPropertyConfig[] jmsPropertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jmsPropertiesArray, JMSPROPERTIES$0);
        }
    }
    
    /**
     * Sets ith "jmsProperties" element
     */
    public void setJmsPropertiesArray(int i, com.eviware.soapui.config.JMSPropertyConfig jmsProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertyConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertyConfig)get_store().find_element_user(JMSPROPERTIES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(jmsProperties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jmsProperties" element
     */
    public com.eviware.soapui.config.JMSPropertyConfig insertNewJmsProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertyConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertyConfig)get_store().insert_element_user(JMSPROPERTIES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jmsProperties" element
     */
    public com.eviware.soapui.config.JMSPropertyConfig addNewJmsProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.JMSPropertyConfig target = null;
            target = (com.eviware.soapui.config.JMSPropertyConfig)get_store().add_element_user(JMSPROPERTIES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "jmsProperties" element
     */
    public void removeJmsProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JMSPROPERTIES$0, i);
        }
    }
}
