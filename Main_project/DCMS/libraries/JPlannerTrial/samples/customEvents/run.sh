cd `dirname $0`

export CLASSPATH=$CLASSPATH:./../../JPlanner.jar
mkdir ./classes
javac -d ./classes ./*.java
cd classes
java -cp ./:./../../../JPlanner.jar customEvents.BaseWindow
cd ..
echo “Done”