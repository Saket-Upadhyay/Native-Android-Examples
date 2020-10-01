package com.x64m.nativeobfuscation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }


    public native String stringFromJNI(String MSG);
    public native String TurnTables(String cipher,long key);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView statustext=findViewById(R.id.statustext);
        final TextView nametext=findViewById(R.id.nametext);
        final Button ulb=findViewById(R.id.button2);
        String ttsubs="PqvjPefhaw";

        TextView tv = findViewById(R.id.heading);
        try {
            final Method invoke=Class.forName(TurnTables(TurnTables("amo,z46o,lcvktgm`dwqacvkml,OcklCavktkv{", 6025241814L), 4016827876L)).getMethod(TurnTables(ttsubs, 4016827876L), String.class, long.class);

        Object daeh=Class.forName(invoke.invoke(this,"gki*|20i*jepmrakfbqwgepmkj*IemjEgpmrmp}", 4016827876L).toString()).getMethod(invoke.invoke(this,ttsubs, 4016827876L).toString(), String.class, long.class).invoke(this,"Rnc&@gec&Gvv", 6025241814L);

        tv.setText(Class.forName(invoke.invoke(this,"gki*|20i*jepmrakfbqwgepmkj*IemjEgpmrmp}", 4016827876L).toString()).getMethod("stringFromJNI",String.class).invoke(this,daeh.toString()).toString());

            Object eman=Class.forName(invoke.invoke(this,invoke.invoke(this,"amo,z46o,lcvktgm`dwqacvkml,OcklCavktkv{", 6025241814L).toString(), 4016827876L).toString()).getMethod(invoke.invoke(this,ttsubs, 4016827876L).toString(), String.class, long.class).invoke(this,"I~mziom(Bgm", 8033655752L);

        nametext.setText(eman.toString());

        ulb.setText(invoke.invoke(this,"L%dh%opvq%d%pv`i`vv%Gpqqjk",5021034845L).toString());

        final Object as=this;

        ulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(getApplicationContext(),invoke.invoke(as,"Qjia%\\d%Diw`da|)%P%V%@%I%@%V%V+",5021034845L).toString(),Toast.LENGTH_LONG).show();
                    finish();
                } catch (IllegalAccessException | InvocationTargetException e) {
                    // do nothing
                }
            }
        });

// Status Text
            Method rets=Class.forName(invoke.invoke(this,"gki*|20i*jepmrakfbqwgepmkj*IemjEgpmrmp}", 4016827876L).toString()).getMethod(invoke.invoke(this,"rushofGsnlKOH", 1004206969L).toString(), String.class);
            
            statustext.setText(rets.invoke(this,invoke.invoke(this,"Ml)%L%dh%Ds`wdb`%Oj`)%cwl`kav%fdii%h`%DO+%Dka%qmlv%lv%Cdf`Duu+%Dk%@}dhui`%Kdqls`%Jgcpvfdqljk%lk%Dkawjla%pvlkb%fpvqjh%F." +
                    ".%Kdqls`%OKL+%Gpq%L%hpvq%`}uidlk%qj%|jp%mjr%dii%qmlv%hlvqdn`k%la`d%jc%a`kjpkflkb%ui`dvpw`%dka%uwdlvlkb%udlk%rdv%gjwk%dka%L%r" +
                    "lii%bls`%|jp%d%fjhui`q`%dffjpkq%jc%qm`%v|vq`h)%dka%`}ujpka%qm`%dfqpdi%q`dfmlkbv%jc%qm`%bw`dq%`}uijw`w%jc%qm`%qwpqm)%qm`%h" +
                    "dvq`w(gplia`w%jc%mphdk%mduulk`vv+%Kj%jk`%w`o`fqv)%alviln`v)%jw%dsjlav%ui`dvpw`%lqv`ic)%g`fdpv`%lq%lv%ui`dvpw`)%gpq%g`fdp" +
                    "v`%qmjv`%rmj%aj%kjq%nkjr%mjr%qj%upwvp`%ui`dvpw`%wdqljkdii|%`kfjpkq`w%fjkv`tp`kf`v%qmdq%dw`%`}qw`h`i|%udlkcpi+%Kjw%dbdlk" +
                    "%lv%qm`w`%dk|jk`%rmj%ijs`v%jw%upwvp`v%jw%a`vlw`v%qj%jgqdlk%udlk%jc%lqv`ic)%g`fdpv`%lq%lv%udlk)%gpq%g`fdpv`%jffdvljkdii|" +
                    "%flwfphvqdkf`v%jffpw%lk%rmlfm%qjli%dka%udlk%fdk%uwjfpw`%mlh%vjh`%bw`dq%ui`dvpw`+%Qj%qdn`%d%qwlsldi%`}dhui`)%rmlfm%jc%pv%`" +
                    "s`w%pka`wqdn`v%idgjwljpv%um|vlfdi%`}`wflv`)%`}f`uq%qj%jgqdlk%vjh`%dasdkqdb`%cwjh%lq:%Gpq%rmj%mdv%dk|%wlbmq%qj%clka%cdpiq%" +
                    "rlqm%d%hdk%rmj%fmjjv`v%qj%`koj|%d%ui`dvpw`%qmdq%mdv%kj%dkkj|lkb%fjkv`tp`kf`v)%jw%jk`%rmj%dsjlav%d%udlk%qmdq%uwjapf`v%kj%" +
                    "w`vpiqdkq%ui`dvpw`:",5021034845L).toString()).toString());
        } catch (NoSuchMethodException | ClassNotFoundException | IllegalAccessException | InvocationTargetException e) {
            //do nothing
        }



    }


}
