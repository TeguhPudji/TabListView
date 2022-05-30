package com.example.tablistview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */

public class FragmentOne extends Fragment {
    public FragmentOne() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        ListView listview = rootView.findViewById(R.id.list);

        final String[] items = new String[]
                {"Facebook", "Twitter", "Instagram",
                        "WhatsApp", "LINE", "KakaoTalk", "Telegram", "Messenger",
                        "YouTube", "TikTok", "SnapChat", "Vine", "Vimeo",
                        "Figma", "Adobe XD", "Sketch", "Framer",
                        "Android", "iOS", "Windows",
                        "Opera", "Mozilla", "Chrome",
                        "Paypal", "Mastercard", "Visa",
                        "Bitcoin", "Ethereum"
                };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                items);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(getActivity().getApplicationContext(), items[i], Toast.LENGTH_SHORT).show());
        return rootView;
    }
}