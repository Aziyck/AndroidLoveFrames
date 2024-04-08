package com.alexandru.loveframes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;

import com.alexandru.loveframes.appMenu.MenuGridItem;
import com.alexandru.loveframes.gallery.PremiumGalleryImageItem;
import com.alexandru.loveframes.gallery.SimpleGalleryImageItem;
import com.alexandru.loveframes.utils.Pair;
import com.alexandru.loveframes.utils.Quartet;
import com.alexandru.loveframes.utils.Unlock;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Pair<Integer, String>> menuItemsResources = Arrays.asList(
            new Pair<>(R.drawable.single_heart_frame, "Single Frames"),
            new Pair<>(R.drawable.double_heart_frame, "Double Frames"),
            new Pair<>(R.drawable.triple_heart_frame, "Triple Frames"),
            new Pair<>(R.drawable.collage, "Collage"),
            new Pair<>(R.drawable.photo_edit, "Photo Edit"),
            new Pair<>(R.drawable.add_text, "Add Text")
    );
    private final List<Quartet<Integer, Unlock, Integer, Integer>> galleryItemsResources = Arrays.asList(
            new Quartet<>(R.drawable.img_1, Unlock.PREMIUM, 2, 1),
            new Quartet<>(R.drawable.img_2, Unlock.FREE, 1, 1),
            new Quartet<>(R.drawable.img_3, Unlock.PREMIUM, 2, 1),
            new Quartet<>(R.drawable.img_4, Unlock.FREE, 1, 1),
            new Quartet<>(R.drawable.content_ad, Unlock.ADD, 1, 2),
            new Quartet<>(R.drawable.img_5, Unlock.PREMIUM, 2, 1),
            new Quartet<>(R.drawable.img_6, Unlock.FREE, 1, 1),
            new Quartet<>(R.drawable.img_7, Unlock.PREMIUM, 2, 1),
            new Quartet<>(R.drawable.img_8, Unlock.FREE, 1, 1),
            new Quartet<>(R.drawable.img_9, Unlock.FREE, 1, 2)
    );

    private GridLayout menuLayout;
    private GridLayout galleryLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuLayout = findViewById(R.id.apps);
        galleryLayout = findViewById(R.id.gallery);

        populateMenuLayout();
        populateGalleryLayout();
    }

    private void populateMenuLayout(){
        for (Pair<Integer, String> entry : menuItemsResources) {
            MenuGridItem item = new MenuGridItem(this);
            item.setImageResource(entry.getId());
            item.setText(entry.getName());

            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = GridLayout.LayoutParams.WRAP_CONTENT;
            layoutParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
            layoutParams.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
            layoutParams.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);

            menuLayout.addView(item, layoutParams);
        }
    }

    private void populateGalleryLayout(){
        for (Quartet<Integer, Unlock, Integer, Integer> entry : galleryItemsResources){
            switch (entry.getUnlock()){
                case FREE:
                case ADD: {
                    SimpleGalleryImageItem imgItem = new SimpleGalleryImageItem(this);
                    imgItem.setImageResource(entry.getId());

                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                    layoutParams.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, entry.getRowSpan());
                    layoutParams.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, entry.getColumnSpan());

                    galleryLayout.addView(imgItem, layoutParams);
                } break;
                case PREMIUM: {
                    PremiumGalleryImageItem imgItem = new PremiumGalleryImageItem(this);
                    imgItem.setImageResource(entry.getId());
                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                    layoutParams.rowSpec = GridLayout.spec(GridLayout.UNDEFINED, entry.getRowSpan());
                    layoutParams.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, entry.getColumnSpan());

                    galleryLayout.addView(imgItem, layoutParams);
                } break;
            }
        }
    }
}