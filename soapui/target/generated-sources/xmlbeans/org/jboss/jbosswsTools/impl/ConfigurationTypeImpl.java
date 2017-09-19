/*
 * XML Type:  configurationType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ConfigurationType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML configurationType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class ConfigurationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.ConfigurationType
{
    private static final long serialVersionUID = 1L;
    
    public ConfigurationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBAL$0 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "global");
    private static final javax.xml.namespace.QName JAVAWSDL$2 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "java-wsdl");
    private static final javax.xml.namespace.QName WSDLJAVA$4 = 
        new javax.xml.namespace.QName("http://www.jboss.org/jbossws-tools", "wsdl-java");
    
    
    /**
     * Gets the "global" element
     */
    public org.jboss.jbosswsTools.GlobalType getGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.GlobalType target = null;
            target = (org.jboss.jbosswsTools.GlobalType)get_store().find_element_user(GLOBAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "global" element
     */
    public boolean isSetGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBAL$0) != 0;
        }
    }
    
    /**
     * Sets the "global" element
     */
    public void setGlobal(org.jboss.jbosswsTools.GlobalType global)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.GlobalType target = null;
            target = (org.jboss.jbosswsTools.GlobalType)get_store().find_element_user(GLOBAL$0, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.GlobalType)get_store().add_element_user(GLOBAL$0);
            }
            target.set(global);
        }
    }
    
    /**
     * Appends and returns a new empty "global" element
     */
    public org.jboss.jbosswsTools.GlobalType addNewGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.GlobalType target = null;
            target = (org.jboss.jbosswsTools.GlobalType)get_store().add_element_user(GLOBAL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "global" element
     */
    public void unsetGlobal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBAL$0, 0);
        }
    }
    
    /**
     * Gets the "java-wsdl" element
     */
    public org.jboss.jbosswsTools.JavaToWsdlType getJavaWsdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.JavaToWsdlType target = null;
            target = (org.jboss.jbosswsTools.JavaToWsdlType)get_store().find_element_user(JAVAWSDL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "java-wsdl" element
     */
    public boolean isSetJavaWsdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JAVAWSDL$2) != 0;
        }
    }
    
    /**
     * Sets the "java-wsdl" element
     */
    public void setJavaWsdl(org.jboss.jbosswsTools.JavaToWsdlType javaWsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.JavaToWsdlType target = null;
            target = (org.jboss.jbosswsTools.JavaToWsdlType)get_store().find_element_user(JAVAWSDL$2, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.JavaToWsdlType)get_store().add_element_user(JAVAWSDL$2);
            }
            target.set(javaWsdl);
        }
    }
    
    /**
     * Appends and returns a new empty "java-wsdl" element
     */
    public org.jboss.jbosswsTools.JavaToWsdlType addNewJavaWsdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.JavaToWsdlType target = null;
            target = (org.jboss.jbosswsTools.JavaToWsdlType)get_store().add_element_user(JAVAWSDL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "java-wsdl" element
     */
    public void unsetJavaWsdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JAVAWSDL$2, 0);
        }
    }
    
    /**
     * Gets the "wsdl-java" element
     */
    public org.jboss.jbosswsTools.WsdlToJavaType getWsdlJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsdlToJavaType target = null;
            target = (org.jboss.jbosswsTools.WsdlToJavaType)get_store().find_element_user(WSDLJAVA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdl-java" element
     */
    public boolean isSetWsdlJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLJAVA$4) != 0;
        }
    }
    
    /**
     * Sets the "wsdl-java" element
     */
    public void setWsdlJava(org.jboss.jbosswsTools.WsdlToJavaType wsdlJava)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsdlToJavaType target = null;
            target = (org.jboss.jbosswsTools.WsdlToJavaType)get_store().find_element_user(WSDLJAVA$4, 0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.WsdlToJavaType)get_store().add_element_user(WSDLJAVA$4);
            }
            target.set(wsdlJava);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-java" element
     */
    public org.jboss.jbosswsTools.WsdlToJavaType addNewWsdlJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.WsdlToJavaType target = null;
            target = (org.jboss.jbosswsTools.WsdlToJavaType)get_store().add_element_user(WSDLJAVA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdl-java" element
     */
    public void unsetWsdlJava()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLJAVA$4, 0);
        }
    }
}
