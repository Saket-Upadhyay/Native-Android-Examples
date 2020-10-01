#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_nativeobfuscation_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */,jstring MSG) {
    std::string hello = env->GetStringUTFChars(MSG,0);
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_nativeobfuscation_MainActivity_TurnTables(JNIEnv* env,jobject MainActivityHandle,jstring CipherText,jlong Key)
{
    std::string PlainText=env->GetStringUTFChars(CipherText,0);

    Key=(Key/1004206969);

    for(int i=0;i < PlainText.length(); i++)
    {
        PlainText[i]=(int)PlainText[i] ^ Key;
    }

    return env->NewStringUTF(PlainText.c_str());
}