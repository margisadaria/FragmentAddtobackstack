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

public class FragmentB extends Fragment
{
    LinearLayout linearLayout;
    Fragmentc fragmentc;
    Button button,button1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_fragment_b,container,false);

        button = (Button)view.findViewById(R.id.btn_go_c);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                fragmentc = new Fragmentc();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.linear_main,fragmentc);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        button1 = (Button)view.findViewById(R.id.btn_go_per);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }

    }

