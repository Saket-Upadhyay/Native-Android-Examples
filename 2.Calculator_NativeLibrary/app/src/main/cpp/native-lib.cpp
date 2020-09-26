//MIT License
//
//Copyright (c) 2020 Saket Upadhyay
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//        of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//        to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//        copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in all
//        copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//        AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//SOFTWARE.

#include "native-lib.h"


using namespace std;


//Text Message Return
extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_xsfmnative_MainActivity_jniMSG(JNIEnv* env,jobject MainObj) {
    std::string hello = "This Calc. Works on Native Library in C++\n\nBasic Android C++ Native Example by X64Mayhem\n\nhttps://github.com/Saket-Upadhyay/Native-Android-Examples";
    return env->NewStringUTF(hello.c_str());
}

//Maths Function Sets

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_xsfmnative_MainActivity_jniADD(JNIEnv* env, jobject MainObj,
                                             jstring x, jstring y)
{
    // atoi() converts char* to int
    //GetStringUTFChars convert jstring to char*

    auto sum=(atoi(env->GetStringUTFChars(x,0))) + (atoi(env->GetStringUTFChars(y,0)));

    std::string ret=to_string(sum);

    return (*env).NewStringUTF(ret.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_xsfmnative_MainActivity_jniMUL(JNIEnv* env,jobject MainObj,jstring x, jstring y)
{
    auto pro=(atoi(env->GetStringUTFChars(x,0))) * (atoi(env->GetStringUTFChars(y,0)));

    std::string ret=to_string(pro);

    return (*env).NewStringUTF(ret.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_xsfmnative_MainActivity_jniDIV(JNIEnv* env,jobject MainObj,jstring x, jstring y)
{
    auto que=(atoi(env->GetStringUTFChars(x,0))) / (atoi(env->GetStringUTFChars(y,0)));

    std::string ret=to_string(que);

    return (*env).NewStringUTF(ret.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_xsfmnative_MainActivity_jniSUB(JNIEnv* env,jobject MainObj,jstring x, jstring y)
{
    auto diff=(atoi(env->GetStringUTFChars(x,0))) - (atoi(env->GetStringUTFChars(y,0)));

    std::string ret=to_string(diff);

    return (*env).NewStringUTF(ret.c_str());
}