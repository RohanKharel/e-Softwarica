package com.rohankharel.e_softwarica.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rohankharel.e_softwarica.R;
import com.rohankharel.e_softwarica.model.StudentDetails;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddStudentAdapter extends RecyclerView.Adapter<AddStudentAdapter.UserViewHolder>{

    Context context;
    List<StudentDetails> studentDetails;

    public AddStudentAdapter(Context context, List<StudentDetails> studentDetails) {
        this.context = context;
        this.studentDetails = studentDetails;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_students, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, final int position) {
        final StudentDetails userInfo = studentDetails.get(position);
        holder.imgCircle.setImageResource(userInfo.getImageId());
        holder.txtName.setText(userInfo.getName());
        holder.txtAge.setText(userInfo.getAge());
        holder.txtAddress.setText(userInfo.getAddress());
        holder.txtGender.setText(userInfo.getGender());

        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentDetails.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentDetails.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imgCircle;
        TextView txtName, txtAge, txtAddress, txtGender;
        ImageButton btnDelete;


        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCircle = itemView.findViewById(R.id.imageView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAge = itemView.findViewById(R.id.txtAge);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            txtGender = itemView.findViewById(R.id.txtGender);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}


