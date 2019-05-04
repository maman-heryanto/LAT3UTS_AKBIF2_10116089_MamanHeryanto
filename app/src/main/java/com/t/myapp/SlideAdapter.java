package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    public String[] lst_slide = {
            "Walktrought \nSlide \n◕ - ○ - ○",
            "Walktrought \nSlide \n○ - ◕ - ○",
            "Walktrought \nSlide \n○ - ○ - ◕"
    };

    public int[] lst_images = {
            R.drawable.welcome,
            R.drawable.boxcheck,
            R.drawable.image_3
    };

    public String[] lst_title = {
            "WELCOME",
            "PURPOSE",
            "APLIKASI"
    };

    // list of descriptions
    public String[] lst_description = {
            "Selamat Datang di Aplikasi ini semoga bisa membantu anda",
            "Aplikasi ini dibuat dalam rangka memenuhi Tugas kuliah UTS AKB-2",
            "Di dalam Aplikasi ini terdapat data pribadi milik Maman Heryanto "
    };


    // list of background colors
    public int[]  lst_backgroundcolor = {
            Color.rgb(55,55,55),
            Color.rgb(55,85,85),
            Color.rgb(55,55,55)
    };



    public SlideAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.slide,container,false);

        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txtslide= (TextView) view.findViewById(R.id.txtslide);
        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);

        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        txtslide.setText(lst_slide[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);



        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

}
