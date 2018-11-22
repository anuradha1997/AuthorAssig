package com.example.anuradha.authorassig;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment  {
    ListView list;
    String data[]={"Premcandra","kalidas","mahatma gandhi","tulsidas"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_first, container, false);
        list= (ListView) v.findViewById(R.id.lis);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);

        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
