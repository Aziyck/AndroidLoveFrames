package com.alexandru.loveframes.appMenu;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.alexandru.loveframes.R;

public class MenuGridItem extends ConstraintLayout {

    private ImageView imageView;
    private TextView textView;

    public MenuGridItem(Context context) {
        super(context);
        init(context);
    }

    public MenuGridItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MenuGridItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.menu_item_layout, this);
        imageView = findViewById(R.id.image_view);
        textView = findViewById(R.id.text_view);
    }

    public void setImageResource(int resourceId) {
        if(imageView != null)
            imageView.setImageResource(resourceId);
    }

    public void setText(String text) {
        if(textView != null)
            textView.setText(text);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
