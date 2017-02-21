package com.example.android.miwok.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;

import java.util.ArrayList;

/**
 * Created by Darknight on 21-02-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorBackground;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorBackground) {
        super(context, 0, words);
        mColorBackground = colorBackground;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if view is reused ,otherwise inflate new view
        View listview = convertView;
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokWord = (TextView) listview.findViewById(R.id.miwok_text_view);

        miwokWord.setText(currentWord.getEnglishTranslation());

        TextView defalutWord = (TextView) listview.findViewById(R.id.default_text_view);

        defalutWord.setText(currentWord.getMiwokTranslation());
        View lineatView = listview.findViewById(R.id.linearView);
        int color = ContextCompat.getColor(getContext(),mColorBackground);
        lineatView.setBackgroundColor(color);
        ImageView imageView = (ImageView) listview.findViewById(R.id.image);
        if (currentWord.hasImage()) {

            imageView.setImageResource(currentWord.getImage());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);
        return listview;
    }


}

