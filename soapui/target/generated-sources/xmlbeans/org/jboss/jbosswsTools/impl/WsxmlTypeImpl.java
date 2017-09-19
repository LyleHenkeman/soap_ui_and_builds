/*
 * XML Type:  wsxmlType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.WsxmlType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML wsxmlType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class WsxmlTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.WsxmlType
{
    private static final long serialVersionUID = 1L;
    
    public WsxmlTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVLETLINK$0 = 
        new javax.xml.namespace.QName("", "servlet-link");
    private static final javax.xml.namespace.QName EJBLINK$2 = 
        new javax.xml.namespace.QName("", "ejb-link");
    private static final javax.xml.namespace.QName APPEND$4 = 
        new javax.xml.namespace.QName("", "append");
    
    
    /**
     * Gets the "servlet-link" attribute
     */
    public java.lang.String getServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVLETLINK$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "servlet-link" attribute
     */
    public org.jboss.jbosswsTools.WsxmlType.ServletLink xgetServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType.ServletLink target = null;
            target = (org.jboss.jbosswsTools.WsxmlType.ServletLink)get_store().find_attribute_user(SERVLETLINK$0);
            return target;
        }
    }
    
    /**
     * True if has "servlet-link" attribute
     */
    public boolean isSetServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVLETLINK$0) != null;
        }
    }
    
    /**
     * Sets the "servlet-link" attribute
     */
    public void setServletLink(java.lang.String servletLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVLETLINK$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVLETLINK$0);
            }
            target.setStringValue(servletLink);
        }
    }
    
    /**
     * Sets (as xml) the "servlet-link" attribute
     */
    public void xsetServletLink(org.jboss.jbosswsTools.WsxmlType.ServletLink servletLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType.ServletLink target = null;
            target = (org.jboss.jbosswsTools.WsxmlType.ServletLink)get_store().find_attribute_user(SERVLETLINK$0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsxmlType.ServletLink)get_store().add_attribute_user(SERVLETLINK$0);
            }
            target.set(servletLink);
        }
    }
    
    /**
     * Unsets the "servlet-link" attribute
     */
    public void unsetServletLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVLETLINK$0);
        }
    }
    
    /**
     * Gets the "ejb-link" attribute
     */
    public java.lang.String getEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EJBLINK$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ejb-link" attribute
     */
    public org.jboss.jbosswsTools.WsxmlType.EjbLink xgetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType.EjbLink target = null;
            target = (org.jboss.jbosswsTools.WsxmlType.EjbLink)get_store().find_attribute_user(EJBLINK$2);
            return target;
        }
    }
    
    /**
     * True if has "ejb-link" attribute
     */
    public boolean isSetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EJBLINK$2) != null;
        }
    }
    
    /**
     * Sets the "ejb-link" attribute
     */
    public void setEjbLink(java.lang.String ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EJBLINK$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EJBLINK$2);
            }
            target.setStringValue(ejbLink);
        }
    }
    
    /**
     * Sets (as xml) the "ejb-link" attribute
     */
    public void xsetEjbLink(org.jboss.jbosswsTools.WsxmlType.EjbLink ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsxmlType.EjbLink target = null;
            target = (org.jboss.jbosswsTools.WsxmlType.EjbLink)get_store().find_attribute_user(EJBLINK$2);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsxmlType.EjbLink)get_store().add_attribute_user(EJBLINK$2);
            }
            target.set(ejbLink);
        }
    }
    
    /**
     * Unsets the "ejb-link" attribute
     */
    public void unsetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EJBLINK$2);
        }
    }
    
    /**
     * Gets the "append" attribute
     */
    public boolean getAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEND$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "append" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPEND$4);
            return target;
        }
    }
    
    /**
     * True if has "append" attribute
     */
    public boolean isSetAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(APPEND$4) != null;
        }
    }
    
    /**
     * Sets the "append" attribute
     */
    public void setAppend(boolean append)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPEND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPEND$4);
            }
            target.setBooleanValue(append);
        }
    }
    
    /**
     * Sets (as xml) the "append" attribute
     */
    public void xsetAppend(org.apache.xmlbeans.XmlBoolean append)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(APPEND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(APPEND$4);
            }
            target.set(append);
        }
    }
    
    /**
     * Unsets the "append" attribute
     */
    public void unsetAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(APPEND$4);
        }
    }
    /**
     * An XML servlet-link(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.WsxmlType$ServletLink.
     */
    public static class ServletLinkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.WsxmlType.ServletLink
    {
        private static final long serialVersionUID = 1L;
        
        public ServletLinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ServletLinkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ejb-link(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.WsxmlType$EjbLink.
     */
    public static class EjbLinkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.WsxmlType.EjbLink
    {
        private static final long serialVersionUID = 1L;
        
        public EjbLinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EjbLinkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
