////////////////////////////////////////////////////////////////////\
// Sara Ristovic 2080101\
// Francesco Lapenna 2072134\
////////////////////////////////////////////////////////////////////

# *** ANALISI STATICA e CODE COVERAGE del codice ***
Il codice Java e' stato controllato dai plugin checkstyle e compila correttamente.
Il code coverage e' del 96% (il report si trova dentro: roman-number/target/site/jacoco/index.html)

# *** RISULTATO DEL PROCESSO DI BUILD ***
``` console
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< it.unipd.mtss:roman-number >---------------------
[INFO] Building roman-number 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.11:prepare-agent (default-prepare-agent) @ roman-number ---
[INFO] argLine set to -javaagent:/home/runner/.m2/repository/org/jacoco/org.jacoco.agent/0.8.11/org.jacoco.agent-0.8.11-runtime.jar=destfile=/home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ roman-number ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/Assignment2_1/Assignment2_1/roman-number/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:compile (default-compile) @ roman-number ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ roman-number ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/Assignment2_1/Assignment2_1/roman-number/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.0:testCompile (default-testCompile) @ roman-number ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to /home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ roman-number ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running it.unipd.mtss.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.108 s - in it.unipd.mtss.AppTest
[INFO] Running it.unipd.mtss.IntegerToRomanTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.004 s - in it.unipd.mtss.IntegerToRomanTest
[INFO] Running it.unipd.mtss.RomanPrinterTest
  _____  
 |_   _| 
   | |   
   | |   
  _| |_  
 |_____| 

 __      __ 
 \ \    / / 
  \ \  / /  
   \ \/ /   
    \  /    
     \/     

 __   __ 
 \ \ / / 
  \ V /  
   > <   
  / . \  
 /_/ \_\ 

  _       
 | |      
 | |      
 | |      
 | |____  
 |______| 

   _____  
  / ____| 
 | |      
 | |      
 | |____  
  \_____| 

  _____   
 |  __ \  
 | |  | | 
 | |  | | 
 | |__| | 
 |_____/  

  __  __  
 |  \/  | 
 | \  / | 
 | |\/| | 
 | |  | | 
 |_|  |_| 

   _____    __  __  
  / ____|  |  \/  | 
 | |       | \  / | 
 | |       | |\/| | 
 | |____   | |  | | 
  \_____|  |_|  |_| 

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.005 s - in it.unipd.mtss.RomanPrinterTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ roman-number ---
[INFO] Building jar: /home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/roman-number-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-checkstyle-plugin:3.3.1:checkstyle (default) @ roman-number ---
[INFO] Rendering content with org.apache.maven.skins:maven-default-skin:jar:1.3 skin.
[INFO] Starting audit...
Audit done.
Warning:  Unable to locate Source XRef to link to - DISABLED
Warning:  Unable to locate Test Source XRef to link to - DISABLED
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.11:report (default-report) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 4 classes
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.11:check (default-check) @ roman-number ---
[INFO] Loading execution data file /home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/jacoco.exec
[INFO] Analyzed bundle 'roman-number' with 4 classes
[INFO] All coverage checks have been met.
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ roman-number ---
[INFO] Installing /home/runner/work/Assignment2_1/Assignment2_1/roman-number/target/roman-number-1.0-SNAPSHOT.jar to /home/runner/.m2/repository/it/unipd/mtss/roman-number/1.0-SNAPSHOT/roman-number-1.0-SNAPSHOT.jar
[INFO] Installing /home/runner/work/Assignment2_1/Assignment2_1/roman-number/pom.xml to /home/runner/.m2/repository/it/unipd/mtss/roman-number/1.0-SNAPSHOT/roman-number-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.368 s
[INFO] Finished at: 2024-05-20T04:49:39Z
[INFO] ------------------------------------------------------------------------
```
