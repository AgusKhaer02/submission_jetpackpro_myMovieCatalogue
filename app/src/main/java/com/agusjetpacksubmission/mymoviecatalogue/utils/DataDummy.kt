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

//      Call
        movies.add(
                MovieEntity(
                        5,
                        "https://upload.wikimedia.org/wikipedia/en/thumb/b/b7/Call_poster.jpg/220px-Call_poster.jpg",
                        "Call",
                        "Thriller/Fantasy",
                        "November 27, 2020",
                        4.6,
                        200,
                        94,
                        "Lee Chung-hyeon",
                        "Connected by phone in the same home but 20 years apart, a serial killer puts another woman's past -- and life -- on the line to change her own fate.",
                        "13+"
                )
        )

//      The Old Guard
        movies.add(
                MovieEntity(
                        6,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcT2z3g2RjEekVFn-HAm9Ro6EtlRjU-7OWxPvMq_tSYKd7JyOEa6",
                        "The Old Guard",
                        "Action/Fantasy",
                        "September 10, 2020",
                        2.2,
                        72,
                        49,
                        "Gina Prince-Bythewood",
                        "A group of mercenaries, all centuries-old immortals with the ablity to heal themselves, discover someone is onto their secret, and they must fight to protect their freedom.",
                        "13+"
                )
        )

//      Joker
        movies.add(
                MovieEntity(
                        7,
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJKLiEyyz1Q9RC8EBYl3ijr3nuGeyO2ETmwy6Kdq0AQtD0elWD",
                        "Joker",
                        "Crime/Drama",
                        "October 2, 2019",
                        2.2,
                        72,
                        49,
                        "Todd Phillips",
                        "Joker is a 2019 American psychological thriller film directed and produced by Todd Phillips, who co-wrote the screenplay with Scott Silver. The film, based on DC Comics characters, stars Joaquin Phoenix as the Joker and provides an alternative origin story for the character. ",
                        "13+"
                )
        )

//      Aquaman
        movies.add(
                MovieEntity(
                        8,
                        "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcTGD0SFM5MwzWdQtgA5ssjVmHofb2ajsLcFR0q3pWBNLwf90D_a",
                        "Aquaman",
                        "Sci-fi/Drama",
                        "December 21, 2018",
                        2.2,
                        72,
                        88,
                        "James Wan",
                        "Half-human, half-Atlantean Arthur is born with the ability to communicate with marine creatures. He goes on a quest to retrieve the legendary Trident of Atlan and protect the water world.",
                        "13+"
                )
        )

//      The Thinning
        movies.add(
                MovieEntity(
                        9,
                        "https://m.media-amazon.com/images/M/MV5BMTgxMDM2NjAyNl5BMl5BanBnXkFtZTgwODA1MTUyMDI@._V1_.jpg",
                        "The Thinning",
                        "Thriller",
                        "October 12, 2016",
                        2.2,
                        72,
                        80,
                        "Michael J. Gallagher",
                        "In a dying world, population control is dictated by an aptitude test in high school. When two students discover the test is all smoke and mirrors and hiding a larger conspiracy, they go against the system to expose the conspiracy and take it down.",
                        "13+"
                )
        )

//      Sonic the Hedgehog
        movies.add(
                MovieEntity(
                        10,
                        "http://www.movienewsletters.net/photos/242898R1.jpg",
                        "Sonic the Hedgehog",
                        "Family/Comedy",
                        "February 26, 2020",
                        2.2,
                        72,
                        49,
                        "Jeff Fowler",
                        "An extraterrestrial hedgehog is discovered by a scientist with evil intentions and plans to use his superpowers for his selfish needs.",
                        "13+"
                )
        )

