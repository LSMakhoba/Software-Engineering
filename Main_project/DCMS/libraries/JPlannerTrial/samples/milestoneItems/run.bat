set CLASSPATH=%CLASSPATH%;..\..\JPlanner.jar
md classes
javac -d classes *.java
cd classes
java -cp ./;..\..\..\JPlanner.jar milestoneItems.BaseWindow
cd..
pause..