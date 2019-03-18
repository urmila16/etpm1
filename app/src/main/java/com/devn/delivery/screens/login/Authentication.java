package com.devn.delivery.screens.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.devn.delivery.R;
import com.devn.delivery.controller.SuperMessActivity;
import com.devn.delivery.devn_exceptions.DevNExcp;
import com.devn.delivery.devn_exceptions.DevNExcpTh;
import com.devn.delivery.screens.collection.OrderCollection;
import com.devn.delivery.screens.collection.OrderDistribution;
import com.devn.delivery.screens.delivery.CustomerDelivery;
import com.devn.delivery.screens.delivery.DistributionCollect;
import com.devn.delivery.screens.feedback.FeedbackScreen;
import com.devn.delivery.screens.feedback.FeedbackScreen;
import com.devn.delivery.screens.myprofile.MyProfile;
import com.devn.delivery.screens.returnprocess.ReturnDC;
import com.devn.delivery.screens.returnprocess.ReturnVender;

public class Authentication  extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_screen);

        button = (Button) findViewById(R.id.id_login_screen_login_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home ();
            }
        });
    }

    public void home(){
        Intent intent = new Intent(this,  OrderCollection.class);
        startActivity(intent);

    }

}
