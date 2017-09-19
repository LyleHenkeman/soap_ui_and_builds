/*
 * XML Type:  session-beanType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.SessionBeanType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML session-beanType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class SessionBeanTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.SessionBeanType
{
    private static final long serialVersionUID = 1L;
    
    public SessionBeanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName EJBNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-name");
    private static final javax.xml.namespace.QName HOME$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "home");
    private static final javax.xml.namespace.QName REMOTE$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "remote");
    private static final javax.xml.namespace.QName LOCALHOME$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "local-home");
    private static final javax.xml.namespace.QName LOCAL$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "local");
    private static final javax.xml.namespace.QName SERVICEENDPOINT$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-endpoint");
    private static final javax.xml.namespace.QName EJBCLASS$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-class");
    private static final javax.xml.namespace.QName SESSIONTYPE$20 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "session-type");
    private static final javax.xml.namespace.QName TRANSACTIONTYPE$22 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "transaction-type");
    private static final javax.xml.namespace.QName ENVENTRY$24 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$26 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$28 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$30 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$32 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$34 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONREF$36 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination-ref");
    private static final javax.xml.namespace.QName SECURITYROLEREF$38 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "security-role-ref");
    private static final javax.xml.namespace.QName SECURITYIDENTITY$40 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "security-identity");
    private static final javax.xml.namespace.QName ID$42 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return SessionBeanTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = SessionBeanTypeImpl.this.getDescriptionArray(i);
                SessionBeanTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { SessionBeanTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = SessionBeanTypeImpl.this.getDescriptionArray(i);
                SessionBeanTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets a List of "display-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> getDisplayNameList()
    {
        final class DisplayNameList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DisplayNameType>
        {
            public com.sun.java.xml.ns.j2Ee.DisplayNameType get(int i)
                { return SessionBeanTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType set(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = SessionBeanTypeImpl.this.getDisplayNameArray(i);
                SessionBeanTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
                { SessionBeanTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = SessionBeanTypeImpl.this.getDisplayNameArray(i);
                SessionBeanTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfDisplayNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayNameList();
        }
    }
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType[] getDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DisplayNameType>();
            get_store().find_all_element_users(DISPLAYNAME$2, targetList);
            com.sun.java.xml.ns.j2Ee.DisplayNameType[] result = new com.sun.java.xml.ns.j2Ee.DisplayNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "display-name" element
     */
    public int sizeOfDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$2);
        }
    }
    
    /**
     * Sets array of all "display-name" element
     */
    public void setDisplayNameArray(com.sun.java.xml.ns.j2Ee.DisplayNameType[] displayNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(displayNameArray, DISPLAYNAME$2);
        }
    }
    
    /**
     * Sets ith "display-name" element
     */
    public void setDisplayNameArray(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(displayName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType insertNewDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().insert_element_user(DISPLAYNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "display-name" element
     */
    public void removeDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$2, i);
        }
    }
    
    /**
     * Gets a List of "icon" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.IconType> getIconList()
    {
        final class IconList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.IconType>
        {
            public com.sun.java.xml.ns.j2Ee.IconType get(int i)
                { return SessionBeanTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.IconType set(int i, com.sun.java.xml.ns.j2Ee.IconType o)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = SessionBeanTypeImpl.this.getIconArray(i);
                SessionBeanTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.IconType o)
                { SessionBeanTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.IconType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = SessionBeanTypeImpl.this.getIconArray(i);
                SessionBeanTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfIconArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IconList();
        }
    }
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.IconType[] getIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.IconType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.IconType>();
            get_store().find_all_element_users(ICON$4, targetList);
            com.sun.java.xml.ns.j2Ee.IconType[] result = new com.sun.java.xml.ns.j2Ee.IconType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType getIconArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "icon" element
     */
    public int sizeOfIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICON$4);
        }
    }
    
    /**
     * Sets array of all "icon" element
     */
    public void setIconArray(com.sun.java.xml.ns.j2Ee.IconType[] iconArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iconArray, ICON$4);
        }
    }
    
    /**
     * Sets ith "icon" element
     */
    public void setIconArray(int i, com.sun.java.xml.ns.j2Ee.IconType icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(icon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType insertNewIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().insert_element_user(ICON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType addNewIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().add_element_user(ICON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "icon" element
     */
    public void removeIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICON$4, i);
        }
    }
    
    /**
     * Gets the "ejb-name" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbNameType getEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().find_element_user(EJBNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-name" element
     */
    public void setEjbName(com.sun.java.xml.ns.j2Ee.EjbNameType ejbName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().find_element_user(EJBNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().add_element_user(EJBNAME$6);
            }
            target.set(ejbName);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-name" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbNameType addNewEjbName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbNameType)get_store().add_element_user(EJBNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "home" element
     */
    public com.sun.java.xml.ns.j2Ee.HomeType getHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HomeType)get_store().find_element_user(HOME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "home" element
     */
    public boolean isSetHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOME$8) != 0;
        }
    }
    
    /**
     * Sets the "home" element
     */
    public void setHome(com.sun.java.xml.ns.j2Ee.HomeType home)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HomeType)get_store().find_element_user(HOME$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.HomeType)get_store().add_element_user(HOME$8);
            }
            target.set(home);
        }
    }
    
    /**
     * Appends and returns a new empty "home" element
     */
    public com.sun.java.xml.ns.j2Ee.HomeType addNewHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HomeType)get_store().add_element_user(HOME$8);
            return target;
        }
    }
    
    /**
     * Unsets the "home" element
     */
    public void unsetHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOME$8, 0);
        }
    }
    
    /**
     * Gets the "remote" element
     */
    public com.sun.java.xml.ns.j2Ee.RemoteType getRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RemoteType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RemoteType)get_store().find_element_user(REMOTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remote" element
     */
    public boolean isSetRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOTE$10) != 0;
        }
    }
    
    /**
     * Sets the "remote" element
     */
    public void setRemote(com.sun.java.xml.ns.j2Ee.RemoteType remote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RemoteType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RemoteType)get_store().find_element_user(REMOTE$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.RemoteType)get_store().add_element_user(REMOTE$10);
            }
            target.set(remote);
        }
    }
    
    /**
     * Appends and returns a new empty "remote" element
     */
    public com.sun.java.xml.ns.j2Ee.RemoteType addNewRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.RemoteType target = null;
            target = (com.sun.java.xml.ns.j2Ee.RemoteType)get_store().add_element_user(REMOTE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "remote" element
     */
    public void unsetRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOTE$10, 0);
        }
    }
    
    /**
     * Gets the "local-home" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalHomeType getLocalHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalHomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().find_element_user(LOCALHOME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "local-home" element
     */
    public boolean isSetLocalHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALHOME$12) != 0;
        }
    }
    
    /**
     * Sets the "local-home" element
     */
    public void setLocalHome(com.sun.java.xml.ns.j2Ee.LocalHomeType localHome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalHomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().find_element_user(LOCALHOME$12, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().add_element_user(LOCALHOME$12);
            }
            target.set(localHome);
        }
    }
    
    /**
     * Appends and returns a new empty "local-home" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalHomeType addNewLocalHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalHomeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalHomeType)get_store().add_element_user(LOCALHOME$12);
            return target;
        }
    }
    
    /**
     * Unsets the "local-home" element
     */
    public void unsetLocalHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALHOME$12, 0);
        }
    }
    
    /**
     * Gets the "local" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalType getLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().find_element_user(LOCAL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "local" element
     */
    public boolean isSetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCAL$14) != 0;
        }
    }
    
    /**
     * Sets the "local" element
     */
    public void setLocal(com.sun.java.xml.ns.j2Ee.LocalType local)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().find_element_user(LOCAL$14, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().add_element_user(LOCAL$14);
            }
            target.set(local);
        }
    }
    
    /**
     * Appends and returns a new empty "local" element
     */
    public com.sun.java.xml.ns.j2Ee.LocalType addNewLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocalType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocalType)get_store().add_element_user(LOCAL$14);
            return target;
        }
    }
    
    /**
     * Unsets the "local" element
     */
    public void unsetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCAL$14, 0);
        }
    }
    
    /**
     * Gets the "service-endpoint" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "service-endpoint" element
     */
    public boolean isSetServiceEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEENDPOINT$16) != 0;
        }
    }
    
    /**
     * Sets the "service-endpoint" element
     */
    public void setServiceEndpoint(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceEndpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINT$16, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINT$16);
            }
            target.set(serviceEndpoint);
        }
    }
    
    /**
     * Appends and returns a new empty "service-endpoint" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "service-endpoint" element
     */
    public void unsetServiceEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEENDPOINT$16, 0);
        }
    }
    
    /**
     * Gets the "ejb-class" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbClassType getEjbClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbClassType)get_store().find_element_user(EJBCLASS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-class" element
     */
    public void setEjbClass(com.sun.java.xml.ns.j2Ee.EjbClassType ejbClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbClassType)get_store().find_element_user(EJBCLASS$18, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.EjbClassType)get_store().add_element_user(EJBCLASS$18);
            }
            target.set(ejbClass);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-class" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbClassType addNewEjbClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbClassType)get_store().add_element_user(EJBCLASS$18);
            return target;
        }
    }
    
    /**
     * Gets the "session-type" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionTypeType getSessionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionTypeType)get_store().find_element_user(SESSIONTYPE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "session-type" element
     */
    public void setSessionType(com.sun.java.xml.ns.j2Ee.SessionTypeType sessionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionTypeType)get_store().find_element_user(SESSIONTYPE$20, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.SessionTypeType)get_store().add_element_user(SESSIONTYPE$20);
            }
            target.set(sessionType);
        }
    }
    
    /**
     * Appends and returns a new empty "session-type" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionTypeType addNewSessionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionTypeType)get_store().add_element_user(SESSIONTYPE$20);
            return target;
        }
    }
    
    /**
     * Gets the "transaction-type" element
     */
    public com.sun.java.xml.ns.j2Ee.TransactionTypeType getTransactionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TransactionTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TransactionTypeType)get_store().find_element_user(TRANSACTIONTYPE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transaction-type" element
     */
    public void setTransactionType(com.sun.java.xml.ns.j2Ee.TransactionTypeType transactionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TransactionTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TransactionTypeType)get_store().find_element_user(TRANSACTIONTYPE$22, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.TransactionTypeType)get_store().add_element_user(TRANSACTIONTYPE$22);
            }
            target.set(transactionType);
        }
    }
    
    /**
     * Appends and returns a new empty "transaction-type" element
     */
    public com.sun.java.xml.ns.j2Ee.TransactionTypeType addNewTransactionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TransactionTypeType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TransactionTypeType)get_store().add_element_user(TRANSACTIONTYPE$22);
            return target;
        }
    }
    
    /**
     * Gets a List of "env-entry" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EnvEntryType> getEnvEntryList()
    {
        final class EnvEntryList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EnvEntryType>
        {
            public com.sun.java.xml.ns.j2Ee.EnvEntryType get(int i)
                { return SessionBeanTypeImpl.this.getEnvEntryArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EnvEntryType set(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType o)
            {
                com.sun.java.xml.ns.j2Ee.EnvEntryType old = SessionBeanTypeImpl.this.getEnvEntryArray(i);
                SessionBeanTypeImpl.this.setEnvEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType o)
                { SessionBeanTypeImpl.this.insertNewEnvEntry(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EnvEntryType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EnvEntryType old = SessionBeanTypeImpl.this.getEnvEntryArray(i);
                SessionBeanTypeImpl.this.removeEnvEntry(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfEnvEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EnvEntryList();
        }
    }
    
    /**
     * Gets array of all "env-entry" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EnvEntryType[] getEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EnvEntryType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EnvEntryType>();
            get_store().find_all_element_users(ENVENTRY$24, targetList);
            com.sun.java.xml.ns.j2Ee.EnvEntryType[] result = new com.sun.java.xml.ns.j2Ee.EnvEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "env-entry" element
     */
    public com.sun.java.xml.ns.j2Ee.EnvEntryType getEnvEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().find_element_user(ENVENTRY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "env-entry" element
     */
    public int sizeOfEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRY$24);
        }
    }
    
    /**
     * Sets array of all "env-entry" element
     */
    public void setEnvEntryArray(com.sun.java.xml.ns.j2Ee.EnvEntryType[] envEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(envEntryArray, ENVENTRY$24);
        }
    }
    
    /**
     * Sets ith "env-entry" element
     */
    public void setEnvEntryArray(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType envEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().find_element_user(ENVENTRY$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(envEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    public com.sun.java.xml.ns.j2Ee.EnvEntryType insertNewEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().insert_element_user(ENVENTRY$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    public com.sun.java.xml.ns.j2Ee.EnvEntryType addNewEnvEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().add_element_user(ENVENTRY$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "env-entry" element
     */
    public void removeEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRY$24, i);
        }
    }
    
    /**
     * Gets a List of "ejb-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EjbRefType> getEjbRefList()
    {
        final class EjbRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EjbRefType>
        {
            public com.sun.java.xml.ns.j2Ee.EjbRefType get(int i)
                { return SessionBeanTypeImpl.this.getEjbRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRefType set(int i, com.sun.java.xml.ns.j2Ee.EjbRefType o)
            {
                com.sun.java.xml.ns.j2Ee.EjbRefType old = SessionBeanTypeImpl.this.getEjbRefArray(i);
                SessionBeanTypeImpl.this.setEjbRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EjbRefType o)
                { SessionBeanTypeImpl.this.insertNewEjbRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EjbRefType old = SessionBeanTypeImpl.this.getEjbRefArray(i);
                SessionBeanTypeImpl.this.removeEjbRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfEjbRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EjbRefList();
        }
    }
    
    /**
     * Gets array of all "ejb-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefType[] getEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EjbRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EjbRefType>();
            get_store().find_all_element_users(EJBREF$26, targetList);
            com.sun.java.xml.ns.j2Ee.EjbRefType[] result = new com.sun.java.xml.ns.j2Ee.EjbRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefType getEjbRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().find_element_user(EJBREF$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-ref" element
     */
    public int sizeOfEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBREF$26);
        }
    }
    
    /**
     * Sets array of all "ejb-ref" element
     */
    public void setEjbRefArray(com.sun.java.xml.ns.j2Ee.EjbRefType[] ejbRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbRefArray, EJBREF$26);
        }
    }
    
    /**
     * Sets ith "ejb-ref" element
     */
    public void setEjbRefArray(int i, com.sun.java.xml.ns.j2Ee.EjbRefType ejbRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().find_element_user(EJBREF$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefType insertNewEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().insert_element_user(EJBREF$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbRefType addNewEjbRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().add_element_user(EJBREF$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-ref" element
     */
    public void removeEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBREF$26, i);
        }
    }
    
    /**
     * Gets a List of "ejb-local-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EjbLocalRefType> getEjbLocalRefList()
    {
        final class EjbLocalRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EjbLocalRefType>
        {
            public com.sun.java.xml.ns.j2Ee.EjbLocalRefType get(int i)
                { return SessionBeanTypeImpl.this.getEjbLocalRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EjbLocalRefType set(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType o)
            {
                com.sun.java.xml.ns.j2Ee.EjbLocalRefType old = SessionBeanTypeImpl.this.getEjbLocalRefArray(i);
                SessionBeanTypeImpl.this.setEjbLocalRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType o)
                { SessionBeanTypeImpl.this.insertNewEjbLocalRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EjbLocalRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EjbLocalRefType old = SessionBeanTypeImpl.this.getEjbLocalRefArray(i);
                SessionBeanTypeImpl.this.removeEjbLocalRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfEjbLocalRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EjbLocalRefList();
        }
    }
    
    /**
     * Gets array of all "ejb-local-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] getEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EjbLocalRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EjbLocalRefType>();
            get_store().find_all_element_users(EJBLOCALREF$28, targetList);
            com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] result = new com.sun.java.xml.ns.j2Ee.EjbLocalRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLocalRefType getEjbLocalRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().find_element_user(EJBLOCALREF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    public int sizeOfEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLOCALREF$28);
        }
    }
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] ejbLocalRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$28);
        }
    }
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType ejbLocalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().find_element_user(EJBLOCALREF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbLocalRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLocalRefType insertNewEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.EjbLocalRefType addNewEjbLocalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().add_element_user(EJBLOCALREF$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    public void removeEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLOCALREF$28, i);
        }
    }
    
    /**
     * Gets a List of "service-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefType> getServiceRefList()
    {
        final class ServiceRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServiceRefType>
        {
            public com.sun.java.xml.ns.j2Ee.ServiceRefType get(int i)
                { return SessionBeanTypeImpl.this.getServiceRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceRefType set(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType o)
            {
                com.sun.java.xml.ns.j2Ee.ServiceRefType old = SessionBeanTypeImpl.this.getServiceRefArray(i);
                SessionBeanTypeImpl.this.setServiceRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType o)
                { SessionBeanTypeImpl.this.insertNewServiceRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServiceRefType old = SessionBeanTypeImpl.this.getServiceRefArray(i);
                SessionBeanTypeImpl.this.removeServiceRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfServiceRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceRefList();
        }
    }
    
    /**
     * Gets array of all "service-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefType[] getServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServiceRefType>();
            get_store().find_all_element_users(SERVICEREF$30, targetList);
            com.sun.java.xml.ns.j2Ee.ServiceRefType[] result = new com.sun.java.xml.ns.j2Ee.ServiceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefType getServiceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().find_element_user(SERVICEREF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-ref" element
     */
    public int sizeOfServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEREF$30);
        }
    }
    
    /**
     * Sets array of all "service-ref" element
     */
    public void setServiceRefArray(com.sun.java.xml.ns.j2Ee.ServiceRefType[] serviceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceRefArray, SERVICEREF$30);
        }
    }
    
    /**
     * Sets ith "service-ref" element
     */
    public void setServiceRefArray(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType serviceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().find_element_user(SERVICEREF$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefType insertNewServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().insert_element_user(SERVICEREF$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefType addNewServiceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().add_element_user(SERVICEREF$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-ref" element
     */
    public void removeServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEREF$30, i);
        }
    }
    
    /**
     * Gets a List of "resource-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ResourceRefType> getResourceRefList()
    {
        final class ResourceRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ResourceRefType>
        {
            public com.sun.java.xml.ns.j2Ee.ResourceRefType get(int i)
                { return SessionBeanTypeImpl.this.getResourceRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceRefType set(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType o)
            {
                com.sun.java.xml.ns.j2Ee.ResourceRefType old = SessionBeanTypeImpl.this.getResourceRefArray(i);
                SessionBeanTypeImpl.this.setResourceRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType o)
                { SessionBeanTypeImpl.this.insertNewResourceRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ResourceRefType old = SessionBeanTypeImpl.this.getResourceRefArray(i);
                SessionBeanTypeImpl.this.removeResourceRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfResourceRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceRefList();
        }
    }
    
    /**
     * Gets array of all "resource-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ResourceRefType[] getResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ResourceRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ResourceRefType>();
            get_store().find_all_element_users(RESOURCEREF$32, targetList);
            com.sun.java.xml.ns.j2Ee.ResourceRefType[] result = new com.sun.java.xml.ns.j2Ee.ResourceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ResourceRefType getResourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().find_element_user(RESOURCEREF$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-ref" element
     */
    public int sizeOfResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEREF$32);
        }
    }
    
    /**
     * Sets array of all "resource-ref" element
     */
    public void setResourceRefArray(com.sun.java.xml.ns.j2Ee.ResourceRefType[] resourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceRefArray, RESOURCEREF$32);
        }
    }
    
    /**
     * Sets ith "resource-ref" element
     */
    public void setResourceRefArray(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().find_element_user(RESOURCEREF$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ResourceRefType insertNewResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().insert_element_user(RESOURCEREF$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ResourceRefType addNewResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().add_element_user(RESOURCEREF$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-ref" element
     */
    public void removeResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEREF$32, i);
        }
    }
    
    /**
     * Gets a List of "resource-env-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ResourceEnvRefType> getResourceEnvRefList()
    {
        final class ResourceEnvRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ResourceEnvRefType>
        {
            public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType get(int i)
                { return SessionBeanTypeImpl.this.getResourceEnvRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType set(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType o)
            {
                com.sun.java.xml.ns.j2Ee.ResourceEnvRefType old = SessionBeanTypeImpl.this.getResourceEnvRefArray(i);
                SessionBeanTypeImpl.this.setResourceEnvRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType o)
                { SessionBeanTypeImpl.this.insertNewResourceEnvRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ResourceEnvRefType old = SessionBeanTypeImpl.this.getResourceEnvRefArray(i);
                SessionBeanTypeImpl.this.removeResourceEnvRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfResourceEnvRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceEnvRefList();
        }
    }
    
    /**
     * Gets array of all "resource-env-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] getResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ResourceEnvRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ResourceEnvRefType>();
            get_store().find_all_element_users(RESOURCEENVREF$34, targetList);
            com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] result = new com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-env-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType getResourceEnvRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-env-ref" element
     */
    public int sizeOfResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEENVREF$34);
        }
    }
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    public void setResourceEnvRefArray(com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] resourceEnvRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$34);
        }
    }
    
    /**
     * Sets ith "resource-env-ref" element
     */
    public void setResourceEnvRefArray(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType resourceEnvRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceEnvRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType insertNewResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType addNewResourceEnvRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    public void removeResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEENVREF$34, i);
        }
    }
    
    /**
     * Gets a List of "message-destination-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationRefType> getMessageDestinationRefList()
    {
        final class MessageDestinationRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MessageDestinationRefType>
        {
            public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType get(int i)
                { return SessionBeanTypeImpl.this.getMessageDestinationRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType set(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType o)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationRefType old = SessionBeanTypeImpl.this.getMessageDestinationRefArray(i);
                SessionBeanTypeImpl.this.setMessageDestinationRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType o)
                { SessionBeanTypeImpl.this.insertNewMessageDestinationRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationRefType old = SessionBeanTypeImpl.this.getMessageDestinationRefArray(i);
                SessionBeanTypeImpl.this.removeMessageDestinationRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfMessageDestinationRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageDestinationRefList();
        }
    }
    
    /**
     * Gets array of all "message-destination-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] getMessageDestinationRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MessageDestinationRefType>();
            get_store().find_all_element_users(MESSAGEDESTINATIONREF$36, targetList);
            com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] result = new com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-destination-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType getMessageDestinationRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().find_element_user(MESSAGEDESTINATIONREF$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-destination-ref" element
     */
    public int sizeOfMessageDestinationRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONREF$36);
        }
    }
    
    /**
     * Sets array of all "message-destination-ref" element
     */
    public void setMessageDestinationRefArray(com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] messageDestinationRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDestinationRefArray, MESSAGEDESTINATIONREF$36);
        }
    }
    
    /**
     * Sets ith "message-destination-ref" element
     */
    public void setMessageDestinationRefArray(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType messageDestinationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().find_element_user(MESSAGEDESTINATIONREF$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDestinationRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType insertNewMessageDestinationRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().insert_element_user(MESSAGEDESTINATIONREF$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType addNewMessageDestinationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().add_element_user(MESSAGEDESTINATIONREF$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-destination-ref" element
     */
    public void removeMessageDestinationRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONREF$36, i);
        }
    }
    
    /**
     * Gets a List of "security-role-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleRefType> getSecurityRoleRefList()
    {
        final class SecurityRoleRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.SecurityRoleRefType>
        {
            public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType get(int i)
                { return SessionBeanTypeImpl.this.getSecurityRoleRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType set(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleRefType o)
            {
                com.sun.java.xml.ns.j2Ee.SecurityRoleRefType old = SessionBeanTypeImpl.this.getSecurityRoleRefArray(i);
                SessionBeanTypeImpl.this.setSecurityRoleRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleRefType o)
                { SessionBeanTypeImpl.this.insertNewSecurityRoleRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.SecurityRoleRefType old = SessionBeanTypeImpl.this.getSecurityRoleRefArray(i);
                SessionBeanTypeImpl.this.removeSecurityRoleRef(i);
                return old;
            }
            
            public int size()
                { return SessionBeanTypeImpl.this.sizeOfSecurityRoleRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityRoleRefList();
        }
    }
    
    /**
     * Gets array of all "security-role-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType[] getSecurityRoleRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.SecurityRoleRefType>();
            get_store().find_all_element_users(SECURITYROLEREF$38, targetList);
            com.sun.java.xml.ns.j2Ee.SecurityRoleRefType[] result = new com.sun.java.xml.ns.j2Ee.SecurityRoleRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "security-role-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType getSecurityRoleRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleRefType)get_store().find_element_user(SECURITYROLEREF$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "security-role-ref" element
     */
    public int sizeOfSecurityRoleRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYROLEREF$38);
        }
    }
    
    /**
     * Sets array of all "security-role-ref" element
     */
    public void setSecurityRoleRefArray(com.sun.java.xml.ns.j2Ee.SecurityRoleRefType[] securityRoleRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityRoleRefArray, SECURITYROLEREF$38);
        }
    }
    
    /**
     * Sets ith "security-role-ref" element
     */
    public void setSecurityRoleRefArray(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleRefType securityRoleRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleRefType)get_store().find_element_user(SECURITYROLEREF$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityRoleRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType insertNewSecurityRoleRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleRefType)get_store().insert_element_user(SECURITYROLEREF$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityRoleRefType addNewSecurityRoleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleRefType)get_store().add_element_user(SECURITYROLEREF$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "security-role-ref" element
     */
    public void removeSecurityRoleRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYROLEREF$38, i);
        }
    }
    
    /**
     * Gets the "security-identity" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityIdentityType getSecurityIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityIdentityType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityIdentityType)get_store().find_element_user(SECURITYIDENTITY$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "security-identity" element
     */
    public boolean isSetSecurityIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYIDENTITY$40) != 0;
        }
    }
    
    /**
     * Sets the "security-identity" element
     */
    public void setSecurityIdentity(com.sun.java.xml.ns.j2Ee.SecurityIdentityType securityIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityIdentityType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityIdentityType)get_store().find_element_user(SECURITYIDENTITY$40, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.SecurityIdentityType)get_store().add_element_user(SECURITYIDENTITY$40);
            }
            target.set(securityIdentity);
        }
    }
    
    /**
     * Appends and returns a new empty "security-identity" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityIdentityType addNewSecurityIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityIdentityType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityIdentityType)get_store().add_element_user(SECURITYIDENTITY$40);
            return target;
        }
    }
    
    /**
     * Unsets the "security-identity" element
     */
    public void unsetSecurityIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYIDENTITY$40, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$42);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$42);
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
            return get_store().find_attribute_user(ID$42) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$42);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$42);
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
            get_store().remove_attribute(ID$42);
        }
    }
}
