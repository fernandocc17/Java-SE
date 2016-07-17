You just need to create HelloJNI.java and HelloJNI.c

1)Create the java file.

2)Compile the java file e.g.:
javac HelloJNI.java

3)create the c header e.g.:
javah HelloJNI

4) Create the C file

4.1)You can copy the method name from the .H file
4.2)It must include jni.h and HelloJNI.h

5)Create the DLL with GCC
Windows
gcc -Wl,--add-stdcall-alias -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o hello.dll HelloJNI.

Please note that the DLL and the JVM must share the same architecture(32 or 64 bits).

6)Run the java code, e.g:
java HelloJNI

Output directory contains the files generated using the command line.