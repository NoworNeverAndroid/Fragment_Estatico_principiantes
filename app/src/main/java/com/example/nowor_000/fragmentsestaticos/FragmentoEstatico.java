package com.example.nowor_000.fragmentsestaticos;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by nowor_000 on 12/01/2016.
 */

public class FragmentoEstatico extends Fragment {


    private final String LOG_TAG = "log_fragment";

    @Override
    public void onAttach(Context context) {//INVISIBLE
        super.onAttach(context);
    }

    @Override
    public void onCreate (Bundle savedInstanceState) {//INVISIBLE
        super.onCreate(savedInstanceState);
        Log.v(LOG_TAG, "onCreate");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {//INVISIBLE
        View rootView = inflater.inflate(R.layout.layout_fragment_estatico, container, false);
        Log.v(LOG_TAG, "onCreateView");

       final TextView tv1= (TextView) rootView.findViewById(R.id.tv_fragment);
		 Button btn1 = (Button) rootView.findViewById(R.id.btn1_fragment);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("ESTE ES TU NUEVO FRAGMENT ESTATICO");
            }
        });


        return rootView;
    }

    @Override
    public void onActivityCreated (Bundle savedInstanceState) {//INVISIBLE
        super.onActivityCreated(savedInstanceState);
        Log.v(LOG_TAG, "onActivityCreated");
    }

    @Override
    public void onViewStateRestored (Bundle savedInstanceState) {//INVISIBLE
        super.onViewStateRestored(savedInstanceState);//el estado guardado de la jerarquia de la vista ha sido restaurado.
        Log.v(LOG_TAG, "onViewStateRestored");
    }

    @Override
    public void onStart () {//VISIBLE -INACTIVO
        super.onStart();
        Log.v(LOG_TAG, "onStart");
    }

    @Override
    public void onResume () {//ACTIVO
        super.onResume();
        Log.v(LOG_TAG, "onResume");
    }

    @Override
    public void onPause () {//PARCIALMENTE VISIBLE - INACTIVO
        super.onPause();
        Log.v(LOG_TAG, "onPause");
    }

    @Override
    public void onStop () {//INVISIBLE
        super.onStop();
        Log.v(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroyView () {//INVISIBLE
        super.onDestroyView();
        Log.v(LOG_TAG, "onDestroyView");
    }

    @Override
    public void onDestroy () {//INVISIBLE
        super.onDestroy();
        Log.v(LOG_TAG, "onDestroy");
    }

    @Override
    public void onDetach () {//INVISIBLE
        super.onDetach();
        Log.v(LOG_TAG, "onDetach");
    }
}
