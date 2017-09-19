/*
 * XML Type:  Parts
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PartsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Parts(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class PartsConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.PartsConfig
{
    private static final long serialVersionUID = 1L;
    
    public PartsConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "part");
    
    
    /**
     * Gets a List of "part" elements
     */
    public java.util.List<com.eviware.soapui.config.PartsConfig.Part> getPartList()
    {
        final class PartList extends java.util.AbstractList<com.eviware.soapui.config.PartsConfig.Part>
        {
            public com.eviware.soapui.config.PartsConfig.Part get(int i)
                { return PartsConfigImpl.this.getPartArray(i); }
            
            public com.eviware.soapui.config.PartsConfig.Part set(int i, com.eviware.soapui.config.PartsConfig.Part o)
            {
                com.eviware.soapui.config.PartsConfig.Part old = PartsConfigImpl.this.getPartArray(i);
                PartsConfigImpl.this.setPartArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.PartsConfig.Part o)
                { PartsConfigImpl.this.insertNewPart(i).set(o); }
            
            public com.eviware.soapui.config.PartsConfig.Part remove(int i)
            {
                com.eviware.soapui.config.PartsConfig.Part old = PartsConfigImpl.this.getPartArray(i);
                PartsConfigImpl.this.removePart(i);
                return old;
            }
            
            public int size()
                { return PartsConfigImpl.this.sizeOfPartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PartList();
        }
    }
    
    /**
     * Gets array of all "part" elements
     * @deprecated
     */
    public com.eviware.soapui.config.PartsConfig.Part[] getPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.PartsConfig.Part> targetList = new java.util.ArrayList<com.eviware.soapui.config.PartsConfig.Part>();
            get_store().find_all_element_users(PART$0, targetList);
            com.eviware.soapui.config.PartsConfig.Part[] result = new com.eviware.soapui.config.PartsConfig.Part[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "part" element
     */
    public com.eviware.soapui.config.PartsConfig.Part getPartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig.Part target = null;
            target = (com.eviware.soapui.config.PartsConfig.Part)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "part" element
     */
    public int sizeOfPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PART$0);
        }
    }
    
    /**
     * Sets array of all "part" element
     */
    public void setPartArray(com.eviware.soapui.config.PartsConfig.Part[] partArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partArray, PART$0);
        }
    }
    
    /**
     * Sets ith "part" element
     */
    public void setPartArray(int i, com.eviware.soapui.config.PartsConfig.Part part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig.Part target = null;
            target = (com.eviware.soapui.config.PartsConfig.Part)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(part);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "part" element
     */
    public com.eviware.soapui.config.PartsConfig.Part insertNewPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig.Part target = null;
            target = (com.eviware.soapui.config.PartsConfig.Part)get_store().insert_element_user(PART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    public com.eviware.soapui.config.PartsConfig.Part addNewPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig.Part target = null;
            target = (com.eviware.soapui.config.PartsConfig.Part)get_store().add_element_user(PART$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "part" element
     */
    public void removePart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PART$0, i);
        }
    }
    /**
     * An XML part(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public static class PartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.PartsConfig.Part
    {
        private static final long serialVersionUID = 1L;
        
        public PartImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTENTTYPE$0 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "contentType");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets a List of "contentType" elements
         */
        public java.util.List<java.lang.String> getContentTypeList()
        {
            final class ContentTypeList extends java.util.AbstractList<java.lang.String>
            {
                public java.lang.String get(int i)
                    { return PartImpl.this.getContentTypeArray(i); }
                
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = PartImpl.this.getContentTypeArray(i);
                    PartImpl.this.setContentTypeArray(i, o);
                    return old;
                }
                
                public void add(int i, java.lang.String o)
                    { PartImpl.this.insertContentType(i, o); }
                
                public java.lang.String remove(int i)
                {
                    java.lang.String old = PartImpl.this.getContentTypeArray(i);
                    PartImpl.this.removeContentType(i);
                    return old;
                }
                
                public int size()
                    { return PartImpl.this.sizeOfContentTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ContentTypeList();
            }
        }
        
        /**
         * Gets array of all "contentType" elements
         * @deprecated
         */
        public java.lang.String[] getContentTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(CONTENTTYPE$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "contentType" element
         */
        public java.lang.String getContentTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "contentType" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetContentTypeList()
        {
            final class ContentTypeList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                public org.apache.xmlbeans.XmlString get(int i)
                    { return PartImpl.this.xgetContentTypeArray(i); }
                
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = PartImpl.this.xgetContentTypeArray(i);
                    PartImpl.this.xsetContentTypeArray(i, o);
                    return old;
                }
                
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { PartImpl.this.insertNewContentType(i).set(o); }
                
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = PartImpl.this.xgetContentTypeArray(i);
                    PartImpl.this.removeContentType(i);
                    return old;
                }
                
                public int size()
                    { return PartImpl.this.sizeOfContentTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ContentTypeList();
            }
        }
        
        /**
         * Gets array of all "contentType" elements
         * @deprecated
         */
        public org.apache.xmlbeans.XmlString[] xgetContentTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(CONTENTTYPE$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "contentType" element
         */
        public org.apache.xmlbeans.XmlString xgetContentTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "contentType" element
         */
        public int sizeOfContentTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTENTTYPE$0);
            }
        }
        
        /**
         * Sets array of all "contentType" element
         */
        public void setContentTypeArray(java.lang.String[] contentTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contentTypeArray, CONTENTTYPE$0);
            }
        }
        
        /**
         * Sets ith "contentType" element
         */
        public void setContentTypeArray(int i, java.lang.String contentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(contentType);
            }
        }
        
        /**
         * Sets (as xml) array of all "contentType" element
         */
        public void xsetContentTypeArray(org.apache.xmlbeans.XmlString[]contentTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contentTypeArray, CONTENTTYPE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "contentType" element
         */
        public void xsetContentTypeArray(int i, org.apache.xmlbeans.XmlString contentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contentType);
            }
        }
        
        /**
         * Inserts the value as the ith "contentType" element
         */
        public void insertContentType(int i, java.lang.String contentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONTENTTYPE$0, i);
                target.setStringValue(contentType);
            }
        }
        
        /**
         * Appends the value as the last "contentType" element
         */
        public void addContentType(java.lang.String contentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTTYPE$0);
                target.setStringValue(contentType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contentType" element
         */
        public org.apache.xmlbeans.XmlString insertNewContentType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONTENTTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contentType" element
         */
        public org.apache.xmlbeans.XmlString addNewContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTTYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "contentType" element
         */
        public void removeContentType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTENTTYPE$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
            }
        }
    }
}
