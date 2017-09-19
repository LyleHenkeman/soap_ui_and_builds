/*
 * XML Type:  MockOperationQueryMatchDispatch
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MockOperationQueryMatchDispatch(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MockOperationQueryMatchDispatchConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockOperationQueryMatchDispatchConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "query");
    
    
    /**
     * Gets a List of "query" elements
     */
    public java.util.List<com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query> getQueryList()
    {
        final class QueryList extends java.util.AbstractList<com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query>
        {
            public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query get(int i)
                { return MockOperationQueryMatchDispatchConfigImpl.this.getQueryArray(i); }
            
            public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query set(int i, com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query o)
            {
                com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query old = MockOperationQueryMatchDispatchConfigImpl.this.getQueryArray(i);
                MockOperationQueryMatchDispatchConfigImpl.this.setQueryArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query o)
                { MockOperationQueryMatchDispatchConfigImpl.this.insertNewQuery(i).set(o); }
            
            public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query remove(int i)
            {
                com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query old = MockOperationQueryMatchDispatchConfigImpl.this.getQueryArray(i);
                MockOperationQueryMatchDispatchConfigImpl.this.removeQuery(i);
                return old;
            }
            
            public int size()
                { return MockOperationQueryMatchDispatchConfigImpl.this.sizeOfQueryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QueryList();
        }
    }
    
    /**
     * Gets array of all "query" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query[] getQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query> targetList = new java.util.ArrayList<com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query>();
            get_store().find_all_element_users(QUERY$0, targetList);
            com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query[] result = new com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "query" element
     */
    public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query getQueryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query target = null;
            target = (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query)get_store().find_element_user(QUERY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "query" element
     */
    public int sizeOfQueryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERY$0);
        }
    }
    
    /**
     * Sets array of all "query" element
     */
    public void setQueryArray(com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query[] queryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryArray, QUERY$0);
        }
    }
    
    /**
     * Sets ith "query" element
     */
    public void setQueryArray(int i, com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query target = null;
            target = (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query)get_store().find_element_user(QUERY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(query);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query insertNewQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query target = null;
            target = (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query)get_store().insert_element_user(QUERY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    public com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query target = null;
            target = (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "query" element
     */
    public void removeQuery(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERY$0, i);
        }
    }
    /**
     * An XML query(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public static class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query
    {
        private static final long serialVersionUID = 1L;
        
        public QueryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
        private static final javax.xml.namespace.QName QUERY$2 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "query");
        private static final javax.xml.namespace.QName MATCH$4 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "match");
        private static final javax.xml.namespace.QName RESPONSE$6 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "response");
        private static final javax.xml.namespace.QName DISABLED$8 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "disabled");
        
        
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
         * Gets the "query" element
         */
        public java.lang.String getQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "query" element
         */
        public org.apache.xmlbeans.XmlString xgetQuery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "query" element
         */
        public void setQuery(java.lang.String query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$2);
                }
                target.setStringValue(query);
            }
        }
        
        /**
         * Sets (as xml) the "query" element
         */
        public void xsetQuery(org.apache.xmlbeans.XmlString query)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$2);
                }
                target.set(query);
            }
        }
        
        /**
         * Gets the "match" element
         */
        public java.lang.String getMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "match" element
         */
        public org.apache.xmlbeans.XmlString xgetMatch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCH$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "match" element
         */
        public void setMatch(java.lang.String match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCH$4);
                }
                target.setStringValue(match);
            }
        }
        
        /**
         * Sets (as xml) the "match" element
         */
        public void xsetMatch(org.apache.xmlbeans.XmlString match)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCH$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCH$4);
                }
                target.set(match);
            }
        }
        
        /**
         * Gets the "response" element
         */
        public java.lang.String getResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "response" element
         */
        public org.apache.xmlbeans.XmlString xgetResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "response" element
         */
        public void setResponse(java.lang.String response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSE$6);
                }
                target.setStringValue(response);
            }
        }
        
        /**
         * Sets (as xml) the "response" element
         */
        public void xsetResponse(org.apache.xmlbeans.XmlString response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSE$6);
                }
                target.set(response);
            }
        }
        
        /**
         * Gets the "disabled" element
         */
        public boolean getDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "disabled" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetDisabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "disabled" element
         */
        public void setDisabled(boolean disabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLED$8);
                }
                target.setBooleanValue(disabled);
            }
        }
        
        /**
         * Sets (as xml) the "disabled" element
         */
        public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISABLED$8);
                }
                target.set(disabled);
            }
        }
    }
}
