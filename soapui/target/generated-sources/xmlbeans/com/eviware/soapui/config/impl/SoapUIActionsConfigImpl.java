/*
 * XML Type:  SoapUIActions
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIActionsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIActions(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIActionsConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIActionsConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIActionsConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "action");
    private static final javax.xml.namespace.QName ACTIONGROUP$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "actionGroup");
    
    
    /**
     * Gets a List of "action" elements
     */
    public java.util.List<com.eviware.soapui.config.SoapUIActionConfig> getActionList()
    {
        final class ActionList extends java.util.AbstractList<com.eviware.soapui.config.SoapUIActionConfig>
        {
            public com.eviware.soapui.config.SoapUIActionConfig get(int i)
                { return SoapUIActionsConfigImpl.this.getActionArray(i); }
            
            public com.eviware.soapui.config.SoapUIActionConfig set(int i, com.eviware.soapui.config.SoapUIActionConfig o)
            {
                com.eviware.soapui.config.SoapUIActionConfig old = SoapUIActionsConfigImpl.this.getActionArray(i);
                SoapUIActionsConfigImpl.this.setActionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SoapUIActionConfig o)
                { SoapUIActionsConfigImpl.this.insertNewAction(i).set(o); }
            
            public com.eviware.soapui.config.SoapUIActionConfig remove(int i)
            {
                com.eviware.soapui.config.SoapUIActionConfig old = SoapUIActionsConfigImpl.this.getActionArray(i);
                SoapUIActionsConfigImpl.this.removeAction(i);
                return old;
            }
            
            public int size()
                { return SoapUIActionsConfigImpl.this.sizeOfActionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ActionList();
        }
    }
    
    /**
     * Gets array of all "action" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SoapUIActionConfig[] getActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SoapUIActionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SoapUIActionConfig>();
            get_store().find_all_element_users(ACTION$0, targetList);
            com.eviware.soapui.config.SoapUIActionConfig[] result = new com.eviware.soapui.config.SoapUIActionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "action" element
     */
    public com.eviware.soapui.config.SoapUIActionConfig getActionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionConfig)get_store().find_element_user(ACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "action" element
     */
    public int sizeOfActionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTION$0);
        }
    }
    
    /**
     * Sets array of all "action" element
     */
    public void setActionArray(com.eviware.soapui.config.SoapUIActionConfig[] actionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actionArray, ACTION$0);
        }
    }
    
    /**
     * Sets ith "action" element
     */
    public void setActionArray(int i, com.eviware.soapui.config.SoapUIActionConfig action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionConfig)get_store().find_element_user(ACTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(action);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "action" element
     */
    public com.eviware.soapui.config.SoapUIActionConfig insertNewAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionConfig)get_store().insert_element_user(ACTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "action" element
     */
    public com.eviware.soapui.config.SoapUIActionConfig addNewAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionConfig)get_store().add_element_user(ACTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "action" element
     */
    public void removeAction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTION$0, i);
        }
    }
    
    /**
     * Gets a List of "actionGroup" elements
     */
    public java.util.List<com.eviware.soapui.config.SoapUIActionGroupConfig> getActionGroupList()
    {
        final class ActionGroupList extends java.util.AbstractList<com.eviware.soapui.config.SoapUIActionGroupConfig>
        {
            public com.eviware.soapui.config.SoapUIActionGroupConfig get(int i)
                { return SoapUIActionsConfigImpl.this.getActionGroupArray(i); }
            
            public com.eviware.soapui.config.SoapUIActionGroupConfig set(int i, com.eviware.soapui.config.SoapUIActionGroupConfig o)
            {
                com.eviware.soapui.config.SoapUIActionGroupConfig old = SoapUIActionsConfigImpl.this.getActionGroupArray(i);
                SoapUIActionsConfigImpl.this.setActionGroupArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SoapUIActionGroupConfig o)
                { SoapUIActionsConfigImpl.this.insertNewActionGroup(i).set(o); }
            
            public com.eviware.soapui.config.SoapUIActionGroupConfig remove(int i)
            {
                com.eviware.soapui.config.SoapUIActionGroupConfig old = SoapUIActionsConfigImpl.this.getActionGroupArray(i);
                SoapUIActionsConfigImpl.this.removeActionGroup(i);
                return old;
            }
            
            public int size()
                { return SoapUIActionsConfigImpl.this.sizeOfActionGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ActionGroupList();
        }
    }
    
    /**
     * Gets array of all "actionGroup" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SoapUIActionGroupConfig[] getActionGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SoapUIActionGroupConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SoapUIActionGroupConfig>();
            get_store().find_all_element_users(ACTIONGROUP$2, targetList);
            com.eviware.soapui.config.SoapUIActionGroupConfig[] result = new com.eviware.soapui.config.SoapUIActionGroupConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "actionGroup" element
     */
    public com.eviware.soapui.config.SoapUIActionGroupConfig getActionGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionGroupConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionGroupConfig)get_store().find_element_user(ACTIONGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "actionGroup" element
     */
    public int sizeOfActionGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIONGROUP$2);
        }
    }
    
    /**
     * Sets array of all "actionGroup" element
     */
    public void setActionGroupArray(com.eviware.soapui.config.SoapUIActionGroupConfig[] actionGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actionGroupArray, ACTIONGROUP$2);
        }
    }
    
    /**
     * Sets ith "actionGroup" element
     */
    public void setActionGroupArray(int i, com.eviware.soapui.config.SoapUIActionGroupConfig actionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionGroupConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionGroupConfig)get_store().find_element_user(ACTIONGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(actionGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actionGroup" element
     */
    public com.eviware.soapui.config.SoapUIActionGroupConfig insertNewActionGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionGroupConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionGroupConfig)get_store().insert_element_user(ACTIONGROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actionGroup" element
     */
    public com.eviware.soapui.config.SoapUIActionGroupConfig addNewActionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionGroupConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionGroupConfig)get_store().add_element_user(ACTIONGROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "actionGroup" element
     */
    public void removeActionGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIONGROUP$2, i);
        }
    }
}
