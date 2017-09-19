/*
 * XML Type:  ejb-relationType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EjbRelationType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML ejb-relationType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class EjbRelationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.EjbRelationType
{
    private static final long serialVersionUID = 1L;
    
    public EjbRelationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName EJBRELATIONNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-relation-name");
    private static final javax.xml.namespace.QName EJBRELATIONSHIPROLE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-relationship-role");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return EjbRelationTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EjbRelationTypeImpl.this.getDescriptionArray(i);
                EjbRelationTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { EjbRelationTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EjbRelationTypeImpl.this.getDescriptionArray(i);
                EjbRelationTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return EjbRelationTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "ejb-relation-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getEjbRelationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(EJBRELATIONNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb-relation-name" element
     */
    public boolean isSetEjbRelationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBRELATIONNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "ejb-relation-name" element
     */
    public void setEjbRelationName(com.sun.java.xml.ns.j2Ee.String ejbRelationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(EJBRELATIONNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(EJBRELATIONNAME$2);
            }
            target.set(ejbRelationName);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-relation-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewEjbRelationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(EJBRELATIONNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb-relation-name" element
     */
    public void unsetEjbRelationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBRELATIONNAME$2, 0);
        }
    }
    
    /**
     * Gets a List of "ejb-relationship-role" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType> getEjbRelationshipRoleList()
    {
        final class EjbRelationshipRoleList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType>
        {
            public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType get(int i)
                { return EjbRelationTypeImpl.this.getEjbRelationshipRoleArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType set(int i, com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType o)
            {
                com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType old = EjbRelationTypeImpl.this.getEjbRelationshipRoleArray(i);
                EjbRelationTypeImpl.this.setEjbRelationshipRoleArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType o)
                { EjbRelationTypeImpl.this.insertNewEjbRelationshipRole(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType old = EjbRelationTypeImpl.this.getEjbRelationshipRoleArray(i);
                EjbRelationTypeImpl.this.removeEjbRelationshipRole(i);
                return old;
            }
            
            public int size()
                { return EjbRelationTypeImpl.this.sizeOfEjbRelationshipRoleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EjbRelationshipRoleList();
        }
    }
    
    /**
     * Gets array of all "ejb-relationship-role" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType[] getEjbRelationshipRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType>();
            get_store().find_all_element_users(EJBRELATIONSHIPROLE$4, targetList);
            com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType[] result = new com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-relationship-role" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType getEjbRelationshipRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType)get_store().find_element_user(EJBRELATIONSHIPROLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-relationship-role" element
     */
    public int sizeOfEjbRelationshipRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBRELATIONSHIPROLE$4);
        }
    }
    
    /**
     * Sets array of all "ejb-relationship-role" element
     */
    public void setEjbRelationshipRoleArray(com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType[] ejbRelationshipRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbRelationshipRoleArray, EJBRELATIONSHIPROLE$4);
        }
    }
    
    /**
     * Sets ith "ejb-relationship-role" element
     */
    public void setEjbRelationshipRoleArray(int i, com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType ejbRelationshipRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType)get_store().find_element_user(EJBRELATIONSHIPROLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbRelationshipRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-relationship-role" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType insertNewEjbRelationshipRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType)get_store().insert_element_user(EJBRELATIONSHIPROLE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-relationship-role" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType addNewEjbRelationshipRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType)get_store().add_element_user(EJBRELATIONSHIPROLE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-relationship-role" element
     */
    public void removeEjbRelationshipRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBRELATIONSHIPROLE$4, i);
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
