package com.example.valleyvittles.fragements;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.valleyvittles.R;
import com.example.valleyvittles.adapter.DashboardAdapter;
import com.example.valleyvittles.adapter.ItemAdapter;
import com.example.valleyvittles.models.ItemDetail;
import com.example.valleyvittles.models.ItemdashboardDetail;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DryFruitsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DryFruitsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DryFruitsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DryFruitsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DryFruitsFragment newInstance(String param1, String param2) {
        DryFruitsFragment fragment = new DryFruitsFragment();
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
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_dry_fruits, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.dryfruitrecy);

        // Initialize the list and add items to it
        ArrayList<ItemDetail> list = new ArrayList<>();
        list = new ArrayList<>();

        list.add(new ItemDetail("Almond" ,"500" , R.drawable.almond));
        list.add(new ItemDetail("Apricots" ,"500" , R.drawable.appricots));
        list.add(new ItemDetail("Mulberries white" ,"500" , R.drawable.mulbarries2));
        list.add(new ItemDetail("Mulberries black" ,"500" , R.drawable.mulbariies1));
        list.add(new ItemDetail("Walnuts" ,"500" , R.drawable.walnuts));
//        list.add(new ItemdashboardDetail("Almonds", "(badham)"));
//        list.add(new ItemdashboardDetail(" Dried Apricots", "(Phator)"));
//        list.add(new ItemdashboardDetail("Walnuts", "(khakai)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));
//        list.add(new ItemdashboardDetail("Dried Mulberries", "(maroch)"));


        // Pass the list to the DashboardAdapter constructor
//        DashboardAdapter dashboardAdapter = new DashboardAdapter(getContext(), list);
//
//        recyclerView.setAdapter(dashboardAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ItemAdapter itemAdapter = new ItemAdapter(getContext(),list);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}