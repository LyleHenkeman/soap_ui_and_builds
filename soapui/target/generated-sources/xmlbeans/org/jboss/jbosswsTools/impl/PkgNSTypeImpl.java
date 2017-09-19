/*
 * XML Type:  pkgNSType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.PkgNSType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML pkgNSType(@http://www.jboss.org/jbossws-tools).
 *
 * This is an atomic type that is a restriction of org.jboss.jbosswsTools.PkgNSType.
 */
public class PkgNSTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.PkgNSType
{
    private static final long serialVersionUID = 1L;
    
    public PkgNSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected PkgNSTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName PACKAGE$0 = 
        new javax.xml.namespace.QName("", "package");
    private static final javax.xml.namespace.QName NAMESPACE$2 = 
        new javax.xml.namespace.QName("", "namespace");
    
    
    /**
     * Gets the "package" attribute
     */
    public java.lang.String getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "package" attribute
     */
    public org.jboss.jbosswsTools.PkgNSType.Package xgetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType.Package target = null;
            target = (org.jboss.jbosswsTools.PkgNSType.Package)get_store().find_attribute_user(PACKAGE$0);
            return target;
        }
    }
    
    /**
     * True if has "package" attribute
     */
    public boolean isSetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PACKAGE$0) != null;
        }
    }
    
    /**
     * Sets the "package" attribute
     */
    public void setPackage(java.lang.String xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$0);
            }
            target.setStringValue(xpackage);
        }
    }
    
    /**
     * Sets (as xml) the "package" attribute
     */
    public void xsetPackage(org.jboss.jbosswsTools.PkgNSType.Package xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType.Package target = null;
            target = (org.jboss.jbosswsTools.PkgNSType.Package)get_store().find_attribute_user(PACKAGE$0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.PkgNSType.Package)get_store().add_attribute_user(PACKAGE$0);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Unsets the "package" attribute
     */
    public void unsetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PACKAGE$0);
        }
    }
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.jboss.jbosswsTools.PkgNSType.Namespace xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType.Namespace target = null;
            target = (org.jboss.jbosswsTools.PkgNSType.Namespace)get_store().find_attribute_user(NAMESPACE$2);
            return target;
        }
    }
    
    /**
     * True if has "namespace" attribute
     */
    public boolean isSetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMESPACE$2) != null;
        }
    }
    
    /**
     * Sets the "namespace" attribute
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$2);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.jboss.jbosswsTools.PkgNSType.Namespace namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.PkgNSType.Namespace target = null;
            target = (org.jboss.jbosswsTools.PkgNSType.Namespace)get_store().find_attribute_user(NAMESPACE$2);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.PkgNSType.Namespace)get_store().add_attribute_user(NAMESPACE$2);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Unsets the "namespace" attribute
     */
    public void unsetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMESPACE$2);
        }
    }
    /**
     * An XML package(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.PkgNSType$Package.
     */
    public static class PackageImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.PkgNSType.Package
    {
        private static final long serialVersionUID = 1L;
        
        public PackageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PackageImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML namespace(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.PkgNSType$Namespace.
     */
    public static class NamespaceImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.PkgNSType.Namespace
    {
        private static final long serialVersionUID = 1L;
        
        public NamespaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NamespaceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
