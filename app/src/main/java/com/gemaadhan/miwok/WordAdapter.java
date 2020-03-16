package com.gemaadhan.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> Words, int colorResourceId) {
        super(context, 0, Words);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.framework_layout, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwoktextview);
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishtextview);
        englishTextView.setText(currentWord.getmDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.gambar);

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageRId());
        }
        else{
            imageView.setVisibility(View.GONE);
        }




        View textContainer = (View) listItemView.findViewById(R.id.linear);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
