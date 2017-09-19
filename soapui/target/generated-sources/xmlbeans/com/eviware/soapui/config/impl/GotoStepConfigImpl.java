/*
 * XML Type:  GotoStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.GotoStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML GotoStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class GotoStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.GotoStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public GotoStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "condition");
    
    
    /**
     * Gets a List of "condition" elements
     */
    public java.util.List<com.eviware.soapui.config.GotoConditionConfig> getConditionList()
    {
        final class ConditionList extends java.util.AbstractList<com.eviware.soapui.config.GotoConditionConfig>
        {
            public com.eviware.soapui.config.GotoConditionConfig get(int i)
                { return GotoStepConfigImpl.this.getConditionArray(i); }
            
            public com.eviware.soapui.config.GotoConditionConfig set(int i, com.eviware.soapui.config.GotoConditionConfig o)
            {
                com.eviware.soapui.config.GotoConditionConfig old = GotoStepConfigImpl.this.getConditionArray(i);
                GotoStepConfigImpl.this.setConditionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.GotoConditionConfig o)
                { GotoStepConfigImpl.this.insertNewCondition(i).set(o); }
            
            public com.eviware.soapui.config.GotoConditionConfig remove(int i)
            {
                com.eviware.soapui.config.GotoConditionConfig old = GotoStepConfigImpl.this.getConditionArray(i);
                GotoStepConfigImpl.this.removeCondition(i);
                return old;
            }
            
            public int size()
                { return GotoStepConfigImpl.this.sizeOfConditionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ConditionList();
        }
    }
    
    /**
     * Gets array of all "condition" elements
     * @deprecated
     */
    public com.eviware.soapui.config.GotoConditionConfig[] getConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.GotoConditionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.GotoConditionConfig>();
            get_store().find_all_element_users(CONDITION$0, targetList);
            com.eviware.soapui.config.GotoConditionConfig[] result = new com.eviware.soapui.config.GotoConditionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "condition" element
     */
    public com.eviware.soapui.config.GotoConditionConfig getConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.GotoConditionConfig target = null;
            target = (com.eviware.soapui.config.GotoConditionConfig)get_store().find_element_user(CONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "condition" element
     */
    public int sizeOfConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$0);
        }
    }
    
    /**
     * Sets array of all "condition" element
     */
    public void setConditionArray(com.eviware.soapui.config.GotoConditionConfig[] conditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conditionArray, CONDITION$0);
        }
    }
    
    /**
     * Sets ith "condition" element
     */
    public void setConditionArray(int i, com.eviware.soapui.config.GotoConditionConfig condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.GotoConditionConfig target = null;
            target = (com.eviware.soapui.config.GotoConditionConfig)get_store().find_element_user(CONDITION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "condition" element
     */
    public com.eviware.soapui.config.GotoConditionConfig insertNewCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.GotoConditionConfig target = null;
            target = (com.eviware.soapui.config.GotoConditionConfig)get_store().insert_element_user(CONDITION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "condition" element
     */
    public com.eviware.soapui.config.GotoConditionConfig addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.GotoConditionConfig target = null;
            target = (com.eviware.soapui.config.GotoConditionConfig)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "condition" element
     */
    public void removeCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$0, i);
        }
    }
}
