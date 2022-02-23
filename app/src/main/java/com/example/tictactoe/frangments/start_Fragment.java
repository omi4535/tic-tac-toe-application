package com.example.tictactoe.frangments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tictactoe.R;


public class start_Fragment extends Fragment {
private Button btn_with_frd,btn_with_comp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_start_, container, false);
        btn_with_frd = view.findViewById(R.id.with_frd);
        btn_with_frd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.main_fragment,new game_Fragment());
                transaction.commit();
            }
        });
        return view;
    }
}