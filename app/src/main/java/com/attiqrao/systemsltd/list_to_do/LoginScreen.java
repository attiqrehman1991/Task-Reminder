package com.attiqrao.systemsltd.list_to_do;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.TextView;


public class LoginScreen extends AppCompatActivity {
    //SmartFacebookResult smartFacebookResult;
    TextView loginResult;
    CheckBox customLogin, facebookLogin, googleLogin, appLogoCheckBox;
    //GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }
}