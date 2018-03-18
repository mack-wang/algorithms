## 1.安装库
mvn install:install-file -Dfile=algs4.jar -DgroupId=com.algs4.com -DartifactId=algs4 -Dversion=1.0.0 -Dpackaging=jar

## 2.编译和执行
编译
javac Example.java
执行
注意事项，如果编译后的文件不在classpath目录下，则要告诉java classpath的路径 然后再执行程序
java -classpath ~/Web/www/mack-wang/algorithms2/src/main/java ReadInputs 5 100.0 200.0
java -cp . ReadInputs 5 100.0 200.0 // 这样也行

## 3.重定向
java -cp . ReadInputs 5 100.0 200.0 > data.txt
java -cp . MyAverage < data.txt
java -cp . ReadInputs 5 100.0 200.0 | java -cp . MyAverage