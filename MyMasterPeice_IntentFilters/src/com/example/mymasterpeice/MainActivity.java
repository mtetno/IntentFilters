package com.example.mymasterpeice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 
 * @author Monika L
 * 
 * 
 *         Shows Demo For All Examples in Android
 * 
 *         1. IntentFilters Demo
 * 
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.intentFilterDemo:
            Intent receiverIntentOFOtherApp = new Intent(
                    "com.mtetno.mymasterpeice.VIEW_RECEIVER");
          
            startActivity(receiverIntentOFOtherApp);
            break;

        default:
            break;
        }
    }

}
