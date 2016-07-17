#include <jni.h>
#include <stdio.h>
#include "HelloJNI.h"
//C code
JNIEXPORT void JNICALL Java_HelloJNI_sayHello(JNIEnv *env, jobject thisObj) {
   printf("Hello world!, C native code");
   return;
}
