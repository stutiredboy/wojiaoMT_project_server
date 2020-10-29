/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class mkdb_Logger */

#ifndef _Included_xdb_Logger
#define _Included_xdb_Logger
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     mkdb_Logger
 * Method:    create
 * Signature: (Ljava/lang/String;I)J
 */
JNIEXPORT jlong JNICALL Java_mkdb_Logger_create
  (JNIEnv *, jobject, jstring, jint);

/*
 * Class:     mkdb_Logger
 * Method:    verify
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_mkdb_Logger_verify
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mkdb_Logger
 * Method:    close
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_mkdb_Logger_close
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mkdb_Logger
 * Method:    prepare
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_mkdb_Logger_prepare
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mkdb_Logger
 * Method:    commit
 * Signature: (JJ)Z
 */
JNIEXPORT jboolean JNICALL Java_mkdb_Logger_commit
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     mkdb_Logger
 * Method:    loggerid
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_mkdb_Logger_loggerid
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
