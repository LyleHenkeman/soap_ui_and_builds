/*
 * XML Type:  namespacesType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.NamespacesType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML namespacesType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class NamespacesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.NamespacesType
{
    private static final long serialVersionUID = 1L;
    
    public NamespacesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETNAMESPACE$0 = 
        new javax.xml.namespace.QName("", "target-namespace");
    private static final javax.xml.namespace.QName TYPENAMESPACE$2 = 
        new javax.xml.namespace.QName("", "type-namespace");
    
    
    /**
     * Gets the "target-namespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "target-namespace" attribute
     */
    public org.jboss.jbosswsTools.NamespacesType.TargetNamespace xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType.TargetNamespace target = null;
            target = (org.jboss.jbosswsTools.NamespacesType.TargetNamespace)get_store().find_attribute_user(TARGETNAMESPACE$0);
            return target;
        }
    }
    
    /**
     * Sets the "target-namespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$0);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "target-namespace" attribute
     */
    public void xsetTargetNamespace(org.jboss.jbosswsTools.NamespacesType.TargetNamespace targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType.TargetNamespace target = null;
            target = (org.jboss.jbosswsTools.NamespacesType.TargetNamespace)get_store().find_attribute_user(TARGETNAMESPACE$0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.NamespacesType.TargetNamespace)get_store().add_attribute_user(TARGETNAMESPACE$0);
            }
            target.set(targetNamespace);
        }
    }
    
    /**
     * Gets the "type-namespace" attribute
     */
    public java.lang.String getTypeNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPENAMESPACE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type-namespace" attribute
     */
    public org.jboss.jbosswsTools.NamespacesType.TypeNamespace xgetTypeNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType.TypeNamespace target = null;
            target = (org.jboss.jbosswsTools.NamespacesType.TypeNamespace)get_store().find_attribute_user(TYPENAMESPACE$2);
            return target;
        }
    }
    
    /**
     * Sets the "type-namespace" attribute
     */
    public void setTypeNamespace(java.lang.String typeNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPENAMESPACE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPENAMESPACE$2);
            }
            target.setStringValue(typeNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "type-namespace" attribute
     */
    public void xsetTypeNamespace(org.jboss.jbosswsTools.NamespacesType.TypeNamespace typeNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.NamespacesType.TypeNamespace target = null;
            target = (org.jboss.jbosswsTools.NamespacesType.TypeNamespace)get_store().find_attribute_user(TYPENAMESPACE$2);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.NamespacesType.TypeNamespace)get_store().add_attribute_user(TYPENAMESPACE$2);
            }
            target.set(typeNamespace);
        }
    }
    /**
     * An XML target-namespace(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.NamespacesType$TargetNamespace.
     */
    public static class TargetNamespaceImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.jboss.jbosswsTools.NamespacesType.TargetNamespace
    {
        private static final long serialVersionUID = 1L;
        
        public TargetNamespaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TargetNamespaceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML type-namespace(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.NamespacesType$TypeNamespace.
     */
    public static class TypeNamespaceImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.jboss.jbosswsTools.NamespacesType.TypeNamespace
    {
        private static final long serialVersionUID = 1L;
        
        public TypeNamespaceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeNamespaceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
