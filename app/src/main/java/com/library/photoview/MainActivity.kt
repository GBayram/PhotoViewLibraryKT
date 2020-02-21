package com.library.photoview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import com.github.chrisbanes.photoview.PhotoView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var imageView : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        imageView.setOnClickListener(this)
    }


    override fun onClick(v: View?) {

        if(v?.id == imageView.id){
            var mBuilder = AlertDialog.Builder(this)
            var mView = layoutInflater.inflate(R.layout.custom_dialog_layout,null)
            var photoView = mView.findViewById<PhotoView>(R.id.photoLibImageView)
            photoView.setImageResource(R.drawable.flower)
            mBuilder.setView(mView)
            var mDialog = mBuilder.create()
            mDialog.show()
        }
    }
}
