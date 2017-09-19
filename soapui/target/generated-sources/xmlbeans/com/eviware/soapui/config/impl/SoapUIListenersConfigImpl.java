/*
 * XML Type:  SoapUIListeners
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIListenersConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIListeners(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIListenersConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIListenersConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIListenersConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTENER$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "listener");
    
    
    /**
     * Gets a List of "listener" elements
     */
    public java.util.List<com.eviware.soapui.config.SoapUIListenerConfig> getListenerList()
    {
        final class ListenerList extends java.util.AbstractList<com.eviware.soapui.config.SoapUIListenerConfig>
        {
            public com.eviware.soapui.config.SoapUIListenerConfig get(int i)
                { return SoapUIListenersConfigImpl.this.getListenerArray(i); }
            
            public com.eviware.soapui.config.SoapUIListenerConfig set(int i, com.eviware.soapui.config.SoapUIListenerConfig o)
            {
                com.eviware.soapui.config.SoapUIListenerConfig old = SoapUIListenersConfigImpl.this.getListenerArray(i);
                SoapUIListenersConfigImpl.this.setListenerArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SoapUIListenerConfig o)
                { SoapUIListenersConfigImpl.this.insertNewListener(i).set(o); }
            
            public com.eviware.soapui.config.SoapUIListenerConfig remove(int i)
            {
                com.eviware.soapui.config.SoapUIListenerConfig old = SoapUIListenersConfigImpl.this.getListenerArray(i);
                SoapUIListenersConfigImpl.this.removeListener(i);
                return old;
            }
            
            public int size()
                { return SoapUIListenersConfigImpl.this.sizeOfListenerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ListenerList();
        }
    }
    
    /**
     * Gets array of all "listener" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SoapUIListenerConfig[] getListenerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SoapUIListenerConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SoapUIListenerConfig>();
            get_store().find_all_element_users(LISTENER$0, targetList);
            com.eviware.soapui.config.SoapUIListenerConfig[] result = new com.eviware.soapui.config.SoapUIListenerConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "listener" element
     */
    public com.eviware.soapui.config.SoapUIListenerConfig getListenerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenerConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenerConfig)get_store().find_element_user(LISTENER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "listener" element
     */
    public int sizeOfListenerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTENER$0);
        }
    }
    
    /**
     * Sets array of all "listener" element
     */
    public void setListenerArray(com.eviware.soapui.config.SoapUIListenerConfig[] listenerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listenerArray, LISTENER$0);
        }
    }
    
    /**
     * Sets ith "listener" element
     */
    public void setListenerArray(int i, com.eviware.soapui.config.SoapUIListenerConfig listener)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenerConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenerConfig)get_store().find_element_user(LISTENER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listener);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listener" element
     */
    public com.eviware.soapui.config.SoapUIListenerConfig insertNewListener(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenerConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenerConfig)get_store().insert_element_user(LISTENER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listener" element
     */
    public com.eviware.soapui.config.SoapUIListenerConfig addNewListener()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIListenerConfig target = null;
            target = (com.eviware.soapui.config.SoapUIListenerConfig)get_store().add_element_user(LISTENER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "listener" element
     */
    public void removeListener(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTENER$0, i);
        }
    }
}
