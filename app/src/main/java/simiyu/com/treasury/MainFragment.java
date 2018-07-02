package simiyu.com.treasury;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private WebView web;
    //private TextView txt;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        super.onCreate(savedInstanceState);
        View view =  inflater.inflate(R.layout.fragment_main, container, false);
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                final StringBuilder builder = new StringBuilder();
//
//                try {
//                    Document doc = Jsoup.connect("http://www.treasury.go.ke").get();
//                    String title = doc.title();
//                    Elements links = doc.select("a[href]");
//
//                    builder.append(title).append("\n");
//
//                    for (Element link : links)
//                        builder.append("\n").append("Link : ").append(link.attr("href")).append("\n").append("Text :").append(link.text());
//
//                } catch (IOException e) {
//                    builder.append("Error : ").append(e.getMessage()).append("\n");
//                }
//                run(new Runnable() {
//                    @Override
//                    public void run() {
//                        web.setText(builder.toString());
//                    }
//                });
//            }
//        }).start();
        WebView web = (WebView)view.findViewById(R.id.web);
        web.loadUrl("http://treasury.go.ke/");
//        web.setWebViewClient(new MyWebViewClient());
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view;
    }


}
