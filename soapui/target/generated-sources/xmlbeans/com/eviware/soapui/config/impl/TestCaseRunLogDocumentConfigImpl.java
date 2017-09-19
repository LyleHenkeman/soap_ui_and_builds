/*
 * An XML document type.
 * Localname: testCaseRunLog
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestCaseRunLogDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * A document containing one testCaseRunLog(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public class TestCaseRunLogDocumentConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestCaseRunLogDocumentConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestCaseRunLogDocumentConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTCASERUNLOG$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testCaseRunLog");
    
    
    /**
     * Gets the "testCaseRunLog" element
     */
    public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog getTestCaseRunLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog target = null;
            target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog)get_store().find_element_user(TESTCASERUNLOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testCaseRunLog" element
     */
    public void setTestCaseRunLog(com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog testCaseRunLog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog target = null;
            target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog)get_store().find_element_user(TESTCASERUNLOG$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog)get_store().add_element_user(TESTCASERUNLOG$0);
            }
            target.set(testCaseRunLog);
        }
    }
    
    /**
     * Appends and returns a new empty "testCaseRunLog" element
     */
    public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog addNewTestCaseRunLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog target = null;
            target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog)get_store().add_element_user(TESTCASERUNLOG$0);
            return target;
        }
    }
    /**
     * An XML testCaseRunLog(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public static class TestCaseRunLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog
    {
        private static final long serialVersionUID = 1L;
        
        public TestCaseRunLogImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTCASERUNLOGTESTSTEP$0 = 
            new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testCaseRunLogTestStep");
        private static final javax.xml.namespace.QName TESTCASE$2 = 
            new javax.xml.namespace.QName("", "testCase");
        private static final javax.xml.namespace.QName TIMETAKEN$4 = 
            new javax.xml.namespace.QName("", "timeTaken");
        private static final javax.xml.namespace.QName STATUS$6 = 
            new javax.xml.namespace.QName("", "status");
        private static final javax.xml.namespace.QName TIMESTAMP$8 = 
            new javax.xml.namespace.QName("", "timeStamp");
        
        
        /**
         * Gets a List of "testCaseRunLogTestStep" elements
         */
        public java.util.List<com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep> getTestCaseRunLogTestStepList()
        {
            final class TestCaseRunLogTestStepList extends java.util.AbstractList<com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep>
            {
                public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep get(int i)
                    { return TestCaseRunLogImpl.this.getTestCaseRunLogTestStepArray(i); }
                
                public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep set(int i, com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep o)
                {
                    com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep old = TestCaseRunLogImpl.this.getTestCaseRunLogTestStepArray(i);
                    TestCaseRunLogImpl.this.setTestCaseRunLogTestStepArray(i, o);
                    return old;
                }
                
                public void add(int i, com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep o)
                    { TestCaseRunLogImpl.this.insertNewTestCaseRunLogTestStep(i).set(o); }
                
                public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep remove(int i)
                {
                    com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep old = TestCaseRunLogImpl.this.getTestCaseRunLogTestStepArray(i);
                    TestCaseRunLogImpl.this.removeTestCaseRunLogTestStep(i);
                    return old;
                }
                
                public int size()
                    { return TestCaseRunLogImpl.this.sizeOfTestCaseRunLogTestStepArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TestCaseRunLogTestStepList();
            }
        }
        
        /**
         * Gets array of all "testCaseRunLogTestStep" elements
         * @deprecated
         */
        public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep[] getTestCaseRunLogTestStepArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep>();
                get_store().find_all_element_users(TESTCASERUNLOGTESTSTEP$0, targetList);
                com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep[] result = new com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testCaseRunLogTestStep" element
         */
        public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep getTestCaseRunLogTestStepArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep target = null;
                target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep)get_store().find_element_user(TESTCASERUNLOGTESTSTEP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testCaseRunLogTestStep" element
         */
        public int sizeOfTestCaseRunLogTestStepArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTCASERUNLOGTESTSTEP$0);
            }
        }
        
        /**
         * Sets array of all "testCaseRunLogTestStep" element
         */
        public void setTestCaseRunLogTestStepArray(com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep[] testCaseRunLogTestStepArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(testCaseRunLogTestStepArray, TESTCASERUNLOGTESTSTEP$0);
            }
        }
        
        /**
         * Sets ith "testCaseRunLogTestStep" element
         */
        public void setTestCaseRunLogTestStepArray(int i, com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep testCaseRunLogTestStep)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep target = null;
                target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep)get_store().find_element_user(TESTCASERUNLOGTESTSTEP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testCaseRunLogTestStep);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testCaseRunLogTestStep" element
         */
        public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep insertNewTestCaseRunLogTestStep(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep target = null;
                target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep)get_store().insert_element_user(TESTCASERUNLOGTESTSTEP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testCaseRunLogTestStep" element
         */
        public com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep addNewTestCaseRunLogTestStep()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep target = null;
                target = (com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep)get_store().add_element_user(TESTCASERUNLOGTESTSTEP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "testCaseRunLogTestStep" element
         */
        public void removeTestCaseRunLogTestStep(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTCASERUNLOGTESTSTEP$0, i);
            }
        }
        
        /**
         * Gets the "testCase" attribute
         */
        public java.lang.String getTestCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTCASE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "testCase" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTestCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTCASE$2);
                return target;
            }
        }
        
        /**
         * True if has "testCase" attribute
         */
        public boolean isSetTestCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TESTCASE$2) != null;
            }
        }
        
        /**
         * Sets the "testCase" attribute
         */
        public void setTestCase(java.lang.String testCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TESTCASE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TESTCASE$2);
                }
                target.setStringValue(testCase);
            }
        }
        
        /**
         * Sets (as xml) the "testCase" attribute
         */
        public void xsetTestCase(org.apache.xmlbeans.XmlString testCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TESTCASE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TESTCASE$2);
                }
                target.set(testCase);
            }
        }
        
        /**
         * Unsets the "testCase" attribute
         */
        public void unsetTestCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TESTCASE$2);
            }
        }
        
        /**
         * Gets the "timeTaken" attribute
         */
        public java.lang.String getTimeTaken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETAKEN$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeTaken" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTimeTaken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETAKEN$4);
                return target;
            }
        }
        
        /**
         * True if has "timeTaken" attribute
         */
        public boolean isSetTimeTaken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMETAKEN$4) != null;
            }
        }
        
        /**
         * Sets the "timeTaken" attribute
         */
        public void setTimeTaken(java.lang.String timeTaken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETAKEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETAKEN$4);
                }
                target.setStringValue(timeTaken);
            }
        }
        
        /**
         * Sets (as xml) the "timeTaken" attribute
         */
        public void xsetTimeTaken(org.apache.xmlbeans.XmlString timeTaken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETAKEN$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMETAKEN$4);
                }
                target.set(timeTaken);
            }
        }
        
        /**
         * Unsets the "timeTaken" attribute
         */
        public void unsetTimeTaken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMETAKEN$4);
            }
        }
        
        /**
         * Gets the "status" attribute
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$6);
                return target;
            }
        }
        
        /**
         * True if has "status" attribute
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATUS$6) != null;
            }
        }
        
        /**
         * Sets the "status" attribute
         */
        public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$6);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" attribute
         */
        public void xsetStatus(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$6);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "status" attribute
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATUS$6);
            }
        }
        
        /**
         * Gets the "timeStamp" attribute
         */
        public java.lang.String getTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "timeStamp" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$8);
                return target;
            }
        }
        
        /**
         * True if has "timeStamp" attribute
         */
        public boolean isSetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$8) != null;
            }
        }
        
        /**
         * Sets the "timeStamp" attribute
         */
        public void setTimeStamp(java.lang.String timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$8);
                }
                target.setStringValue(timeStamp);
            }
        }
        
        /**
         * Sets (as xml) the "timeStamp" attribute
         */
        public void xsetTimeStamp(org.apache.xmlbeans.XmlString timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMESTAMP$8);
                }
                target.set(timeStamp);
            }
        }
        
        /**
         * Unsets the "timeStamp" attribute
         */
        public void unsetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$8);
            }
        }
        /**
         * An XML testCaseRunLogTestStep(@http://eviware.com/soapui/config).
         *
         * This is a complex type.
         */
        public static class TestCaseRunLogTestStepImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestCaseRunLogDocumentConfig.TestCaseRunLog.TestCaseRunLogTestStep
        {
            private static final long serialVersionUID = 1L;
            
            public TestCaseRunLogTestStepImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MESSAGE$0 = 
                new javax.xml.namespace.QName("http://eviware.com/soapui/config", "message");
            private static final javax.xml.namespace.QName ERRORMESSAGE$2 = 
                new javax.xml.namespace.QName("http://eviware.com/soapui/config", "errorMessage");
            private static final javax.xml.namespace.QName NAME$4 = 
                new javax.xml.namespace.QName("", "name");
            private static final javax.xml.namespace.QName TIMETAKEN$6 = 
                new javax.xml.namespace.QName("", "timeTaken");
            private static final javax.xml.namespace.QName STATUS$8 = 
                new javax.xml.namespace.QName("", "status");
            private static final javax.xml.namespace.QName TIMESTAMP$10 = 
                new javax.xml.namespace.QName("", "timestamp");
            private static final javax.xml.namespace.QName HTTPSTATUS$12 = 
                new javax.xml.namespace.QName("", "httpStatus");
            private static final javax.xml.namespace.QName CONTENTLENGTH$14 = 
                new javax.xml.namespace.QName("", "contentLength");
            private static final javax.xml.namespace.QName DNSTIME$16 = 
                new javax.xml.namespace.QName("", "dnsTime");
            private static final javax.xml.namespace.QName CONNECTTIME$18 = 
                new javax.xml.namespace.QName("", "connectTime");
            private static final javax.xml.namespace.QName TIMETOFIRSTBYTE$20 = 
                new javax.xml.namespace.QName("", "timeToFirstByte");
            private static final javax.xml.namespace.QName READTIME$22 = 
                new javax.xml.namespace.QName("", "readTime");
            private static final javax.xml.namespace.QName TOTALTIME$24 = 
                new javax.xml.namespace.QName("", "totalTime");
            private static final javax.xml.namespace.QName ENDPOINT$26 = 
                new javax.xml.namespace.QName("", "endpoint");
            private static final javax.xml.namespace.QName HTTPMETHOD$28 = 
                new javax.xml.namespace.QName("", "httpMethod");
            private static final javax.xml.namespace.QName IPADDRESS$30 = 
                new javax.xml.namespace.QName("", "ipAddress");
            private static final javax.xml.namespace.QName PORT$32 = 
                new javax.xml.namespace.QName("", "port");
            
            
            /**
             * Gets a List of "message" elements
             */
            public java.util.List<java.lang.String> getMessageList()
            {
                final class MessageList extends java.util.AbstractList<java.lang.String>
                {
                    public java.lang.String get(int i)
                        { return TestCaseRunLogTestStepImpl.this.getMessageArray(i); }
                    
                    public java.lang.String set(int i, java.lang.String o)
                    {
                      java.lang.String old = TestCaseRunLogTestStepImpl.this.getMessageArray(i);
                      TestCaseRunLogTestStepImpl.this.setMessageArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, java.lang.String o)
                        { TestCaseRunLogTestStepImpl.this.insertMessage(i, o); }
                    
                    public java.lang.String remove(int i)
                    {
                      java.lang.String old = TestCaseRunLogTestStepImpl.this.getMessageArray(i);
                      TestCaseRunLogTestStepImpl.this.removeMessage(i);
                      return old;
                    }
                    
                    public int size()
                        { return TestCaseRunLogTestStepImpl.this.sizeOfMessageArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new MessageList();
                }
            }
            
            /**
             * Gets array of all "message" elements
             * @deprecated
             */
            public java.lang.String[] getMessageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                    get_store().find_all_element_users(MESSAGE$0, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "message" element
             */
            public java.lang.String getMessageArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) a List of "message" elements
             */
            public java.util.List<org.apache.xmlbeans.XmlString> xgetMessageList()
            {
                final class MessageList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
                {
                    public org.apache.xmlbeans.XmlString get(int i)
                        { return TestCaseRunLogTestStepImpl.this.xgetMessageArray(i); }
                    
                    public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                    {
                      org.apache.xmlbeans.XmlString old = TestCaseRunLogTestStepImpl.this.xgetMessageArray(i);
                      TestCaseRunLogTestStepImpl.this.xsetMessageArray(i, o);
                      return old;
                    }
                    
                    public void add(int i, org.apache.xmlbeans.XmlString o)
                        { TestCaseRunLogTestStepImpl.this.insertNewMessage(i).set(o); }
                    
                    public org.apache.xmlbeans.XmlString remove(int i)
                    {
                      org.apache.xmlbeans.XmlString old = TestCaseRunLogTestStepImpl.this.xgetMessageArray(i);
                      TestCaseRunLogTestStepImpl.this.removeMessage(i);
                      return old;
                    }
                    
                    public int size()
                        { return TestCaseRunLogTestStepImpl.this.sizeOfMessageArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new MessageList();
                }
            }
            
            /**
             * Gets array of all "message" elements
             * @deprecated
             */
            public org.apache.xmlbeans.XmlString[] xgetMessageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                    get_store().find_all_element_users(MESSAGE$0, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "message" element
             */
            public org.apache.xmlbeans.XmlString xgetMessageArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "message" element
             */
            public int sizeOfMessageArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MESSAGE$0);
                }
            }
            
            /**
             * Sets array of all "message" element
             */
            public void setMessageArray(java.lang.String[] messageArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(messageArray, MESSAGE$0);
                }
            }
            
            /**
             * Sets ith "message" element
             */
            public void setMessageArray(int i, java.lang.String message)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(message);
                }
            }
            
            /**
             * Sets (as xml) array of all "message" element
             */
            public void xsetMessageArray(org.apache.xmlbeans.XmlString[]messageArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(messageArray, MESSAGE$0);
                }
            }
            
            /**
             * Sets (as xml) ith "message" element
             */
            public void xsetMessageArray(int i, org.apache.xmlbeans.XmlString message)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(message);
                }
            }
            
            /**
             * Inserts the value as the ith "message" element
             */
            public void insertMessage(int i, java.lang.String message)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MESSAGE$0, i);
                    target.setStringValue(message);
                }
            }
            
            /**
             * Appends the value as the last "message" element
             */
            public void addMessage(java.lang.String message)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$0);
                    target.setStringValue(message);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "message" element
             */
            public org.apache.xmlbeans.XmlString insertNewMessage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MESSAGE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "message" element
             */
            public org.apache.xmlbeans.XmlString addNewMessage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "message" element
             */
            public void removeMessage(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MESSAGE$0, i);
                }
            }
            
            /**
             * Gets the "errorMessage" element
             */
            public java.lang.String getErrorMessage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "errorMessage" element
             */
            public org.apache.xmlbeans.XmlString xgetErrorMessage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "errorMessage" element
             */
            public void setErrorMessage(java.lang.String errorMessage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMESSAGE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMESSAGE$2);
                    }
                    target.setStringValue(errorMessage);
                }
            }
            
            /**
             * Sets (as xml) the "errorMessage" element
             */
            public void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMESSAGE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMESSAGE$2);
                    }
                    target.set(errorMessage);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                    return get_store().find_attribute_user(NAME$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
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
                    get_store().remove_attribute(NAME$4);
                }
            }
            
            /**
             * Gets the "timeTaken" attribute
             */
            public java.lang.String getTimeTaken()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETAKEN$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "timeTaken" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTimeTaken()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETAKEN$6);
                    return target;
                }
            }
            
            /**
             * True if has "timeTaken" attribute
             */
            public boolean isSetTimeTaken()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TIMETAKEN$6) != null;
                }
            }
            
            /**
             * Sets the "timeTaken" attribute
             */
            public void setTimeTaken(java.lang.String timeTaken)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETAKEN$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETAKEN$6);
                    }
                    target.setStringValue(timeTaken);
                }
            }
            
            /**
             * Sets (as xml) the "timeTaken" attribute
             */
            public void xsetTimeTaken(org.apache.xmlbeans.XmlString timeTaken)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETAKEN$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMETAKEN$6);
                    }
                    target.set(timeTaken);
                }
            }
            
            /**
             * Unsets the "timeTaken" attribute
             */
            public void unsetTimeTaken()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TIMETAKEN$6);
                }
            }
            
            /**
             * Gets the "status" attribute
             */
            public java.lang.String getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "status" attribute
             */
            public org.apache.xmlbeans.XmlString xgetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                    return target;
                }
            }
            
            /**
             * True if has "status" attribute
             */
            public boolean isSetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(STATUS$8) != null;
                }
            }
            
            /**
             * Sets the "status" attribute
             */
            public void setStatus(java.lang.String status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$8);
                    }
                    target.setStringValue(status);
                }
            }
            
            /**
             * Sets (as xml) the "status" attribute
             */
            public void xsetStatus(org.apache.xmlbeans.XmlString status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STATUS$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STATUS$8);
                    }
                    target.set(status);
                }
            }
            
            /**
             * Unsets the "status" attribute
             */
            public void unsetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(STATUS$8);
                }
            }
            
            /**
             * Gets the "timestamp" attribute
             */
            public java.lang.String getTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "timestamp" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$10);
                    return target;
                }
            }
            
            /**
             * True if has "timestamp" attribute
             */
            public boolean isSetTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TIMESTAMP$10) != null;
                }
            }
            
            /**
             * Sets the "timestamp" attribute
             */
            public void setTimestamp(java.lang.String timestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMP$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMP$10);
                    }
                    target.setStringValue(timestamp);
                }
            }
            
            /**
             * Sets (as xml) the "timestamp" attribute
             */
            public void xsetTimestamp(org.apache.xmlbeans.XmlString timestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMESTAMP$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMESTAMP$10);
                    }
                    target.set(timestamp);
                }
            }
            
            /**
             * Unsets the "timestamp" attribute
             */
            public void unsetTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TIMESTAMP$10);
                }
            }
            
            /**
             * Gets the "httpStatus" attribute
             */
            public java.lang.String getHttpStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPSTATUS$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "httpStatus" attribute
             */
            public org.apache.xmlbeans.XmlString xgetHttpStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HTTPSTATUS$12);
                    return target;
                }
            }
            
            /**
             * True if has "httpStatus" attribute
             */
            public boolean isSetHttpStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HTTPSTATUS$12) != null;
                }
            }
            
            /**
             * Sets the "httpStatus" attribute
             */
            public void setHttpStatus(java.lang.String httpStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPSTATUS$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTTPSTATUS$12);
                    }
                    target.setStringValue(httpStatus);
                }
            }
            
            /**
             * Sets (as xml) the "httpStatus" attribute
             */
            public void xsetHttpStatus(org.apache.xmlbeans.XmlString httpStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HTTPSTATUS$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HTTPSTATUS$12);
                    }
                    target.set(httpStatus);
                }
            }
            
            /**
             * Unsets the "httpStatus" attribute
             */
            public void unsetHttpStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HTTPSTATUS$12);
                }
            }
            
            /**
             * Gets the "contentLength" attribute
             */
            public java.lang.String getContentLength()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTLENGTH$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "contentLength" attribute
             */
            public org.apache.xmlbeans.XmlString xgetContentLength()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTLENGTH$14);
                    return target;
                }
            }
            
            /**
             * True if has "contentLength" attribute
             */
            public boolean isSetContentLength()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CONTENTLENGTH$14) != null;
                }
            }
            
            /**
             * Sets the "contentLength" attribute
             */
            public void setContentLength(java.lang.String contentLength)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTLENGTH$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENTLENGTH$14);
                    }
                    target.setStringValue(contentLength);
                }
            }
            
            /**
             * Sets (as xml) the "contentLength" attribute
             */
            public void xsetContentLength(org.apache.xmlbeans.XmlString contentLength)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTLENGTH$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTENTLENGTH$14);
                    }
                    target.set(contentLength);
                }
            }
            
            /**
             * Unsets the "contentLength" attribute
             */
            public void unsetContentLength()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CONTENTLENGTH$14);
                }
            }
            
            /**
             * Gets the "dnsTime" attribute
             */
            public java.lang.String getDnsTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DNSTIME$16);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "dnsTime" attribute
             */
            public org.apache.xmlbeans.XmlString xgetDnsTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DNSTIME$16);
                    return target;
                }
            }
            
            /**
             * True if has "dnsTime" attribute
             */
            public boolean isSetDnsTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DNSTIME$16) != null;
                }
            }
            
            /**
             * Sets the "dnsTime" attribute
             */
            public void setDnsTime(java.lang.String dnsTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DNSTIME$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DNSTIME$16);
                    }
                    target.setStringValue(dnsTime);
                }
            }
            
            /**
             * Sets (as xml) the "dnsTime" attribute
             */
            public void xsetDnsTime(org.apache.xmlbeans.XmlString dnsTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DNSTIME$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DNSTIME$16);
                    }
                    target.set(dnsTime);
                }
            }
            
            /**
             * Unsets the "dnsTime" attribute
             */
            public void unsetDnsTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DNSTIME$16);
                }
            }
            
            /**
             * Gets the "connectTime" attribute
             */
            public java.lang.String getConnectTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTTIME$18);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "connectTime" attribute
             */
            public org.apache.xmlbeans.XmlString xgetConnectTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTTIME$18);
                    return target;
                }
            }
            
            /**
             * True if has "connectTime" attribute
             */
            public boolean isSetConnectTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CONNECTTIME$18) != null;
                }
            }
            
            /**
             * Sets the "connectTime" attribute
             */
            public void setConnectTime(java.lang.String connectTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONNECTTIME$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONNECTTIME$18);
                    }
                    target.setStringValue(connectTime);
                }
            }
            
            /**
             * Sets (as xml) the "connectTime" attribute
             */
            public void xsetConnectTime(org.apache.xmlbeans.XmlString connectTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONNECTTIME$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONNECTTIME$18);
                    }
                    target.set(connectTime);
                }
            }
            
            /**
             * Unsets the "connectTime" attribute
             */
            public void unsetConnectTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CONNECTTIME$18);
                }
            }
            
            /**
             * Gets the "timeToFirstByte" attribute
             */
            public java.lang.String getTimeToFirstByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETOFIRSTBYTE$20);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "timeToFirstByte" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTimeToFirstByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETOFIRSTBYTE$20);
                    return target;
                }
            }
            
            /**
             * True if has "timeToFirstByte" attribute
             */
            public boolean isSetTimeToFirstByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TIMETOFIRSTBYTE$20) != null;
                }
            }
            
            /**
             * Sets the "timeToFirstByte" attribute
             */
            public void setTimeToFirstByte(java.lang.String timeToFirstByte)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMETOFIRSTBYTE$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMETOFIRSTBYTE$20);
                    }
                    target.setStringValue(timeToFirstByte);
                }
            }
            
            /**
             * Sets (as xml) the "timeToFirstByte" attribute
             */
            public void xsetTimeToFirstByte(org.apache.xmlbeans.XmlString timeToFirstByte)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TIMETOFIRSTBYTE$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TIMETOFIRSTBYTE$20);
                    }
                    target.set(timeToFirstByte);
                }
            }
            
            /**
             * Unsets the "timeToFirstByte" attribute
             */
            public void unsetTimeToFirstByte()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TIMETOFIRSTBYTE$20);
                }
            }
            
            /**
             * Gets the "readTime" attribute
             */
            public java.lang.String getReadTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READTIME$22);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "readTime" attribute
             */
            public org.apache.xmlbeans.XmlString xgetReadTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(READTIME$22);
                    return target;
                }
            }
            
            /**
             * True if has "readTime" attribute
             */
            public boolean isSetReadTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(READTIME$22) != null;
                }
            }
            
            /**
             * Sets the "readTime" attribute
             */
            public void setReadTime(java.lang.String readTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READTIME$22);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READTIME$22);
                    }
                    target.setStringValue(readTime);
                }
            }
            
            /**
             * Sets (as xml) the "readTime" attribute
             */
            public void xsetReadTime(org.apache.xmlbeans.XmlString readTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(READTIME$22);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(READTIME$22);
                    }
                    target.set(readTime);
                }
            }
            
            /**
             * Unsets the "readTime" attribute
             */
            public void unsetReadTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(READTIME$22);
                }
            }
            
            /**
             * Gets the "totalTime" attribute
             */
            public java.lang.String getTotalTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIME$24);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "totalTime" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTotalTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOTALTIME$24);
                    return target;
                }
            }
            
            /**
             * True if has "totalTime" attribute
             */
            public boolean isSetTotalTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TOTALTIME$24) != null;
                }
            }
            
            /**
             * Sets the "totalTime" attribute
             */
            public void setTotalTime(java.lang.String totalTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOTALTIME$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOTALTIME$24);
                    }
                    target.setStringValue(totalTime);
                }
            }
            
            /**
             * Sets (as xml) the "totalTime" attribute
             */
            public void xsetTotalTime(org.apache.xmlbeans.XmlString totalTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOTALTIME$24);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOTALTIME$24);
                    }
                    target.set(totalTime);
                }
            }
            
            /**
             * Unsets the "totalTime" attribute
             */
            public void unsetTotalTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TOTALTIME$24);
                }
            }
            
            /**
             * Gets the "endpoint" attribute
             */
            public java.lang.String getEndpoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINT$26);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "endpoint" attribute
             */
            public org.apache.xmlbeans.XmlString xgetEndpoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDPOINT$26);
                    return target;
                }
            }
            
            /**
             * True if has "endpoint" attribute
             */
            public boolean isSetEndpoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ENDPOINT$26) != null;
                }
            }
            
            /**
             * Sets the "endpoint" attribute
             */
            public void setEndpoint(java.lang.String endpoint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDPOINT$26);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDPOINT$26);
                    }
                    target.setStringValue(endpoint);
                }
            }
            
            /**
             * Sets (as xml) the "endpoint" attribute
             */
            public void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENDPOINT$26);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENDPOINT$26);
                    }
                    target.set(endpoint);
                }
            }
            
            /**
             * Unsets the "endpoint" attribute
             */
            public void unsetEndpoint()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ENDPOINT$26);
                }
            }
            
            /**
             * Gets the "httpMethod" attribute
             */
            public java.lang.String getHttpMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPMETHOD$28);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "httpMethod" attribute
             */
            public org.apache.xmlbeans.XmlString xgetHttpMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HTTPMETHOD$28);
                    return target;
                }
            }
            
            /**
             * True if has "httpMethod" attribute
             */
            public boolean isSetHttpMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(HTTPMETHOD$28) != null;
                }
            }
            
            /**
             * Sets the "httpMethod" attribute
             */
            public void setHttpMethod(java.lang.String httpMethod)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPMETHOD$28);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTTPMETHOD$28);
                    }
                    target.setStringValue(httpMethod);
                }
            }
            
            /**
             * Sets (as xml) the "httpMethod" attribute
             */
            public void xsetHttpMethod(org.apache.xmlbeans.XmlString httpMethod)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HTTPMETHOD$28);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HTTPMETHOD$28);
                    }
                    target.set(httpMethod);
                }
            }
            
            /**
             * Unsets the "httpMethod" attribute
             */
            public void unsetHttpMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(HTTPMETHOD$28);
                }
            }
            
            /**
             * Gets the "ipAddress" attribute
             */
            public java.lang.String getIpAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$30);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ipAddress" attribute
             */
            public org.apache.xmlbeans.XmlString xgetIpAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IPADDRESS$30);
                    return target;
                }
            }
            
            /**
             * True if has "ipAddress" attribute
             */
            public boolean isSetIpAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(IPADDRESS$30) != null;
                }
            }
            
            /**
             * Sets the "ipAddress" attribute
             */
            public void setIpAddress(java.lang.String ipAddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IPADDRESS$30);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IPADDRESS$30);
                    }
                    target.setStringValue(ipAddress);
                }
            }
            
            /**
             * Sets (as xml) the "ipAddress" attribute
             */
            public void xsetIpAddress(org.apache.xmlbeans.XmlString ipAddress)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IPADDRESS$30);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IPADDRESS$30);
                    }
                    target.set(ipAddress);
                }
            }
            
            /**
             * Unsets the "ipAddress" attribute
             */
            public void unsetIpAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(IPADDRESS$30);
                }
            }
            
            /**
             * Gets the "port" attribute
             */
            public int getPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$32);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "port" attribute
             */
            public org.apache.xmlbeans.XmlInt xgetPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PORT$32);
                    return target;
                }
            }
            
            /**
             * True if has "port" attribute
             */
            public boolean isSetPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PORT$32) != null;
                }
            }
            
            /**
             * Sets the "port" attribute
             */
            public void setPort(int port)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PORT$32);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PORT$32);
                    }
                    target.setIntValue(port);
                }
            }
            
            /**
             * Sets (as xml) the "port" attribute
             */
            public void xsetPort(org.apache.xmlbeans.XmlInt port)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PORT$32);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PORT$32);
                    }
                    target.set(port);
                }
            }
            
            /**
             * Unsets the "port" attribute
             */
            public void unsetPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PORT$32);
                }
            }
        }
    }
}
