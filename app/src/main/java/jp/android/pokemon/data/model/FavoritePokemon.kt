package jp.android.pokemon.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_pokemon")
data class FavoritePokemon (
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    val name: String,
    val imageUrl: String
)