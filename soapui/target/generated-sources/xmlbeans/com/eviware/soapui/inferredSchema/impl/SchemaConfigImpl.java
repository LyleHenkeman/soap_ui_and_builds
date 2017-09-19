/*
 * XML Type:  Schema
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SchemaConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML Schema(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class SchemaConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.inferredSchema.SchemaConfig
{
    private static final long serialVersionUID = 1L;
    
    public SchemaConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMESPACE$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "namespace");
    private static final javax.xml.namespace.QName PARTICLE$2 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "particle");
    private static final javax.xml.namespace.QName PREFIX$4 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "prefix");
    private static final javax.xml.namespace.QName COMPLEXTYPE$6 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "complexType");
    
    
    /**
     * Gets the "namespace" element
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" element
     */
    public org.apache.xmlbeans.XmlString xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMESPACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "namespace" element
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAMESPACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAMESPACE$0);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" element
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlString namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAMESPACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAMESPACE$0);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Gets a List of "particle" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> getParticleList()
    {
        final class ParticleList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.ParticleConfig>
        {
            public com.eviware.soapui.inferredSchema.ParticleConfig get(int i)
                { return SchemaConfigImpl.this.getParticleArray(i); }
            
            public com.eviware.soapui.inferredSchema.ParticleConfig set(int i, com.eviware.soapui.inferredSchema.ParticleConfig o)
            {
                com.eviware.soapui.inferredSchema.ParticleConfig old = SchemaConfigImpl.this.getParticleArray(i);
                SchemaConfigImpl.this.setParticleArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.ParticleConfig o)
                { SchemaConfigImpl.this.insertNewParticle(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.ParticleConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.ParticleConfig old = SchemaConfigImpl.this.getParticleArray(i);
                SchemaConfigImpl.this.removeParticle(i);
                return old;
            }
            
            public int size()
                { return SchemaConfigImpl.this.sizeOfParticleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ParticleList();
        }
    }
    
    /**
     * Gets array of all "particle" elements
     * @deprecated
     */
    public com.eviware.soapui.inferredSchema.ParticleConfig[] getParticleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.ParticleConfig>();
            get_store().find_all_element_users(PARTICLE$2, targetList);
            com.eviware.soapui.inferredSchema.ParticleConfig[] result = new com.eviware.soapui.inferredSchema.ParticleConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "particle" element
     */
    public com.eviware.soapui.inferredSchema.ParticleConfig getParticleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().find_element_user(PARTICLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "particle" element
     */
    public int sizeOfParticleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICLE$2);
        }
    }
    
    /**
     * Sets array of all "particle" element
     */
    public void setParticleArray(com.eviware.soapui.inferredSchema.ParticleConfig[] particleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(particleArray, PARTICLE$2);
        }
    }
    
    /**
     * Sets ith "particle" element
     */
    public void setParticleArray(int i, com.eviware.soapui.inferredSchema.ParticleConfig particle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().find_element_user(PARTICLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(particle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "particle" element
     */
    public com.eviware.soapui.inferredSchema.ParticleConfig insertNewParticle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().insert_element_user(PARTICLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "particle" element
     */
    public com.eviware.soapui.inferredSchema.ParticleConfig addNewParticle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ParticleConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ParticleConfig)get_store().add_element_user(PARTICLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "particle" element
     */
    public void removeParticle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICLE$2, i);
        }
    }
    
    /**
     * Gets a List of "prefix" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.MapEntryConfig> getPrefixList()
    {
        final class PrefixList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.MapEntryConfig>
        {
            public com.eviware.soapui.inferredSchema.MapEntryConfig get(int i)
                { return SchemaConfigImpl.this.getPrefixArray(i); }
            
            public com.eviware.soapui.inferredSchema.MapEntryConfig set(int i, com.eviware.soapui.inferredSchema.MapEntryConfig o)
            {
                com.eviware.soapui.inferredSchema.MapEntryConfig old = SchemaConfigImpl.this.getPrefixArray(i);
                SchemaConfigImpl.this.setPrefixArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.MapEntryConfig o)
                { SchemaConfigImpl.this.insertNewPrefix(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.MapEntryConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.MapEntryConfig old = SchemaConfigImpl.this.getPrefixArray(i);
                SchemaConfigImpl.this.removePrefix(i);
                return old;
            }
            
            public int size()
                { return SchemaConfigImpl.this.sizeOfPrefixArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PrefixList();
        }
    }
    
    /**
     * Gets array of all "prefix" elements
     * @deprecated
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig[] getPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.MapEntryConfig> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.MapEntryConfig>();
            get_store().find_all_element_users(PREFIX$4, targetList);
            com.eviware.soapui.inferredSchema.MapEntryConfig[] result = new com.eviware.soapui.inferredSchema.MapEntryConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prefix" element
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig getPrefixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().find_element_user(PREFIX$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prefix" element
     */
    public int sizeOfPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIX$4);
        }
    }
    
    /**
     * Sets array of all "prefix" element
     */
    public void setPrefixArray(com.eviware.soapui.inferredSchema.MapEntryConfig[] prefixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(prefixArray, PREFIX$4);
        }
    }
    
    /**
     * Sets ith "prefix" element
     */
    public void setPrefixArray(int i, com.eviware.soapui.inferredSchema.MapEntryConfig prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().find_element_user(PREFIX$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prefix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig insertNewPrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().insert_element_user(PREFIX$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    public com.eviware.soapui.inferredSchema.MapEntryConfig addNewPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.MapEntryConfig target = null;
            target = (com.eviware.soapui.inferredSchema.MapEntryConfig)get_store().add_element_user(PREFIX$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "prefix" element
     */
    public void removePrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIX$4, i);
        }
    }
    
    /**
     * Gets a List of "complexType" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.ComplexTypeConfig> getComplexTypeList()
    {
        final class ComplexTypeList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.ComplexTypeConfig>
        {
            public com.eviware.soapui.inferredSchema.ComplexTypeConfig get(int i)
                { return SchemaConfigImpl.this.getComplexTypeArray(i); }
            
            public com.eviware.soapui.inferredSchema.ComplexTypeConfig set(int i, com.eviware.soapui.inferredSchema.ComplexTypeConfig o)
            {
                com.eviware.soapui.inferredSchema.ComplexTypeConfig old = SchemaConfigImpl.this.getComplexTypeArray(i);
                SchemaConfigImpl.this.setComplexTypeArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.ComplexTypeConfig o)
                { SchemaConfigImpl.this.insertNewComplexType(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.ComplexTypeConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.ComplexTypeConfig old = SchemaConfigImpl.this.getComplexTypeArray(i);
                SchemaConfigImpl.this.removeComplexType(i);
                return old;
            }
            
            public int size()
                { return SchemaConfigImpl.this.sizeOfComplexTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ComplexTypeList();
        }
    }
    
    /**
     * Gets array of all "complexType" elements
     * @deprecated
     */
    public com.eviware.soapui.inferredSchema.ComplexTypeConfig[] getComplexTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.ComplexTypeConfig> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.ComplexTypeConfig>();
            get_store().find_all_element_users(COMPLEXTYPE$6, targetList);
            com.eviware.soapui.inferredSchema.ComplexTypeConfig[] result = new com.eviware.soapui.inferredSchema.ComplexTypeConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "complexType" element
     */
    public com.eviware.soapui.inferredSchema.ComplexTypeConfig getComplexTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ComplexTypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ComplexTypeConfig)get_store().find_element_user(COMPLEXTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "complexType" element
     */
    public int sizeOfComplexTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEXTYPE$6);
        }
    }
    
    /**
     * Sets array of all "complexType" element
     */
    public void setComplexTypeArray(com.eviware.soapui.inferredSchema.ComplexTypeConfig[] complexTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(complexTypeArray, COMPLEXTYPE$6);
        }
    }
    
    /**
     * Sets ith "complexType" element
     */
    public void setComplexTypeArray(int i, com.eviware.soapui.inferredSchema.ComplexTypeConfig complexType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ComplexTypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ComplexTypeConfig)get_store().find_element_user(COMPLEXTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(complexType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complexType" element
     */
    public com.eviware.soapui.inferredSchema.ComplexTypeConfig insertNewComplexType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ComplexTypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ComplexTypeConfig)get_store().insert_element_user(COMPLEXTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complexType" element
     */
    public com.eviware.soapui.inferredSchema.ComplexTypeConfig addNewComplexType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.ComplexTypeConfig target = null;
            target = (com.eviware.soapui.inferredSchema.ComplexTypeConfig)get_store().add_element_user(COMPLEXTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "complexType" element
     */
    public void removeComplexType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEXTYPE$6, i);
        }
    }
}
