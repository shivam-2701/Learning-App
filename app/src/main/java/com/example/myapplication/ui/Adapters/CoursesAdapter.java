package com.example.myapplication.ui.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;





public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.CoursesViewHolder> {
    @NonNull
    @Override



    //TODO: Add a dummy Array for the adapter to use to put data into the card Elements
    public CoursesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem= R.layout.card_layout_courses;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem,parent,false);
        return new CoursesViewHolder(view);
    }

    //TODO: Finish the onBindViewHolder and getCount methods
    @Override
    public void onBindViewHolder(@NonNull CoursesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


//    ViewHolder class
    public class CoursesViewHolder extends RecyclerView.ViewHolder {
        public final TextView mCourseTextView;
        public final ImageView mCourseImageView;

//        Creating the ViewHolder for each card
        public CoursesViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mCourseTextView = (TextView) itemView.findViewById(R.id.course_title_tv);
            this.mCourseImageView=(ImageView) itemView.findViewById(R.id.course_image);
        }

    }
}
