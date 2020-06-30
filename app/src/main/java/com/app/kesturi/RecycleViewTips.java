package com.app.kesturi;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecycleViewTips extends RecyclerView.Adapter<RecycleViewTips.ViewHolder> {

    private static final String TAG = "RecycleViewQna";

    private ArrayList<String> mImage = new ArrayList<>();
    private Context mContext;

    public RecycleViewTips(Context context, ArrayList<String> imageUrls) {
        mImage = imageUrls;
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_tipslist, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder");
        Log.d(TAG, mImage.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.mImageGo);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, mImage.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImage.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageGo;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView){
            super(itemView);
            mImageGo = itemView.findViewById(R.id.image);
            parentLayout = itemView.findViewById(R.id.parent_tips);
        }
    }
}
