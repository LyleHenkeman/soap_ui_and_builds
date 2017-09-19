/*
 * XML Type:  WssContainer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WssContainerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WssContainer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WssContainerConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.WssContainerConfig
{
    private static final long serialVersionUID = 1L;
    
    public WssContainerConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRYPTO$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "crypto");
    private static final javax.xml.namespace.QName INCOMING$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "incoming");
    private static final javax.xml.namespace.QName OUTGOING$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "outgoing");
    
    
    /**
     * Gets a List of "crypto" elements
     */
    public java.util.List<com.eviware.soapui.config.KeyMaterialCryptoConfig> getCryptoList()
    {
        final class CryptoList extends java.util.AbstractList<com.eviware.soapui.config.KeyMaterialCryptoConfig>
        {
            public com.eviware.soapui.config.KeyMaterialCryptoConfig get(int i)
                { return WssContainerConfigImpl.this.getCryptoArray(i); }
            
            public com.eviware.soapui.config.KeyMaterialCryptoConfig set(int i, com.eviware.soapui.config.KeyMaterialCryptoConfig o)
            {
                com.eviware.soapui.config.KeyMaterialCryptoConfig old = WssContainerConfigImpl.this.getCryptoArray(i);
                WssContainerConfigImpl.this.setCryptoArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.KeyMaterialCryptoConfig o)
                { WssContainerConfigImpl.this.insertNewCrypto(i).set(o); }
            
            public com.eviware.soapui.config.KeyMaterialCryptoConfig remove(int i)
            {
                com.eviware.soapui.config.KeyMaterialCryptoConfig old = WssContainerConfigImpl.this.getCryptoArray(i);
                WssContainerConfigImpl.this.removeCrypto(i);
                return old;
            }
            
            public int size()
                { return WssContainerConfigImpl.this.sizeOfCryptoArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CryptoList();
        }
    }
    
    /**
     * Gets array of all "crypto" elements
     * @deprecated
     */
    public com.eviware.soapui.config.KeyMaterialCryptoConfig[] getCryptoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.KeyMaterialCryptoConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.KeyMaterialCryptoConfig>();
            get_store().find_all_element_users(CRYPTO$0, targetList);
            com.eviware.soapui.config.KeyMaterialCryptoConfig[] result = new com.eviware.soapui.config.KeyMaterialCryptoConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "crypto" element
     */
    public com.eviware.soapui.config.KeyMaterialCryptoConfig getCryptoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.KeyMaterialCryptoConfig target = null;
            target = (com.eviware.soapui.config.KeyMaterialCryptoConfig)get_store().find_element_user(CRYPTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "crypto" element
     */
    public int sizeOfCryptoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CRYPTO$0);
        }
    }
    
    /**
     * Sets array of all "crypto" element
     */
    public void setCryptoArray(com.eviware.soapui.config.KeyMaterialCryptoConfig[] cryptoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cryptoArray, CRYPTO$0);
        }
    }
    
    /**
     * Sets ith "crypto" element
     */
    public void setCryptoArray(int i, com.eviware.soapui.config.KeyMaterialCryptoConfig crypto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.KeyMaterialCryptoConfig target = null;
            target = (com.eviware.soapui.config.KeyMaterialCryptoConfig)get_store().find_element_user(CRYPTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(crypto);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "crypto" element
     */
    public com.eviware.soapui.config.KeyMaterialCryptoConfig insertNewCrypto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.KeyMaterialCryptoConfig target = null;
            target = (com.eviware.soapui.config.KeyMaterialCryptoConfig)get_store().insert_element_user(CRYPTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "crypto" element
     */
    public com.eviware.soapui.config.KeyMaterialCryptoConfig addNewCrypto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.KeyMaterialCryptoConfig target = null;
            target = (com.eviware.soapui.config.KeyMaterialCryptoConfig)get_store().add_element_user(CRYPTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "crypto" element
     */
    public void removeCrypto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CRYPTO$0, i);
        }
    }
    
    /**
     * Gets a List of "incoming" elements
     */
    public java.util.List<com.eviware.soapui.config.IncomingWssConfig> getIncomingList()
    {
        final class IncomingList extends java.util.AbstractList<com.eviware.soapui.config.IncomingWssConfig>
        {
            public com.eviware.soapui.config.IncomingWssConfig get(int i)
                { return WssContainerConfigImpl.this.getIncomingArray(i); }
            
            public com.eviware.soapui.config.IncomingWssConfig set(int i, com.eviware.soapui.config.IncomingWssConfig o)
            {
                com.eviware.soapui.config.IncomingWssConfig old = WssContainerConfigImpl.this.getIncomingArray(i);
                WssContainerConfigImpl.this.setIncomingArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.IncomingWssConfig o)
                { WssContainerConfigImpl.this.insertNewIncoming(i).set(o); }
            
            public com.eviware.soapui.config.IncomingWssConfig remove(int i)
            {
                com.eviware.soapui.config.IncomingWssConfig old = WssContainerConfigImpl.this.getIncomingArray(i);
                WssContainerConfigImpl.this.removeIncoming(i);
                return old;
            }
            
            public int size()
                { return WssContainerConfigImpl.this.sizeOfIncomingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncomingList();
        }
    }
    
    /**
     * Gets array of all "incoming" elements
     * @deprecated
     */
    public com.eviware.soapui.config.IncomingWssConfig[] getIncomingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.IncomingWssConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.IncomingWssConfig>();
            get_store().find_all_element_users(INCOMING$2, targetList);
            com.eviware.soapui.config.IncomingWssConfig[] result = new com.eviware.soapui.config.IncomingWssConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "incoming" element
     */
    public com.eviware.soapui.config.IncomingWssConfig getIncomingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.IncomingWssConfig target = null;
            target = (com.eviware.soapui.config.IncomingWssConfig)get_store().find_element_user(INCOMING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "incoming" element
     */
    public int sizeOfIncomingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCOMING$2);
        }
    }
    
    /**
     * Sets array of all "incoming" element
     */
    public void setIncomingArray(com.eviware.soapui.config.IncomingWssConfig[] incomingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incomingArray, INCOMING$2);
        }
    }
    
    /**
     * Sets ith "incoming" element
     */
    public void setIncomingArray(int i, com.eviware.soapui.config.IncomingWssConfig incoming)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.IncomingWssConfig target = null;
            target = (com.eviware.soapui.config.IncomingWssConfig)get_store().find_element_user(INCOMING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incoming);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "incoming" element
     */
    public com.eviware.soapui.config.IncomingWssConfig insertNewIncoming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.IncomingWssConfig target = null;
            target = (com.eviware.soapui.config.IncomingWssConfig)get_store().insert_element_user(INCOMING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "incoming" element
     */
    public com.eviware.soapui.config.IncomingWssConfig addNewIncoming()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.IncomingWssConfig target = null;
            target = (com.eviware.soapui.config.IncomingWssConfig)get_store().add_element_user(INCOMING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "incoming" element
     */
    public void removeIncoming(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCOMING$2, i);
        }
    }
    
    /**
     * Gets a List of "outgoing" elements
     */
    public java.util.List<com.eviware.soapui.config.OutgoingWssConfig> getOutgoingList()
    {
        final class OutgoingList extends java.util.AbstractList<com.eviware.soapui.config.OutgoingWssConfig>
        {
            public com.eviware.soapui.config.OutgoingWssConfig get(int i)
                { return WssContainerConfigImpl.this.getOutgoingArray(i); }
            
            public com.eviware.soapui.config.OutgoingWssConfig set(int i, com.eviware.soapui.config.OutgoingWssConfig o)
            {
                com.eviware.soapui.config.OutgoingWssConfig old = WssContainerConfigImpl.this.getOutgoingArray(i);
                WssContainerConfigImpl.this.setOutgoingArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.OutgoingWssConfig o)
                { WssContainerConfigImpl.this.insertNewOutgoing(i).set(o); }
            
            public com.eviware.soapui.config.OutgoingWssConfig remove(int i)
            {
                com.eviware.soapui.config.OutgoingWssConfig old = WssContainerConfigImpl.this.getOutgoingArray(i);
                WssContainerConfigImpl.this.removeOutgoing(i);
                return old;
            }
            
            public int size()
                { return WssContainerConfigImpl.this.sizeOfOutgoingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OutgoingList();
        }
    }
    
    /**
     * Gets array of all "outgoing" elements
     * @deprecated
     */
    public com.eviware.soapui.config.OutgoingWssConfig[] getOutgoingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.OutgoingWssConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.OutgoingWssConfig>();
            get_store().find_all_element_users(OUTGOING$4, targetList);
            com.eviware.soapui.config.OutgoingWssConfig[] result = new com.eviware.soapui.config.OutgoingWssConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "outgoing" element
     */
    public com.eviware.soapui.config.OutgoingWssConfig getOutgoingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OutgoingWssConfig target = null;
            target = (com.eviware.soapui.config.OutgoingWssConfig)get_store().find_element_user(OUTGOING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outgoing" element
     */
    public int sizeOfOutgoingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTGOING$4);
        }
    }
    
    /**
     * Sets array of all "outgoing" element
     */
    public void setOutgoingArray(com.eviware.soapui.config.OutgoingWssConfig[] outgoingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outgoingArray, OUTGOING$4);
        }
    }
    
    /**
     * Sets ith "outgoing" element
     */
    public void setOutgoingArray(int i, com.eviware.soapui.config.OutgoingWssConfig outgoing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OutgoingWssConfig target = null;
            target = (com.eviware.soapui.config.OutgoingWssConfig)get_store().find_element_user(OUTGOING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outgoing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outgoing" element
     */
    public com.eviware.soapui.config.OutgoingWssConfig insertNewOutgoing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OutgoingWssConfig target = null;
            target = (com.eviware.soapui.config.OutgoingWssConfig)get_store().insert_element_user(OUTGOING$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outgoing" element
     */
    public com.eviware.soapui.config.OutgoingWssConfig addNewOutgoing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OutgoingWssConfig target = null;
            target = (com.eviware.soapui.config.OutgoingWssConfig)get_store().add_element_user(OUTGOING$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "outgoing" element
     */
    public void removeOutgoing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTGOING$4, i);
        }
    }
}
