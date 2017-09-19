/*
 * XML Type:  configuration
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.Configuration
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML configuration(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is a complex type.
 */
public class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.wsI.testing.x2003.x03.analyzerConfig.Configuration
{
    private static final long serialVersionUID = 1L;
    
    public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "description");
    private static final javax.xml.namespace.QName VERBOSE$2 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "verbose");
    private static final javax.xml.namespace.QName ASSERTIONRESULTS$4 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "assertionResults");
    private static final javax.xml.namespace.QName REPORTFILE$6 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "reportFile");
    private static final javax.xml.namespace.QName TESTASSERTIONSFILE$8 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "testAssertionsFile");
    private static final javax.xml.namespace.QName LOGFILE$10 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "logFile");
    private static final javax.xml.namespace.QName WSDLREFERENCE$12 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "wsdlReference");
    private static final javax.xml.namespace.QName UDDIREFERENCE$14 = 
        new javax.xml.namespace.QName("http://www.ws-i.org/testing/2003/03/analyzerConfig/", "uddiReference");
    private static final javax.xml.namespace.QName NAME$16 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "description" element
     */
    public org.wsI.testing.x2003.x03.common.Description getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.Description target = null;
            target = (org.wsI.testing.x2003.x03.common.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.wsI.testing.x2003.x03.common.Description description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.Description target = null;
            target = (org.wsI.testing.x2003.x03.common.Description)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.common.Description)get_store().add_element_user(DESCRIPTION$0);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.wsI.testing.x2003.x03.common.Description addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.common.Description target = null;
            target = (org.wsI.testing.x2003.x03.common.Description)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "verbose" element
     */
    public boolean getVerbose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERBOSE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "verbose" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetVerbose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERBOSE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "verbose" element
     */
    public boolean isSetVerbose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERBOSE$2) != 0;
        }
    }
    
    /**
     * Sets the "verbose" element
     */
    public void setVerbose(boolean verbose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERBOSE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERBOSE$2);
            }
            target.setBooleanValue(verbose);
        }
    }
    
    /**
     * Sets (as xml) the "verbose" element
     */
    public void xsetVerbose(org.apache.xmlbeans.XmlBoolean verbose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERBOSE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VERBOSE$2);
            }
            target.set(verbose);
        }
    }
    
    /**
     * Unsets the "verbose" element
     */
    public void unsetVerbose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERBOSE$2, 0);
        }
    }
    
    /**
     * Gets the "assertionResults" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults getAssertionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults)get_store().find_element_user(ASSERTIONRESULTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assertionResults" element
     */
    public void setAssertionResults(org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults assertionResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults)get_store().find_element_user(ASSERTIONRESULTS$4, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults)get_store().add_element_user(ASSERTIONRESULTS$4);
            }
            target.set(assertionResults);
        }
    }
    
    /**
     * Appends and returns a new empty "assertionResults" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults addNewAssertionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults)get_store().add_element_user(ASSERTIONRESULTS$4);
            return target;
        }
    }
    
    /**
     * Gets the "reportFile" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.ReportFile getReportFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.ReportFile target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.ReportFile)get_store().find_element_user(REPORTFILE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportFile" element
     */
    public void setReportFile(org.wsI.testing.x2003.x03.analyzerConfig.ReportFile reportFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.ReportFile target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.ReportFile)get_store().find_element_user(REPORTFILE$6, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.ReportFile)get_store().add_element_user(REPORTFILE$6);
            }
            target.set(reportFile);
        }
    }
    
    /**
     * Appends and returns a new empty "reportFile" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.ReportFile addNewReportFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.ReportFile target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.ReportFile)get_store().add_element_user(REPORTFILE$6);
            return target;
        }
    }
    
    /**
     * Gets the "testAssertionsFile" element
     */
    public java.lang.String getTestAssertionsFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTASSERTIONSFILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "testAssertionsFile" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTestAssertionsFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TESTASSERTIONSFILE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "testAssertionsFile" element
     */
    public void setTestAssertionsFile(java.lang.String testAssertionsFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTASSERTIONSFILE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTASSERTIONSFILE$8);
            }
            target.setStringValue(testAssertionsFile);
        }
    }
    
    /**
     * Sets (as xml) the "testAssertionsFile" element
     */
    public void xsetTestAssertionsFile(org.apache.xmlbeans.XmlAnyURI testAssertionsFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TESTASSERTIONSFILE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TESTASSERTIONSFILE$8);
            }
            target.set(testAssertionsFile);
        }
    }
    
    /**
     * Gets the "logFile" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.LogFile getLogFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.LogFile target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile)get_store().find_element_user(LOGFILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "logFile" element
     */
    public boolean isSetLogFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGFILE$10) != 0;
        }
    }
    
    /**
     * Sets the "logFile" element
     */
    public void setLogFile(org.wsI.testing.x2003.x03.analyzerConfig.LogFile logFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.LogFile target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile)get_store().find_element_user(LOGFILE$10, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile)get_store().add_element_user(LOGFILE$10);
            }
            target.set(logFile);
        }
    }
    
    /**
     * Appends and returns a new empty "logFile" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.LogFile addNewLogFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.LogFile target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile)get_store().add_element_user(LOGFILE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "logFile" element
     */
    public void unsetLogFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGFILE$10, 0);
        }
    }
    
    /**
     * Gets the "wsdlReference" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference getWsdlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference)get_store().find_element_user(WSDLREFERENCE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdlReference" element
     */
    public boolean isSetWsdlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLREFERENCE$12) != 0;
        }
    }
    
    /**
     * Sets the "wsdlReference" element
     */
    public void setWsdlReference(org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference wsdlReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference)get_store().find_element_user(WSDLREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference)get_store().add_element_user(WSDLREFERENCE$12);
            }
            target.set(wsdlReference);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdlReference" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference addNewWsdlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.WsdlReference)get_store().add_element_user(WSDLREFERENCE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdlReference" element
     */
    public void unsetWsdlReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLREFERENCE$12, 0);
        }
    }
    
    /**
     * Gets the "uddiReference" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.UddiReference getUddiReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference)get_store().find_element_user(UDDIREFERENCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "uddiReference" element
     */
    public boolean isSetUddiReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UDDIREFERENCE$14) != 0;
        }
    }
    
    /**
     * Sets the "uddiReference" element
     */
    public void setUddiReference(org.wsI.testing.x2003.x03.analyzerConfig.UddiReference uddiReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference)get_store().find_element_user(UDDIREFERENCE$14, 0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference)get_store().add_element_user(UDDIREFERENCE$14);
            }
            target.set(uddiReference);
        }
    }
    
    /**
     * Appends and returns a new empty "uddiReference" element
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.UddiReference addNewUddiReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiReference target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference)get_store().add_element_user(UDDIREFERENCE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "uddiReference" element
     */
    public void unsetUddiReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UDDIREFERENCE$14, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$16) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$16);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$16);
        }
    }
}
