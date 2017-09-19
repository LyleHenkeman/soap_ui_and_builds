/*
 * XML Type:  globalType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.GlobalType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML globalType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class GlobalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.GlobalType
{
    private static final long serialVersionUID = 1L;
    
    public GlobalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGENAMESPACE$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "package-namespace");
    
    
    /**
     * Gets a List of "package-namespace" elements
     */
    public java.util.List<org.jboss.jbosswsTools.PkgNSType> getPackageNamespaceList()
    {
        final class PackageNamespaceList extends java.util.AbstractList<org.jboss.jbosswsTools.PkgNSType>
        {
            public org.jboss.jbosswsTools.PkgNSType get(int i)
                { return GlobalTypeImpl.this.getPackageNamespaceArray(i); }
            
            public org.jboss.jbosswsTools.PkgNSType set(int i, org.jboss.jbosswsTools.PkgNSType o)
            {
                org.jboss.jbosswsTools.PkgNSType old = GlobalTypeImpl.this.getPackageNamespaceArray(i);
                GlobalTypeImpl.this.setPackageNamespaceArray(i, o);
                return old;
            }
            
            public void add(int i, org.jboss.jbosswsTools.PkgNSType o)
                { GlobalTypeImpl.this.insertNewPackageNamespace(i).set(o); }
            
            public org.jboss.jbosswsTools.PkgNSType remove(int i)
            {
                org.jboss.jbosswsTools.PkgNSType old = GlobalTypeImpl.this.getPackageNamespaceArray(i);
                GlobalTypeImpl.this.removePackageNamespace(i);
                return old;
            }
            
            public int size()
                { return GlobalTypeImpl.this.sizeOfPackageNamespaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PackageNamespaceList();
        }
    }
    
    /**
     * Gets array of all "package-namespace" elements
     * @deprecated
     */
    public org.jboss.jbosswsTools.PkgNSType[] getPackageNamespaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.jboss.jbosswsTools.PkgNSType> targetList = new java.util.ArrayList<org.jboss.jbosswsTools.PkgNSType>();
            get_store().find_all_element_users(PACKAGENAMESPACE$0, targetList);
            org.jboss.jbosswsTools.PkgNSType[] result = new org.jboss.jbosswsTools.PkgNSType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "package-namespace" element
     */
    public org.jboss.jbosswsTools.PkgNSType getPackageNamespaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType target = null;
            target = (org.jboss.jbosswsTools.PkgNSType)get_store().find_element_user(PACKAGENAMESPACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "package-namespace" element
     */
    public int sizeOfPackageNamespaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGENAMESPACE$0);
        }
    }
    
    /**
     * Sets array of all "package-namespace" element
     */
    public void setPackageNamespaceArray(org.jboss.jbosswsTools.PkgNSType[] packageNamespaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(packageNamespaceArray, PACKAGENAMESPACE$0);
        }
    }
    
    /**
     * Sets ith "package-namespace" element
     */
    public void setPackageNamespaceArray(int i, org.jboss.jbosswsTools.PkgNSType packageNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType target = null;
            target = (org.jboss.jbosswsTools.PkgNSType)get_store().find_element_user(PACKAGENAMESPACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(packageNamespace);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "package-namespace" element
     */
    public org.jboss.jbosswsTools.PkgNSType insertNewPackageNamespace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType target = null;
            target = (org.jboss.jbosswsTools.PkgNSType)get_store().insert_element_user(PACKAGENAMESPACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "package-namespace" element
     */
    public org.jboss.jbosswsTools.PkgNSType addNewPackageNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType target = null;
            target = (org.jboss.jbosswsTools.PkgNSType)get_store().add_element_user(PACKAGENAMESPACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "package-namespace" element
     */
    public void removePackageNamespace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGENAMESPACE$0, i);
        }
    }
}
