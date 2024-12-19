package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import kotlin.collections.mutableListOf

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        var toolbar = findViewById<Toolbar>(R.id.topAppBar)
        setSupportActionBar(toolbar)

        var cards = createCard()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu_card, menu)
        return true
    }
}

private fun createCard(): MutableList<Card> {

    val cards = (1..4).map {
        Card(
            headerTitle = "List item $it",
        )
    }.toMutableList()
    return cards
}

data class Card(
    val headerTitle: String
)