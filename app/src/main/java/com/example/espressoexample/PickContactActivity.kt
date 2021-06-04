package com.example.espressoexample

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.os.PersistableBundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher

class PickContactActivity : AppCompatActivity() {

    val PICK_REQUEST = 101
    private lateinit var contact: Uri
    private lateinit var selectContactButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_contact)

        selectContactButton = findViewById(R.id.btn_select_contact) // присоединяем к вью


    }

    fun pickContact(v: View) {
        val i = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI) // неянвный
        // интент в контакты телефона
        startActivityForResult(i, PICK_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_REQUEST) {
            if(resultCode == Activity.RESULT_OK) {
                if (data != null) {
                    contact = data.data!! // берем данные из контактов
                }
                selectContactButton.isEnabled = true
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putParcelable("contact", contact) // сохраняем данные от изменений а активити
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) { // восстанавливаем
        // состояние во время изменений в активити
        super.onRestoreInstanceState(savedInstanceState)
        contact = savedInstanceState.getParcelable<Parcelable>("contact") as Uri // парсируем
        // данные по ключу
        selectContactButton.isEnabled = true

    }






}