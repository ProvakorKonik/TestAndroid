package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Level_C_Holder> {
    private Context mContext;
    private List<Model> mData;
    private RecylerviewClickInterface recylerviewClickInterface;
    public Adapter(Context mContext, List<Model> mData, RecylerviewClickInterface recylerviewClickInterface) {
        this.mContext = mContext;
        this.mData = mData;
        this.recylerviewClickInterface = recylerviewClickInterface;
    }

    @NonNull
    @Override
    public Level_C_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_level_c_item,parent,false); //connecting to cardview
        return new Level_C_Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Level_C_Holder holder, int position) {
        String dPhotoURL = mData.get(position).getPhotoUrl();
        Picasso.get().load(dPhotoURL).into(holder.mL3ItemImageView);
        holder.mL3ItemTitleText.setText(mData.get(position).getText());
        holder.mL3ItemBioText.setText(mData.get(position).getVideofeed());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    class Level_C_Holder extends RecyclerView.ViewHolder {

        ImageView mL3ItemImageView;
        TextView mL3ItemTitleText;
        TextView mL3ItemBioText;

        public Level_C_Holder(@NonNull View itemView) {
            super(itemView);

            mL3ItemImageView = (ImageView) itemView.findViewById(R.id.item_level_c_img_id);
            mL3ItemTitleText = (TextView)itemView.findViewById(R.id.item_level_c_title_id);
            mL3ItemBioText = (TextView)itemView.findViewById(R.id.item_level_c_bio);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recylerviewClickInterface .onItemClick(getAdapterPosition());
                }
            });
            /*mCategoryBtn = (Button) itemView.findViewById(R.id.card_category_btn);

            mCategoryBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int postion = getAdapterPosition();
                    if (postion != RecyclerView.NO_POSITION && listener1 != null) {
                        listener1.onItemClick(getSnapshots().getSnapshot(postion), postion);

                    }
                }
            });*/
        }
    }


}
