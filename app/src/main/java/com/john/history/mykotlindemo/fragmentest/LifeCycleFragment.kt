package com.john.history.mykotlindemo.fragmentest

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.john.history.mykotlindemo.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [LifeCycleFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [LifeCycleFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class LifeCycleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.d("FragmentLifeCycle","onCreate ")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("FragmentLifeCycle","onCreateView ")
        return inflater.inflate(R.layout.fragment_life_cycle, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FragmentLifeCycle","onAttach ")
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentLifeCycle","onPause ")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("FragmentLifeCycle","onViewCreated ")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("FragmentLifeCycle","onActivityCreated ")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FragmentLifeCycle","onStart ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentLifeCycle","onResume ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FragmentLifeCycle","onDestroyView ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentLifeCycle","onStop ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("FragmentLifeCycle","onViewStateRestored ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentLifeCycle","onDestroy ")
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
        Log.d("FragmentLifeCycle","onDetach ")
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LifeCycleFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LifeCycleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}