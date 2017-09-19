/*
 * XML Type:  assembly-descriptorType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML assembly-descriptorType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class AssemblyDescriptorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType
{
    private static final long serialVersionUID = 1L;
    
    public AssemblyDescriptorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITYROLE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "security-role");
    private static final javax.xml.namespace.QName METHODPERMISSION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "method-permission");
    private static final javax.xml.namespace.QName CONTAINERTRANSACTION$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "container-transaction");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination");
    private static final javax.xml.namespace.QName EXCLUDELIST$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "exclude-list");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "security-role" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleType> getSecurityRoleList()
    {
        final class SecurityRoleList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.SecurityRoleType>
        {
            public com.sun.java.xml.ns.j2Ee.SecurityRoleType get(int i)
                { return AssemblyDescriptorTypeImpl.this.getSecurityRoleArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityRoleType set(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType o)
            {
                com.sun.java.xml.ns.j2Ee.SecurityRoleType old = AssemblyDescriptorTypeImpl.this.getSecurityRoleArray(i);
                AssemblyDescriptorTypeImpl.this.setSecurityRoleArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType o)
                { AssemblyDescriptorTypeImpl.this.insertNewSecurityRole(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityRoleType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.SecurityRoleType old = AssemblyDescriptorTypeImpl.this.getSecurityRoleArray(i);
                AssemblyDescriptorTypeImpl.this.removeSecurityRole(i);
                return old;
            }
            
            public int size()
                { return AssemblyDescriptorTypeImpl.this.sizeOfSecurityRoleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityRoleList();
        }
    }
    
    /**
     * Gets array of all "security-role" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleType[] getSecurityRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.SecurityRoleType>();
            get_store().find_all_element_users(SECURITYROLE$0, targetList);
            com.sun.java.xml.ns.j2Ee.SecurityRoleType[] result = new com.sun.java.xml.ns.j2Ee.SecurityRoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "security-role" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleType getSecurityRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().find_element_user(SECURITYROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "security-role" element
     */
    public int sizeOfSecurityRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYROLE$0);
        }
    }
    
    /**
     * Sets array of all "security-role" element
     */
    public void setSecurityRoleArray(com.sun.java.xml.ns.j2Ee.SecurityRoleType[] securityRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityRoleArray, SECURITYROLE$0);
        }
    }
    
    /**
     * Sets ith "security-role" element
     */
    public void setSecurityRoleArray(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType securityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().find_element_user(SECURITYROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleType insertNewSecurityRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().insert_element_user(SECURITYROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleType addNewSecurityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().add_element_user(SECURITYROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "security-role" element
     */
    public void removeSecurityRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYROLE$0, i);
        }
    }
    
    /**
     * Gets a List of "method-permission" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MethodPermissionType> getMethodPermissionList()
    {
        final class MethodPermissionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MethodPermissionType>
        {
            public com.sun.java.xml.ns.j2Ee.MethodPermissionType get(int i)
                { return AssemblyDescriptorTypeImpl.this.getMethodPermissionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MethodPermissionType set(int i, com.sun.java.xml.ns.j2Ee.MethodPermissionType o)
            {
                com.sun.java.xml.ns.j2Ee.MethodPermissionType old = AssemblyDescriptorTypeImpl.this.getMethodPermissionArray(i);
                AssemblyDescriptorTypeImpl.this.setMethodPermissionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MethodPermissionType o)
                { AssemblyDescriptorTypeImpl.this.insertNewMethodPermission(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MethodPermissionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MethodPermissionType old = AssemblyDescriptorTypeImpl.this.getMethodPermissionArray(i);
                AssemblyDescriptorTypeImpl.this.removeMethodPermission(i);
                return old;
            }
            
            public int size()
                { return AssemblyDescriptorTypeImpl.this.sizeOfMethodPermissionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MethodPermissionList();
        }
    }
    
    /**
     * Gets array of all "method-permission" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MethodPermissionType[] getMethodPermissionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MethodPermissionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MethodPermissionType>();
            get_store().find_all_element_users(METHODPERMISSION$2, targetList);
            com.sun.java.xml.ns.j2Ee.MethodPermissionType[] result = new com.sun.java.xml.ns.j2Ee.MethodPermissionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method-permission" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodPermissionType getMethodPermissionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodPermissionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodPermissionType)get_store().find_element_user(METHODPERMISSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method-permission" element
     */
    public int sizeOfMethodPermissionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHODPERMISSION$2);
        }
    }
    
    /**
     * Sets array of all "method-permission" element
     */
    public void setMethodPermissionArray(com.sun.java.xml.ns.j2Ee.MethodPermissionType[] methodPermissionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodPermissionArray, METHODPERMISSION$2);
        }
    }
    
    /**
     * Sets ith "method-permission" element
     */
    public void setMethodPermissionArray(int i, com.sun.java.xml.ns.j2Ee.MethodPermissionType methodPermission)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodPermissionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodPermissionType)get_store().find_element_user(METHODPERMISSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(methodPermission);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method-permission" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodPermissionType insertNewMethodPermission(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodPermissionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodPermissionType)get_store().insert_element_user(METHODPERMISSION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method-permission" element
     */
    public com.sun.java.xml.ns.j2Ee.MethodPermissionType addNewMethodPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MethodPermissionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MethodPermissionType)get_store().add_element_user(METHODPERMISSION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "method-permission" element
     */
    public void removeMethodPermission(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHODPERMISSION$2, i);
        }
    }
    
    /**
     * Gets a List of "container-transaction" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ContainerTransactionType> getContainerTransactionList()
    {
        final class ContainerTransactionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ContainerTransactionType>
        {
            public com.sun.java.xml.ns.j2Ee.ContainerTransactionType get(int i)
                { return AssemblyDescriptorTypeImpl.this.getContainerTransactionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ContainerTransactionType set(int i, com.sun.java.xml.ns.j2Ee.ContainerTransactionType o)
            {
                com.sun.java.xml.ns.j2Ee.ContainerTransactionType old = AssemblyDescriptorTypeImpl.this.getContainerTransactionArray(i);
                AssemblyDescriptorTypeImpl.this.setContainerTransactionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ContainerTransactionType o)
                { AssemblyDescriptorTypeImpl.this.insertNewContainerTransaction(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ContainerTransactionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ContainerTransactionType old = AssemblyDescriptorTypeImpl.this.getContainerTransactionArray(i);
                AssemblyDescriptorTypeImpl.this.removeContainerTransaction(i);
                return old;
            }
            
            public int size()
                { return AssemblyDescriptorTypeImpl.this.sizeOfContainerTransactionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContainerTransactionList();
        }
    }
    
    /**
     * Gets array of all "container-transaction" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ContainerTransactionType[] getContainerTransactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ContainerTransactionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ContainerTransactionType>();
            get_store().find_all_element_users(CONTAINERTRANSACTION$4, targetList);
            com.sun.java.xml.ns.j2Ee.ContainerTransactionType[] result = new com.sun.java.xml.ns.j2Ee.ContainerTransactionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "container-transaction" element
     */
    public com.sun.java.xml.ns.j2Ee.ContainerTransactionType getContainerTransactionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ContainerTransactionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ContainerTransactionType)get_store().find_element_user(CONTAINERTRANSACTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "container-transaction" element
     */
    public int sizeOfContainerTransactionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINERTRANSACTION$4);
        }
    }
    
    /**
     * Sets array of all "container-transaction" element
     */
    public void setContainerTransactionArray(com.sun.java.xml.ns.j2Ee.ContainerTransactionType[] containerTransactionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(containerTransactionArray, CONTAINERTRANSACTION$4);
        }
    }
    
    /**
     * Sets ith "container-transaction" element
     */
    public void setContainerTransactionArray(int i, com.sun.java.xml.ns.j2Ee.ContainerTransactionType containerTransaction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ContainerTransactionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ContainerTransactionType)get_store().find_element_user(CONTAINERTRANSACTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(containerTransaction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "container-transaction" element
     */
    public com.sun.java.xml.ns.j2Ee.ContainerTransactionType insertNewContainerTransaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ContainerTransactionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ContainerTransactionType)get_store().insert_element_user(CONTAINERTRANSACTION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "container-transaction" element
     */
    public com.sun.java.xml.ns.j2Ee.ContainerTransactionType addNewContainerTransaction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ContainerTransactionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ContainerTransactionType)get_store().add_element_user(CONTAINERTRANSACTION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "container-transaction" element
     */
    public void removeContainerTransaction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINERTRANSACTION$4, i);
        }
    }
    
    /**
     * Gets a List of "message-destination" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationType> getMessageDestinationList()
    {
        final class MessageDestinationList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MessageDestinationType>
        {
            public com.sun.java.xml.ns.j2Ee.MessageDestinationType get(int i)
                { return AssemblyDescriptorTypeImpl.this.getMessageDestinationArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationType set(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType o)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationType old = AssemblyDescriptorTypeImpl.this.getMessageDestinationArray(i);
                AssemblyDescriptorTypeImpl.this.setMessageDestinationArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType o)
                { AssemblyDescriptorTypeImpl.this.insertNewMessageDestination(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationType old = AssemblyDescriptorTypeImpl.this.getMessageDestinationArray(i);
                AssemblyDescriptorTypeImpl.this.removeMessageDestination(i);
                return old;
            }
            
            public int size()
                { return AssemblyDescriptorTypeImpl.this.sizeOfMessageDestinationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageDestinationList();
        }
    }
    
    /**
     * Gets array of all "message-destination" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationType[] getMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MessageDestinationType>();
            get_store().find_all_element_users(MESSAGEDESTINATION$6, targetList);
            com.sun.java.xml.ns.j2Ee.MessageDestinationType[] result = new com.sun.java.xml.ns.j2Ee.MessageDestinationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-destination" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationType getMessageDestinationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-destination" element
     */
    public int sizeOfMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATION$6);
        }
    }
    
    /**
     * Sets array of all "message-destination" element
     */
    public void setMessageDestinationArray(com.sun.java.xml.ns.j2Ee.MessageDestinationType[] messageDestinationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$6);
        }
    }
    
    /**
     * Sets ith "message-destination" element
     */
    public void setMessageDestinationArray(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType messageDestination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDestination);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationType insertNewMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationType addNewMessageDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-destination" element
     */
    public void removeMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATION$6, i);
        }
    }
    
    /**
     * Gets the "exclude-list" element
     */
    public com.sun.java.xml.ns.j2Ee.ExcludeListType getExcludeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExcludeListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExcludeListType)get_store().find_element_user(EXCLUDELIST$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exclude-list" element
     */
    public boolean isSetExcludeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUDELIST$8) != 0;
        }
    }
    
    /**
     * Sets the "exclude-list" element
     */
    public void setExcludeList(com.sun.java.xml.ns.j2Ee.ExcludeListType excludeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExcludeListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExcludeListType)get_store().find_element_user(EXCLUDELIST$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ExcludeListType)get_store().add_element_user(EXCLUDELIST$8);
            }
            target.set(excludeList);
        }
    }
    
    /**
     * Appends and returns a new empty "exclude-list" element
     */
    public com.sun.java.xml.ns.j2Ee.ExcludeListType addNewExcludeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ExcludeListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ExcludeListType)get_store().add_element_user(EXCLUDELIST$8);
            return target;
        }
    }
    
    /**
     * Unsets the "exclude-list" element
     */
    public void unsetExcludeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUDELIST$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
        }
    }
}
