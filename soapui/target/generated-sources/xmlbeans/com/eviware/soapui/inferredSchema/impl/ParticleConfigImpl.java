/*
 * XML Type:  Particle
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.ParticleConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML Particle(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class ParticleConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.inferredSchema.ParticleConfig
{
    private static final long serialVersionUID = 1L;
    
    public ParticleConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "name");
    private static final javax.xml.namespace.QName ATTRIBUTE$2 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "attribute");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets a List of "attribute" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.MapEntryConfig> getAttributeList()
    {
        final class AttributeList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.MapEntryConfig>
        {
            public com.eviware.soapui.inferredSchema.MapEntryConfig get(int i)
                { return ParticleConfigImpl.this.getAttributeArray(i); }
            
            public com.eviware.soapui.inferredSchema.MapEntryConfig set(int i, com.eviware.soapui.inferredSchema.MapEntryConfig o)
            {
                com.eviware.soapui.inferredSchema.MapEntryConfig old = ParticleConfigImpl.this.getAttributeArray(i);
                ParticleConfigImpl.this.setAttributeArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.MapEntryConfig o)
                { ParticleConfigImpl.this.insertNewAttribute(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.MapEntryConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.MapEntryConfig old = ParticleConfigImpl.this.getAttributeArray(i);
                ParticleConfigImpl.this.removeAttribute(i);
                return old;
            }
            
            public int size()
                { return ParticleConfigImpl.this.sizeOfAttributeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AttributeList();
        }
    }
    
    /**
     * Gets array of all "attribute" elements
     * @deprecated
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.MapEntryConfig> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.MapEntryConfig>();
            get_store().find_all_element_users(ATTRIBUTE$2, targetList);
            com.eviware.soapui.inferredSchema.MapEntryConfig[] result = new com.eviware.soapui.inferredSchema.MapEntryConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attribute" element
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().find_element_user(ATTRIBUTE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$2);
        }
    }
    
    /**
     * Sets array of all "attribute" element
     */
    public void setAttributeArray(com.eviware.soapui.inferredSchema.MapEntryConfig[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$2);
        }
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, com.eviware.soapui.inferredSchema.MapEntryConfig attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().find_element_user(ATTRIBUTE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().insert_element_user(ATTRIBUTE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().add_element_user(ATTRIBUTE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$2, i);
        }
    }
}
