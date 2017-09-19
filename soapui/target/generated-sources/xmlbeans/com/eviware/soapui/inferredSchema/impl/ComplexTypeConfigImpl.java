/*
 * XML Type:  ComplexType
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.ComplexTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML ComplexType(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class ComplexTypeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.inferredSchema.ComplexTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public ComplexTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETED$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "completed");
    private static final javax.xml.namespace.QName MIXED$2 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "mixed");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "name");
    private static final javax.xml.namespace.QName ATTRIBUTE$6 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "attribute");
    private static final javax.xml.namespace.QName CONTENT$8 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "content");
    
    
    /**
     * Gets the "completed" element
     */
    public boolean getCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "completed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "completed" element
     */
    public void setCompleted(boolean completed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETED$0);
            }
            target.setBooleanValue(completed);
        }
    }
    
    /**
     * Sets (as xml) the "completed" element
     */
    public void xsetCompleted(org.apache.xmlbeans.XmlBoolean completed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPLETED$0);
            }
            target.set(completed);
        }
    }
    
    /**
     * Gets the "mixed" element
     */
    public boolean getMixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIXED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mixed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMixed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MIXED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mixed" element
     */
    public void setMixed(boolean mixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIXED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIXED$2);
            }
            target.setBooleanValue(mixed);
        }
    }
    
    /**
     * Sets (as xml) the "mixed" element
     */
    public void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MIXED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MIXED$2);
            }
            target.set(mixed);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets a List of "attribute" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> getAttributeList()
    {
        final class AttributeList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.ParticleConfig>
        {
            public com.eviware.soapui.inferredSchema.ParticleConfig get(int i)
                { return ComplexTypeConfigImpl.this.getAttributeArray(i); }
            
            public com.eviware.soapui.inferredSchema.ParticleConfig set(int i, com.eviware.soapui.inferredSchema.ParticleConfig o)
            {
                com.eviware.soapui.inferredSchema.ParticleConfig old = ComplexTypeConfigImpl.this.getAttributeArray(i);
                ComplexTypeConfigImpl.this.setAttributeArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.ParticleConfig o)
                { ComplexTypeConfigImpl.this.insertNewAttribute(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.ParticleConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.ParticleConfig old = ComplexTypeConfigImpl.this.getAttributeArray(i);
                ComplexTypeConfigImpl.this.removeAttribute(i);
                return old;
            }
            
            public int size()
                { return ComplexTypeConfigImpl.this.sizeOfAttributeArray(); }
            
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
    public com.eviware.soapui.inferredSchema.ParticleConfig[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.ParticleConfig>();
            get_store().find_all_element_users(ATTRIBUTE$6, targetList);
            com.eviware.soapui.inferredSchema.ParticleConfig[] result = new com.eviware.soapui.inferredSchema.ParticleConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "attribute" element
     */
    public com.eviware.soapui.inferredSchema.ParticleConfig getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().find_element_user(ATTRIBUTE$6, i);
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
            return get_store().count_elements(ATTRIBUTE$6);
        }
    }
    
    /**
     * Sets array of all "attribute" element
     */
    public void setAttributeArray(com.eviware.soapui.inferredSchema.ParticleConfig[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$6);
        }
    }
    
    /**
     * Sets ith "attribute" element
     */
    public void setAttributeArray(int i, com.eviware.soapui.inferredSchema.ParticleConfig attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().find_element_user(ATTRIBUTE$6, i);
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
    public com.eviware.soapui.inferredSchema.ParticleConfig insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().insert_element_user(ATTRIBUTE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    public com.eviware.soapui.inferredSchema.ParticleConfig addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().add_element_user(ATTRIBUTE$6);
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
            get_store().remove_element(ATTRIBUTE$6, i);
        }
    }
    
    /**
     * Gets the "content" element
     */
    public com.eviware.soapui.inferredSchema.ContentConfig getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ContentConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ContentConfig)get_store().find_element_user(CONTENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(com.eviware.soapui.inferredSchema.ContentConfig content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ContentConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ContentConfig)get_store().find_element_user(CONTENT$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.inferredSchema.ContentConfig)get_store().add_element_user(CONTENT$8);
            }
            target.set(content);
        }
    }
    
    /**
     * Appends and returns a new empty "content" element
     */
    public com.eviware.soapui.inferredSchema.ContentConfig addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ContentConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ContentConfig)get_store().add_element_user(CONTENT$8);
            return target;
        }
    }
}
