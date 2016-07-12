#include <jni.h>
#include "HolaMundoN.h"
#include<stdio.h>

JNIEXPORT void JNICALL Java_HolaMundoN_presentaSaludo
  (JNIEnv *env, jobject obj){
	printf("Hola mundo nativo");

}