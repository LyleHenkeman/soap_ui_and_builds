/*
 * XML Type:  MaliciousAttachmentElement
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MaliciousAttachmentElementConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MaliciousAttachmentElement(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MaliciousAttachmentElementConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MaliciousAttachmentElementConfig
{
    private static final long serialVersionUID = 1L;
    
    public MaliciousAttachmentElementConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLACEATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "replaceAttachment");
    private static final javax.xml.namespace.QName GENERATEATTACHMENT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "generateAttachment");
    private static final javax.xml.namespace.QName KEY$4 = 
        new javax.xml.namespace.QName("", "key");
    private static final javax.xml.namespace.QName REMOVE$6 = 
        new javax.xml.namespace.QName("", "remove");
    
    
    /**
     * Gets a List of "replaceAttachment" elements
     */
    public java.util.List<com.eviware.soapui.config.MaliciousAttachmentConfig> getReplaceAttachmentList()
    {
        final class ReplaceAttachmentList extends java.util.AbstractList<com.eviware.soapui.config.MaliciousAttachmentConfig>
        {
            public com.eviware.soapui.config.MaliciousAttachmentConfig get(int i)
                { return MaliciousAttachmentElementConfigImpl.this.getReplaceAttachmentArray(i); }
            
            public com.eviware.soapui.config.MaliciousAttachmentConfig set(int i, com.eviware.soapui.config.MaliciousAttachmentConfig o)
            {
                com.eviware.soapui.config.MaliciousAttachmentConfig old = MaliciousAttachmentElementConfigImpl.this.getReplaceAttachmentArray(i);
                MaliciousAttachmentElementConfigImpl.this.setReplaceAttachmentArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MaliciousAttachmentConfig o)
                { MaliciousAttachmentElementConfigImpl.this.insertNewReplaceAttachment(i).set(o); }
            
            public com.eviware.soapui.config.MaliciousAttachmentConfig remove(int i)
            {
                com.eviware.soapui.config.MaliciousAttachmentConfig old = MaliciousAttachmentElementConfigImpl.this.getReplaceAttachmentArray(i);
                MaliciousAttachmentElementConfigImpl.this.removeReplaceAttachment(i);
                return old;
            }
            
            public int size()
                { return MaliciousAttachmentElementConfigImpl.this.sizeOfReplaceAttachmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ReplaceAttachmentList();
        }
    }
    
    /**
     * Gets array of all "replaceAttachment" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig[] getReplaceAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MaliciousAttachmentConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MaliciousAttachmentConfig>();
            get_store().find_all_element_users(REPLACEATTACHMENT$0, targetList);
            com.eviware.soapui.config.MaliciousAttachmentConfig[] result = new com.eviware.soapui.config.MaliciousAttachmentConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "replaceAttachment" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig getReplaceAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().find_element_user(REPLACEATTACHMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "replaceAttachment" element
     */
    public int sizeOfReplaceAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLACEATTACHMENT$0);
        }
    }
    
    /**
     * Sets array of all "replaceAttachment" element
     */
    public void setReplaceAttachmentArray(com.eviware.soapui.config.MaliciousAttachmentConfig[] replaceAttachmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(replaceAttachmentArray, REPLACEATTACHMENT$0);
        }
    }
    
    /**
     * Sets ith "replaceAttachment" element
     */
    public void setReplaceAttachmentArray(int i, com.eviware.soapui.config.MaliciousAttachmentConfig replaceAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().find_element_user(REPLACEATTACHMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(replaceAttachment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "replaceAttachment" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig insertNewReplaceAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().insert_element_user(REPLACEATTACHMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "replaceAttachment" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig addNewReplaceAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().add_element_user(REPLACEATTACHMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "replaceAttachment" element
     */
    public void removeReplaceAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLACEATTACHMENT$0, i);
        }
    }
    
    /**
     * Gets a List of "generateAttachment" elements
     */
    public java.util.List<com.eviware.soapui.config.MaliciousAttachmentConfig> getGenerateAttachmentList()
    {
        final class GenerateAttachmentList extends java.util.AbstractList<com.eviware.soapui.config.MaliciousAttachmentConfig>
        {
            public com.eviware.soapui.config.MaliciousAttachmentConfig get(int i)
                { return MaliciousAttachmentElementConfigImpl.this.getGenerateAttachmentArray(i); }
            
            public com.eviware.soapui.config.MaliciousAttachmentConfig set(int i, com.eviware.soapui.config.MaliciousAttachmentConfig o)
            {
                com.eviware.soapui.config.MaliciousAttachmentConfig old = MaliciousAttachmentElementConfigImpl.this.getGenerateAttachmentArray(i);
                MaliciousAttachmentElementConfigImpl.this.setGenerateAttachmentArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MaliciousAttachmentConfig o)
                { MaliciousAttachmentElementConfigImpl.this.insertNewGenerateAttachment(i).set(o); }
            
            public com.eviware.soapui.config.MaliciousAttachmentConfig remove(int i)
            {
                com.eviware.soapui.config.MaliciousAttachmentConfig old = MaliciousAttachmentElementConfigImpl.this.getGenerateAttachmentArray(i);
                MaliciousAttachmentElementConfigImpl.this.removeGenerateAttachment(i);
                return old;
            }
            
            public int size()
                { return MaliciousAttachmentElementConfigImpl.this.sizeOfGenerateAttachmentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GenerateAttachmentList();
        }
    }
    
    /**
     * Gets array of all "generateAttachment" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig[] getGenerateAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MaliciousAttachmentConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MaliciousAttachmentConfig>();
            get_store().find_all_element_users(GENERATEATTACHMENT$2, targetList);
            com.eviware.soapui.config.MaliciousAttachmentConfig[] result = new com.eviware.soapui.config.MaliciousAttachmentConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "generateAttachment" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig getGenerateAttachmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().find_element_user(GENERATEATTACHMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "generateAttachment" element
     */
    public int sizeOfGenerateAttachmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERATEATTACHMENT$2);
        }
    }
    
    /**
     * Sets array of all "generateAttachment" element
     */
    public void setGenerateAttachmentArray(com.eviware.soapui.config.MaliciousAttachmentConfig[] generateAttachmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(generateAttachmentArray, GENERATEATTACHMENT$2);
        }
    }
    
    /**
     * Sets ith "generateAttachment" element
     */
    public void setGenerateAttachmentArray(int i, com.eviware.soapui.config.MaliciousAttachmentConfig generateAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().find_element_user(GENERATEATTACHMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(generateAttachment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "generateAttachment" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig insertNewGenerateAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().insert_element_user(GENERATEATTACHMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "generateAttachment" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentConfig addNewGenerateAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentConfig)get_store().add_element_user(GENERATEATTACHMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "generateAttachment" element
     */
    public void removeGenerateAttachment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERATEATTACHMENT$2, i);
        }
    }
    
    /**
     * Gets the "key" attribute
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key" attribute
     */
    public org.apache.xmlbeans.XmlString xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$4);
            return target;
        }
    }
    
    /**
     * True if has "key" attribute
     */
    public boolean isSetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEY$4) != null;
        }
    }
    
    /**
     * Sets the "key" attribute
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$4);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "key" attribute
     */
    public void xsetKey(org.apache.xmlbeans.XmlString key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$4);
            }
            target.set(key);
        }
    }
    
    /**
     * Unsets the "key" attribute
     */
    public void unsetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEY$4);
        }
    }
    
    /**
     * Gets the "remove" attribute
     */
    public boolean getRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVE$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "remove" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REMOVE$6);
            return target;
        }
    }
    
    /**
     * True if has "remove" attribute
     */
    public boolean isSetRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOVE$6) != null;
        }
    }
    
    /**
     * Sets the "remove" attribute
     */
    public void setRemove(boolean remove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOVE$6);
            }
            target.setBooleanValue(remove);
        }
    }
    
    /**
     * Sets (as xml) the "remove" attribute
     */
    public void xsetRemove(org.apache.xmlbeans.XmlBoolean remove)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(REMOVE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(REMOVE$6);
            }
            target.set(remove);
        }
    }
    
    /**
     * Unsets the "remove" attribute
     */
    public void unsetRemove()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOVE$6);
        }
    }
}
