/*
 * XML Type:  web-appType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebAppType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML web-appType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class WebAppTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WebAppType
{
    private static final long serialVersionUID = 1L;
    
    public WebAppTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName DISTRIBUTABLE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "distributable");
    private static final javax.xml.namespace.QName CONTEXTPARAM$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "context-param");
    private static final javax.xml.namespace.QName FILTER$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "filter");
    private static final javax.xml.namespace.QName FILTERMAPPING$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "filter-mapping");
    private static final javax.xml.namespace.QName LISTENER$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "listener");
    private static final javax.xml.namespace.QName SERVLET$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "servlet");
    private static final javax.xml.namespace.QName SERVLETMAPPING$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "servlet-mapping");
    private static final javax.xml.namespace.QName SESSIONCONFIG$20 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "session-config");
    private static final javax.xml.namespace.QName MIMEMAPPING$22 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "mime-mapping");
    private static final javax.xml.namespace.QName WELCOMEFILELIST$24 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "welcome-file-list");
    private static final javax.xml.namespace.QName ERRORPAGE$26 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "error-page");
    private static final javax.xml.namespace.QName JSPCONFIG$28 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "jsp-config");
    private static final javax.xml.namespace.QName SECURITYCONSTRAINT$30 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "security-constraint");
    private static final javax.xml.namespace.QName LOGINCONFIG$32 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "login-config");
    private static final javax.xml.namespace.QName SECURITYROLE$34 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "security-role");
    private static final javax.xml.namespace.QName ENVENTRY$36 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$38 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$40 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$42 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$44 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$46 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONREF$48 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$50 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "message-destination");
    private static final javax.xml.namespace.QName LOCALEENCODINGMAPPINGLIST$52 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "locale-encoding-mapping-list");
    private static final javax.xml.namespace.QName VERSION$54 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ID$56 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return WebAppTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = WebAppTypeImpl.this.getDescriptionArray(i);
                WebAppTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { WebAppTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = WebAppTypeImpl.this.getDescriptionArray(i);
                WebAppTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return WebAppTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType set(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = WebAppTypeImpl.this.getDisplayNameArray(i);
                WebAppTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
                { WebAppTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = WebAppTypeImpl.this.getDisplayNameArray(i);
                WebAppTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return WebAppTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.IconType set(int i, com.sun.java.xml.ns.j2Ee.IconType o)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = WebAppTypeImpl.this.getIconArray(i);
                WebAppTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.IconType o)
                { WebAppTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.IconType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = WebAppTypeImpl.this.getIconArray(i);
                WebAppTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets a List of "distributable" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.EmptyType> getDistributableList()
    {
        final class DistributableList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.EmptyType>
        {
            public com.sun.java.xml.ns.j2Ee.EmptyType get(int i)
                { return WebAppTypeImpl.this.getDistributableArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EmptyType set(int i, com.sun.java.xml.ns.j2Ee.EmptyType o)
            {
                com.sun.java.xml.ns.j2Ee.EmptyType old = WebAppTypeImpl.this.getDistributableArray(i);
                WebAppTypeImpl.this.setDistributableArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EmptyType o)
                { WebAppTypeImpl.this.insertNewDistributable(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EmptyType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EmptyType old = WebAppTypeImpl.this.getDistributableArray(i);
                WebAppTypeImpl.this.removeDistributable(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfDistributableArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DistributableList();
        }
    }
    
    /**
     * Gets array of all "distributable" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType[] getDistributableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.EmptyType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.EmptyType>();
            get_store().find_all_element_users(DISTRIBUTABLE$6, targetList);
            com.sun.java.xml.ns.j2Ee.EmptyType[] result = new com.sun.java.xml.ns.j2Ee.EmptyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributable" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType getDistributableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(DISTRIBUTABLE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributable" element
     */
    public int sizeOfDistributableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTABLE$6);
        }
    }
    
    /**
     * Sets array of all "distributable" element
     */
    public void setDistributableArray(com.sun.java.xml.ns.j2Ee.EmptyType[] distributableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(distributableArray, DISTRIBUTABLE$6);
        }
    }
    
    /**
     * Sets ith "distributable" element
     */
    public void setDistributableArray(int i, com.sun.java.xml.ns.j2Ee.EmptyType distributable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().find_element_user(DISTRIBUTABLE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributable" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType insertNewDistributable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().insert_element_user(DISTRIBUTABLE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributable" element
     */
    public com.sun.java.xml.ns.j2Ee.EmptyType addNewDistributable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.EmptyType target = null;
            target = (com.sun.java.xml.ns.j2Ee.EmptyType)get_store().add_element_user(DISTRIBUTABLE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributable" element
     */
    public void removeDistributable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTABLE$6, i);
        }
    }
    
    /**
     * Gets a List of "context-param" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ParamValueType> getContextParamList()
    {
        final class ContextParamList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ParamValueType>
        {
            public com.sun.java.xml.ns.j2Ee.ParamValueType get(int i)
                { return WebAppTypeImpl.this.getContextParamArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ParamValueType set(int i, com.sun.java.xml.ns.j2Ee.ParamValueType o)
            {
                com.sun.java.xml.ns.j2Ee.ParamValueType old = WebAppTypeImpl.this.getContextParamArray(i);
                WebAppTypeImpl.this.setContextParamArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ParamValueType o)
                { WebAppTypeImpl.this.insertNewContextParam(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ParamValueType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ParamValueType old = WebAppTypeImpl.this.getContextParamArray(i);
                WebAppTypeImpl.this.removeContextParam(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfContextParamArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContextParamList();
        }
    }
    
    /**
     * Gets array of all "context-param" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType[] getContextParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ParamValueType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ParamValueType>();
            get_store().find_all_element_users(CONTEXTPARAM$8, targetList);
            com.sun.java.xml.ns.j2Ee.ParamValueType[] result = new com.sun.java.xml.ns.j2Ee.ParamValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "context-param" element
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType getContextParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().find_element_user(CONTEXTPARAM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "context-param" element
     */
    public int sizeOfContextParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTPARAM$8);
        }
    }
    
    /**
     * Sets array of all "context-param" element
     */
    public void setContextParamArray(com.sun.java.xml.ns.j2Ee.ParamValueType[] contextParamArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextParamArray, CONTEXTPARAM$8);
        }
    }
    
    /**
     * Sets ith "context-param" element
     */
    public void setContextParamArray(int i, com.sun.java.xml.ns.j2Ee.ParamValueType contextParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().find_element_user(CONTEXTPARAM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextParam);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "context-param" element
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType insertNewContextParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().insert_element_user(CONTEXTPARAM$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "context-param" element
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType addNewContextParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().add_element_user(CONTEXTPARAM$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "context-param" element
     */
    public void removeContextParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTPARAM$8, i);
        }
    }
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.FilterType> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.FilterType>
        {
            public com.sun.java.xml.ns.j2Ee.FilterType get(int i)
                { return WebAppTypeImpl.this.getFilterArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.FilterType set(int i, com.sun.java.xml.ns.j2Ee.FilterType o)
            {
                com.sun.java.xml.ns.j2Ee.FilterType old = WebAppTypeImpl.this.getFilterArray(i);
                WebAppTypeImpl.this.setFilterArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.FilterType o)
                { WebAppTypeImpl.this.insertNewFilter(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.FilterType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.FilterType old = WebAppTypeImpl.this.getFilterArray(i);
                WebAppTypeImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets array of all "filter" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.FilterType[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.FilterType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.FilterType>();
            get_store().find_all_element_users(FILTER$10, targetList);
            com.sun.java.xml.ns.j2Ee.FilterType[] result = new com.sun.java.xml.ns.j2Ee.FilterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterType getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterType)get_store().find_element_user(FILTER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$10);
        }
    }
    
    /**
     * Sets array of all "filter" element
     */
    public void setFilterArray(com.sun.java.xml.ns.j2Ee.FilterType[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$10);
        }
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, com.sun.java.xml.ns.j2Ee.FilterType filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterType)get_store().find_element_user(FILTER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterType insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterType)get_store().insert_element_user(FILTER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterType addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterType)get_store().add_element_user(FILTER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$10, i);
        }
    }
    
    /**
     * Gets a List of "filter-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.FilterMappingType> getFilterMappingList()
    {
        final class FilterMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.FilterMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.FilterMappingType get(int i)
                { return WebAppTypeImpl.this.getFilterMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.FilterMappingType set(int i, com.sun.java.xml.ns.j2Ee.FilterMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.FilterMappingType old = WebAppTypeImpl.this.getFilterMappingArray(i);
                WebAppTypeImpl.this.setFilterMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.FilterMappingType o)
                { WebAppTypeImpl.this.insertNewFilterMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.FilterMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.FilterMappingType old = WebAppTypeImpl.this.getFilterMappingArray(i);
                WebAppTypeImpl.this.removeFilterMapping(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfFilterMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterMappingList();
        }
    }
    
    /**
     * Gets array of all "filter-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.FilterMappingType[] getFilterMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.FilterMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.FilterMappingType>();
            get_store().find_all_element_users(FILTERMAPPING$12, targetList);
            com.sun.java.xml.ns.j2Ee.FilterMappingType[] result = new com.sun.java.xml.ns.j2Ee.FilterMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterMappingType getFilterMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterMappingType)get_store().find_element_user(FILTERMAPPING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter-mapping" element
     */
    public int sizeOfFilterMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERMAPPING$12);
        }
    }
    
    /**
     * Sets array of all "filter-mapping" element
     */
    public void setFilterMappingArray(com.sun.java.xml.ns.j2Ee.FilterMappingType[] filterMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterMappingArray, FILTERMAPPING$12);
        }
    }
    
    /**
     * Sets ith "filter-mapping" element
     */
    public void setFilterMappingArray(int i, com.sun.java.xml.ns.j2Ee.FilterMappingType filterMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterMappingType)get_store().find_element_user(FILTERMAPPING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filterMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterMappingType insertNewFilterMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterMappingType)get_store().insert_element_user(FILTERMAPPING$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterMappingType addNewFilterMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterMappingType)get_store().add_element_user(FILTERMAPPING$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter-mapping" element
     */
    public void removeFilterMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERMAPPING$12, i);
        }
    }
    
    /**
     * Gets a List of "listener" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ListenerType> getListenerList()
    {
        final class ListenerList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ListenerType>
        {
            public com.sun.java.xml.ns.j2Ee.ListenerType get(int i)
                { return WebAppTypeImpl.this.getListenerArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ListenerType set(int i, com.sun.java.xml.ns.j2Ee.ListenerType o)
            {
                com.sun.java.xml.ns.j2Ee.ListenerType old = WebAppTypeImpl.this.getListenerArray(i);
                WebAppTypeImpl.this.setListenerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ListenerType o)
                { WebAppTypeImpl.this.insertNewListener(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ListenerType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ListenerType old = WebAppTypeImpl.this.getListenerArray(i);
                WebAppTypeImpl.this.removeListener(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfListenerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ListenerList();
        }
    }
    
    /**
     * Gets array of all "listener" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ListenerType[] getListenerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ListenerType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ListenerType>();
            get_store().find_all_element_users(LISTENER$14, targetList);
            com.sun.java.xml.ns.j2Ee.ListenerType[] result = new com.sun.java.xml.ns.j2Ee.ListenerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "listener" element
     */
    public com.sun.java.xml.ns.j2Ee.ListenerType getListenerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ListenerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ListenerType)get_store().find_element_user(LISTENER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "listener" element
     */
    public int sizeOfListenerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTENER$14);
        }
    }
    
    /**
     * Sets array of all "listener" element
     */
    public void setListenerArray(com.sun.java.xml.ns.j2Ee.ListenerType[] listenerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listenerArray, LISTENER$14);
        }
    }
    
    /**
     * Sets ith "listener" element
     */
    public void setListenerArray(int i, com.sun.java.xml.ns.j2Ee.ListenerType listener)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ListenerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ListenerType)get_store().find_element_user(LISTENER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listener);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listener" element
     */
    public com.sun.java.xml.ns.j2Ee.ListenerType insertNewListener(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ListenerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ListenerType)get_store().insert_element_user(LISTENER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listener" element
     */
    public com.sun.java.xml.ns.j2Ee.ListenerType addNewListener()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ListenerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ListenerType)get_store().add_element_user(LISTENER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "listener" element
     */
    public void removeListener(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTENER$14, i);
        }
    }
    
    /**
     * Gets a List of "servlet" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServletType> getServletList()
    {
        final class ServletList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServletType>
        {
            public com.sun.java.xml.ns.j2Ee.ServletType get(int i)
                { return WebAppTypeImpl.this.getServletArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServletType set(int i, com.sun.java.xml.ns.j2Ee.ServletType o)
            {
                com.sun.java.xml.ns.j2Ee.ServletType old = WebAppTypeImpl.this.getServletArray(i);
                WebAppTypeImpl.this.setServletArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServletType o)
                { WebAppTypeImpl.this.insertNewServlet(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServletType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServletType old = WebAppTypeImpl.this.getServletArray(i);
                WebAppTypeImpl.this.removeServlet(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfServletArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServletList();
        }
    }
    
    /**
     * Gets array of all "servlet" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServletType[] getServletArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServletType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServletType>();
            get_store().find_all_element_users(SERVLET$16, targetList);
            com.sun.java.xml.ns.j2Ee.ServletType[] result = new com.sun.java.xml.ns.j2Ee.ServletType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servlet" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletType getServletArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletType)get_store().find_element_user(SERVLET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "servlet" element
     */
    public int sizeOfServletArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLET$16);
        }
    }
    
    /**
     * Sets array of all "servlet" element
     */
    public void setServletArray(com.sun.java.xml.ns.j2Ee.ServletType[] servletArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servletArray, SERVLET$16);
        }
    }
    
    /**
     * Sets ith "servlet" element
     */
    public void setServletArray(int i, com.sun.java.xml.ns.j2Ee.ServletType servlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletType)get_store().find_element_user(SERVLET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servlet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletType insertNewServlet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletType)get_store().insert_element_user(SERVLET$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletType addNewServlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletType)get_store().add_element_user(SERVLET$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "servlet" element
     */
    public void removeServlet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLET$16, i);
        }
    }
    
    /**
     * Gets a List of "servlet-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServletMappingType> getServletMappingList()
    {
        final class ServletMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServletMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.ServletMappingType get(int i)
                { return WebAppTypeImpl.this.getServletMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServletMappingType set(int i, com.sun.java.xml.ns.j2Ee.ServletMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.ServletMappingType old = WebAppTypeImpl.this.getServletMappingArray(i);
                WebAppTypeImpl.this.setServletMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServletMappingType o)
                { WebAppTypeImpl.this.insertNewServletMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServletMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServletMappingType old = WebAppTypeImpl.this.getServletMappingArray(i);
                WebAppTypeImpl.this.removeServletMapping(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfServletMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServletMappingList();
        }
    }
    
    /**
     * Gets array of all "servlet-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServletMappingType[] getServletMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServletMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServletMappingType>();
            get_store().find_all_element_users(SERVLETMAPPING$18, targetList);
            com.sun.java.xml.ns.j2Ee.ServletMappingType[] result = new com.sun.java.xml.ns.j2Ee.ServletMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servlet-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletMappingType getServletMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletMappingType)get_store().find_element_user(SERVLETMAPPING$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "servlet-mapping" element
     */
    public int sizeOfServletMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLETMAPPING$18);
        }
    }
    
    /**
     * Sets array of all "servlet-mapping" element
     */
    public void setServletMappingArray(com.sun.java.xml.ns.j2Ee.ServletMappingType[] servletMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servletMappingArray, SERVLETMAPPING$18);
        }
    }
    
    /**
     * Sets ith "servlet-mapping" element
     */
    public void setServletMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServletMappingType servletMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletMappingType)get_store().find_element_user(SERVLETMAPPING$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servletMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletMappingType insertNewServletMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletMappingType)get_store().insert_element_user(SERVLETMAPPING$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletMappingType addNewServletMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletMappingType)get_store().add_element_user(SERVLETMAPPING$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "servlet-mapping" element
     */
    public void removeServletMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLETMAPPING$18, i);
        }
    }
    
    /**
     * Gets a List of "session-config" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.SessionConfigType> getSessionConfigList()
    {
        final class SessionConfigList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.SessionConfigType>
        {
            public com.sun.java.xml.ns.j2Ee.SessionConfigType get(int i)
                { return WebAppTypeImpl.this.getSessionConfigArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.SessionConfigType set(int i, com.sun.java.xml.ns.j2Ee.SessionConfigType o)
            {
                com.sun.java.xml.ns.j2Ee.SessionConfigType old = WebAppTypeImpl.this.getSessionConfigArray(i);
                WebAppTypeImpl.this.setSessionConfigArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.SessionConfigType o)
                { WebAppTypeImpl.this.insertNewSessionConfig(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.SessionConfigType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.SessionConfigType old = WebAppTypeImpl.this.getSessionConfigArray(i);
                WebAppTypeImpl.this.removeSessionConfig(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfSessionConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SessionConfigList();
        }
    }
    
    /**
     * Gets array of all "session-config" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.SessionConfigType[] getSessionConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.SessionConfigType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.SessionConfigType>();
            get_store().find_all_element_users(SESSIONCONFIG$20, targetList);
            com.sun.java.xml.ns.j2Ee.SessionConfigType[] result = new com.sun.java.xml.ns.j2Ee.SessionConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "session-config" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionConfigType getSessionConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionConfigType)get_store().find_element_user(SESSIONCONFIG$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "session-config" element
     */
    public int sizeOfSessionConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSIONCONFIG$20);
        }
    }
    
    /**
     * Sets array of all "session-config" element
     */
    public void setSessionConfigArray(com.sun.java.xml.ns.j2Ee.SessionConfigType[] sessionConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sessionConfigArray, SESSIONCONFIG$20);
        }
    }
    
    /**
     * Sets ith "session-config" element
     */
    public void setSessionConfigArray(int i, com.sun.java.xml.ns.j2Ee.SessionConfigType sessionConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionConfigType)get_store().find_element_user(SESSIONCONFIG$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sessionConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "session-config" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionConfigType insertNewSessionConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionConfigType)get_store().insert_element_user(SESSIONCONFIG$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "session-config" element
     */
    public com.sun.java.xml.ns.j2Ee.SessionConfigType addNewSessionConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SessionConfigType)get_store().add_element_user(SESSIONCONFIG$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "session-config" element
     */
    public void removeSessionConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSIONCONFIG$20, i);
        }
    }
    
    /**
     * Gets a List of "mime-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.MimeMappingType> getMimeMappingList()
    {
        final class MimeMappingList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.MimeMappingType>
        {
            public com.sun.java.xml.ns.j2Ee.MimeMappingType get(int i)
                { return WebAppTypeImpl.this.getMimeMappingArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MimeMappingType set(int i, com.sun.java.xml.ns.j2Ee.MimeMappingType o)
            {
                com.sun.java.xml.ns.j2Ee.MimeMappingType old = WebAppTypeImpl.this.getMimeMappingArray(i);
                WebAppTypeImpl.this.setMimeMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MimeMappingType o)
                { WebAppTypeImpl.this.insertNewMimeMapping(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MimeMappingType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MimeMappingType old = WebAppTypeImpl.this.getMimeMappingArray(i);
                WebAppTypeImpl.this.removeMimeMapping(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfMimeMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MimeMappingList();
        }
    }
    
    /**
     * Gets array of all "mime-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.MimeMappingType[] getMimeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.MimeMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.MimeMappingType>();
            get_store().find_all_element_users(MIMEMAPPING$22, targetList);
            com.sun.java.xml.ns.j2Ee.MimeMappingType[] result = new com.sun.java.xml.ns.j2Ee.MimeMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mime-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.MimeMappingType getMimeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MimeMappingType)get_store().find_element_user(MIMEMAPPING$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mime-mapping" element
     */
    public int sizeOfMimeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMEMAPPING$22);
        }
    }
    
    /**
     * Sets array of all "mime-mapping" element
     */
    public void setMimeMappingArray(com.sun.java.xml.ns.j2Ee.MimeMappingType[] mimeMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mimeMappingArray, MIMEMAPPING$22);
        }
    }
    
    /**
     * Sets ith "mime-mapping" element
     */
    public void setMimeMappingArray(int i, com.sun.java.xml.ns.j2Ee.MimeMappingType mimeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MimeMappingType)get_store().find_element_user(MIMEMAPPING$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mimeMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mime-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.MimeMappingType insertNewMimeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MimeMappingType)get_store().insert_element_user(MIMEMAPPING$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mime-mapping" element
     */
    public com.sun.java.xml.ns.j2Ee.MimeMappingType addNewMimeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.j2Ee.MimeMappingType)get_store().add_element_user(MIMEMAPPING$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "mime-mapping" element
     */
    public void removeMimeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMEMAPPING$22, i);
        }
    }
    
    /**
     * Gets a List of "welcome-file-list" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.WelcomeFileListType> getWelcomeFileListList()
    {
        final class WelcomeFileListList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.WelcomeFileListType>
        {
            public com.sun.java.xml.ns.j2Ee.WelcomeFileListType get(int i)
                { return WebAppTypeImpl.this.getWelcomeFileListArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.WelcomeFileListType set(int i, com.sun.java.xml.ns.j2Ee.WelcomeFileListType o)
            {
                com.sun.java.xml.ns.j2Ee.WelcomeFileListType old = WebAppTypeImpl.this.getWelcomeFileListArray(i);
                WebAppTypeImpl.this.setWelcomeFileListArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.WelcomeFileListType o)
                { WebAppTypeImpl.this.insertNewWelcomeFileList(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.WelcomeFileListType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.WelcomeFileListType old = WebAppTypeImpl.this.getWelcomeFileListArray(i);
                WebAppTypeImpl.this.removeWelcomeFileList(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfWelcomeFileListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WelcomeFileListList();
        }
    }
    
    /**
     * Gets array of all "welcome-file-list" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.WelcomeFileListType[] getWelcomeFileListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.WelcomeFileListType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.WelcomeFileListType>();
            get_store().find_all_element_users(WELCOMEFILELIST$24, targetList);
            com.sun.java.xml.ns.j2Ee.WelcomeFileListType[] result = new com.sun.java.xml.ns.j2Ee.WelcomeFileListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "welcome-file-list" element
     */
    public com.sun.java.xml.ns.j2Ee.WelcomeFileListType getWelcomeFileListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WelcomeFileListType)get_store().find_element_user(WELCOMEFILELIST$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "welcome-file-list" element
     */
    public int sizeOfWelcomeFileListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WELCOMEFILELIST$24);
        }
    }
    
    /**
     * Sets array of all "welcome-file-list" element
     */
    public void setWelcomeFileListArray(com.sun.java.xml.ns.j2Ee.WelcomeFileListType[] welcomeFileListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(welcomeFileListArray, WELCOMEFILELIST$24);
        }
    }
    
    /**
     * Sets ith "welcome-file-list" element
     */
    public void setWelcomeFileListArray(int i, com.sun.java.xml.ns.j2Ee.WelcomeFileListType welcomeFileList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WelcomeFileListType)get_store().find_element_user(WELCOMEFILELIST$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(welcomeFileList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "welcome-file-list" element
     */
    public com.sun.java.xml.ns.j2Ee.WelcomeFileListType insertNewWelcomeFileList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WelcomeFileListType)get_store().insert_element_user(WELCOMEFILELIST$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "welcome-file-list" element
     */
    public com.sun.java.xml.ns.j2Ee.WelcomeFileListType addNewWelcomeFileList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WelcomeFileListType)get_store().add_element_user(WELCOMEFILELIST$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "welcome-file-list" element
     */
    public void removeWelcomeFileList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WELCOMEFILELIST$24, i);
        }
    }
    
    /**
     * Gets a List of "error-page" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ErrorPageType> getErrorPageList()
    {
        final class ErrorPageList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ErrorPageType>
        {
            public com.sun.java.xml.ns.j2Ee.ErrorPageType get(int i)
                { return WebAppTypeImpl.this.getErrorPageArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ErrorPageType set(int i, com.sun.java.xml.ns.j2Ee.ErrorPageType o)
            {
                com.sun.java.xml.ns.j2Ee.ErrorPageType old = WebAppTypeImpl.this.getErrorPageArray(i);
                WebAppTypeImpl.this.setErrorPageArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ErrorPageType o)
                { WebAppTypeImpl.this.insertNewErrorPage(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ErrorPageType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ErrorPageType old = WebAppTypeImpl.this.getErrorPageArray(i);
                WebAppTypeImpl.this.removeErrorPage(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfErrorPageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrorPageList();
        }
    }
    
    /**
     * Gets array of all "error-page" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ErrorPageType[] getErrorPageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ErrorPageType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ErrorPageType>();
            get_store().find_all_element_users(ERRORPAGE$26, targetList);
            com.sun.java.xml.ns.j2Ee.ErrorPageType[] result = new com.sun.java.xml.ns.j2Ee.ErrorPageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "error-page" element
     */
    public com.sun.java.xml.ns.j2Ee.ErrorPageType getErrorPageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ErrorPageType)get_store().find_element_user(ERRORPAGE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "error-page" element
     */
    public int sizeOfErrorPageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORPAGE$26);
        }
    }
    
    /**
     * Sets array of all "error-page" element
     */
    public void setErrorPageArray(com.sun.java.xml.ns.j2Ee.ErrorPageType[] errorPageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorPageArray, ERRORPAGE$26);
        }
    }
    
    /**
     * Sets ith "error-page" element
     */
    public void setErrorPageArray(int i, com.sun.java.xml.ns.j2Ee.ErrorPageType errorPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ErrorPageType)get_store().find_element_user(ERRORPAGE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errorPage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "error-page" element
     */
    public com.sun.java.xml.ns.j2Ee.ErrorPageType insertNewErrorPage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ErrorPageType)get_store().insert_element_user(ERRORPAGE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "error-page" element
     */
    public com.sun.java.xml.ns.j2Ee.ErrorPageType addNewErrorPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ErrorPageType)get_store().add_element_user(ERRORPAGE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "error-page" element
     */
    public void removeErrorPage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORPAGE$26, i);
        }
    }
    
    /**
     * Gets a List of "jsp-config" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.JspConfigType> getJspConfigList()
    {
        final class JspConfigList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.JspConfigType>
        {
            public com.sun.java.xml.ns.j2Ee.JspConfigType get(int i)
                { return WebAppTypeImpl.this.getJspConfigArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.JspConfigType set(int i, com.sun.java.xml.ns.j2Ee.JspConfigType o)
            {
                com.sun.java.xml.ns.j2Ee.JspConfigType old = WebAppTypeImpl.this.getJspConfigArray(i);
                WebAppTypeImpl.this.setJspConfigArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.JspConfigType o)
                { WebAppTypeImpl.this.insertNewJspConfig(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.JspConfigType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.JspConfigType old = WebAppTypeImpl.this.getJspConfigArray(i);
                WebAppTypeImpl.this.removeJspConfig(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfJspConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JspConfigList();
        }
    }
    
    /**
     * Gets array of all "jsp-config" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.JspConfigType[] getJspConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.JspConfigType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.JspConfigType>();
            get_store().find_all_element_users(JSPCONFIG$28, targetList);
            com.sun.java.xml.ns.j2Ee.JspConfigType[] result = new com.sun.java.xml.ns.j2Ee.JspConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "jsp-config" element
     */
    public com.sun.java.xml.ns.j2Ee.JspConfigType getJspConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JspConfigType)get_store().find_element_user(JSPCONFIG$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "jsp-config" element
     */
    public int sizeOfJspConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JSPCONFIG$28);
        }
    }
    
    /**
     * Sets array of all "jsp-config" element
     */
    public void setJspConfigArray(com.sun.java.xml.ns.j2Ee.JspConfigType[] jspConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jspConfigArray, JSPCONFIG$28);
        }
    }
    
    /**
     * Sets ith "jsp-config" element
     */
    public void setJspConfigArray(int i, com.sun.java.xml.ns.j2Ee.JspConfigType jspConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JspConfigType)get_store().find_element_user(JSPCONFIG$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(jspConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jsp-config" element
     */
    public com.sun.java.xml.ns.j2Ee.JspConfigType insertNewJspConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JspConfigType)get_store().insert_element_user(JSPCONFIG$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jsp-config" element
     */
    public com.sun.java.xml.ns.j2Ee.JspConfigType addNewJspConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JspConfigType)get_store().add_element_user(JSPCONFIG$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "jsp-config" element
     */
    public void removeJspConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JSPCONFIG$28, i);
        }
    }
    
    /**
     * Gets a List of "security-constraint" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.SecurityConstraintType> getSecurityConstraintList()
    {
        final class SecurityConstraintList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.SecurityConstraintType>
        {
            public com.sun.java.xml.ns.j2Ee.SecurityConstraintType get(int i)
                { return WebAppTypeImpl.this.getSecurityConstraintArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityConstraintType set(int i, com.sun.java.xml.ns.j2Ee.SecurityConstraintType o)
            {
                com.sun.java.xml.ns.j2Ee.SecurityConstraintType old = WebAppTypeImpl.this.getSecurityConstraintArray(i);
                WebAppTypeImpl.this.setSecurityConstraintArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.SecurityConstraintType o)
                { WebAppTypeImpl.this.insertNewSecurityConstraint(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityConstraintType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.SecurityConstraintType old = WebAppTypeImpl.this.getSecurityConstraintArray(i);
                WebAppTypeImpl.this.removeSecurityConstraint(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfSecurityConstraintArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityConstraintList();
        }
    }
    
    /**
     * Gets array of all "security-constraint" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.SecurityConstraintType[] getSecurityConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.SecurityConstraintType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.SecurityConstraintType>();
            get_store().find_all_element_users(SECURITYCONSTRAINT$30, targetList);
            com.sun.java.xml.ns.j2Ee.SecurityConstraintType[] result = new com.sun.java.xml.ns.j2Ee.SecurityConstraintType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "security-constraint" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityConstraintType getSecurityConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityConstraintType)get_store().find_element_user(SECURITYCONSTRAINT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "security-constraint" element
     */
    public int sizeOfSecurityConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYCONSTRAINT$30);
        }
    }
    
    /**
     * Sets array of all "security-constraint" element
     */
    public void setSecurityConstraintArray(com.sun.java.xml.ns.j2Ee.SecurityConstraintType[] securityConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityConstraintArray, SECURITYCONSTRAINT$30);
        }
    }
    
    /**
     * Sets ith "security-constraint" element
     */
    public void setSecurityConstraintArray(int i, com.sun.java.xml.ns.j2Ee.SecurityConstraintType securityConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityConstraintType)get_store().find_element_user(SECURITYCONSTRAINT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-constraint" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityConstraintType insertNewSecurityConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityConstraintType)get_store().insert_element_user(SECURITYCONSTRAINT$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-constraint" element
     */
    public com.sun.java.xml.ns.j2Ee.SecurityConstraintType addNewSecurityConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.j2Ee.SecurityConstraintType)get_store().add_element_user(SECURITYCONSTRAINT$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "security-constraint" element
     */
    public void removeSecurityConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYCONSTRAINT$30, i);
        }
    }
    
    /**
     * Gets a List of "login-config" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.LoginConfigType> getLoginConfigList()
    {
        final class LoginConfigList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.LoginConfigType>
        {
            public com.sun.java.xml.ns.j2Ee.LoginConfigType get(int i)
                { return WebAppTypeImpl.this.getLoginConfigArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.LoginConfigType set(int i, com.sun.java.xml.ns.j2Ee.LoginConfigType o)
            {
                com.sun.java.xml.ns.j2Ee.LoginConfigType old = WebAppTypeImpl.this.getLoginConfigArray(i);
                WebAppTypeImpl.this.setLoginConfigArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.LoginConfigType o)
                { WebAppTypeImpl.this.insertNewLoginConfig(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.LoginConfigType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.LoginConfigType old = WebAppTypeImpl.this.getLoginConfigArray(i);
                WebAppTypeImpl.this.removeLoginConfig(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfLoginConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LoginConfigList();
        }
    }
    
    /**
     * Gets array of all "login-config" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.LoginConfigType[] getLoginConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.LoginConfigType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.LoginConfigType>();
            get_store().find_all_element_users(LOGINCONFIG$32, targetList);
            com.sun.java.xml.ns.j2Ee.LoginConfigType[] result = new com.sun.java.xml.ns.j2Ee.LoginConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "login-config" element
     */
    public com.sun.java.xml.ns.j2Ee.LoginConfigType getLoginConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LoginConfigType)get_store().find_element_user(LOGINCONFIG$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "login-config" element
     */
    public int sizeOfLoginConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGINCONFIG$32);
        }
    }
    
    /**
     * Sets array of all "login-config" element
     */
    public void setLoginConfigArray(com.sun.java.xml.ns.j2Ee.LoginConfigType[] loginConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loginConfigArray, LOGINCONFIG$32);
        }
    }
    
    /**
     * Sets ith "login-config" element
     */
    public void setLoginConfigArray(int i, com.sun.java.xml.ns.j2Ee.LoginConfigType loginConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LoginConfigType)get_store().find_element_user(LOGINCONFIG$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(loginConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-config" element
     */
    public com.sun.java.xml.ns.j2Ee.LoginConfigType insertNewLoginConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LoginConfigType)get_store().insert_element_user(LOGINCONFIG$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-config" element
     */
    public com.sun.java.xml.ns.j2Ee.LoginConfigType addNewLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LoginConfigType)get_store().add_element_user(LOGINCONFIG$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "login-config" element
     */
    public void removeLoginConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGINCONFIG$32, i);
        }
    }
    
    /**
     * Gets a List of "security-role" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleType> getSecurityRoleList()
    {
        final class SecurityRoleList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.SecurityRoleType>
        {
            public com.sun.java.xml.ns.j2Ee.SecurityRoleType get(int i)
                { return WebAppTypeImpl.this.getSecurityRoleArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityRoleType set(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType o)
            {
                com.sun.java.xml.ns.j2Ee.SecurityRoleType old = WebAppTypeImpl.this.getSecurityRoleArray(i);
                WebAppTypeImpl.this.setSecurityRoleArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType o)
                { WebAppTypeImpl.this.insertNewSecurityRole(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.SecurityRoleType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.SecurityRoleType old = WebAppTypeImpl.this.getSecurityRoleArray(i);
                WebAppTypeImpl.this.removeSecurityRole(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfSecurityRoleArray(); }
            
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
            get_store().find_all_element_users(SECURITYROLE$34, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().find_element_user(SECURITYROLE$34, i);
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
            return get_store().count_elements(SECURITYROLE$34);
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
            arraySetterHelper(securityRoleArray, SECURITYROLE$34);
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
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().find_element_user(SECURITYROLE$34, i);
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
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().insert_element_user(SECURITYROLE$34, i);
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
            target = (com.sun.java.xml.ns.j2Ee.SecurityRoleType)get_store().add_element_user(SECURITYROLE$34);
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
            get_store().remove_element(SECURITYROLE$34, i);
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
                { return WebAppTypeImpl.this.getEnvEntryArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EnvEntryType set(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType o)
            {
                com.sun.java.xml.ns.j2Ee.EnvEntryType old = WebAppTypeImpl.this.getEnvEntryArray(i);
                WebAppTypeImpl.this.setEnvEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType o)
                { WebAppTypeImpl.this.insertNewEnvEntry(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EnvEntryType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EnvEntryType old = WebAppTypeImpl.this.getEnvEntryArray(i);
                WebAppTypeImpl.this.removeEnvEntry(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfEnvEntryArray(); }
            
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
            get_store().find_all_element_users(ENVENTRY$36, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().find_element_user(ENVENTRY$36, i);
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
            return get_store().count_elements(ENVENTRY$36);
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
            arraySetterHelper(envEntryArray, ENVENTRY$36);
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
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().find_element_user(ENVENTRY$36, i);
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
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().insert_element_user(ENVENTRY$36, i);
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
            target = (com.sun.java.xml.ns.j2Ee.EnvEntryType)get_store().add_element_user(ENVENTRY$36);
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
            get_store().remove_element(ENVENTRY$36, i);
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
                { return WebAppTypeImpl.this.getEjbRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRefType set(int i, com.sun.java.xml.ns.j2Ee.EjbRefType o)
            {
                com.sun.java.xml.ns.j2Ee.EjbRefType old = WebAppTypeImpl.this.getEjbRefArray(i);
                WebAppTypeImpl.this.setEjbRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EjbRefType o)
                { WebAppTypeImpl.this.insertNewEjbRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EjbRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EjbRefType old = WebAppTypeImpl.this.getEjbRefArray(i);
                WebAppTypeImpl.this.removeEjbRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfEjbRefArray(); }
            
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
            get_store().find_all_element_users(EJBREF$38, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().find_element_user(EJBREF$38, i);
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
            return get_store().count_elements(EJBREF$38);
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
            arraySetterHelper(ejbRefArray, EJBREF$38);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().find_element_user(EJBREF$38, i);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().insert_element_user(EJBREF$38, i);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbRefType)get_store().add_element_user(EJBREF$38);
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
            get_store().remove_element(EJBREF$38, i);
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
                { return WebAppTypeImpl.this.getEjbLocalRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.EjbLocalRefType set(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType o)
            {
                com.sun.java.xml.ns.j2Ee.EjbLocalRefType old = WebAppTypeImpl.this.getEjbLocalRefArray(i);
                WebAppTypeImpl.this.setEjbLocalRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType o)
                { WebAppTypeImpl.this.insertNewEjbLocalRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.EjbLocalRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.EjbLocalRefType old = WebAppTypeImpl.this.getEjbLocalRefArray(i);
                WebAppTypeImpl.this.removeEjbLocalRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfEjbLocalRefArray(); }
            
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
            get_store().find_all_element_users(EJBLOCALREF$40, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().find_element_user(EJBLOCALREF$40, i);
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
            return get_store().count_elements(EJBLOCALREF$40);
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
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$40);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().find_element_user(EJBLOCALREF$40, i);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$40, i);
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
            target = (com.sun.java.xml.ns.j2Ee.EjbLocalRefType)get_store().add_element_user(EJBLOCALREF$40);
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
            get_store().remove_element(EJBLOCALREF$40, i);
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
                { return WebAppTypeImpl.this.getServiceRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceRefType set(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType o)
            {
                com.sun.java.xml.ns.j2Ee.ServiceRefType old = WebAppTypeImpl.this.getServiceRefArray(i);
                WebAppTypeImpl.this.setServiceRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType o)
                { WebAppTypeImpl.this.insertNewServiceRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServiceRefType old = WebAppTypeImpl.this.getServiceRefArray(i);
                WebAppTypeImpl.this.removeServiceRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfServiceRefArray(); }
            
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
            get_store().find_all_element_users(SERVICEREF$42, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().find_element_user(SERVICEREF$42, i);
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
            return get_store().count_elements(SERVICEREF$42);
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
            arraySetterHelper(serviceRefArray, SERVICEREF$42);
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
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().find_element_user(SERVICEREF$42, i);
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
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().insert_element_user(SERVICEREF$42, i);
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
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefType)get_store().add_element_user(SERVICEREF$42);
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
            get_store().remove_element(SERVICEREF$42, i);
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
                { return WebAppTypeImpl.this.getResourceRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceRefType set(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType o)
            {
                com.sun.java.xml.ns.j2Ee.ResourceRefType old = WebAppTypeImpl.this.getResourceRefArray(i);
                WebAppTypeImpl.this.setResourceRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType o)
                { WebAppTypeImpl.this.insertNewResourceRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ResourceRefType old = WebAppTypeImpl.this.getResourceRefArray(i);
                WebAppTypeImpl.this.removeResourceRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfResourceRefArray(); }
            
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
            get_store().find_all_element_users(RESOURCEREF$44, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().find_element_user(RESOURCEREF$44, i);
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
            return get_store().count_elements(RESOURCEREF$44);
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
            arraySetterHelper(resourceRefArray, RESOURCEREF$44);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().find_element_user(RESOURCEREF$44, i);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().insert_element_user(RESOURCEREF$44, i);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceRefType)get_store().add_element_user(RESOURCEREF$44);
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
            get_store().remove_element(RESOURCEREF$44, i);
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
                { return WebAppTypeImpl.this.getResourceEnvRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType set(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType o)
            {
                com.sun.java.xml.ns.j2Ee.ResourceEnvRefType old = WebAppTypeImpl.this.getResourceEnvRefArray(i);
                WebAppTypeImpl.this.setResourceEnvRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType o)
                { WebAppTypeImpl.this.insertNewResourceEnvRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ResourceEnvRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ResourceEnvRefType old = WebAppTypeImpl.this.getResourceEnvRefArray(i);
                WebAppTypeImpl.this.removeResourceEnvRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfResourceEnvRefArray(); }
            
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
            get_store().find_all_element_users(RESOURCEENVREF$46, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$46, i);
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
            return get_store().count_elements(RESOURCEENVREF$46);
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
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$46);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$46, i);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$46, i);
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
            target = (com.sun.java.xml.ns.j2Ee.ResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$46);
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
            get_store().remove_element(RESOURCEENVREF$46, i);
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
                { return WebAppTypeImpl.this.getMessageDestinationRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType set(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType o)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationRefType old = WebAppTypeImpl.this.getMessageDestinationRefArray(i);
                WebAppTypeImpl.this.setMessageDestinationRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType o)
                { WebAppTypeImpl.this.insertNewMessageDestinationRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationRefType old = WebAppTypeImpl.this.getMessageDestinationRefArray(i);
                WebAppTypeImpl.this.removeMessageDestinationRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfMessageDestinationRefArray(); }
            
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
            get_store().find_all_element_users(MESSAGEDESTINATIONREF$48, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().find_element_user(MESSAGEDESTINATIONREF$48, i);
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
            return get_store().count_elements(MESSAGEDESTINATIONREF$48);
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
            arraySetterHelper(messageDestinationRefArray, MESSAGEDESTINATIONREF$48);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().find_element_user(MESSAGEDESTINATIONREF$48, i);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().insert_element_user(MESSAGEDESTINATIONREF$48, i);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationRefType)get_store().add_element_user(MESSAGEDESTINATIONREF$48);
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
            get_store().remove_element(MESSAGEDESTINATIONREF$48, i);
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
                { return WebAppTypeImpl.this.getMessageDestinationArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationType set(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType o)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationType old = WebAppTypeImpl.this.getMessageDestinationArray(i);
                WebAppTypeImpl.this.setMessageDestinationArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType o)
                { WebAppTypeImpl.this.insertNewMessageDestination(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.MessageDestinationType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.MessageDestinationType old = WebAppTypeImpl.this.getMessageDestinationArray(i);
                WebAppTypeImpl.this.removeMessageDestination(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfMessageDestinationArray(); }
            
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
            get_store().find_all_element_users(MESSAGEDESTINATION$50, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$50, i);
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
            return get_store().count_elements(MESSAGEDESTINATION$50);
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
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$50);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$50, i);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$50, i);
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
            target = (com.sun.java.xml.ns.j2Ee.MessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$50);
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
            get_store().remove_element(MESSAGEDESTINATION$50, i);
        }
    }
    
    /**
     * Gets a List of "locale-encoding-mapping-list" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType> getLocaleEncodingMappingListList()
    {
        final class LocaleEncodingMappingListList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType>
        {
            public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType get(int i)
                { return WebAppTypeImpl.this.getLocaleEncodingMappingListArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType set(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType o)
            {
                com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType old = WebAppTypeImpl.this.getLocaleEncodingMappingListArray(i);
                WebAppTypeImpl.this.setLocaleEncodingMappingListArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType o)
                { WebAppTypeImpl.this.insertNewLocaleEncodingMappingList(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType old = WebAppTypeImpl.this.getLocaleEncodingMappingListArray(i);
                WebAppTypeImpl.this.removeLocaleEncodingMappingList(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfLocaleEncodingMappingListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocaleEncodingMappingListList();
        }
    }
    
    /**
     * Gets array of all "locale-encoding-mapping-list" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType[] getLocaleEncodingMappingListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType>();
            get_store().find_all_element_users(LOCALEENCODINGMAPPINGLIST$52, targetList);
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType[] result = new com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "locale-encoding-mapping-list" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType getLocaleEncodingMappingListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType)get_store().find_element_user(LOCALEENCODINGMAPPINGLIST$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "locale-encoding-mapping-list" element
     */
    public int sizeOfLocaleEncodingMappingListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALEENCODINGMAPPINGLIST$52);
        }
    }
    
    /**
     * Sets array of all "locale-encoding-mapping-list" element
     */
    public void setLocaleEncodingMappingListArray(com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType[] localeEncodingMappingListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(localeEncodingMappingListArray, LOCALEENCODINGMAPPINGLIST$52);
        }
    }
    
    /**
     * Sets ith "locale-encoding-mapping-list" element
     */
    public void setLocaleEncodingMappingListArray(int i, com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType localeEncodingMappingList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType)get_store().find_element_user(LOCALEENCODINGMAPPINGLIST$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localeEncodingMappingList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale-encoding-mapping-list" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType insertNewLocaleEncodingMappingList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType)get_store().insert_element_user(LOCALEENCODINGMAPPINGLIST$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale-encoding-mapping-list" element
     */
    public com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType addNewLocaleEncodingMappingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.j2Ee.LocaleEncodingMappingListType)get_store().add_element_user(LOCALEENCODINGMAPPINGLIST$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "locale-encoding-mapping-list" element
     */
    public void removeLocaleEncodingMappingList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALEENCODINGMAPPINGLIST$52, i);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public com.sun.java.xml.ns.j2Ee.WebAppVersionType.Enum getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$54);
            if (target == null)
            {
                return null;
            }
            return (com.sun.java.xml.ns.j2Ee.WebAppVersionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public com.sun.java.xml.ns.j2Ee.WebAppVersionType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebAppVersionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebAppVersionType)get_store().find_attribute_user(VERSION$54);
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(com.sun.java.xml.ns.j2Ee.WebAppVersionType.Enum version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$54);
            }
            target.setEnumValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(com.sun.java.xml.ns.j2Ee.WebAppVersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebAppVersionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebAppVersionType)get_store().find_attribute_user(VERSION$54);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.WebAppVersionType)get_store().add_attribute_user(VERSION$54);
            }
            target.set(version);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$56);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$56);
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
            return get_store().find_attribute_user(ID$56) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$56);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$56);
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
            get_store().remove_attribute(ID$56);
        }
    }
}
