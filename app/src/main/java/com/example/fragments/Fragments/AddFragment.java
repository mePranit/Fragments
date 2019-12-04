package com.example.fragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment implements View.OnClickListener{

    EditText txtFirst,txtSecond;
    Button btnAdd;

    public AddFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add, container, false);
        txtFirst=view.findViewById(R.id.txtFirst);
        txtSecond=view.findViewById(R.id.txtSecond);
        btnAdd=view.findViewById(R.id.btnSum);

        btnAdd.setOnClickListener(this);
        return view;

           }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(txtFirst.getText().toString());
        int second=Integer.parseInt(txtSecond.getText().toString());

        Toast.makeText(getActivity(), "Sum is"+first+second, Toast.LENGTH_SHORT).show();

    }
}
