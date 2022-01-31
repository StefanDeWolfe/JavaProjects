# JavaStuff
Step 1: Install Java on your machine
Step 2: set ENV variables JAVA_HOME="C:\Program Files\Java\jdk1.8.0_xxx"
Step 3: Append JAVA_HOME to path. %JAVE_HOME%\bin

Step 4: download and extract MAVEN to "C:\Program Files"
Step 5: Set ENV variables MAVEN_HOME = "C:\Program Files"
Step 6: Append JAVA_HOME to path. %MAVEN_HOME%\bin

IF starting from scratch

Step 7: open IntelliJ, start new project as Maven
Step 8: Add dependancies to pom.xml
Step 9: File -> Project Structure -> Modules -> Dependancies -> + (add new dependancy) -> Library -> From Maven
        a: org.testng:testng:7.3.0
        b: io.rest-assured:rest-assured:<most recent 4.3.0>
        c: io.rest-assured:json-path:<most recent 4.3.0>
        d: io.rest-assured:xml-path:<most recent 4.3.0>
        
IF using git

Step 7: create workspace directory
        with terminal, cd to directory
        copy html link from gitlab -> clone button
        in terminal, type "git clone " then paste html clone path
Step 8: start up IntelliJ, open the <workspace>/JavaStuff/JavaRestAssuredApiTesting/pom.xlm AS PROJECT

Step 9: run
