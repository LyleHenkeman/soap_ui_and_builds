# The SoapUI project

## Structure and submodules

* *[soapui](soapui)* - The core module that creates the SoapUI jar
* *[soapui-system-test](soapui-system-test)* - Integration and system tests for SoapUI
* *[soapui-installer](soapui-installer)* - Creates the SoapUI distributions, such as installers and archives
* *[soapui-maven-plugin](soapui-maven-plugin)* – Maven plugin used for running SoapUI in a Continuous integration environment (such as [Jenkins](http://jenkins-ci.org)).
* *[soapui-maven-plugin-tester](soapui-maven-plugin-tester)* - Small test `pom.xml` used for testing the *soapui-maven-plugin*.

* *[takealot](takealot)* - folder containing tests for respective platforms
    * *[marketplace](marketplace)* - folder containing marketplace api tests.
    * *[wms](wms)* - folder containing warehouse management systems tests.
    * *[finance](finance)* - folder containing finance tests.
    * *[catalogue](catalogue)* - folder containing catalogue tests.
    * *[frontend](frontend)* - folder containing frontend tests.
    * *[bys](bys)* - folder containing business systems tests.

## Building and running

### Prerequisite

* [JDK (version 1.6 or higher)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
    * If you're using Java 1.6 you have download the [standalone Java FX runtime ](http://www.oracle.com/technetwork/java/javase/downloads/javafxjdk6-1728173.html) and set the `javafx.runtime.lib.jar` property in the root `pom.xml` file to the path of the `jfxrt.jar` file
* [Maven (version 3.0.0 or higher)](http://maven.apache.org/)
* [Git (version 1.8 or higher)](http://git-scm.com)

### Getting the source code for the first time

the source project https://github.com/SmartBear/soapui.git`.

### Building

* To build the SoapUI project run `mvn clean install` in the root folder.
* To build a individual submodule run `mvn clean install` the root folder of the submodule you want to build.
* Ensure everything passes, fix broken builds before continuing.

```[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] SoapUI project ..................................... SUCCESS [  3.708 s]
[INFO] SoapUI ............................................. SUCCESS [06:30 min]
[INFO] SoapUI Maven plugin ................................ SUCCESS [ 37.587 s]
[INFO] SoapUI installer ................................... SUCCESS [ 33.745 s]
[INFO] SoapUI Maven plugin tester ......................... SUCCESS [ 13.749 s]
[INFO] SoapUI system test ................................. SUCCESS [ 13.623 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------```
### Running

To run SoapUI after it has been built, execute `mvn exec:java` in the root folder of the *soapui* submodule.

### Running tests via command line interface
There is a method to call soap ui tests using crontab.

Running functional tests from the command-line is straightforward using the included in soap ui testrunner.sh script, which takes a number of arguments to control which tests to run, output, for example:

```
sh SmartBear/soapUI-4.5.1/bin/testrunner.sh -s"TestSuite 1" -r -a -fyour_folder/reports your_folder/your_project-soapui-project.xml
```
Where:
SmartBear/soapUI-4.5.1/bin/testrunner.sh : path to running script
-s "TestSuite 1": test suite name
-r : create summary report in console
-a : exporting of all test results in report, not only errors
-f your_folder/reports : path to your reports folder
your_folder/your_project-soapui-project.xml : path to your soap ui project file

More information here: http://www.soapui.org/Test-Automation/functional-tests.html

### Getting the latest changes

To get the latest source code changes clone the project by running `git pull` in the root directory of the SoapUI project or the root directory of the submodule you want to update.

### IDE support

As SoapUI is using a standard Maven 3 setup, building and running SoapUI from an IDE is usually very straight forward, as long as the IDE has good Maven support.

**Getting started using Intellij IDEA (version 13)**

* Clone the project
* In the main menu select *File* -> *Open...*
* Enter the path to the root folder of the SoapUI project
* Run `mvn compile` in order to auto generate necessary source files
* After you have created the IDEA project sucessfully, navigate to the main class `com.eviware.soapui.SoapUI` right click and select *Run*.
* To get the latest changes right click on the root folder in the *Project* view and select *Git* -> *Repository* -> *Pull...*
* To get the same code style settings as the SoapUI team select *File* -> *Import Settings...* and import the file intellij-codestyle.jar located in the root folder of the SoapUI project

**Getting started using Eclipse (version 4 / Juno)**

* Clone the project
* In the main menu select *File* -> *Import* -> *Maven* -> *Existing Maven projects* and at *Root directory* enter the path to the root folder of the SoapUI project and then finish the wizard.
* After you have created the Eclipse project sucessfully, navigate to the main class `com.eviware.soapui.SoapUI` right click and select *Run as* -> *Java application*
* To get the latest changes right click on the root folder in the *Package explorer* view and select *Team* -> *Pull*

## Documentation
To generate documentation ([JavaDoc](http://www.oracle.com/technetwork/java/javase/documentation/index-jsp-135444.html)) run `mvn javadoc:javadoc` in the root folder of the submodule you want documentation for. The documentation will be located in the `target/site/javadoc` folder after the Maven command has terminated successfully. 

You can also get the latest JavaDoc for SoapUI [here](http://www.soapui.org/apidocs).


## Additional resources
* *[SoapUI Groovy examples](https://github.com/SmartBear/soapui-groovy-examples)* - This is a collection of SoapUI projects and Groovy Scripts used to demonstrate the Groovy scripting capabilities in SoapUI.
* [Extending SoapUI](http://www.soapui.org/Developers-Corner/extending-soapui.html)
* [Custom factories](http://www.soapui.org/Developers-Corner/custom-factories.html)
* [Integrating with SoapUI](http://www.soapui.org/Developers-Corner/integrating-with-soapui.html)
