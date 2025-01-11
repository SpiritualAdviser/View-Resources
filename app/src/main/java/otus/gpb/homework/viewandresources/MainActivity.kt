package otus.gpb.homework.viewandresources

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.contacts_button).setOnClickListener {
            startActivity(Intent(this, ContactsActivity::class.java))
        }

        findViewById<Button>(R.id.cart_button).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }

        findViewById<Button>(R.id.signin_button).setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setView(R.layout.dialog_signin)
                .show()
        }

//        var textInputEditPassword= findViewById<TextInputEditText>(R.id.editTextPassword)

//        textInputEditTextPassword.transformationMethod = object : PasswordTransformationMethod() {
//            override fun getTransformation(
//                source: CharSequence?,
//                view: View?
//            ): CharSequence {
//                return PasswordCharSequence(super.getTransformation(source, view))
//            }
//
//            inner class PasswordCharSequence(private val source: CharSequence) : CharSequence {
//                override val length: Int get() = source.length
//
//                override fun get(index: Int): Char {
//                    //Only modify char '\u2022' if you want to keep the default behaviour
//                    return if(source[index] == '\u2022') '*' else source[index]
//                }
//
//                override fun subSequence(startIndex: Int, endIndex: Int): CharSequence {
//                    return source.subSequence(startIndex, endIndex)
//                }
//            }
//        }
    }
}