/*
 * XML Type:  SchemaSet
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SchemaSetConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema.impl;
/**
 * An XML SchemaSet(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public class SchemaSetConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.inferredSchema.SchemaSetConfig
{
    private static final long serialVersionUID = 1L;
    
    public SchemaSetConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMA$0 = 
        new javax.xml.namespace.QName("http://www.eviware.com/soapui/InferredSchema", "schema");
    
    
    /**
     * Gets a List of "schema" elements
     */
    public java.util.List<com.eviware.soapui.inferredSchema.SchemaConfig> getSchemaList()
    {
        final class SchemaList extends java.util.AbstractList<com.eviware.soapui.inferredSchema.SchemaConfig>
        {
            public com.eviware.soapui.inferredSchema.SchemaConfig get(int i)
                { return SchemaSetConfigImpl.this.getSchemaArray(i); }
            
            public com.eviware.soapui.inferredSchema.SchemaConfig set(int i, com.eviware.soapui.inferredSchema.SchemaConfig o)
            {
                com.eviware.soapui.inferredSchema.SchemaConfig old = SchemaSetConfigImpl.this.getSchemaArray(i);
                SchemaSetConfigImpl.this.setSchemaArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.inferredSchema.SchemaConfig o)
                { SchemaSetConfigImpl.this.insertNewSchema(i).set(o); }
            
            public com.eviware.soapui.inferredSchema.SchemaConfig remove(int i)
            {
                com.eviware.soapui.inferredSchema.SchemaConfig old = SchemaSetConfigImpl.this.getSchemaArray(i);
                SchemaSetConfigImpl.this.removeSchema(i);
                return old;
            }
            
            public int size()
                { return SchemaSetConfigImpl.this.sizeOfSchemaArray(); }
            
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
    public com.eviware.soapui.inferredSchema.SchemaConfig[] getSchemaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.inferredSchema.SchemaConfig> targetList = new java.util.ArrayList<com.eviware.soapui.inferredSchema.SchemaConfig>();
            get_store().find_all_element_users(SCHEMA$0, targetList);
            com.eviware.soapui.inferredSchema.SchemaConfig[] result = new com.eviware.soapui.inferredSchema.SchemaConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "schema" element
     */
    public com.eviware.soapui.inferredSchema.SchemaConfig getSchemaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaConfig)get_store().find_element_user(SCHEMA$0, i);
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
    public void setSchemaArray(com.eviware.soapui.inferredSchema.SchemaConfig[] schemaArray)
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
    public void setSchemaArray(int i, com.eviware.soapui.inferredSchema.SchemaConfig schema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaConfig)get_store().find_element_user(SCHEMA$0, i);
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
    public com.eviware.soapui.inferredSchema.SchemaConfig insertNewSchema(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaConfig)get_store().insert_element_user(SCHEMA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "schema" element
     */
    public com.eviware.soapui.inferredSchema.SchemaConfig addNewSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.inferredSchema.SchemaConfig target = null;
            target = (com.eviware.soapui.inferredSchema.SchemaConfig)get_store().add_element_user(SCHEMA$0);
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
