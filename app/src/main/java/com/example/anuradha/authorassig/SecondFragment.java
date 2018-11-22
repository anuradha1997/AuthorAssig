package com.example.anuradha.authorassig;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    TextView t1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_second, container, false);
        t1= (TextView) v.findViewById(R.id.tv);
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction() ;
        Bundle b=getArguments();
        String data=b.getString("name_key");
        t1.setText(data);
        return  v;

    }

}
