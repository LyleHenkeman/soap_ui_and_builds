/*
 * XML Type:  method-permissionType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.MethodPermissionType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML method-permissionType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class MethodPermissionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.MethodPermissionType
{
    private static final long serialVersionUID = 1L;
    
    public MethodPermissionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName ROLENAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "role-name");
    private static final javax.xml.namespace.QName UNCHECKED$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "unchecked");
    private static final javax.xml.namespace.QName METHOD$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return MethodPermissionTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = MethodPermissionTypeImpl.this.getDescriptionArray(i);
                MethodPermissionTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { MethodPermissionTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = MethodPermissionTypeImpl.this.getDescriptionArray(i);
                MethodPermissionTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return MethodPermissionTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets a List of "role-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.RoleNameType> getRoleNameList()
    {
        final class RoleNameList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.RoleNameType>
        {
            public com.sun.java.xml.ns.j2Ee.RoleNameType get(int i)
                { return MethodPermissionTypeImpl.this.getRoleNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.RoleNameType set(int i, com.sun.java.xml.ns.j2Ee.RoleNameType o)
            {
                com.sun.java.xml.ns.j2Ee.RoleNameType old = MethodPermissionTypeImpl.this.getRoleNameArray(i);
                MethodPermissionTypeImpl.this.setRoleNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.RoleNameType o)
                { MethodPermissionTypeImpl.this.insertNewRoleName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.RoleNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.RoleNameType old = MethodPermissionTypeImpl.this.getRoleNameArray(i);
                MethodPermissionTypeImpl.this.removeRoleName(i);
                return old;
            }
            
            public int size()
                { return MethodPermissionTypeImpl.this.sizeOfRoleNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RoleNameList();
        }
    }
    
    /**
     * Gets array of all "role-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.RoleNameType[] getRoleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.RoleNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.RoleNameType>();
            get_store().find_all_element_users(ROLENAME$2, targetList);
            com.sun.java.xml.ns.j2Ee.RoleNameType[] result = new com.sun.java.xml.ns.j2Ee.RoleNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role-name" element
     */
    public com.sun.java.xml.ns.j2Ee.RoleNameType getRoleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RoleNameType)get_store().find_element_user(ROLENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role-name" element
     */
    public int sizeOfRoleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLENAME$2);
        }
    }
    
    /**
     * Sets array of all "role-name" element
     */
    public void setRoleNameArray(com.sun.java.xml.ns.j2Ee.RoleNameType[] roleNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleNameArray, ROLENAME$2);
        }
    }
    
    /**
     * Sets ith "role-name" element
     */
    public void setRoleNameArray(int i, com.sun.java.xml.ns.j2Ee.RoleNameType roleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RoleNameType)get_store().find_element_user(ROLENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(roleName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role-name" element
     */
    public com.sun.java.xml.ns.j2Ee.RoleNameType insertNewRoleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RoleNameType)get_store().insert_element_user(ROLENAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role-name" element
     */
    public com.sun.java.xml.ns.j2Ee.RoleNameType addNewRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RoleNameType)get_store().add_element_user(ROLENAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "role-name" element
     */
    public void removeRoleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLENAME$2, i);
        }
    }
    
    /**
     * Gets the "unchecked" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getUnchecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(UNCHECKED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "unchecked" element
     */
    public boolean isSetUnchecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNCHECKED$4) != 0;
        }
    }
    
    /**
     * Sets the "unchecked" element
     */
    public void setUnchecked(com.sun.java.xml.ns.j2Ee.EmptyType unchecked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(UNCHECKED$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(UNCHECKED$4);
            }
            target.set(unchecked);
        }
    }
    
    /**
     * Appends and returns a new empty "unchecked" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewUnchecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(UNCHECKED$4);
            return target;
        }
    }
    
    /**
     * Unsets the "unchecked" element
     */
    public void unsetUnchecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNCHECKED$4, 0);
        }
    }
    
    /**
     * Gets a List of "method" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MethodType> getMethodList()
    {
        final class MethodList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MethodType>
        {
            public com.sun.java.xml.ns.j2Ee.MethodType get(int i)
                { return MethodPermissionTypeImpl.this.getMethodArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MethodType set(int i, com.sun.java.xml.ns.j2Ee.MethodType o)
            {
                com.sun.java.xml.ns.j2Ee.MethodType old = MethodPermissionTypeImpl.this.getMethodArray(i);
                MethodPermissionTypeImpl.this.setMethodArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MethodType o)
                { MethodPermissionTypeImpl.this.insertNewMethod(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MethodType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MethodType old = MethodPermissionTypeImpl.this.getMethodArray(i);
                MethodPermissionTypeImpl.this.removeMethod(i);
                return old;
            }
            
            public int size()
                { return MethodPermissionTypeImpl.this.sizeOfMethodArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodList();
        }
    }
    
    /**
     * Gets array of all "method" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MethodType[] getMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MethodType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MethodType>();
            get_store().find_all_element_users(METHOD$6, targetList);
            com.sun.java.xml.ns.j2Ee.MethodType[] result = new com.sun.java.xml.ns.j2Ee.MethodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodType getMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().find_element_user(METHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method" element
     */
    public int sizeOfMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHOD$6);
        }
    }
    
    /**
     * Sets array of all "method" element
     */
    public void setMethodArray(com.sun.java.xml.ns.j2Ee.MethodType[] methodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodArray, METHOD$6);
        }
    }
    
    /**
     * Sets ith "method" element
     */
    public void setMethodArray(int i, com.sun.java.xml.ns.j2Ee.MethodType method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().find_element_user(METHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(method);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodType insertNewMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().insert_element_user(METHOD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodType addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodType)get_store().add_element_user(METHOD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "method" element
     */
    public void removeMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHOD$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
