/*
 * XML Type:  importType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.ImportType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML importType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class ImportTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.ImportType
{
    private static final long serialVersionUID = 1L;
    
    public ImportTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMA$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "schema");
    
    
    /**
     * Gets a List of "schema" elements
     */
    public java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType> getSchemaList()
    {
        final class SchemaList extends java.util.AbstractList<com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType>
        {
            public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType get(int i)
                { return ImportTypeImpl.this.getSchemaArray(i); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType set(int i, com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType o)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType old = ImportTypeImpl.this.getSchemaArray(i);
                ImportTypeImpl.this.setSchemaArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType o)
                { ImportTypeImpl.this.insertNewSchema(i).set(o); }
            
            public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType remove(int i)
            {
                com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType old = ImportTypeImpl.this.getSchemaArray(i);
                ImportTypeImpl.this.removeSchema(i);
                return old;
            }
            
            public int size()
                { return ImportTypeImpl.this.sizeOfSchemaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SchemaList();
        }
    }
    
    /**
     * Gets array of all "schema" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType[] getSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType>();
            get_store().find_all_element_users(SCHEMA$0, targetList);
            com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType[] result = new com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schema" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType getSchemaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType)get_store().find_element_user(SCHEMA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "schema" element
     */
    public int sizeOfSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEMA$0);
        }
    }
    
    /**
     * Sets array of all "schema" element
     */
    public void setSchemaArray(com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType[] schemaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(schemaArray, SCHEMA$0);
        }
    }
    
    /**
     * Sets ith "schema" element
     */
    public void setSchemaArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType schema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType)get_store().find_element_user(SCHEMA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(schema);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "schema" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType insertNewSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType)get_store().insert_element_user(SCHEMA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schema" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType addNewSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.SchemaType)get_store().add_element_user(SCHEMA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "schema" element
     */
    public void removeSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEMA$0, i);
        }
    }
}
