package com.example.dell.frgement;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.fremt1);
        Button bt=(Button)findViewById( R.id.toastfragment12 );
        bt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager ms=getSupportFragmentManager();
                FragmentTransaction tm=ms.beginTransaction();
                Freg1 fragment1=new Freg1();
                tm.add( R.id.fre_fragement,fragment1 );
                tm.commit();
            }
        } );

    }
}
