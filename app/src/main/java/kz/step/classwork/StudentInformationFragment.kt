package kz.step.classwork

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class StudentInformationFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view:View=LayoutInflater.from(context).inflate(R.layout.fragment_information_students,container,false);

        var imgAvatar=view.findViewById<ImageView>(R.id.imageView_fragment_students_avatar);
        var textFio=view.findViewById<TextView>(R.id.textView_fragment_students_fio);
        var textDetail=view.findViewById<TextView>(R.id.textView_fragment_students_details);
        return view;
    }
}