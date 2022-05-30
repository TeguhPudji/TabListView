package com.example.tablistview;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */

public class FragmentTwo extends Fragment {
    public FragmentTwo() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        ListView listview = rootView.findViewById(R.id.list2);

        final String[] items = new String[]
                {"Alert","Toast"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getActivity().getApplicationContext(), items[i], Toast.LENGTH_SHORT).show());
        return rootView;
    }
}