package co.id.naufalnibros.arprojectastronot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DisclaimerFragment : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_disclaimer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isCancelable = false
        view.findViewById<Toolbar>(R.id.toolbar).setNavigationOnClickListener { dismiss() }
        view.findViewById<AppCompatButton>(R.id.action).setOnClickListener { dismiss() }
    }
}