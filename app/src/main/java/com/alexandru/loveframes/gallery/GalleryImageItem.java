package com.alexandru.loveframes.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public abstract class GalleryImageItem extends RelativeLayout{
    protected ImageView imageView;

    public GalleryImageItem(Context context) {
        super(context);
    }

    public GalleryImageItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GalleryImageItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

     public void setImageResource(int resourceId) {
        if(imageView != null)
            imageView.setImageResource(resourceId);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

}
