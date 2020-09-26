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

extern "C" JNIEXPORT jstring JNICALL
Java_com_x64m_hellojni_MainActivity_stringFromJNI(
        JNIEnv* env, //default env parameter.
        jobject /* this, activity context. */) {
    std::string hello = "Hi! This text is coming in hot from the Native Library!! Wanna see the License? Here you go ...\n--------------------------------\nMIT License\n"
                        "\n"
                        "Copyright (c) 2020 Saket Upadhyay\n"
                        "\n"
                        "Permission is hereby granted, free of charge, to any person obtaining a copy\n"
                        "of this software and associated documentation files (the \"Software\"), to deal\n"
                        "in the Software without restriction, including without limitation the rights\n"
                        "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n"
                        "copies of the Software, and to permit persons to whom the Software is\n"
                        "furnished to do so, subject to the following conditions:\n"
                        "\n"
                        "The above copyright notice and this permission notice shall be included in all\n"
                        "copies or substantial portions of the Software.\n"
                        "\n"
                        "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n"
                        "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n"
                        "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n"
                        "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n"
                        "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n"
                        "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\n"
                        "SOFTWARE.";

    //RETURN THE STRING TO THE CALLER
    return env->NewStringUTF(hello.c_str());
}
