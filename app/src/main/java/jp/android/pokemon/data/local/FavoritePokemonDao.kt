package jp.android.pokemon.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import jp.android.pokemon.data.model.FavoritePokemon
import kotlinx.coroutines.flow.Flow
@Dao
interface FavoritePokemonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(favoritePokemon: FavoritePokemon)

    @Delete
    suspend fun delete(favoritePokemon: FavoritePokemon)

    @Query("SELECT * FROM favorite_pokemon")
    fun getAllFavorites(): Flow<List<FavoritePokemon>>
}