//      212 Warrior (Wiro Sableng Pendekar Kapak Maut Naga Geni 212)
        movies.add(
                MovieEntity(
                        11,
                        "https://m.media-amazon.com/images/M/MV5BY2QxZTgwMWEtMDE3ZC00YzAxLTllNjAtNmMyNmE2MTJkZDRhXkEyXkFqcGdeQXVyNzc4NjY1MTA@._V1_UY1200_CR104,0,630,1200_AL_.jpg",
                        "212 Warrior (Wiro Sableng Pendekar Kapak Maut Naga Geni 212)",
                        "Fantasy/Action",
                        "August 30, 2018",
                        2.2,
                        72,
                        49,
                        "Sheila Timothy",
                        "212 Warrior is a 2018 Indonesian action-comedy film based on the Wiro Sableng novel series by Bastian Tito. The movie is the first collaboration between an Indonesian studio with Fox International Production. A teaser for the film was released on 21 December 2017 throughout Indonesian theaters.",
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

//      Money Heist
        tvShow.add(
            TvShowEntity(
                1,
                "https://occ-0-2008-769.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABUpJhujhQAvjWyEkzhf6Z3ChDyZHZChxm8Q_3C6818BjZB3TC6hZ6rW_EpKl4NSoA6QQF187BYhiwzTwd7lY79ERH6o6.jpg?r=a73",
                "Money Heist",
                "TV Thrillers",
                4
            )
        )

//      Riverdale
        tvShow.add(
            TvShowEntity(
                2,
                "https://joypixel.id/wp-content/uploads/2017/12/riverdale.png",
                "Riverdale",
                "Drama",
                5
            )
        )

//      Prison Break
        tvShow.add(
            TvShowEntity(
                3,
                "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/66fe4c393d24983d361e40b5498f16c142d21500ef9cc979080ee968b51c8dc7._UY500_UX667_RI_V_TTW_.jpg",
                "Prison Break",
                "Drama",
                5
            )
        )

//      Tayo the Little Bus
        tvShow.add(
            TvShowEntity(
                4,
                "https://static.wikia.nocookie.net/soundeffects/images/1/1b/14516.jpg/revision/latest?cb=20180619143130",
                "Tayo the Little Bus",
                "Child",
                5
            )
        )

//      Dark
        tvShow.add(
            TvShowEntity(
                5,
                "https://4.bp.blogspot.com/--Z1nqbEOgLA/XQtZ0cdTchI/AAAAAAAAgOg/QAitEmvmu9U-WmiygAAjlDapKy8uRBUewCLcBGAs/s1600/rsz_dark2.jpg",
                "Dark",
                "Mystery",
                3
            )
        )

//      The 100
        tvShow.add(
            TvShowEntity(
                6,
                "https://static.wikia.nocookie.net/thehundred/images/0/0d/The-100-poster.png/revision/latest?cb=20140410034446",
                "The 100",
                "Sci-fi",
                7
            )
        )

//      Hospital Playlist
        tvShow.add(
            TvShowEntity(
                7,
                "https://media.suara.com/pictures/970x544/2020/05/15/85463-hospital-playlist.jpg",
                "Hospital Playlist",
                "Drama",
                1
            )
        )

//      Narcos
        tvShow.add(
            TvShowEntity(
                8,
                "https://www.medellincitytours.com/wp-content/uploads/2018/07/419.jpg",
                "Narcos",
                "Crime",
                3
            )
        )

//      Sweet Home
        tvShow.add(
            TvShowEntity(
                9,
                "https://webbiesworld.com/wp-content/uploads/2020/11/Sweet-Home-920x425.jpg",
                "Sweet Home",
                "Drama",
                1
            )
        )

//      Save Me
        tvShow.add(
            TvShowEntity(
                10,
                "https://external-preview.redd.it/p3gnInkUmSUErtaAVP8AsU1TzJlAHsavMF66Fcd225s.jpg?auto=webp&s=c699a7f817accb3ff6085b03f145972194b7a840",
                "Save Me",
                "Thriller",
                1
            )
        )

//      Attack On Titan
        tvShow.add(
            TvShowEntity(
                11,
                "https://m.media-amazon.com/images/M/MV5BMTY5ODk1NzUyMl5BMl5BanBnXkFtZTgwMjUyNzEyMTE@._V1_.jpg",
                "Attack On Titan",
                "Action fiction",
                4
            )
        )

//      Masha and the Bear
        tvShow.add(
            TvShowEntity(
                12,
                "https://i.ytimg.com/vi/8JqHP4dkT5U/maxresdefault.jpg",
                "Masha and the Bear",
                "Adventure",
                8
            )
        )
        return tvShow
    }
}