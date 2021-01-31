package com.example.new_recycler_view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.ViewHolder> {

    private List<Book> bookList;
    private Context context;

    public BookListAdapter(List<Book> bookList, Context context) {
        this.bookList = bookList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView title, desc, price, like, website;

        public ViewHolder(View view) {
            super(view);

            photo =view.findViewById(R.id.photo);
            title =view.findViewById(R.id.title);
            desc =view.findViewById(R.id.desc);
            price =view.findViewById(R.id.price);
            like =view.findViewById(R.id.like);
            website =view.findViewById(R.id.website);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_main, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int position) {
        Book item = bookList.get(position);

        viewHolder.photo.setImageResource(item.getPhoto());
        viewHolder.title.setText(item.getTitle());
        viewHolder.desc.setText("Type: "+ item.getDesc());
        viewHolder.price.setText("Avg Price: "+item.getPrice());
        viewHolder.like.setText(item.getLike() + " Likes");
        viewHolder.website.setText(item.getWebsite());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}