/*
 * XML Type:  SQLInjectionCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SQLInjectionCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SQLInjectionCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SQLInjectionCheckConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SQLInjectionCheckConfig
{
    private static final long serialVersionUID = 1L;
    
    public SQLInjectionCheckConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SQLINJECTIONSTRINGS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sqlInjectionStrings");
    
    
    /**
     * Gets a List of "sqlInjectionStrings" elements
     */
    public java.util.List<java.lang.String> getSqlInjectionStringsList()
    {
        final class SqlInjectionStringsList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return SQLInjectionCheckConfigImpl.this.getSqlInjectionStringsArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = SQLInjectionCheckConfigImpl.this.getSqlInjectionStringsArray(i);
                SQLInjectionCheckConfigImpl.this.setSqlInjectionStringsArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { SQLInjectionCheckConfigImpl.this.insertSqlInjectionStrings(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = SQLInjectionCheckConfigImpl.this.getSqlInjectionStringsArray(i);
                SQLInjectionCheckConfigImpl.this.removeSqlInjectionStrings(i);
                return old;
            }
            
            public int size()
                { return SQLInjectionCheckConfigImpl.this.sizeOfSqlInjectionStringsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SqlInjectionStringsList();
        }
    }
    
    /**
     * Gets array of all "sqlInjectionStrings" elements
     * @deprecated
     */
    public java.lang.String[] getSqlInjectionStringsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(SQLINJECTIONSTRINGS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "sqlInjectionStrings" element
     */
    public java.lang.String getSqlInjectionStringsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SQLINJECTIONSTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "sqlInjectionStrings" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetSqlInjectionStringsList()
    {
        final class SqlInjectionStringsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return SQLInjectionCheckConfigImpl.this.xgetSqlInjectionStringsArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = SQLInjectionCheckConfigImpl.this.xgetSqlInjectionStringsArray(i);
                SQLInjectionCheckConfigImpl.this.xsetSqlInjectionStringsArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { SQLInjectionCheckConfigImpl.this.insertNewSqlInjectionStrings(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = SQLInjectionCheckConfigImpl.this.xgetSqlInjectionStringsArray(i);
                SQLInjectionCheckConfigImpl.this.removeSqlInjectionStrings(i);
                return old;
            }
            
            public int size()
                { return SQLInjectionCheckConfigImpl.this.sizeOfSqlInjectionStringsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SqlInjectionStringsList();
        }
    }
    
    /**
     * Gets array of all "sqlInjectionStrings" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetSqlInjectionStringsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(SQLINJECTIONSTRINGS$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "sqlInjectionStrings" element
     */
    public org.apache.xmlbeans.XmlString xgetSqlInjectionStringsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SQLINJECTIONSTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "sqlInjectionStrings" element
     */
    public int sizeOfSqlInjectionStringsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SQLINJECTIONSTRINGS$0);
        }
    }
    
    /**
     * Sets array of all "sqlInjectionStrings" element
     */
    public void setSqlInjectionStringsArray(java.lang.String[] sqlInjectionStringsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sqlInjectionStringsArray, SQLINJECTIONSTRINGS$0);
        }
    }
    
    /**
     * Sets ith "sqlInjectionStrings" element
     */
    public void setSqlInjectionStringsArray(int i, java.lang.String sqlInjectionStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SQLINJECTIONSTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(sqlInjectionStrings);
        }
    }
    
    /**
     * Sets (as xml) array of all "sqlInjectionStrings" element
     */
    public void xsetSqlInjectionStringsArray(org.apache.xmlbeans.XmlString[]sqlInjectionStringsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sqlInjectionStringsArray, SQLINJECTIONSTRINGS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "sqlInjectionStrings" element
     */
    public void xsetSqlInjectionStringsArray(int i, org.apache.xmlbeans.XmlString sqlInjectionStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SQLINJECTIONSTRINGS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sqlInjectionStrings);
        }
    }
    
    /**
     * Inserts the value as the ith "sqlInjectionStrings" element
     */
    public void insertSqlInjectionStrings(int i, java.lang.String sqlInjectionStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SQLINJECTIONSTRINGS$0, i);
            target.setStringValue(sqlInjectionStrings);
        }
    }
    
    /**
     * Appends the value as the last "sqlInjectionStrings" element
     */
    public void addSqlInjectionStrings(java.lang.String sqlInjectionStrings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SQLINJECTIONSTRINGS$0);
            target.setStringValue(sqlInjectionStrings);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sqlInjectionStrings" element
     */
    public org.apache.xmlbeans.XmlString insertNewSqlInjectionStrings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SQLINJECTIONSTRINGS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sqlInjectionStrings" element
     */
    public org.apache.xmlbeans.XmlString addNewSqlInjectionStrings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SQLINJECTIONSTRINGS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sqlInjectionStrings" element
     */
    public void removeSqlInjectionStrings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SQLINJECTIONSTRINGS$0, i);
        }
    }
}
