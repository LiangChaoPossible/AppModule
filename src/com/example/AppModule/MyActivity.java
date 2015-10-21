package com.example.AppModule;

import com.example.libmodule.Hi;
import com.mathutil.Suber;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        Suber sub = new Suber();
        tv1.setText("sub values: " + sub.sub(10, 5) + "moning hi " + Hi.getHi());
    }
}
