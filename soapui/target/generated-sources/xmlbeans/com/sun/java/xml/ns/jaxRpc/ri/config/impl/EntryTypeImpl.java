/*
 * XML Type:  entryType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.EntryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * An XML entryType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public class EntryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.EntryType
{
    private static final long serialVersionUID = 1L;
    
    public EntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEMATYPE$0 = 
        new javax.xml.namespace.QName("", "schemaType");
    private static final javax.xml.namespace.QName JAVATYPE$2 = 
        new javax.xml.namespace.QName("", "javaType");
    private static final javax.xml.namespace.QName SERIALIZERFACTORY$4 = 
        new javax.xml.namespace.QName("", "serializerFactory");
    private static final javax.xml.namespace.QName DESERIALIZERFACTORY$6 = 
        new javax.xml.namespace.QName("", "deserializerFactory");
    
    
    /**
     * Gets the "schemaType" attribute
     */
    public javax.xml.namespace.QName getSchemaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMATYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemaType" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSchemaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SCHEMATYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "schemaType" attribute
     */
    public void setSchemaType(javax.xml.namespace.QName schemaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMATYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMATYPE$0);
            }
            target.setQNameValue(schemaType);
        }
    }
    
    /**
     * Sets (as xml) the "schemaType" attribute
     */
    public void xsetSchemaType(org.apache.xmlbeans.XmlQName schemaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SCHEMATYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SCHEMATYPE$0);
            }
            target.set(schemaType);
        }
    }
    
    /**
     * Gets the "javaType" attribute
     */
    public java.lang.String getJavaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVATYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "javaType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetJavaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JAVATYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "javaType" attribute
     */
    public void setJavaType(java.lang.String javaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVATYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVATYPE$2);
            }
            target.setStringValue(javaType);
        }
    }
    
    /**
     * Sets (as xml) the "javaType" attribute
     */
    public void xsetJavaType(org.apache.xmlbeans.XmlString javaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JAVATYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JAVATYPE$2);
            }
            target.set(javaType);
        }
    }
    
    /**
     * Gets the "serializerFactory" attribute
     */
    public java.lang.String getSerializerFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZERFACTORY$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serializerFactory" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSerializerFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIALIZERFACTORY$4);
            return target;
        }
    }
    
    /**
     * Sets the "serializerFactory" attribute
     */
    public void setSerializerFactory(java.lang.String serializerFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERIALIZERFACTORY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERIALIZERFACTORY$4);
            }
            target.setStringValue(serializerFactory);
        }
    }
    
    /**
     * Sets (as xml) the "serializerFactory" attribute
     */
    public void xsetSerializerFactory(org.apache.xmlbeans.XmlString serializerFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERIALIZERFACTORY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERIALIZERFACTORY$4);
            }
            target.set(serializerFactory);
        }
    }
    
    /**
     * Gets the "deserializerFactory" attribute
     */
    public java.lang.String getDeserializerFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZERFACTORY$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "deserializerFactory" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDeserializerFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESERIALIZERFACTORY$6);
            return target;
        }
    }
    
    /**
     * Sets the "deserializerFactory" attribute
     */
    public void setDeserializerFactory(java.lang.String deserializerFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESERIALIZERFACTORY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESERIALIZERFACTORY$6);
            }
            target.setStringValue(deserializerFactory);
        }
    }
    
    /**
     * Sets (as xml) the "deserializerFactory" attribute
     */
    public void xsetDeserializerFactory(org.apache.xmlbeans.XmlString deserializerFactory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESERIALIZERFACTORY$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESERIALIZERFACTORY$6);
            }
            target.set(deserializerFactory);
        }
    }
}
