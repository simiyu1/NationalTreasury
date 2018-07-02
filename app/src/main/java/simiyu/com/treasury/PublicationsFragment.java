package simiyu.com.treasury;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class PublicationsFragment extends Fragment {


    public PublicationsFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_publications, container, false);

//        Button btn = (Button)view.findViewById(R.id.text1);
//        btn.setOnClickListener((View.OnClickListener) this);

        return view;
    }

//    public void onClick(View view){
//        Button b = (Button) view;
//        switch(b.getId()) {
//            case R.id.text1:
////                // Do something
////                Intent sectorIntent = new Intent(String.valueOf(Reports.class));
////                break;
////            case R.id.text2:
////                // Do something
////                break;
//    }

}
