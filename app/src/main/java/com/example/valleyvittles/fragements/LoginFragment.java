package com.example.valleyvittles.fragements;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.valleyvittles.R;
import com.example.valleyvittles.ui.DashboardActivity;
import com.example.valleyvittles.ui.ProfileActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentdfg

        View view  = inflater.inflate(R.layout.fragment_login,container,false);

        Button btnLogin = view.findViewById(R.id.btnLogin);
     LinearLayout btnGoogle = view.findViewById(R.id.btnGoogle);
        TextView btnForgetPassword = view.findViewById(R.id.btnForgetPassword);


        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click event here

                // Inflate the detail_activity.xml layout
                View detailView = inflater.inflate(R.layout.detail_activity, null, false);

                // Now you can show the inflated layout in a dialog or another container
                // For example, you can use AlertDialog to show it as a dialog:
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(detailView);
                builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Handle the submit button click here to process the user input
                        // For example, get references to the input fields in detailView
                        // using findViewById and handle the user input.
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Handle the cancel button click here if needed
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


        btnLogin.setOnClickListener(view12 -> Toast.makeText(getContext(), "Click successfully", Toast.LENGTH_SHORT).show());

        btnForgetPassword.setOnClickListener(view1 -> {
            Toast.makeText(getContext(), "Password changed Successfully", Toast.LENGTH_SHORT).show();

        });





        return  view;
    }
}