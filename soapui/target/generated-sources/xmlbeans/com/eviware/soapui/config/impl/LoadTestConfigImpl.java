/*
 * XML Type:  LoadTest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.LoadTestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML LoadTest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class LoadTestConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.LoadTestConfig
{
    private static final long serialVersionUID = 1L;
    
    public LoadTestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THREADCOUNT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "threadCount");
    private static final javax.xml.namespace.QName STARTDELAY$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "startDelay");
    private static final javax.xml.namespace.QName SAMPLEINTERVAL$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sampleInterval");
    private static final javax.xml.namespace.QName CALCULATETPSONTIMEPASSED$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "calculateTPSOnTimePassed");
    private static final javax.xml.namespace.QName RESETSTATISTICSONTHREADCOUNTCHANGE$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "resetStatisticsOnThreadCountChange");
    private static final javax.xml.namespace.QName HISTORYLIMIT$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "historyLimit");
    private static final javax.xml.namespace.QName TESTLIMIT$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testLimit");
    private static final javax.xml.namespace.QName LIMITTYPE$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "limitType");
    private static final javax.xml.namespace.QName LOADSTRATEGY$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "loadStrategy");
    private static final javax.xml.namespace.QName ASSERTION$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    private static final javax.xml.namespace.QName MAXASSERTIONERRORS$20 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "maxAssertionErrors");
    private static final javax.xml.namespace.QName STATISTICSLOGFOLDER$22 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "statisticsLogFolder");
    private static final javax.xml.namespace.QName STATISTICSLOGINTERVAL$24 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "statisticsLogInterval");
    private static final javax.xml.namespace.QName LOGSTATISTICSONTHREADCHANGE$26 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "logStatisticsOnThreadChange");
    private static final javax.xml.namespace.QName CANCELONREACHEDLIMIT$28 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "cancelOnReachedLimit");
    private static final javax.xml.namespace.QName CANCELEXCESSIVETHREADS$30 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "cancelExcessiveThreads");
    private static final javax.xml.namespace.QName STRATEGYINTERVAL$32 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "strategyInterval");
    private static final javax.xml.namespace.QName SETUPSCRIPT$34 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "setupScript");
    private static final javax.xml.namespace.QName TEARDOWNSCRIPT$36 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tearDownScript");
    private static final javax.xml.namespace.QName UPDATESTATISTICSPERTESTSTEP$38 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "updateStatisticsPerTestStep");
    private static final javax.xml.namespace.QName REPORTSCRIPT$40 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportScript");
    private static final javax.xml.namespace.QName REPORTPARAMETERS$42 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportParameters");
    
    
    /**
     * Gets the "threadCount" element
     */
    public int getThreadCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THREADCOUNT$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "threadCount" element
     */
    public org.apache.xmlbeans.XmlInt xgetThreadCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(THREADCOUNT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "threadCount" element
     */
    public void setThreadCount(int threadCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(THREADCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(THREADCOUNT$0);
            }
            target.setIntValue(threadCount);
        }
    }
    
    /**
     * Sets (as xml) the "threadCount" element
     */
    public void xsetThreadCount(org.apache.xmlbeans.XmlInt threadCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(THREADCOUNT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(THREADCOUNT$0);
            }
            target.set(threadCount);
        }
    }
    
    /**
     * Gets the "startDelay" element
     */
    public int getStartDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDELAY$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "startDelay" element
     */
    public org.apache.xmlbeans.XmlInt xgetStartDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STARTDELAY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startDelay" element
     */
    public void setStartDelay(int startDelay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDELAY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDELAY$2);
            }
            target.setIntValue(startDelay);
        }
    }
    
    /**
     * Sets (as xml) the "startDelay" element
     */
    public void xsetStartDelay(org.apache.xmlbeans.XmlInt startDelay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STARTDELAY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STARTDELAY$2);
            }
            target.set(startDelay);
        }
    }
    
    /**
     * Gets the "sampleInterval" element
     */
    public int getSampleInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLEINTERVAL$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sampleInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetSampleInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SAMPLEINTERVAL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sampleInterval" element
     */
    public void setSampleInterval(int sampleInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLEINTERVAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAMPLEINTERVAL$4);
            }
            target.setIntValue(sampleInterval);
        }
    }
    
    /**
     * Sets (as xml) the "sampleInterval" element
     */
    public void xsetSampleInterval(org.apache.xmlbeans.XmlInt sampleInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SAMPLEINTERVAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SAMPLEINTERVAL$4);
            }
            target.set(sampleInterval);
        }
    }
    
    /**
     * Gets the "calculateTPSOnTimePassed" element
     */
    public boolean getCalculateTPSOnTimePassed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCULATETPSONTIMEPASSED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "calculateTPSOnTimePassed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCalculateTPSOnTimePassed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CALCULATETPSONTIMEPASSED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "calculateTPSOnTimePassed" element
     */
    public void setCalculateTPSOnTimePassed(boolean calculateTPSOnTimePassed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALCULATETPSONTIMEPASSED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALCULATETPSONTIMEPASSED$6);
            }
            target.setBooleanValue(calculateTPSOnTimePassed);
        }
    }
    
    /**
     * Sets (as xml) the "calculateTPSOnTimePassed" element
     */
    public void xsetCalculateTPSOnTimePassed(org.apache.xmlbeans.XmlBoolean calculateTPSOnTimePassed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CALCULATETPSONTIMEPASSED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CALCULATETPSONTIMEPASSED$6);
            }
            target.set(calculateTPSOnTimePassed);
        }
    }
    
    /**
     * Gets the "resetStatisticsOnThreadCountChange" element
     */
    public boolean getResetStatisticsOnThreadCountChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETSTATISTICSONTHREADCOUNTCHANGE$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "resetStatisticsOnThreadCountChange" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetResetStatisticsOnThreadCountChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESETSTATISTICSONTHREADCOUNTCHANGE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resetStatisticsOnThreadCountChange" element
     */
    public void setResetStatisticsOnThreadCountChange(boolean resetStatisticsOnThreadCountChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESETSTATISTICSONTHREADCOUNTCHANGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESETSTATISTICSONTHREADCOUNTCHANGE$8);
            }
            target.setBooleanValue(resetStatisticsOnThreadCountChange);
        }
    }
    
    /**
     * Sets (as xml) the "resetStatisticsOnThreadCountChange" element
     */
    public void xsetResetStatisticsOnThreadCountChange(org.apache.xmlbeans.XmlBoolean resetStatisticsOnThreadCountChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESETSTATISTICSONTHREADCOUNTCHANGE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESETSTATISTICSONTHREADCOUNTCHANGE$8);
            }
            target.set(resetStatisticsOnThreadCountChange);
        }
    }
    
    /**
     * Gets the "historyLimit" element
     */
    public long getHistoryLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORYLIMIT$10, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "historyLimit" element
     */
    public org.apache.xmlbeans.XmlLong xgetHistoryLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(HISTORYLIMIT$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "historyLimit" element
     */
    public boolean isSetHistoryLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HISTORYLIMIT$10) != 0;
        }
    }
    
    /**
     * Sets the "historyLimit" element
     */
    public void setHistoryLimit(long historyLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HISTORYLIMIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HISTORYLIMIT$10);
            }
            target.setLongValue(historyLimit);
        }
    }
    
    /**
     * Sets (as xml) the "historyLimit" element
     */
    public void xsetHistoryLimit(org.apache.xmlbeans.XmlLong historyLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(HISTORYLIMIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(HISTORYLIMIT$10);
            }
            target.set(historyLimit);
        }
    }
    
    /**
     * Unsets the "historyLimit" element
     */
    public void unsetHistoryLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HISTORYLIMIT$10, 0);
        }
    }
    
    /**
     * Gets the "testLimit" element
     */
    public long getTestLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTLIMIT$12, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "testLimit" element
     */
    public org.apache.xmlbeans.XmlLong xgetTestLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TESTLIMIT$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "testLimit" element
     */
    public void setTestLimit(long testLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTLIMIT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTLIMIT$12);
            }
            target.setLongValue(testLimit);
        }
    }
    
    /**
     * Sets (as xml) the "testLimit" element
     */
    public void xsetTestLimit(org.apache.xmlbeans.XmlLong testLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TESTLIMIT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TESTLIMIT$12);
            }
            target.set(testLimit);
        }
    }
    
    /**
     * Gets the "limitType" element
     */
    public com.eviware.soapui.config.LoadTestLimitTypesConfig.Enum getLimitType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITTYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.LoadTestLimitTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "limitType" element
     */
    public com.eviware.soapui.config.LoadTestLimitTypesConfig xgetLimitType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestLimitTypesConfig target = null;
            target = (com.eviware.soapui.config.LoadTestLimitTypesConfig)get_store().find_element_user(LIMITTYPE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "limitType" element
     */
    public void setLimitType(com.eviware.soapui.config.LoadTestLimitTypesConfig.Enum limitType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMITTYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIMITTYPE$14);
            }
            target.setEnumValue(limitType);
        }
    }
    
    /**
     * Sets (as xml) the "limitType" element
     */
    public void xsetLimitType(com.eviware.soapui.config.LoadTestLimitTypesConfig limitType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestLimitTypesConfig target = null;
            target = (com.eviware.soapui.config.LoadTestLimitTypesConfig)get_store().find_element_user(LIMITTYPE$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.LoadTestLimitTypesConfig)get_store().add_element_user(LIMITTYPE$14);
            }
            target.set(limitType);
        }
    }
    
    /**
     * Gets the "loadStrategy" element
     */
    public com.eviware.soapui.config.LoadStrategyConfig getLoadStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadStrategyConfig target = null;
            target = (com.eviware.soapui.config.LoadStrategyConfig)get_store().find_element_user(LOADSTRATEGY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "loadStrategy" element
     */
    public void setLoadStrategy(com.eviware.soapui.config.LoadStrategyConfig loadStrategy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadStrategyConfig target = null;
            target = (com.eviware.soapui.config.LoadStrategyConfig)get_store().find_element_user(LOADSTRATEGY$16, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.LoadStrategyConfig)get_store().add_element_user(LOADSTRATEGY$16);
            }
            target.set(loadStrategy);
        }
    }
    
    /**
     * Appends and returns a new empty "loadStrategy" element
     */
    public com.eviware.soapui.config.LoadStrategyConfig addNewLoadStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadStrategyConfig target = null;
            target = (com.eviware.soapui.config.LoadStrategyConfig)get_store().add_element_user(LOADSTRATEGY$16);
            return target;
        }
    }
    
    /**
     * Gets a List of "assertion" elements
     */
    public java.util.List<com.eviware.soapui.config.LoadTestAssertionConfig> getAssertionList()
    {
        final class AssertionList extends java.util.AbstractList<com.eviware.soapui.config.LoadTestAssertionConfig>
        {
            public com.eviware.soapui.config.LoadTestAssertionConfig get(int i)
                { return LoadTestConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.LoadTestAssertionConfig set(int i, com.eviware.soapui.config.LoadTestAssertionConfig o)
            {
                com.eviware.soapui.config.LoadTestAssertionConfig old = LoadTestConfigImpl.this.getAssertionArray(i);
                LoadTestConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.LoadTestAssertionConfig o)
                { LoadTestConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.LoadTestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.LoadTestAssertionConfig old = LoadTestConfigImpl.this.getAssertionArray(i);
                LoadTestConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return LoadTestConfigImpl.this.sizeOfAssertionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AssertionList();
        }
    }
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    public com.eviware.soapui.config.LoadTestAssertionConfig[] getAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.LoadTestAssertionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.LoadTestAssertionConfig>();
            get_store().find_all_element_users(ASSERTION$18, targetList);
            com.eviware.soapui.config.LoadTestAssertionConfig[] result = new com.eviware.soapui.config.LoadTestAssertionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assertion" element
     */
    public com.eviware.soapui.config.LoadTestAssertionConfig getAssertionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestAssertionConfig target = null;
            target = (com.eviware.soapui.config.LoadTestAssertionConfig)get_store().find_element_user(ASSERTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assertion" element
     */
    public int sizeOfAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTION$18);
        }
    }
    
    /**
     * Sets array of all "assertion" element
     */
    public void setAssertionArray(com.eviware.soapui.config.LoadTestAssertionConfig[] assertionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assertionArray, ASSERTION$18);
        }
    }
    
    /**
     * Sets ith "assertion" element
     */
    public void setAssertionArray(int i, com.eviware.soapui.config.LoadTestAssertionConfig assertion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestAssertionConfig target = null;
            target = (com.eviware.soapui.config.LoadTestAssertionConfig)get_store().find_element_user(ASSERTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assertion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    public com.eviware.soapui.config.LoadTestAssertionConfig insertNewAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestAssertionConfig target = null;
            target = (com.eviware.soapui.config.LoadTestAssertionConfig)get_store().insert_element_user(ASSERTION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    public com.eviware.soapui.config.LoadTestAssertionConfig addNewAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.LoadTestAssertionConfig target = null;
            target = (com.eviware.soapui.config.LoadTestAssertionConfig)get_store().add_element_user(ASSERTION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "assertion" element
     */
    public void removeAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTION$18, i);
        }
    }
    
    /**
     * Gets the "maxAssertionErrors" element
     */
    public long getMaxAssertionErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXASSERTIONERRORS$20, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxAssertionErrors" element
     */
    public org.apache.xmlbeans.XmlLong xgetMaxAssertionErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXASSERTIONERRORS$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "maxAssertionErrors" element
     */
    public boolean isSetMaxAssertionErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXASSERTIONERRORS$20) != 0;
        }
    }
    
    /**
     * Sets the "maxAssertionErrors" element
     */
    public void setMaxAssertionErrors(long maxAssertionErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXASSERTIONERRORS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXASSERTIONERRORS$20);
            }
            target.setLongValue(maxAssertionErrors);
        }
    }
    
    /**
     * Sets (as xml) the "maxAssertionErrors" element
     */
    public void xsetMaxAssertionErrors(org.apache.xmlbeans.XmlLong maxAssertionErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(MAXASSERTIONERRORS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(MAXASSERTIONERRORS$20);
            }
            target.set(maxAssertionErrors);
        }
    }
    
    /**
     * Unsets the "maxAssertionErrors" element
     */
    public void unsetMaxAssertionErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXASSERTIONERRORS$20, 0);
        }
    }
    
    /**
     * Gets the "statisticsLogFolder" element
     */
    public java.lang.String getStatisticsLogFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATISTICSLOGFOLDER$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "statisticsLogFolder" element
     */
    public org.apache.xmlbeans.XmlString xgetStatisticsLogFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATISTICSLOGFOLDER$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "statisticsLogFolder" element
     */
    public void setStatisticsLogFolder(java.lang.String statisticsLogFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATISTICSLOGFOLDER$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATISTICSLOGFOLDER$22);
            }
            target.setStringValue(statisticsLogFolder);
        }
    }
    
    /**
     * Sets (as xml) the "statisticsLogFolder" element
     */
    public void xsetStatisticsLogFolder(org.apache.xmlbeans.XmlString statisticsLogFolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATISTICSLOGFOLDER$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATISTICSLOGFOLDER$22);
            }
            target.set(statisticsLogFolder);
        }
    }
    
    /**
     * Gets the "statisticsLogInterval" element
     */
    public int getStatisticsLogInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATISTICSLOGINTERVAL$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "statisticsLogInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetStatisticsLogInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATISTICSLOGINTERVAL$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "statisticsLogInterval" element
     */
    public void setStatisticsLogInterval(int statisticsLogInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATISTICSLOGINTERVAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATISTICSLOGINTERVAL$24);
            }
            target.setIntValue(statisticsLogInterval);
        }
    }
    
    /**
     * Sets (as xml) the "statisticsLogInterval" element
     */
    public void xsetStatisticsLogInterval(org.apache.xmlbeans.XmlInt statisticsLogInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATISTICSLOGINTERVAL$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATISTICSLOGINTERVAL$24);
            }
            target.set(statisticsLogInterval);
        }
    }
    
    /**
     * Gets the "logStatisticsOnThreadChange" element
     */
    public boolean getLogStatisticsOnThreadChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGSTATISTICSONTHREADCHANGE$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "logStatisticsOnThreadChange" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLogStatisticsOnThreadChange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOGSTATISTICSONTHREADCHANGE$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "logStatisticsOnThreadChange" element
     */
    public void setLogStatisticsOnThreadChange(boolean logStatisticsOnThreadChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGSTATISTICSONTHREADCHANGE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGSTATISTICSONTHREADCHANGE$26);
            }
            target.setBooleanValue(logStatisticsOnThreadChange);
        }
    }
    
    /**
     * Sets (as xml) the "logStatisticsOnThreadChange" element
     */
    public void xsetLogStatisticsOnThreadChange(org.apache.xmlbeans.XmlBoolean logStatisticsOnThreadChange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOGSTATISTICSONTHREADCHANGE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOGSTATISTICSONTHREADCHANGE$26);
            }
            target.set(logStatisticsOnThreadChange);
        }
    }
    
    /**
     * Gets the "cancelOnReachedLimit" element
     */
    public boolean getCancelOnReachedLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELONREACHEDLIMIT$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cancelOnReachedLimit" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCancelOnReachedLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANCELONREACHEDLIMIT$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cancelOnReachedLimit" element
     */
    public void setCancelOnReachedLimit(boolean cancelOnReachedLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELONREACHEDLIMIT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANCELONREACHEDLIMIT$28);
            }
            target.setBooleanValue(cancelOnReachedLimit);
        }
    }
    
    /**
     * Sets (as xml) the "cancelOnReachedLimit" element
     */
    public void xsetCancelOnReachedLimit(org.apache.xmlbeans.XmlBoolean cancelOnReachedLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANCELONREACHEDLIMIT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANCELONREACHEDLIMIT$28);
            }
            target.set(cancelOnReachedLimit);
        }
    }
    
    /**
     * Gets the "cancelExcessiveThreads" element
     */
    public boolean getCancelExcessiveThreads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELEXCESSIVETHREADS$30, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cancelExcessiveThreads" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCancelExcessiveThreads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANCELEXCESSIVETHREADS$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cancelExcessiveThreads" element
     */
    public void setCancelExcessiveThreads(boolean cancelExcessiveThreads)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANCELEXCESSIVETHREADS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANCELEXCESSIVETHREADS$30);
            }
            target.setBooleanValue(cancelExcessiveThreads);
        }
    }
    
    /**
     * Sets (as xml) the "cancelExcessiveThreads" element
     */
    public void xsetCancelExcessiveThreads(org.apache.xmlbeans.XmlBoolean cancelExcessiveThreads)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CANCELEXCESSIVETHREADS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CANCELEXCESSIVETHREADS$30);
            }
            target.set(cancelExcessiveThreads);
        }
    }
    
    /**
     * Gets the "strategyInterval" element
     */
    public int getStrategyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRATEGYINTERVAL$32, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "strategyInterval" element
     */
    public org.apache.xmlbeans.XmlInt xgetStrategyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STRATEGYINTERVAL$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "strategyInterval" element
     */
    public void setStrategyInterval(int strategyInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRATEGYINTERVAL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRATEGYINTERVAL$32);
            }
            target.setIntValue(strategyInterval);
        }
    }
    
    /**
     * Sets (as xml) the "strategyInterval" element
     */
    public void xsetStrategyInterval(org.apache.xmlbeans.XmlInt strategyInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STRATEGYINTERVAL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STRATEGYINTERVAL$32);
            }
            target.set(strategyInterval);
        }
    }
    
    /**
     * Gets the "setupScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "setupScript" element
     */
    public boolean isSetSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETUPSCRIPT$34) != 0;
        }
    }
    
    /**
     * Sets the "setupScript" element
     */
    public void setSetupScript(com.eviware.soapui.config.ScriptConfig setupScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(SETUPSCRIPT$34, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$34);
            }
            target.set(setupScript);
        }
    }
    
    /**
     * Appends and returns a new empty "setupScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(SETUPSCRIPT$34);
            return target;
        }
    }
    
    /**
     * Unsets the "setupScript" element
     */
    public void unsetSetupScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETUPSCRIPT$34, 0);
        }
    }
    
    /**
     * Gets the "tearDownScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tearDownScript" element
     */
    public boolean isSetTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEARDOWNSCRIPT$36) != 0;
        }
    }
    
    /**
     * Sets the "tearDownScript" element
     */
    public void setTearDownScript(com.eviware.soapui.config.ScriptConfig tearDownScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(TEARDOWNSCRIPT$36, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$36);
            }
            target.set(tearDownScript);
        }
    }
    
    /**
     * Appends and returns a new empty "tearDownScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(TEARDOWNSCRIPT$36);
            return target;
        }
    }
    
    /**
     * Unsets the "tearDownScript" element
     */
    public void unsetTearDownScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEARDOWNSCRIPT$36, 0);
        }
    }
    
    /**
     * Gets the "updateStatisticsPerTestStep" element
     */
    public boolean getUpdateStatisticsPerTestStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATISTICSPERTESTSTEP$38, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateStatisticsPerTestStep" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUpdateStatisticsPerTestStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATESTATISTICSPERTESTSTEP$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "updateStatisticsPerTestStep" element
     */
    public void setUpdateStatisticsPerTestStep(boolean updateStatisticsPerTestStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATESTATISTICSPERTESTSTEP$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATESTATISTICSPERTESTSTEP$38);
            }
            target.setBooleanValue(updateStatisticsPerTestStep);
        }
    }
    
    /**
     * Sets (as xml) the "updateStatisticsPerTestStep" element
     */
    public void xsetUpdateStatisticsPerTestStep(org.apache.xmlbeans.XmlBoolean updateStatisticsPerTestStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATESTATISTICSPERTESTSTEP$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UPDATESTATISTICSPERTESTSTEP$38);
            }
            target.set(updateStatisticsPerTestStep);
        }
    }
    
    /**
     * Gets the "reportScript" element
     */
    public com.eviware.soapui.config.ScriptConfig getReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportScript" element
     */
    public boolean isSetReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSCRIPT$40) != 0;
        }
    }
    
    /**
     * Sets the "reportScript" element
     */
    public void setReportScript(com.eviware.soapui.config.ScriptConfig reportScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(REPORTSCRIPT$40, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$40);
            }
            target.set(reportScript);
        }
    }
    
    /**
     * Appends and returns a new empty "reportScript" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(REPORTSCRIPT$40);
            return target;
        }
    }
    
    /**
     * Unsets the "reportScript" element
     */
    public void unsetReportScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSCRIPT$40, 0);
        }
    }
    
    /**
     * Gets the "reportParameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig getReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reportParameters" element
     */
    public boolean isSetReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTPARAMETERS$42) != 0;
        }
    }
    
    /**
     * Sets the "reportParameters" element
     */
    public void setReportParameters(com.eviware.soapui.config.PropertiesTypeConfig reportParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().find_element_user(REPORTPARAMETERS$42, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$42);
            }
            target.set(reportParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "reportParameters" element
     */
    public com.eviware.soapui.config.PropertiesTypeConfig addNewReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertiesTypeConfig target = null;
            target = (com.eviware.soapui.config.PropertiesTypeConfig)get_store().add_element_user(REPORTPARAMETERS$42);
            return target;
        }
    }
    
    /**
     * Unsets the "reportParameters" element
     */
    public void unsetReportParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTPARAMETERS$42, 0);
        }
    }
}
