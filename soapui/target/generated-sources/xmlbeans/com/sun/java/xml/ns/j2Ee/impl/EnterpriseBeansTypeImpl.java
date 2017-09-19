/*
 * XML Type:  enterprise-beansType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EnterpriseBeansType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML enterprise-beansType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class EnterpriseBeansTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.EnterpriseBeansType
{
    private static final long serialVersionUID = 1L;
    
    public EnterpriseBeansTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SESSION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "session");
    private static final javax.xml.namespace.QName ENTITY$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "entity");
    private static final javax.xml.namespace.QName MESSAGEDRIVEN$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-driven");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "session" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.SessionBeanType> getSessionList()
    {
        final class SessionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.SessionBeanType>
        {
            public com.sun.java.xml.ns.j2Ee.SessionBeanType get(int i)
                { return EnterpriseBeansTypeImpl.this.getSessionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.SessionBeanType set(int i, com.sun.java.xml.ns.j2Ee.SessionBeanType o)
            {
                com.sun.java.xml.ns.j2Ee.SessionBeanType old = EnterpriseBeansTypeImpl.this.getSessionArray(i);
                EnterpriseBeansTypeImpl.this.setSessionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.SessionBeanType o)
                { EnterpriseBeansTypeImpl.this.insertNewSession(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.SessionBeanType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.SessionBeanType old = EnterpriseBeansTypeImpl.this.getSessionArray(i);
                EnterpriseBeansTypeImpl.this.removeSession(i);
                return old;
            }
            
            public int size()
                { return EnterpriseBeansTypeImpl.this.sizeOfSessionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SessionList();
        }
    }
    
    /**
     * Gets array of all "session" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.SessionBeanType[] getSessionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.SessionBeanType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.SessionBeanType>();
            get_store().find_all_element_users(SESSION$0, targetList);
            com.sun.java.xml.ns.j2Ee.SessionBeanType[] result = new com.sun.java.xml.ns.j2Ee.SessionBeanType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "session" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionBeanType getSessionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionBeanType)get_store().find_element_user(SESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "session" element
     */
    public int sizeOfSessionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSION$0);
        }
    }
    
    /**
     * Sets array of all "session" element
     */
    public void setSessionArray(com.sun.java.xml.ns.j2Ee.SessionBeanType[] sessionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sessionArray, SESSION$0);
        }
    }
    
    /**
     * Sets ith "session" element
     */
    public void setSessionArray(int i, com.sun.java.xml.ns.j2Ee.SessionBeanType session)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionBeanType)get_store().find_element_user(SESSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(session);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "session" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionBeanType insertNewSession(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionBeanType)get_store().insert_element_user(SESSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "session" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionBeanType addNewSession()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionBeanType)get_store().add_element_user(SESSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "session" element
     */
    public void removeSession(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSION$0, i);
        }
    }
    
    /**
     * Gets a List of "entity" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EntityBeanType> getEntityList()
    {
        final class EntityList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EntityBeanType>
        {
            public com.sun.java.xml.ns.j2Ee.EntityBeanType get(int i)
                { return EnterpriseBeansTypeImpl.this.getEntityArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EntityBeanType set(int i, com.sun.java.xml.ns.j2Ee.EntityBeanType o)
            {
                com.sun.java.xml.ns.j2Ee.EntityBeanType old = EnterpriseBeansTypeImpl.this.getEntityArray(i);
                EnterpriseBeansTypeImpl.this.setEntityArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EntityBeanType o)
                { EnterpriseBeansTypeImpl.this.insertNewEntity(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EntityBeanType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EntityBeanType old = EnterpriseBeansTypeImpl.this.getEntityArray(i);
                EnterpriseBeansTypeImpl.this.removeEntity(i);
                return old;
            }
            
            public int size()
                { return EnterpriseBeansTypeImpl.this.sizeOfEntityArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntityList();
        }
    }
    
    /**
     * Gets array of all "entity" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EntityBeanType[] getEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EntityBeanType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EntityBeanType>();
            get_store().find_all_element_users(ENTITY$2, targetList);
            com.sun.java.xml.ns.j2Ee.EntityBeanType[] result = new com.sun.java.xml.ns.j2Ee.EntityBeanType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entity" element
     */
    public com.sun.java.xml.ns.j2Ee.EntityBeanType getEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EntityBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EntityBeanType)get_store().find_element_user(ENTITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entity" element
     */
    public int sizeOfEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITY$2);
        }
    }
    
    /**
     * Sets array of all "entity" element
     */
    public void setEntityArray(com.sun.java.xml.ns.j2Ee.EntityBeanType[] entityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entityArray, ENTITY$2);
        }
    }
    
    /**
     * Sets ith "entity" element
     */
    public void setEntityArray(int i, com.sun.java.xml.ns.j2Ee.EntityBeanType entity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EntityBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EntityBeanType)get_store().find_element_user(ENTITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    public com.sun.java.xml.ns.j2Ee.EntityBeanType insertNewEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EntityBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EntityBeanType)get_store().insert_element_user(ENTITY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    public com.sun.java.xml.ns.j2Ee.EntityBeanType addNewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EntityBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EntityBeanType)get_store().add_element_user(ENTITY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "entity" element
     */
    public void removeEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITY$2, i);
        }
    }
    
    /**
     * Gets a List of "message-driven" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType> getMessageDrivenList()
    {
        final class MessageDrivenList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType>
        {
            public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType get(int i)
                { return EnterpriseBeansTypeImpl.this.getMessageDrivenArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType set(int i, com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType o)
            {
                com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType old = EnterpriseBeansTypeImpl.this.getMessageDrivenArray(i);
                EnterpriseBeansTypeImpl.this.setMessageDrivenArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType o)
                { EnterpriseBeansTypeImpl.this.insertNewMessageDriven(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType old = EnterpriseBeansTypeImpl.this.getMessageDrivenArray(i);
                EnterpriseBeansTypeImpl.this.removeMessageDriven(i);
                return old;
            }
            
            public int size()
                { return EnterpriseBeansTypeImpl.this.sizeOfMessageDrivenArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageDrivenList();
        }
    }
    
    /**
     * Gets array of all "message-driven" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType[] getMessageDrivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType>();
            get_store().find_all_element_users(MESSAGEDRIVEN$4, targetList);
            com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType[] result = new com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-driven" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType getMessageDrivenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType)get_store().find_element_user(MESSAGEDRIVEN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-driven" element
     */
    public int sizeOfMessageDrivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDRIVEN$4);
        }
    }
    
    /**
     * Sets array of all "message-driven" element
     */
    public void setMessageDrivenArray(com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType[] messageDrivenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDrivenArray, MESSAGEDRIVEN$4);
        }
    }
    
    /**
     * Sets ith "message-driven" element
     */
    public void setMessageDrivenArray(int i, com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType messageDriven)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType)get_store().find_element_user(MESSAGEDRIVEN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDriven);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-driven" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType insertNewMessageDriven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType)get_store().insert_element_user(MESSAGEDRIVEN$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-driven" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType addNewMessageDriven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType)get_store().add_element_user(MESSAGEDRIVEN$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-driven" element
     */
    public void removeMessageDriven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDRIVEN$4, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$6) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$6);
        }
    }
}
