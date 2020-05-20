package com.example.kesturi;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewQna extends RecyclerView.Adapter<RecycleViewQna.ViewHolder> {

    private static final String TAG = "RecycleViewQna";

    private ArrayList<String> mQuestionText = new ArrayList<>();
    private ArrayList<String> mAnswerText = new ArrayList<>();
    private Context mContext;

    public RecycleViewQna(Context context, ArrayList<String> questionText, ArrayList<String> answerText) {
        mQuestionText = questionText;
        mAnswerText = answerText;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_qnalist, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder");

        holder.mQuestion.setText(mQuestionText.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, mQuestionText.get(position));
                Log.d(TAG, mAnswerText.get(position));
                Intent intent = new Intent(view.getContext(), AnswerActivity.class);
                intent.putExtra("question", mQuestionText.get(position));
                intent.putExtra("answer", mAnswerText.get(position));
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mQuestionText.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView mQuestion;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView){
            super(itemView);
            mQuestion = itemView.findViewById(R.id.question);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
