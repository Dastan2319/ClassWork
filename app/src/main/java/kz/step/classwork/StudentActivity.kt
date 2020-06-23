package kz.step.classwork

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class StudentActivity:AppCompatActivity() {

    lateinit var fragmentManager: FragmentManager

    var currentFragment: Fragment?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        initFragmentManager();
        initDefaultFragment();
    }

    fun initFragmentManager(){
        fragmentManager=supportFragmentManager;

    }

    fun initDefaultFragment(){
        if(currentFragment==null){
            currentFragment=StudentFragment();

            fragmentManager.beginTransaction()
                .add(R.id.relativelayout_activity_students_fragment_contianer,currentFragment!!)
//                .addToBackStack(currentFragment)
                .commit();
            fragmentManager.popBackStack();
        }
    }

}