package com.example.nighteventsapp.models;

import androidx.compose.runtime.mutableStateOf;
import com.example.nighteventsapp.R;

val eventList = listOf(
    Event(
        id = 1,
        title = "Noite Cultural",
        description = "Uma celebração da arte e cultura local.",
        date = "2025-01-20",
        location = "Teatro Municipal",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 2,
        title = "Expo Tecnologia 2024",
        description = "Descubra as inovações tecnológicas mais recentes.",
        date = "2024-12-20",
        location = "Centro de Convenções",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.mipmap.tecnology_icon_foreground
    ),
    Event(
        id = 3,
        title = "Torneio de Luta 2024",
        description = "Competição de boxe e artes marciais.",
        date = "2025-02-20",
        location = "Ginásio Municipal",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.boxing
    ),
    Event(
        id = 204,
        title = "Feira Culinária 2024",
        description = "Sabores incríveis e pratos típicos para explorar.",
        date = "2024-12-05",
        location = "Praça Central",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),

    Event(
        id = 5,
        title = "Maratona Gamer 2024",
        description = "Desafios e competições entre gamers.",
        date = "2024-12-22",
        location = "Game Arena",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),

);
