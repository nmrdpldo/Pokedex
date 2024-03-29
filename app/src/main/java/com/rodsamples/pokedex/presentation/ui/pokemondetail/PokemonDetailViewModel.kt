package com.rodsamples.pokedex.presentation.ui.pokemondetail

import androidx.lifecycle.ViewModel
import com.rodsamples.pokedex.data.remote.responses.Pokemon
import com.rodsamples.pokedex.di.repository.PokemonRepository
import com.rodsamples.pokedex.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val pokemonRepository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName : String) : Resource<Pokemon> {
        return pokemonRepository.getPokemonInfo(pokemonName)
    }
}
