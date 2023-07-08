package com.example.ejercicio5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import com.example.ejercicio5.databinding.FragmentListBinding;

import java.util.ArrayList;
import java.util.List;

import com.example.ejercicio5.databinding.FragmentListBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentList extends Fragment {
    FragmentListBinding binding;
    List<String> data = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentList() {
        // Required empty public constructor
    }


    public static FragmentList newInstance(String param1, String param2) {
        FragmentList fragment = new FragmentList();
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
    public void intListener() {
        binding.floatingActionButton.setOnClickListener(v -> {
            data.add("Word " + data.size());
            //setData();
            binding.RecyclerView.getAdapter().notifyItemInserted(data.size());
        });

        setData();
    }


        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(getActivity().getLayoutInflater());



        return binding.getRoot();
    }
    public List<String> getData(){
        List<String> data = new ArrayList<>();
        for(int i=0; i<20; i++){
            data.add("word "+ i);
        }
        return data;
    }

    public void setData(){
        AdapterWords adapter = new AdapterWords();
        adapter.setData(getData());
        binding.RecyclerView.setAdapter(adapter);
    }
}


