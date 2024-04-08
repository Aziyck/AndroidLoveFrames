package com.alexandru.loveframes.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.alexandru.loveframes.R;

public class PremiumGalleryImageItem extends RelativeLayout implements GalleryImageItem{

    protected ImageView imageView;
    public PremiumGalleryImageItem(Context context) {
        super(context);
        init(context);
    }

    public PremiumGalleryImageItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PremiumGalleryImageItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        inflate(context, R.layout.premium_image_item, this);
        imageView = findViewById(R.id.image_view);
    }


    @Override
    public void setImageResource(int resourceId) {
        if(imageView != null)
            imageView.setImageResource(resourceId);
    }
}
