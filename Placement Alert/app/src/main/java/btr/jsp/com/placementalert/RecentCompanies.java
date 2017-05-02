package btr.jsp.com.placementalert;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RecentCompanies.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RecentCompanies#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecentCompanies extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RecentCompanies() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecentCompanies.
     */
    // TODO: Rename and change types and number of parameters
    public static RecentCompanies newInstance(String param1, String param2) {
        RecentCompanies fragment = new RecentCompanies();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_recent_companies,container,false);
        ListView lv1;
        lv1=(ListView)v.findViewById(R.id.listView_recent_companies);
        ArrayList<String> recentCompanies = new ArrayList<>();
        ArrayAdapter<String> arrayAdapter;
        recentCompanies.add("HONEYWELL");
        recentCompanies.add("NOKIA");
        recentCompanies.add("INFOSYS");
        recentCompanies.add("CAPEGEMINI");
        recentCompanies.add("CDAC R&D");
        recentCompanies.add("GOOGLE");

        arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,recentCompanies);
        lv1.setAdapter(arrayAdapter);




        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
