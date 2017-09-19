/*
 * An XML document type.
 * Localname: configuration
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config.impl;
/**
 * A document containing one configuration(@http://java.sun.com/xml/ns/jax-rpc/ri/config) element.
 *
 * This is a complex type.
 */
public class ConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "configuration");
    
    
    /**
     * Gets the "configuration" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration)get_store().add_element_user(CONFIGURATION$0);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration target = null;
            target = (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration)get_store().add_element_user(CONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML configuration(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration
    {
        private static final long serialVersionUID = 1L;
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "service");
        private static final javax.xml.namespace.QName WSDL$2 = 
            new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "wsdl");
        private static final javax.xml.namespace.QName MODELFILE$4 = 
            new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "modelfile");
        private static final javax.xml.namespace.QName J2EEMAPPINGFILE$6 = 
            new javax.xml.namespace.QName("http://java.sun.com/xml/ns/jax-rpc/ri/config", "j2eeMappingFile");
        
        
        /**
         * Gets the "service" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "service" element
         */
        public boolean isSetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICE$0) != 0;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    target = (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType)get_store().add_element_user(SERVICE$0);
                }
                target.set(service);
            }
        }
        
        /**
         * Appends and returns a new empty "service" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType)get_store().add_element_user(SERVICE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "service" element
         */
        public void unsetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICE$0, 0);
            }
        }
        
        /**
         * Gets the "wsdl" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType getWsdl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType)get_store().find_element_user(WSDL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "wsdl" element
         */
        public boolean isSetWsdl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WSDL$2) != 0;
            }
        }
        
        /**
         * Sets the "wsdl" element
         */
        public void setWsdl(com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType wsdl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType)get_store().find_element_user(WSDL$2, 0);
                if (target == null)
                {
                    target = (com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType)get_store().add_element_user(WSDL$2);
                }
                target.set(wsdl);
            }
        }
        
        /**
         * Appends and returns a new empty "wsdl" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType addNewWsdl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType)get_store().add_element_user(WSDL$2);
                return target;
            }
        }
        
        /**
         * Unsets the "wsdl" element
         */
        public void unsetWsdl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WSDL$2, 0);
            }
        }
        
        /**
         * Gets the "modelfile" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType getModelfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType)get_store().find_element_user(MODELFILE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "modelfile" element
         */
        public boolean isSetModelfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODELFILE$4) != 0;
            }
        }
        
        /**
         * Sets the "modelfile" element
         */
        public void setModelfile(com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType modelfile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType)get_store().find_element_user(MODELFILE$4, 0);
                if (target == null)
                {
                    target = (com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType)get_store().add_element_user(MODELFILE$4);
                }
                target.set(modelfile);
            }
        }
        
        /**
         * Appends and returns a new empty "modelfile" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType addNewModelfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType)get_store().add_element_user(MODELFILE$4);
                return target;
            }
        }
        
        /**
         * Unsets the "modelfile" element
         */
        public void unsetModelfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODELFILE$4, 0);
            }
        }
        
        /**
         * Gets the "j2eeMappingFile" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType getJ2EeMappingFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType)get_store().find_element_user(J2EEMAPPINGFILE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "j2eeMappingFile" element
         */
        public boolean isSetJ2EeMappingFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(J2EEMAPPINGFILE$6) != 0;
            }
        }
        
        /**
         * Sets the "j2eeMappingFile" element
         */
        public void setJ2EeMappingFile(com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType j2EeMappingFile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType)get_store().find_element_user(J2EEMAPPINGFILE$6, 0);
                if (target == null)
                {
                    target = (com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType)get_store().add_element_user(J2EEMAPPINGFILE$6);
                }
                target.set(j2EeMappingFile);
            }
        }
        
        /**
         * Appends and returns a new empty "j2eeMappingFile" element
         */
        public com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType addNewJ2EeMappingFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType target = null;
                target = (com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType)get_store().add_element_user(J2EEMAPPINGFILE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "j2eeMappingFile" element
         */
        public void unsetJ2EeMappingFile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(J2EEMAPPINGFILE$6, 0);
            }
        }
    }
}
