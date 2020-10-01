# Native Android Examples
Basic Android Native Library Examples for Beginners (JNI via C++ Libraries)

### Contents

- [HelloWorld (JNI intro.)](https://github.com/Saket-Upadhyay/Native-Android-Examples/tree/master/1.HelloJNI)
    - This uses _native-lib.cpp_ to get string from our C++ library and print that on screen using regular _TextView.setText(String)_ function.

- [Basic Calculator (Native Library)](https://github.com/Saket-Upadhyay/Native-Android-Examples/tree/master/2.Calculator_NativeLibrary)
    - This uses native library to do simple calculations and then display the result.
    - JNI functions take parameters in jstring (Java String) then converts it into C string (char*) and then into C integer (int) via std::atoi()
    - Flow : String -> Jstring -> Char* -> int -> std::string -> c_string() -> String

- [Native Obfuscation (Sample C++ based Java Obfuscation)](https://github.com/Saket-Upadhyay/Native-Android-Examples/tree/master/3.NativeObfuscation)
    - This uses native library to Obfuscate the code.
    - JNI functions takes two parameters in jstring (Java String) and jint (Java Integer) and then performs XOR with (jint/10042069)
    - Uses `Class.forName().getMethod()` and `Method.invoke()` to obfuscate class names and basic method calls.
