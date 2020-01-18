package com.john.history.mykotlindemo.share

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.Person
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import com.john.history.mykotlindemo.R
import kotlinx.android.synthetic.main.activity_share.*
import java.util.*

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)


        buttonShare.setOnClickListener {
            val sendintent=Intent(android.content.Intent.ACTION_SEND)
            sendintent.setType("text/plain")
            sendintent.putExtra(android.content.Intent.EXTRA_TEXT, tvSend.getText().toString())
            sendintent.putExtra(Intent.EXTRA_TITLE, "发送Plain")
            startActivity(Intent.createChooser(sendintent, null))
        }

        buttonOther.setOnClickListener {
            val sendintent=Intent(android.content.Intent.ACTION_SEND)
            sendintent.setType("text/rtf")
            sendintent.putExtra(android.content.Intent.EXTRA_TEXT, tvSend.getText().toString())
            sendintent.putExtra(Intent.EXTRA_TITLE, "发送rtf")
            startActivity(Intent.createChooser(sendintent, null))
        }
        createDynamicShortcuts()
        createOther()
    }

    fun createDynamicShortcuts(){
        var shortcuts = ArrayList<ShortcutInfoCompat>()
        var shortcuts1= mutableListOf<ShortcutInfoCompat>()
        // Item that will be sent if the shortcut is opened as a static launcher shortcut
        val staticLauncherShortcutIntent = Intent(Intent.ACTION_DEFAULT)
        // Category that our sharing shortcuts will be assigned to
        var contactCategories: MutableSet<String> = HashSet()
        contactCategories.add("com.john.history.mykotlindemo.share.category.TEXT_SHARE_TARGET")

        for (i in 0..1){
            shortcuts1.add(ShortcutInfoCompat.Builder(this,i.toString())
                .setShortLabel("plain"+i.toString())
                .setIntent(staticLauncherShortcutIntent)
                .setLongLived()
                .setCategories(contactCategories)
                .setPerson(
                    Person.Builder()
                    .setName("papa")
                    .build())
                .build()
            )
        }
        ShortcutManagerCompat.addDynamicShortcuts(this,shortcuts1)
    }

    fun createOther(){
        var shortcuts= mutableListOf<ShortcutInfoCompat>()
        // Item that will be sent if the shortcut is opened as a static launcher shortcut
        val staticLauncherShortcutIntent = Intent(Intent.ACTION_DEFAULT)
        // Category that our sharing shortcuts will be assigned to
        var contactCategories: MutableSet<String> = HashSet()
        contactCategories.add("com.john.history.mykotlindemo.share.category.TEXT_SHARE_TARGET")

        for (i in 0..1){
            shortcuts.add(ShortcutInfoCompat.Builder(this,i.toString())
                .setShortLabel("rtf"+i.toString())
                .setIntent(staticLauncherShortcutIntent)
                .setLongLived()
                .setCategories(contactCategories)
                .setPerson(
                    Person.Builder()
                        .setName("papa")
                        .build())
                .build()
            )
        }
        ShortcutManagerCompat.addDynamicShortcuts(this,shortcuts)
    }
}
