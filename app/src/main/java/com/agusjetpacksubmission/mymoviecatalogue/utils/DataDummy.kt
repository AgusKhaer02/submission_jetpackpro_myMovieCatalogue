package com.agusjetpacksubmission.mymoviecatalogue.utils

import com.agusjetpacksubmission.mymoviecatalogue.entities.MovieEntity
import com.agusjetpacksubmission.mymoviecatalogue.entities.TvShowEntity

object DataDummy {

//  MOVIES DUMMY
//  25 MOVIES
    fun generateDummyMovies() : List<MovieEntity>{
        val movies = ArrayList<MovieEntity>()

//      the midnight sky
        movies.add(
                MovieEntity(
                        1,
                        "https://upload.wikimedia.org/wikipedia/en/3/35/The_Midnight_Sky_poster.png",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )

//      venom
        movies.add(
                MovieEntity(
                        2,
                        "https://upload.wikimedia.org/wikipedia/en/thumb/1/18/Venom_%282018_film_poster%29.png/220px-Venom_%282018_film_poster%29.png",
                        "Venom",
                        "Action/Sci-fi",
                        "October 3, 2018",
                        4.5,
                        400,
                        91,
                        "Ruben Fleischer",
                        "Journalist Eddie Brock is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. While investigating one of Drake's experiments, Eddie's body merges with the alien Venom -- leaving him with superhuman strength and power. Twisted, dark and fueled by rage, Venom tries to control the new and dangerous abilities that Eddie finds so intoxicating.",
                        "13+"
                )
        )

//      extraction
        movies.add(
                MovieEntity(
                        3,
                        "https://1.bp.blogspot.com/-YHTkZsfie68/XqgqW1l-QJI/AAAAAAAAAQo/QKmH5SpABKQdyKvsEM5P-nBTCjxGRKAZACLcBGAsYHQ/w680/Webp.net-compress-image%2B%25283%2529.jpg",
                        "Extraction",
                        "Action/Thriller",
                        "April 24, 2020",
                        4.3,
                        100,
                        91,
                        "Sam Hargrave",
                        "A black-market mercenary who has nothing to lose is hired to rescue the kidnapped son of an imprisoned international crime lord. But in the murky underworld of weapons dealers and drug traffickers, an already deadly mission approaches the impossible.",
                        "18+"
                )
        )

//      bright
        movies.add(
                MovieEntity(
                        4,
                        "https://cps-static.rovicorp.com/2/Open/Netflix_2588/Program/29335018/_derived_jpg_q90_500x500_m0/Bright_VR.jpg",
                        "Bright",
                        "Action/Fantasy",
                        "December 13, 2017",
                        4.4,
                        200,
                        90,
                        "David Ayer",
                        "In an alternate present day, humans, orcs, elves and fairies have been coexisting since the beginning of time. Two police officers, one a human, the other an orc, embark on a routine night patrol that will alter the future of their world as they know it. Battling both their own personal differences as well as an onslaught of enemies, they must work together to protect a young female elf and a thought-to-be-forgotten relic, which, in the wrong hands, could destroy everything.",
                        "18+"
                )
        )

        movies.add(
                MovieEntity(
                        5,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        6,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        7,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        8,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        9,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        10,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        11,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        12,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        13,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        14,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        15,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        16,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        17,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        18,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        19,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        20,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        21,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        22,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        23,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        24,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        movies.add(
                MovieEntity(
                        25,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbUm8LBCI_sTQ_fS-ufqv8MPE4P6zMbcBBaMshKpzIsWsz-PqZ",
                        "The Midnight Sky",
                        "Sci-fi/Drama",
                        "December 9, 2020",
                        2.2,
                        72,
                        49,
                        "George Clooney",
                        "A lone scientist in the Arctic races to contact a crew of astronauts returning home to a mysterious global catastrophe.",
                        "13+"
                )
        )
        return movies
    }


//   TV SHOWS DUMMY
    fun generateDummyTvShow() : List<TvShowEntity>{
        val tvShow = ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )
        return tvShow
    }
}