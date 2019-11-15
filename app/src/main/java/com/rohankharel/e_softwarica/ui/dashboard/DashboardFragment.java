package com.rohankharel.e_softwarica.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.rohankharel.e_softwarica.R;
import com.rohankharel.e_softwarica.model.StudentDetails;
import com.rohankharel.e_softwarica.ui.home.HomeFragment;

public class DashboardFragment extends Fragment implements View.OnClickListener  {

    private EditText etName, etAge, etAddress;
    private Button btnSave;
    private RadioGroup rdgGender;
    String name, age, gender, address;
    int imageId;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        etAddress = root.findViewById(R.id.etAddress);
        etName = root.findViewById(R.id.etName);
        etAge = root.findViewById(R.id.etAge);
        btnSave = root.findViewById(R.id.btnSave);
        rdgGender = root.findViewById(R.id.rdgGender);

        btnSave.setOnClickListener(this);
        return root;
    }



    @Override
    public void onClick(View v) {
        name = etName.getText().toString();
        age = etAge.getText().toString();
        address = etAddress.getText().toString();

        int selectedId = rdgGender.getCheckedRadioButtonId();
        if (selectedId == R.id.rdgMale) {
            gender = "Male";
            imageId = R.drawable.male;
        } else if (selectedId == R.id.rdgFemale) {
            gender = "Female";
            imageId = R.drawable.female;
        } else if (selectedId == R.id.rdgOthers) {
            gender = "Others";
            imageId = R.drawable.noimage;
        }

        HomeFragment.users.add(new StudentDetails(name,age,address,gender,imageId));

        Toast.makeText(getActivity(), "Student details inserted", Toast.LENGTH_SHORT).show();
    }
}

