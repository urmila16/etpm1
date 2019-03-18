package com.devn.delivery.screens.returnprocess;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;

import com.devn.delivery.R;
import com.devn.delivery.controller.SuperMessActivity;
import com.devn.delivery.devn_exceptions.DevNExcp;
import com.devn.delivery.devn_exceptions.DevNExcpTh;

public class ReturnDC extends SuperMessActivity {
    private Context mContext;
    @Override
    protected View onDevNCreate(Bundle savedInstanceState) {
        final View rootView = getView(R.layout.activity_return_dc);
        final RecyclerView returndc = rootView.findViewById(R.id.returndc);
        returndc.setLayoutManager(new LinearLayoutManager(this));
        String[] order = {"DC#123", "DC#134", "DC#1323", "DC#12343"};
        returndc.setAdapter(new ReturndcAdapter(order, this));
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        rootView.setLayoutParams(params);
        return rootView;
    }
    @Override
    protected String actionbarTitle() throws DevNExcp, DevNExcpTh {
        return "Return to DC";
    }

    @Override
    protected void onDevNReady(View contentView) throws DevNExcp, DevNExcpTh {

    }

    @Override
    protected String TAG() {
        return getClass().getName();
    }
}
