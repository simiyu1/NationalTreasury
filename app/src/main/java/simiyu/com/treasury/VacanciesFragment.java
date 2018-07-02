package simiyu.com.treasury;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class VacanciesFragment extends Fragment {

    private WebView web;

    public VacanciesFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_vacancies, container, false);

       WebView web = (WebView)view.findViewById(R.id.web);
       web.loadUrl("http://www.treasury.go.ke/vacancies1.html");
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
       return view;


    }

}
