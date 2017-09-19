/*
 * XML Type:  SequenceContent
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SequenceContentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML SequenceContent(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class SequenceContentConfigImpl extends com.eviware.soapui.inferredSchema.impl.ContentConfigImpl implements com.eviware.soapui.inferredSchema.SequenceContentConfig
{
    private static final long serialVersionUID = 1L;
    
    public SequenceContentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETED$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "completed");
    private static final javax.xml.namespace.QName PARTICLE$2 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "particle");
    private static final javax.xml.namespace.QName COMESBEFORE$4 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "comesBefore");
    
    
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
     * Gets a List of "particle" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> getParticleList()
    {
        final class ParticleList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.ParticleConfig>
        {
            public com.eviware.soapui.inferredSchema.ParticleConfig get(int i)
                { return SequenceContentConfigImpl.this.getParticleArray(i); }
            
            public com.eviware.soapui.inferredSchema.ParticleConfig set(int i, com.eviware.soapui.inferredSchema.ParticleConfig o)
            {
                com.eviware.soapui.inferredSchema.ParticleConfig old = SequenceContentConfigImpl.this.getParticleArray(i);
                SequenceContentConfigImpl.this.setParticleArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.ParticleConfig o)
                { SequenceContentConfigImpl.this.insertNewParticle(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.ParticleConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.ParticleConfig old = SequenceContentConfigImpl.this.getParticleArray(i);
                SequenceContentConfigImpl.this.removeParticle(i);
                return old;
            }
            
            public int size()
                { return SequenceContentConfigImpl.this.sizeOfParticleArray(); }
            
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
     * Gets a List of "comesBefore" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore> getComesBeforeList()
    {
        final class ComesBeforeList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore>
        {
            public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore get(int i)
                { return SequenceContentConfigImpl.this.getComesBeforeArray(i); }
            
            public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore set(int i, com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore o)
            {
                com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore old = SequenceContentConfigImpl.this.getComesBeforeArray(i);
                SequenceContentConfigImpl.this.setComesBeforeArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore o)
                { SequenceContentConfigImpl.this.insertNewComesBefore(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore remove(int i)
            {
                com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore old = SequenceContentConfigImpl.this.getComesBeforeArray(i);
                SequenceContentConfigImpl.this.removeComesBefore(i);
                return old;
            }
            
            public int size()
                { return SequenceContentConfigImpl.this.sizeOfComesBeforeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ComesBeforeList();
        }
    }
    
    /**
     * Gets array of all "comesBefore" elements
     * @deprecated
     */
    public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore[] getComesBeforeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore>();
            get_store().find_all_element_users(COMESBEFORE$4, targetList);
            com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore[] result = new com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comesBefore" element
     */
    public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore getComesBeforeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore target = null;
            target = (com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore)get_store().find_element_user(COMESBEFORE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comesBefore" element
     */
    public int sizeOfComesBeforeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMESBEFORE$4);
        }
    }
    
    /**
     * Sets array of all "comesBefore" element
     */
    public void setComesBeforeArray(com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore[] comesBeforeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(comesBeforeArray, COMESBEFORE$4);
        }
    }
    
    /**
     * Sets ith "comesBefore" element
     */
    public void setComesBeforeArray(int i, com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore comesBefore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore target = null;
            target = (com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore)get_store().find_element_user(COMESBEFORE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comesBefore);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comesBefore" element
     */
    public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore insertNewComesBefore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore target = null;
            target = (com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore)get_store().insert_element_user(COMESBEFORE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comesBefore" element
     */
    public com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore addNewComesBefore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore target = null;
            target = (com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore)get_store().add_element_user(COMESBEFORE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "comesBefore" element
     */
    public void removeComesBefore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMESBEFORE$4, i);
        }
    }
    /**
     * An XML comesBefore(@http://www.eviware.com/soapui/InferredSchema).
     *
     * This is a complex type.
     */
    public static class ComesBeforeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.inferredSchema.SequenceContentConfig.ComesBefore
    {
        private static final long serialVersionUID = 1L;
        
        public ComesBeforeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OTHER$0 = 
            new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "other");
        private static final javax.xml.namespace.QName QNAME$2 = 
            new javax.xml.namespace.QName("", "qname");
        
        
        /**
         * Gets a List of "other" elements
         */
        public java.util.List<javax.xml.namespace.QName> getOtherList()
        {
            final class OtherList extends java.util.AbstractList<javax.xml.namespace.QName>
            {
                public javax.xml.namespace.QName get(int i)
                    { return ComesBeforeImpl.this.getOtherArray(i); }
                
                public javax.xml.namespace.QName set(int i, javax.xml.namespace.QName o)
                {
                    javax.xml.namespace.QName old = ComesBeforeImpl.this.getOtherArray(i);
                    ComesBeforeImpl.this.setOtherArray(i, o);
                    return old;
                }
                
                public void add(int i, javax.xml.namespace.QName o)
                    { ComesBeforeImpl.this.insertOther(i, o); }
                
                public javax.xml.namespace.QName remove(int i)
                {
                    javax.xml.namespace.QName old = ComesBeforeImpl.this.getOtherArray(i);
                    ComesBeforeImpl.this.removeOther(i);
                    return old;
                }
                
                public int size()
                    { return ComesBeforeImpl.this.sizeOfOtherArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new OtherList();
            }
        }
        
        /**
         * Gets array of all "other" elements
         * @deprecated
         */
        public javax.xml.namespace.QName[] getOtherArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlQName> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlQName>();
                get_store().find_all_element_users(OTHER$0, targetList);
                javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
                return result;
            }
        }
        
        /**
         * Gets ith "other" element
         */
        public javax.xml.namespace.QName getOtherArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "other" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlQName> xgetOtherList()
        {
            final class OtherList extends java.util.AbstractList<org.apache.xmlbeans.XmlQName>
            {
                public org.apache.xmlbeans.XmlQName get(int i)
                    { return ComesBeforeImpl.this.xgetOtherArray(i); }
                
                public org.apache.xmlbeans.XmlQName set(int i, org.apache.xmlbeans.XmlQName o)
                {
                    org.apache.xmlbeans.XmlQName old = ComesBeforeImpl.this.xgetOtherArray(i);
                    ComesBeforeImpl.this.xsetOtherArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.xmlbeans.XmlQName o)
                    { ComesBeforeImpl.this.insertNewOther(i).set(o); }
                
                public org.apache.xmlbeans.XmlQName remove(int i)
                {
                    org.apache.xmlbeans.XmlQName old = ComesBeforeImpl.this.xgetOtherArray(i);
                    ComesBeforeImpl.this.removeOther(i);
                    return old;
                }
                
                public int size()
                    { return ComesBeforeImpl.this.sizeOfOtherArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new OtherList();
            }
        }
        
        /**
         * Gets array of all "other" elements
         * @deprecated
         */
        public org.apache.xmlbeans.XmlQName[] xgetOtherArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlQName> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlQName>();
                get_store().find_all_element_users(OTHER$0, targetList);
                org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "other" element
         */
        public org.apache.xmlbeans.XmlQName xgetOtherArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OTHER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlQName)target;
            }
        }
        
        /**
         * Returns number of "other" element
         */
        public int sizeOfOtherArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHER$0);
            }
        }
        
        /**
         * Sets array of all "other" element
         */
        public void setOtherArray(javax.xml.namespace.QName[] otherArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(otherArray, OTHER$0);
            }
        }
        
        /**
         * Sets ith "other" element
         */
        public void setOtherArray(int i, javax.xml.namespace.QName other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setQNameValue(other);
            }
        }
        
        /**
         * Sets (as xml) array of all "other" element
         */
        public void xsetOtherArray(org.apache.xmlbeans.XmlQName[]otherArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(otherArray, OTHER$0);
            }
        }
        
        /**
         * Sets (as xml) ith "other" element
         */
        public void xsetOtherArray(int i, org.apache.xmlbeans.XmlQName other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OTHER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(other);
            }
        }
        
        /**
         * Inserts the value as the ith "other" element
         */
        public void insertOther(int i, javax.xml.namespace.QName other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OTHER$0, i);
                target.setQNameValue(other);
            }
        }
        
        /**
         * Appends the value as the last "other" element
         */
        public void addOther(javax.xml.namespace.QName other)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHER$0);
                target.setQNameValue(other);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "other" element
         */
        public org.apache.xmlbeans.XmlQName insertNewOther(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(OTHER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "other" element
         */
        public org.apache.xmlbeans.XmlQName addNewOther()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(OTHER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "other" element
         */
        public void removeOther(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHER$0, i);
            }
        }
        
        /**
         * Gets the "qname" attribute
         */
        public javax.xml.namespace.QName getQname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "qname" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetQname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(QNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "qname" attribute
         */
        public boolean isSetQname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(QNAME$2) != null;
            }
        }
        
        /**
         * Sets the "qname" attribute
         */
        public void setQname(javax.xml.namespace.QName qname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QNAME$2);
                }
                target.setQNameValue(qname);
            }
        }
        
        /**
         * Sets (as xml) the "qname" attribute
         */
        public void xsetQname(org.apache.xmlbeans.XmlQName qname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(QNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(QNAME$2);
                }
                target.set(qname);
            }
        }
        
        /**
         * Unsets the "qname" attribute
         */
        public void unsetQname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(QNAME$2);
            }
        }
    }
}
