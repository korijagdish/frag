package com.example.dell.frgement;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class Freg1 extends Fragment {

    Button bs;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        container = (ViewGroup) inflater.inflate( R.layout.fragment1, container, false );
        Toast.makeText( getActivity(), "Registration Start ", Toast.LENGTH_SHORT ).show();
        bs=(Button) container.findViewById( R.id.toastfragment );
        bs.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( getActivity(), " Successfully Submited data", Toast.LENGTH_SHORT ).show();
                Intent in =new Intent( getContext(),MainActivity.class );
                startActivity( in );
            }
        } );
        return container;
        }

}

