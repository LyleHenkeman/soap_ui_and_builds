/*
 * XML Type:  ejb-relationship-roleType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML ejb-relationship-roleType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class EjbRelationshipRoleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType
{
    private static final long serialVersionUID = 1L;
    
    public EjbRelationshipRoleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName EJBRELATIONSHIPROLENAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-relationship-role-name");
    private static final javax.xml.namespace.QName MULTIPLICITY$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "multiplicity");
    private static final javax.xml.namespace.QName CASCADEDELETE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "cascade-delete");
    private static final javax.xml.namespace.QName RELATIONSHIPROLESOURCE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "relationship-role-source");
    private static final javax.xml.namespace.QName CMRFIELD$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "cmr-field");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return EjbRelationshipRoleTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EjbRelationshipRoleTypeImpl.this.getDescriptionArray(i);
                EjbRelationshipRoleTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { EjbRelationshipRoleTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = EjbRelationshipRoleTypeImpl.this.getDescriptionArray(i);
                EjbRelationshipRoleTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return EjbRelationshipRoleTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "ejb-relationship-role-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getEjbRelationshipRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(EJBRELATIONSHIPROLENAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb-relationship-role-name" element
     */
    public boolean isSetEjbRelationshipRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBRELATIONSHIPROLENAME$2) != 0;
        }
    }
    
    /**
     * Sets the "ejb-relationship-role-name" element
     */
    public void setEjbRelationshipRoleName(com.sun.java.xml.ns.j2Ee.String ejbRelationshipRoleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(EJBRELATIONSHIPROLENAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(EJBRELATIONSHIPROLENAME$2);
            }
            target.set(ejbRelationshipRoleName);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-relationship-role-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewEjbRelationshipRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(EJBRELATIONSHIPROLENAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb-relationship-role-name" element
     */
    public void unsetEjbRelationshipRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBRELATIONSHIPROLENAME$2, 0);
        }
    }
    
    /**
     * Gets the "multiplicity" element
     */
    public com.sun.java.xml.ns.j2Ee.MultiplicityType getMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MultiplicityType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MultiplicityType)get_store().find_element_user(MULTIPLICITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiplicity" element
     */
    public void setMultiplicity(com.sun.java.xml.ns.j2Ee.MultiplicityType multiplicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MultiplicityType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MultiplicityType)get_store().find_element_user(MULTIPLICITY$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.MultiplicityType)get_store().add_element_user(MULTIPLICITY$4);
            }
            target.set(multiplicity);
        }
    }
    
    /**
     * Appends and returns a new empty "multiplicity" element
     */
    public com.sun.java.xml.ns.j2Ee.MultiplicityType addNewMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MultiplicityType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MultiplicityType)get_store().add_element_user(MULTIPLICITY$4);
            return target;
        }
    }
    
    /**
     * Gets the "cascade-delete" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getCascadeDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(CASCADEDELETE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cascade-delete" element
     */
    public boolean isSetCascadeDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASCADEDELETE$6) != 0;
        }
    }
    
    /**
     * Sets the "cascade-delete" element
     */
    public void setCascadeDelete(com.sun.java.xml.ns.j2Ee.EmptyType cascadeDelete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(CASCADEDELETE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(CASCADEDELETE$6);
            }
            target.set(cascadeDelete);
        }
    }
    
    /**
     * Appends and returns a new empty "cascade-delete" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewCascadeDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(CASCADEDELETE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "cascade-delete" element
     */
    public void unsetCascadeDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASCADEDELETE$6, 0);
        }
    }
    
    /**
     * Gets the "relationship-role-source" element
     */
    public com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType getRelationshipRoleSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType)get_store().find_element_user(RELATIONSHIPROLESOURCE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationship-role-source" element
     */
    public void setRelationshipRoleSource(com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType relationshipRoleSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType)get_store().find_element_user(RELATIONSHIPROLESOURCE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType)get_store().add_element_user(RELATIONSHIPROLESOURCE$8);
            }
            target.set(relationshipRoleSource);
        }
    }
    
    /**
     * Appends and returns a new empty "relationship-role-source" element
     */
    public com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType addNewRelationshipRoleSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType)get_store().add_element_user(RELATIONSHIPROLESOURCE$8);
            return target;
        }
    }
    
    /**
     * Gets the "cmr-field" element
     */
    public com.sun.java.xml.ns.j2Ee.CmrFieldType getCmrField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.CmrFieldType target = null;
            target = (com.sun.java.xml.ns.j2Ee.CmrFieldType)get_store().find_element_user(CMRFIELD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cmr-field" element
     */
    public boolean isSetCmrField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CMRFIELD$10) != 0;
        }
    }
    
    /**
     * Sets the "cmr-field" element
     */
    public void setCmrField(com.sun.java.xml.ns.j2Ee.CmrFieldType cmrField)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.CmrFieldType target = null;
            target = (com.sun.java.xml.ns.j2Ee.CmrFieldType)get_store().find_element_user(CMRFIELD$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.CmrFieldType)get_store().add_element_user(CMRFIELD$10);
            }
            target.set(cmrField);
        }
    }
    
    /**
     * Appends and returns a new empty "cmr-field" element
     */
    public com.sun.java.xml.ns.j2Ee.CmrFieldType addNewCmrField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.CmrFieldType target = null;
            target = (com.sun.java.xml.ns.j2Ee.CmrFieldType)get_store().add_element_user(CMRFIELD$10);
            return target;
        }
    }
    
    /**
     * Unsets the "cmr-field" element
     */
    public void unsetCmrField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CMRFIELD$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
        }
    }
}
