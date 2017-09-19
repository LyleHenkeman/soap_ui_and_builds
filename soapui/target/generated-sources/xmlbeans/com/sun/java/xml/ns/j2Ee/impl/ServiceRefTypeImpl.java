/*
 * XML Type:  service-refType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML service-refType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class ServiceRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.ServiceRefType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName SERVICEREFNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-ref-name");
    private static final javax.xml.namespace.QName SERVICEINTERFACE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-interface");
    private static final javax.xml.namespace.QName WSDLFILE$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "wsdl-file");
    private static final javax.xml.namespace.QName JAXRPCMAPPINGFILE$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "jaxrpc-mapping-file");
    private static final javax.xml.namespace.QName SERVICEQNAME$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "service-qname");
    private static final javax.xml.namespace.QName PORTCOMPONENTREF$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "port-component-ref");
    private static final javax.xml.namespace.QName HANDLER$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "handler");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return ServiceRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ServiceRefTypeImpl.this.getDescriptionArray(i);
                ServiceRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { ServiceRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = ServiceRefTypeImpl.this.getDescriptionArray(i);
                ServiceRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return ServiceRefTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType set(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = ServiceRefTypeImpl.this.getDisplayNameArray(i);
                ServiceRefTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
                { ServiceRefTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = ServiceRefTypeImpl.this.getDisplayNameArray(i);
                ServiceRefTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return ServiceRefTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.IconType set(int i, com.sun.java.xml.ns.j2Ee.IconType o)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = ServiceRefTypeImpl.this.getIconArray(i);
                ServiceRefTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.IconType o)
                { ServiceRefTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.IconType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = ServiceRefTypeImpl.this.getIconArray(i);
                ServiceRefTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets the "service-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType getServiceRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(SERVICEREFNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-ref-name" element
     */
    public void setServiceRefName(com.sun.java.xml.ns.j2Ee.JndiNameType serviceRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().find_element_user(SERVICEREFNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(SERVICEREFNAME$6);
            }
            target.set(serviceRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "service-ref-name" element
     */
    public com.sun.java.xml.ns.j2Ee.JndiNameType addNewServiceRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.JndiNameType)get_store().add_element_user(SERVICEREFNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "service-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEINTERFACE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-interface" element
     */
    public void setServiceInterface(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().find_element_user(SERVICEINTERFACE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEINTERFACE$8);
            }
            target.set(serviceInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "service-interface" element
     */
    public com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType)get_store().add_element_user(SERVICEINTERFACE$8);
            return target;
        }
    }
    
    /**
     * Gets the "wsdl-file" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdAnyURIType getWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().find_element_user(WSDLFILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdl-file" element
     */
    public boolean isSetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLFILE$10) != 0;
        }
    }
    
    /**
     * Sets the "wsdl-file" element
     */
    public void setWsdlFile(com.sun.java.xml.ns.j2Ee.XsdAnyURIType wsdlFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().find_element_user(WSDLFILE$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().add_element_user(WSDLFILE$10);
            }
            target.set(wsdlFile);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-file" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdAnyURIType addNewWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdAnyURIType)get_store().add_element_user(WSDLFILE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdl-file" element
     */
    public void unsetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLFILE$10, 0);
        }
    }
    
    /**
     * Gets the "jaxrpc-mapping-file" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType getJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(JAXRPCMAPPINGFILE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jaxrpc-mapping-file" element
     */
    public boolean isSetJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JAXRPCMAPPINGFILE$12) != 0;
        }
    }
    
    /**
     * Sets the "jaxrpc-mapping-file" element
     */
    public void setJaxrpcMappingFile(com.sun.java.xml.ns.j2Ee.PathType jaxrpcMappingFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(JAXRPCMAPPINGFILE$12, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(JAXRPCMAPPINGFILE$12);
            }
            target.set(jaxrpcMappingFile);
        }
    }
    
    /**
     * Appends and returns a new empty "jaxrpc-mapping-file" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType addNewJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(JAXRPCMAPPINGFILE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "jaxrpc-mapping-file" element
     */
    public void unsetJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JAXRPCMAPPINGFILE$12, 0);
        }
    }
    
    /**
     * Gets the "service-qname" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType getServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(SERVICEQNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "service-qname" element
     */
    public boolean isSetServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEQNAME$14) != 0;
        }
    }
    
    /**
     * Sets the "service-qname" element
     */
    public void setServiceQname(com.sun.java.xml.ns.j2Ee.XsdQNameType serviceQname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().find_element_user(SERVICEQNAME$14, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(SERVICEQNAME$14);
            }
            target.set(serviceQname);
        }
    }
    
    /**
     * Appends and returns a new empty "service-qname" element
     */
    public com.sun.java.xml.ns.j2Ee.XsdQNameType addNewServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.XsdQNameType)get_store().add_element_user(SERVICEQNAME$14);
            return target;
        }
    }
    
    /**
     * Unsets the "service-qname" element
     */
    public void unsetServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEQNAME$14, 0);
        }
    }
    
    /**
     * Gets a List of "port-component-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentRefType> getPortComponentRefList()
    {
        final class PortComponentRefList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PortComponentRefType>
        {
            public com.sun.java.xml.ns.j2Ee.PortComponentRefType get(int i)
                { return ServiceRefTypeImpl.this.getPortComponentRefArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PortComponentRefType set(int i, com.sun.java.xml.ns.j2Ee.PortComponentRefType o)
            {
                com.sun.java.xml.ns.j2Ee.PortComponentRefType old = ServiceRefTypeImpl.this.getPortComponentRefArray(i);
                ServiceRefTypeImpl.this.setPortComponentRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PortComponentRefType o)
                { ServiceRefTypeImpl.this.insertNewPortComponentRef(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PortComponentRefType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PortComponentRefType old = ServiceRefTypeImpl.this.getPortComponentRefArray(i);
                ServiceRefTypeImpl.this.removePortComponentRef(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfPortComponentRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortComponentRefList();
        }
    }
    
    /**
     * Gets array of all "port-component-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentRefType[] getPortComponentRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PortComponentRefType>();
            get_store().find_all_element_users(PORTCOMPONENTREF$16, targetList);
            com.sun.java.xml.ns.j2Ee.PortComponentRefType[] result = new com.sun.java.xml.ns.j2Ee.PortComponentRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port-component-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentRefType getPortComponentRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentRefType)get_store().find_element_user(PORTCOMPONENTREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port-component-ref" element
     */
    public int sizeOfPortComponentRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTCOMPONENTREF$16);
        }
    }
    
    /**
     * Sets array of all "port-component-ref" element
     */
    public void setPortComponentRefArray(com.sun.java.xml.ns.j2Ee.PortComponentRefType[] portComponentRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portComponentRefArray, PORTCOMPONENTREF$16);
        }
    }
    
    /**
     * Sets ith "port-component-ref" element
     */
    public void setPortComponentRefArray(int i, com.sun.java.xml.ns.j2Ee.PortComponentRefType portComponentRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentRefType)get_store().find_element_user(PORTCOMPONENTREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portComponentRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-component-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentRefType insertNewPortComponentRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentRefType)get_store().insert_element_user(PORTCOMPONENTREF$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-component-ref" element
     */
    public com.sun.java.xml.ns.j2Ee.PortComponentRefType addNewPortComponentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PortComponentRefType)get_store().add_element_user(PORTCOMPONENTREF$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "port-component-ref" element
     */
    public void removePortComponentRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTCOMPONENTREF$16, i);
        }
    }
    
    /**
     * Gets a List of "handler" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType> getHandlerList()
    {
        final class HandlerList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType>
        {
            public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType get(int i)
                { return ServiceRefTypeImpl.this.getHandlerArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType set(int i, com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType o)
            {
                com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType old = ServiceRefTypeImpl.this.getHandlerArray(i);
                ServiceRefTypeImpl.this.setHandlerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType o)
                { ServiceRefTypeImpl.this.insertNewHandler(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType old = ServiceRefTypeImpl.this.getHandlerArray(i);
                ServiceRefTypeImpl.this.removeHandler(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfHandlerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HandlerList();
        }
    }
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType[] getHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType>();
            get_store().find_all_element_users(HANDLER$18, targetList);
            com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType[] result = new com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "handler" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType getHandlerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType)get_store().find_element_user(HANDLER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "handler" element
     */
    public int sizeOfHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLER$18);
        }
    }
    
    /**
     * Sets array of all "handler" element
     */
    public void setHandlerArray(com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType[] handlerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(handlerArray, HANDLER$18);
        }
    }
    
    /**
     * Sets ith "handler" element
     */
    public void setHandlerArray(int i, com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType handler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType)get_store().find_element_user(HANDLER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(handler);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType insertNewHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType)get_store().insert_element_user(HANDLER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    public com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType addNewHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType)get_store().add_element_user(HANDLER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "handler" element
     */
    public void removeHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLER$18, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
            return get_store().find_attribute_user(ID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
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
            get_store().remove_attribute(ID$20);
        }
    }
}
