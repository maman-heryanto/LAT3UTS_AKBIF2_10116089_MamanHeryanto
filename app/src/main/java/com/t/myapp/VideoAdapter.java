package com.t.myapp;

/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    private ProgressDialog progressDialog;
    List<YouTubeVideos> youtubeVideoList;

    public VideoAdapter() {

    }

    public VideoAdapter(List<YouTubeVideos> youtubeVideoList) {
        this.youtubeVideoList = youtubeVideoList;
    }
    
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( parent.getContext()).inflate(R.layout.video_view, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.videoWeb.loadData( youtubeVideoList.get(position).getVideoUrl(), "text/html" , "utf-8" );
    }

    @Override
    public int getItemCount() {
        return youtubeVideoList.size();
    }


    public class VideoViewHolder extends RecyclerView.ViewHolder{

        WebView videoWeb;

        public VideoViewHolder(View itemView) {
            super(itemView);

            videoWeb = (WebView) itemView.findViewById(R.id.videoWebView);

            videoWeb.getSettings().setJavaScriptEnabled(true);
            videoWeb.setWebChromeClient(new WebChromeClient() {
            } );

        }

    }

}
