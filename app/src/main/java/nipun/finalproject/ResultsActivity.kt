package nipun.smit.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nipun.smit.finalproject.databinding.ActivityResultsBinding

class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_results)

        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        @Suppress("UNCHECKED_CAST") val data = intent.getSerializableExtra(getString(R.string.user_data_key)) as ArrayList<Users>

        supportActionBar?.title = "${data.size} Results"



    }
}