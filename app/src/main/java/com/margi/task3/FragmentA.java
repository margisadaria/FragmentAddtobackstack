package com.margi.task3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class FragmentA extends Fragment
{
     Button button;
    FragmentB fragmentB;
    LinearLayout linearLayout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View  view=inflater.inflate(R.layout.afragment,container,false);
        button = (Button)view.findViewById(R.id.btn_go_a);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                 fragmentB = new FragmentB();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.linear_main,fragmentB);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        return view;
    }
}
