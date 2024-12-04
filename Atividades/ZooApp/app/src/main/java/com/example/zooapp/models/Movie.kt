package com.example.zooapp.models

import com.example.zooapp.R

data class Movie (
    val id: Int,
    val title: String, // Alterado de "name" para "title"
    val genre: String, // Alterado de "species" para "genre"
    val imageRes: Int, // Imagem do filme (poster)
    val description: String, // Descrição do filme
    val trivia: String, // Alterado de "curiosities" para "trivia"
    var isFavorite: Boolean = false // Marcar como favorito
)

val movieList = listOf(
    Movie(
        id = 1,
        title = "Inception",
        genre = "Ficção Científica, Ação",
        imageRes = R.drawable.inception_poster, // Substitua com a imagem do filme
        description = "Um ladrão que rouba segredos corporativos usando tecnologia de compartilhamento de sonhos recebe a tarefa inversa de plantar uma ideia na mente de um CEO.",
        trivia = "Dirigido por Christopher Nolan.",
        isFavorite = false
    ),
    Movie(
        id = 2,
        title = "The Matrix",
        genre = "Ação, Ficção Científica",
        imageRes = R.drawable.matrix_poster, // Substitua com a imagem do filme
        description = "Um hacker de computador aprende com misteriosos rebeldes sobre a verdadeira natureza de sua realidade e seu papel na guerra contra seus controladores.",
        trivia = "O icônico código verde representa a 'Matrix'.",
        isFavorite = true
    ),
    Movie(
        id = 3,
        title = "The Dark Knight",
        genre = "Ação, Crime, Drama",
        imageRes = R.drawable.dark_knight_poster, // Substitua com a imagem do filme
        description = "Quando a ameaça conhecida como Coringa emerge de seu passado misterioso, ele causa caos e destruição nas pessoas de Gotham.",
        trivia = "Heath Ledger ganhou um Oscar por seu papel como o Coringa.",
        isFavorite = true
    ),
    Movie(
        id = 4,
        title = "Interstellar",
        genre = "Aventura, Drama, Ficção Científica",
        imageRes = R.drawable.interstellar_poster, // Substitua com a imagem do filme
        description = "Uma equipe de exploradores viaja por um buraco de minhoca no espaço na tentativa de garantir a sobrevivência da humanidade.",
        trivia = "O filme explora teorias reais em física e astrofísica.",
        isFavorite = false
    ),
    Movie(
        id = 5,
        title = "The Godfather",
        genre = "Crime, Drama",
        imageRes = R.drawable.godfather_poster, // Substitua com a imagem do filme
        description = "O patriarca envelhecido de uma dinastia do crime organizado transfere o controle de seu império clandestino para seu filho relutante.",
        trivia = "O icônico 'Vou fazer uma oferta que ele não poderá recusar.' de Marlon Brando.",
        isFavorite = true
    ),
    Movie(
        id = 6,
        title = "Fight Club",
        genre = "Drama",
        imageRes = R.drawable.fight_club_poster, // Substitua com a imagem do filme
        description = "Um trabalhador de escritório insone, procurando uma maneira de mudar sua vida, cruza o caminho com um vendedor de sabonetes.",
        trivia = "O filme foi adaptado do romance de Chuck Palahniuk.",
        isFavorite = false
    ),
    Movie(
        id = 7,
        title = "The Shawshank Redemption",
        genre = "Drama",
        imageRes = R.drawable.shawshank_poster, // Substitua com a imagem do filme
        description = "Dois homens presos criam um vínculo ao longo de vários anos, encontrando conforto e redenção através de atos de decência comum.",
        trivia = "O filme é consistentemente classificado entre os maiores filmes de todos os tempos.",
        isFavorite = true
    ),
    Movie(
        id = 8,
        title = "Pulp Fiction",
        genre = "Crime, Drama",
        imageRes = R.drawable.pulp_fiction_poster, // Substitua com a imagem do filme
        description = "As vidas de dois matadores da máfia, um boxeador, a esposa de um gangster e um casal de assaltantes de restaurante se entrelaçam em quatro contos de violência e redenção.",
        trivia = "Segundo filme de Quentin Tarantino, conhecido por sua narrativa não linear.",
        isFavorite = false
    ),
    Movie(
        id = 9,
        title = "Forrest Gump",
        genre = "Drama, Romance",
        imageRes = R.drawable.forrest_gump_poster, // Substitua com a imagem do filme
        description = "As presidências de Kennedy e Johnson, a Guerra do Vietnã, o movimento pelos direitos civis e outros eventos históricos são contados do ponto de vista de um homem extraordinário do Alabama.",
        trivia = "Tom Hanks ganhou um Oscar de Melhor Ator.",
        isFavorite = true
    ),
    Movie(
        id = 10,
        title = "Avatar",
        genre = "Ação, Aventura, Fantasia",
        imageRes = R.drawable.avatar_poster, // Substitua com a imagem do filme
        description = "Um fuzileiro paraplégico enviado para a lua Pandora em uma missão única fica dividido entre cumprir suas ordens e proteger o mundo que ele sente ser sua casa.",
        trivia = "O filme foi o de maior bilheteria de todos os tempos até Vingadores: Ultimato.",
        isFavorite = false
    )
)



