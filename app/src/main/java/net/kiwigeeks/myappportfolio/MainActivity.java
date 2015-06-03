package net.kiwigeeks.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private String appName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the button is clicked and displays a toast.
     */

    public void displayToast(View view) {

        appName = (String) view.getTag();
        Toast.makeText(getApplicationContext(), "This button will launch my " + appName + " app",
                Toast.LENGTH_LONG).show();

    }

}