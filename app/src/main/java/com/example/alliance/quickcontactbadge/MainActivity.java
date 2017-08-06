package com.example.alliance.quickcontactbadge;

import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView emailtxt;
    TextView phntxt;

    QuickContactBadge email;
    QuickContactBadge phn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailtxt = (TextView)findViewById(R.id.textViewEmail);
        phntxt = (TextView)findViewById(R.id.textViewPhn);

        email = (QuickContactBadge)findViewById(R.id.quickContactBadgeEmail);
        phn = (QuickContactBadge)findViewById(R.id.quickContactBadgePhn);

        //assign the contact badge  to email  badge

        email.assignContactFromEmail("mb.billah8@gmail.com",true);
        email.setMode(ContactsContract.QuickContact.MODE_MEDIUM);

        //assign the contac badge to phn badge

        phn.assignContactFromPhone("+8801930168088", true);
        phn.setMode(ContactsContract.QuickContact.MODE_SMALL);





    }
}
