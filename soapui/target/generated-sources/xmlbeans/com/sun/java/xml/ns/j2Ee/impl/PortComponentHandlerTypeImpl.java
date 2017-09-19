/*
 * XML Type:  port-component_handlerType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.PortComponentHandlerType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML port-component_handlerType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class PortComponentHandlerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.PortComponentHandlerType
{
    private static final long serialVersionUID = 1L;
    
    public PortComponentHandlerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName HANDLERNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "handler-name");
    private static final javax.xml.namespace.QName HANDLERCLASS$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "handler-class");
    private static final javax.xml.namespace.QName INITPARAM$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "init-param");
    private static final javax.xml.namespace.QName SOAPHEADER$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "soap-header");
    private static final javax.xml.namespace.QName SOAPROLE$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "soap-role");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return PortComponentHandlerTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = PortComponentHandlerTypeImpl.this.getDescriptionArray(i);
                PortComponentHandlerTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { PortComponentHandlerTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = PortComponentHandlerTypeImpl.this.getDescriptionArray(i);
                PortComponentHandlerTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return PortComponentHandlerTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return PortComponentHandlerTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType set(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = PortComponentHandlerTypeImpl.this.getDisplayNameArray(i);
                PortComponentHandlerTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
                { PortComponentHandlerTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = PortComponentHandlerTypeImpl.this.getDisplayNameArray(i);
                PortComponentHandlerTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return PortComponentHandlerTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return PortComponentHandlerTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.IconType set(int i, com.sun.java.xml.ns.j2Ee.IconType o)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = PortComponentHandlerTypeImpl.this.getIconArray(i);
                PortComponentHandlerTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.IconType o)
                { PortComponentHandlerTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.IconType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = PortComponentHandlerTypeImpl.this.getIconArray(i);
                PortComponentHandlerTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return PortComponentHandlerTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets the "handler-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getHandlerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(HANDLERNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "handler-name" element
     */
    public void setHandlerName(com.sun.java.xml.ns.j2Ee.String handlerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(HANDLERNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(HANDLERNAME$6);
            }
            target.set(handlerName);
        }
    }
    
    /**
     * Appends and returns a new empty "handler-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewHandlerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(HANDLERNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "handler-class" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getHandlerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(HANDLERCLASS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "handler-class" element
     */
    public void setHandlerClass(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType handlerClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(HANDLERCLASS$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(HANDLERCLASS$8);
            }
            target.set(handlerClass);
        }
    }
    
    /**
     * Appends and returns a new empty "handler-class" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewHandlerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(HANDLERCLASS$8);
            return target;
        }
    }
    
    /**
     * Gets a List of "init-param" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ParamValueType> getInitParamList()
    {
        final class InitParamList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ParamValueType>
        {
            public com.sun.java.xml.ns.j2Ee.ParamValueType get(int i)
                { return PortComponentHandlerTypeImpl.this.getInitParamArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ParamValueType set(int i, com.sun.java.xml.ns.j2Ee.ParamValueType o)
            {
                com.sun.java.xml.ns.j2Ee.ParamValueType old = PortComponentHandlerTypeImpl.this.getInitParamArray(i);
                PortComponentHandlerTypeImpl.this.setInitParamArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ParamValueType o)
                { PortComponentHandlerTypeImpl.this.insertNewInitParam(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ParamValueType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ParamValueType old = PortComponentHandlerTypeImpl.this.getInitParamArray(i);
                PortComponentHandlerTypeImpl.this.removeInitParam(i);
                return old;
            }
            
            public int size()
                { return PortComponentHandlerTypeImpl.this.sizeOfInitParamArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InitParamList();
        }
    }
    
    /**
     * Gets array of all "init-param" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType[] getInitParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ParamValueType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ParamValueType>();
            get_store().find_all_element_users(INITPARAM$10, targetList);
            com.sun.java.xml.ns.j2Ee.ParamValueType[] result = new com.sun.java.xml.ns.j2Ee.ParamValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "init-param" element
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType getInitParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().find_element_user(INITPARAM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "init-param" element
     */
    public int sizeOfInitParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITPARAM$10);
        }
    }
    
    /**
     * Sets array of all "init-param" element
     */
    public void setInitParamArray(com.sun.java.xml.ns.j2Ee.ParamValueType[] initParamArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(initParamArray, INITPARAM$10);
        }
    }
    
    /**
     * Sets ith "init-param" element
     */
    public void setInitParamArray(int i, com.sun.java.xml.ns.j2Ee.ParamValueType initParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().find_element_user(INITPARAM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(initParam);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "init-param" element
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType insertNewInitParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().insert_element_user(INITPARAM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "init-param" element
     */
    public com.sun.java.xml.ns.j2Ee.ParamValueType addNewInitParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ParamValueType)get_store().add_element_user(INITPARAM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "init-param" element
     */
    public void removeInitParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITPARAM$10, i);
        }
    }
    
    /**
     * Gets a List of "soap-header" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.XsdQNameType> getSoapHeaderList()
    {
        final class SoapHeaderList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.XsdQNameType>
        {
            public com.sun.java.xml.ns.j2Ee.XsdQNameType get(int i)
                { return PortComponentHandlerTypeImpl.this.getSoapHeaderArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.XsdQNameType set(int i, com.sun.java.xml.ns.j2Ee.XsdQNameType o)
            {
                com.sun.java.xml.ns.j2Ee.XsdQNameType old = PortComponentHandlerTypeImpl.this.getSoapHeaderArray(i);
                PortComponentHandlerTypeImpl.this.setSoapHeaderArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.XsdQNameType o)
                { PortComponentHandlerTypeImpl.this.insertNewSoapHeader(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.XsdQNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.XsdQNameType old = PortComponentHandlerTypeImpl.this.getSoapHeaderArray(i);
                PortComponentHandlerTypeImpl.this.removeSoapHeader(i);
                return old;
            }
            
            public int size()
                { return PortComponentHandlerTypeImpl.this.sizeOfSoapHeaderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SoapHeaderList();
        }
    }
    
    /**
     * Gets array of all "soap-header" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType[] getSoapHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.XsdQNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.XsdQNameType>();
            get_store().find_all_element_users(SOAPHEADER$12, targetList);
            com.sun.java.xml.ns.j2Ee.XsdQNameType[] result = new com.sun.java.xml.ns.j2Ee.XsdQNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "soap-header" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getSoapHeaderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(SOAPHEADER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "soap-header" element
     */
    public int sizeOfSoapHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOAPHEADER$12);
        }
    }
    
    /**
     * Sets array of all "soap-header" element
     */
    public void setSoapHeaderArray(com.sun.java.xml.ns.j2Ee.XsdQNameType[] soapHeaderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(soapHeaderArray, SOAPHEADER$12);
        }
    }
    
    /**
     * Sets ith "soap-header" element
     */
    public void setSoapHeaderArray(int i, com.sun.java.xml.ns.j2Ee.XsdQNameType soapHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(SOAPHEADER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(soapHeader);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-header" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType insertNewSoapHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().insert_element_user(SOAPHEADER$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-header" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewSoapHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(SOAPHEADER$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "soap-header" element
     */
    public void removeSoapHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOAPHEADER$12, i);
        }
    }
    
    /**
     * Gets a List of "soap-role" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.String> getSoapRoleList()
    {
        final class SoapRoleList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.String>
        {
            public com.sun.java.xml.ns.j2Ee.String get(int i)
                { return PortComponentHandlerTypeImpl.this.getSoapRoleArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.String set(int i, com.sun.java.xml.ns.j2Ee.String o)
            {
                com.sun.java.xml.ns.j2Ee.String old = PortComponentHandlerTypeImpl.this.getSoapRoleArray(i);
                PortComponentHandlerTypeImpl.this.setSoapRoleArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.String o)
                { PortComponentHandlerTypeImpl.this.insertNewSoapRole(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.String remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.String old = PortComponentHandlerTypeImpl.this.getSoapRoleArray(i);
                PortComponentHandlerTypeImpl.this.removeSoapRole(i);
                return old;
            }
            
            public int size()
                { return PortComponentHandlerTypeImpl.this.sizeOfSoapRoleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SoapRoleList();
        }
    }
    
    /**
     * Gets array of all "soap-role" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.String[] getSoapRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.String> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.String>();
            get_store().find_all_element_users(SOAPROLE$14, targetList);
            com.sun.java.xml.ns.j2Ee.String[] result = new com.sun.java.xml.ns.j2Ee.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "soap-role" element
     */
    public com.sun.java.xml.ns.j2Ee.String getSoapRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(SOAPROLE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "soap-role" element
     */
    public int sizeOfSoapRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOAPROLE$14);
        }
    }
    
    /**
     * Sets array of all "soap-role" element
     */
    public void setSoapRoleArray(com.sun.java.xml.ns.j2Ee.String[] soapRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(soapRoleArray, SOAPROLE$14);
        }
    }
    
    /**
     * Sets ith "soap-role" element
     */
    public void setSoapRoleArray(int i, com.sun.java.xml.ns.j2Ee.String soapRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(SOAPROLE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(soapRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-role" element
     */
    public com.sun.java.xml.ns.j2Ee.String insertNewSoapRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().insert_element_user(SOAPROLE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-role" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewSoapRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(SOAPROLE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "soap-role" element
     */
    public void removeSoapRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOAPROLE$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
            return get_store().find_attribute_user(ID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
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
            get_store().remove_attribute(ID$16);
        }
    }
}
