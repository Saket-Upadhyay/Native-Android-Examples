//MIT License
//
//        Copyright (c) 2020 Saket Upadhyay
//
//        Permission is hereby granted, free of charge, to any person obtaining a copy
//        of this software and associated documentation files (the "Software"), to deal
//        in the Software without restriction, including without limitation the rights
//        to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//        copies of the Software, and to permit persons to whom the Software is
//        furnished to do so, subject to the following conditions:
//
//        The above copyright notice and this permission notice shall be included in all
//        copies or substantial portions of the Software.
//
//        THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//        IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//        FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//        AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//        LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//        OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//        SOFTWARE.

package com.x64m.xsfmnative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //JNI FUNCTIONS
    public native String jniMSG();
    public native String jniADD(String x,String y);
    public native String jniMUL(String x,String y);
    public native String jniDIV(String x,String y);
    public native String jniSUB(String x,String y);

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }


    String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText num1et=findViewById(R.id.num1textedit);
        final EditText num2et=findViewById(R.id.num2textedit);
        final RadioGroup radg=findViewById(R.id.radioGroup);
        final TextView answer=findViewById(R.id.answertextfield);
        final TextView msg=findViewById(R.id.msgtext);
        final Button TRIGGER=findViewById(R.id.button8);

        //SHOW BOTTOM INFO TEXT
        msg.setText(jniMSG());
        //ON BUTTON CLICK
        TRIGGER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans="";
                //GET RADIO BUTTON CHECK ID
                switch (radg.getCheckedRadioButtonId()){
                    case R.id.rbadd:
                        //CALL RESPECTIVE FUNCTION FROM native-lib
                        ans=jniADD(num1et.getText().toString(),num2et.getText().toString());
                        break;

                    case R.id.rbsub:
                        ans=jniSUB(num1et.getText().toString(),num2et.getText().toString());
                        break;

                    case R.id.rbmul:
                        ans=jniMUL(num1et.getText().toString(),num2et.getText().toString());
                        break;

                    case R.id.rbdiv:
                        ans=jniDIV(num1et.getText().toString(),num2et.getText().toString());
                        break;

                    default:
                        ans="INVALID OPERATION";
                }
                //PRINT RESULT FROM LIBRARY
                answer.clearComposingText();
                answer.setText(ans);
            }
        });





    }



}
