package com.example.midul.test_recy_contacts4;

//import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.zip.Inflater;

/**
 * Created by Midul on 8/8/2017.
 */

public class Tab1 extends Fragment {

    ImageButton b1,b2,b3,b4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab1,container,false);



    }

}

