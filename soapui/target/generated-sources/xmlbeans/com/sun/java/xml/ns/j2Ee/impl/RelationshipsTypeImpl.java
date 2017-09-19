/*
 * XML Type:  relationshipsType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.RelationshipsType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML relationshipsType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class RelationshipsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.RelationshipsType
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName EJBRELATION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-relation");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return RelationshipsTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = RelationshipsTypeImpl.this.getDescriptionArray(i);
                RelationshipsTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { RelationshipsTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = RelationshipsTypeImpl.this.getDescriptionArray(i);
                RelationshipsTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return RelationshipsTypeImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DescriptionType>();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            com.sun.java.xml.ns.j2Ee.DescriptionType[] result = new com.sun.java.xml.ns.j2Ee.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets a List of "ejb-relation" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EjbRelationType> getEjbRelationList()
    {
        final class EjbRelationList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EjbRelationType>
        {
            public com.sun.java.xml.ns.j2Ee.EjbRelationType get(int i)
                { return RelationshipsTypeImpl.this.getEjbRelationArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRelationType set(int i, com.sun.java.xml.ns.j2Ee.EjbRelationType o)
            {
                com.sun.java.xml.ns.j2Ee.EjbRelationType old = RelationshipsTypeImpl.this.getEjbRelationArray(i);
                RelationshipsTypeImpl.this.setEjbRelationArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EjbRelationType o)
                { RelationshipsTypeImpl.this.insertNewEjbRelation(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRelationType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EjbRelationType old = RelationshipsTypeImpl.this.getEjbRelationArray(i);
                RelationshipsTypeImpl.this.removeEjbRelation(i);
                return old;
            }
            
            public int size()
                { return RelationshipsTypeImpl.this.sizeOfEjbRelationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EjbRelationList();
        }
    }
    
    /**
     * Gets array of all "ejb-relation" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationType[] getEjbRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EjbRelationType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EjbRelationType>();
            get_store().find_all_element_users(EJBRELATION$2, targetList);
            com.sun.java.xml.ns.j2Ee.EjbRelationType[] result = new com.sun.java.xml.ns.j2Ee.EjbRelationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-relation" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationType getEjbRelationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationType)get_store().find_element_user(EJBRELATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-relation" element
     */
    public int sizeOfEjbRelationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBRELATION$2);
        }
    }
    
    /**
     * Sets array of all "ejb-relation" element
     */
    public void setEjbRelationArray(com.sun.java.xml.ns.j2Ee.EjbRelationType[] ejbRelationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbRelationArray, EJBRELATION$2);
        }
    }
    
    /**
     * Sets ith "ejb-relation" element
     */
    public void setEjbRelationArray(int i, com.sun.java.xml.ns.j2Ee.EjbRelationType ejbRelation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationType)get_store().find_element_user(EJBRELATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbRelation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-relation" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationType insertNewEjbRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationType)get_store().insert_element_user(EJBRELATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-relation" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationType addNewEjbRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationType)get_store().add_element_user(EJBRELATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-relation" element
     */
    public void removeEjbRelation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBRELATION$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
}
