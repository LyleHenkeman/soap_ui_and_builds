/*
 * An XML document type.
 * Localname: TestOnDemandLocationsRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one TestOnDemandLocationsRequest(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class TestOnDemandLocationsRequestDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandLocationsRequestDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTONDEMANDLOCATIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "TestOnDemandLocationsRequest");
    
    
    /**
     * Gets the "TestOnDemandLocationsRequest" element
     */
    public com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest getTestOnDemandLocationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest target = null;
            target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest)get_store().find_element_user(TESTONDEMANDLOCATIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TestOnDemandLocationsRequest" element
     */
    public void setTestOnDemandLocationsRequest(com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest testOnDemandLocationsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest target = null;
            target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest)get_store().find_element_user(TESTONDEMANDLOCATIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest)get_store().add_element_user(TESTONDEMANDLOCATIONSREQUEST$0);
            }
            target.set(testOnDemandLocationsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "TestOnDemandLocationsRequest" element
     */
    public com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest addNewTestOnDemandLocationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest target = null;
            target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest)get_store().add_element_user(TESTONDEMANDLOCATIONSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML TestOnDemandLocationsRequest(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public static class TestOnDemandLocationsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest
    {
        private static final long serialVersionUID = 1L;
        
        public TestOnDemandLocationsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Request");
        
        
        /**
         * Gets the "Request" element
         */
        public com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request target = null;
                target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Request" element
         */
        public void setRequest(com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request target = null;
                target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request)get_store().add_element_user(REQUEST$0);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "Request" element
         */
        public com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request target = null;
                target = (com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        /**
         * An XML Request(@http://eviware.com/soapui/config).
         *
         * This is a complex type.
         */
        public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandLocationsRequestDocumentConfig.TestOnDemandLocationsRequest.Request
        {
            private static final long serialVersionUID = 1L;
            
            public RequestImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName HEADER$0 = 
                new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Header");
            private static final javax.xml.namespace.QName BODY$2 = 
                new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Body");
            private static final javax.xml.namespace.QName APIVERSION$4 = 
                new javax.xml.namespace.QName("", "api_version");
            
            
            /**
             * Gets the "Header" element
             */
            public com.eviware.soapui.config.TestOnDemandHeaderConfig getHeader()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.eviware.soapui.config.TestOnDemandHeaderConfig target = null;
                    target = (com.eviware.soapui.config.TestOnDemandHeaderConfig)get_store().find_element_user(HEADER$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Header" element
             */
            public void setHeader(com.eviware.soapui.config.TestOnDemandHeaderConfig header)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.eviware.soapui.config.TestOnDemandHeaderConfig target = null;
                    target = (com.eviware.soapui.config.TestOnDemandHeaderConfig)get_store().find_element_user(HEADER$0, 0);
                    if (target == null)
                    {
                      target = (com.eviware.soapui.config.TestOnDemandHeaderConfig)get_store().add_element_user(HEADER$0);
                    }
                    target.set(header);
                }
            }
            
            /**
             * Appends and returns a new empty "Header" element
             */
            public com.eviware.soapui.config.TestOnDemandHeaderConfig addNewHeader()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.eviware.soapui.config.TestOnDemandHeaderConfig target = null;
                    target = (com.eviware.soapui.config.TestOnDemandHeaderConfig)get_store().add_element_user(HEADER$0);
                    return target;
                }
            }
            
            /**
             * Gets the "Body" element
             */
            public com.eviware.soapui.config.TestOnDemandLocationBodyConfig getBody()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.eviware.soapui.config.TestOnDemandLocationBodyConfig target = null;
                    target = (com.eviware.soapui.config.TestOnDemandLocationBodyConfig)get_store().find_element_user(BODY$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Body" element
             */
            public void setBody(com.eviware.soapui.config.TestOnDemandLocationBodyConfig body)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.eviware.soapui.config.TestOnDemandLocationBodyConfig target = null;
                    target = (com.eviware.soapui.config.TestOnDemandLocationBodyConfig)get_store().find_element_user(BODY$2, 0);
                    if (target == null)
                    {
                      target = (com.eviware.soapui.config.TestOnDemandLocationBodyConfig)get_store().add_element_user(BODY$2);
                    }
                    target.set(body);
                }
            }
            
            /**
             * Appends and returns a new empty "Body" element
             */
            public com.eviware.soapui.config.TestOnDemandLocationBodyConfig addNewBody()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.eviware.soapui.config.TestOnDemandLocationBodyConfig target = null;
                    target = (com.eviware.soapui.config.TestOnDemandLocationBodyConfig)get_store().add_element_user(BODY$2);
                    return target;
                }
            }
            
            /**
             * Gets the "api_version" attribute
             */
            public java.lang.String getApiVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APIVERSION$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "api_version" attribute
             */
            public org.apache.xmlbeans.XmlString xgetApiVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APIVERSION$4);
                    return target;
                }
            }
            
            /**
             * True if has "api_version" attribute
             */
            public boolean isSetApiVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(APIVERSION$4) != null;
                }
            }
            
            /**
             * Sets the "api_version" attribute
             */
            public void setApiVersion(java.lang.String apiVersion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APIVERSION$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APIVERSION$4);
                    }
                    target.setStringValue(apiVersion);
                }
            }
            
            /**
             * Sets (as xml) the "api_version" attribute
             */
            public void xsetApiVersion(org.apache.xmlbeans.XmlString apiVersion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(APIVERSION$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(APIVERSION$4);
                    }
                    target.set(apiVersion);
                }
            }
            
            /**
             * Unsets the "api_version" attribute
             */
            public void unsetApiVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(APIVERSION$4);
                }
            }
        }
    }
}
