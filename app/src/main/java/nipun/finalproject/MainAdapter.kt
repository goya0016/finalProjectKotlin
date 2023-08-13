package nipun.smit.finalproject

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nipun.smit.finalproject.databinding.DataRowBinding

class CustomViewHolderClass(val view: View, var login: String = "",
                            var user: Users? = null) // a single Users object from ResponseDataClass/Users classes
    : RecyclerView.ViewHolder(view){

    val binding = DataRowBinding.bind(view)

    companion object{
        val titleKey = "ACTIONBAR_TITLE"
        val objectKey = "ITEM_DATA"
    }
}

class MainAdapter(private val responseDataClass: ArrayList<Users>) :
    RecyclerView.Adapter<CustomViewHolderClass>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolderClass {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CustomViewHolderClass, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = responseDataClass.size
}