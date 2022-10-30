package com.example.tasty_toast;

import androidx.appcompat.app.AppCompatActivity;
import com.sdsmdg.tastytoast.TastyToast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TastyToast.makeText(
                getApplicationContext(),
                "Success message !",
                TastyToast.LENGTH_LONG,
                TastyToast.SUCCESS
        );
    }
}