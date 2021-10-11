# Native Android डेवलपमेंट के उदाहरण
Basic Android Native Library Examples for Beginners (JNI via C++ Libraries)

शुरुआती डेवलपर्स के लिए सरल एंड्रॉइड नेटिव लाइब्रेरी के उदाहरण (सी++ लाइब्रेरी के माध्यम से JNI का कार्यान्वयन) 

### विषय सूची 

- [HelloWorld (JNI intro.)](https://github.com/Saket-Upadhyay/Native-Android-Examples/tree/master/1.HelloJNI)
    - Tवह हमारी सी++ लाइब्रेरी से स्ट्रिंग प्राप्त करने के लिए _native-lib.cpp_ का उपयोग करता है और नियमित _TextView.setText(String)_ फ़ंक्शन का उपयोग करके स्क्रीन पर प्रिंट करता है।

- [Basic Calculator (Native Library)](https://github.com/Saket-Upadhyay/Native-Android-Examples/tree/master/2.Calculator_NativeLibrary)
    - यह साधारण गणना करने के लिए मूल लाइब्रेरी का उपयोग करता है और फिर परिणाम प्रदर्शित करता है।
    - जे.एन.आई फ़ंक्शन जेस्ट्रिंग (जावा स्ट्रिंग) में पैरामीटर लेते हैं और फिर इसे c स्ट्रिंग (char \*) में परिवर्तित करते हैं और फिर c संख्या (int) में std :: atoi () के माध्यम से परिवर्तित करते हैं
    - प्रवाह : String -> Jstring -> Char* -> int -> std::string -> c_string() -> String

- [Native Obfuscation (Sample C++ based Java Obfuscation)](https://github.com/Saket-Upadhyay/Native-Android-Examples/tree/master/3.NativeObfuscation)
    - यह कोड को अस्पष्ट करने के लिए मूल लाइब्रेरी का उपयोग करता है।
    - जे.एन.आई फ़ंक्शन jstring (जावा स्ट्रिंग) और jint (जावा इंटीजर) में दो पैरामीटर लेता है और फिर (jint/10042069) से XOR करता है
    - क्लास के नाम और बुनियादी मेथड कॉल्स को अस्पष्ट (obfuscate) करने के लिए `Class.forName().getMethod()` और `Method.invoke()` का उपयोग करता है।
