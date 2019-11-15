package com.rohankharel.e_softwarica.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rohankharel.e_softwarica.R;
import com.rohankharel.e_softwarica.adapter.AddStudentAdapter;
import com.rohankharel.e_softwarica.model.StudentDetails;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    public static List<StudentDetails> users = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recycleView);

        if (users.size()==0) {

            users.add(new StudentDetails("Rohan Kharel", "21", "Jhapa", "Male", R.drawable.male));
            users.add(new StudentDetails("Roshni Rai", "21", "Jhapa", "Female", R.drawable.female));
        }
            AddStudentAdapter addStudentAdapter = new AddStudentAdapter(getActivity(), users);
            recyclerView.setAdapter(addStudentAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return root;
    }
}