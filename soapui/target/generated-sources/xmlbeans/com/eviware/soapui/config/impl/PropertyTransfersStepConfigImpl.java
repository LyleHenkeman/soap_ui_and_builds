/*
 * XML Type:  PropertyTransfersStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PropertyTransfersStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML PropertyTransfersStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class PropertyTransfersStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.PropertyTransfersStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public PropertyTransfersStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "transfers");
    
    
    /**
     * Gets a List of "transfers" elements
     */
    public java.util.List<com.eviware.soapui.config.PropertyTransferConfig> getTransfersList()
    {
        final class TransfersList extends java.util.AbstractList<com.eviware.soapui.config.PropertyTransferConfig>
        {
            public com.eviware.soapui.config.PropertyTransferConfig get(int i)
                { return PropertyTransfersStepConfigImpl.this.getTransfersArray(i); }
            
            public com.eviware.soapui.config.PropertyTransferConfig set(int i, com.eviware.soapui.config.PropertyTransferConfig o)
            {
                com.eviware.soapui.config.PropertyTransferConfig old = PropertyTransfersStepConfigImpl.this.getTransfersArray(i);
                PropertyTransfersStepConfigImpl.this.setTransfersArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.PropertyTransferConfig o)
                { PropertyTransfersStepConfigImpl.this.insertNewTransfers(i).set(o); }
            
            public com.eviware.soapui.config.PropertyTransferConfig remove(int i)
            {
                com.eviware.soapui.config.PropertyTransferConfig old = PropertyTransfersStepConfigImpl.this.getTransfersArray(i);
                PropertyTransfersStepConfigImpl.this.removeTransfers(i);
                return old;
            }
            
            public int size()
                { return PropertyTransfersStepConfigImpl.this.sizeOfTransfersArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TransfersList();
        }
    }
    
    /**
     * Gets array of all "transfers" elements
     * @deprecated
     */
    public com.eviware.soapui.config.PropertyTransferConfig[] getTransfersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.PropertyTransferConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.PropertyTransferConfig>();
            get_store().find_all_element_users(TRANSFERS$0, targetList);
            com.eviware.soapui.config.PropertyTransferConfig[] result = new com.eviware.soapui.config.PropertyTransferConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "transfers" element
     */
    public com.eviware.soapui.config.PropertyTransferConfig getTransfersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferConfig)get_store().find_element_user(TRANSFERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "transfers" element
     */
    public int sizeOfTransfersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFERS$0);
        }
    }
    
    /**
     * Sets array of all "transfers" element
     */
    public void setTransfersArray(com.eviware.soapui.config.PropertyTransferConfig[] transfersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transfersArray, TRANSFERS$0);
        }
    }
    
    /**
     * Sets ith "transfers" element
     */
    public void setTransfersArray(int i, com.eviware.soapui.config.PropertyTransferConfig transfers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferConfig)get_store().find_element_user(TRANSFERS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transfers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transfers" element
     */
    public com.eviware.soapui.config.PropertyTransferConfig insertNewTransfers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferConfig)get_store().insert_element_user(TRANSFERS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transfers" element
     */
    public com.eviware.soapui.config.PropertyTransferConfig addNewTransfers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferConfig)get_store().add_element_user(TRANSFERS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "transfers" element
     */
    public void removeTransfers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFERS$0, i);
        }
    }
}
