package com.agusjetpacksubmission.mymoviecatalogue.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.agusjetpacksubmission.mymoviecatalogue.R
import com.agusjetpacksubmission.mymoviecatalogue.utils.DataDummy
import org.junit.Before
import org.junit.Test

class HomeActivityTest{

    private val dummyMovie = DataDummy.generateDummyMovies()

    @Before
    fun setUp(){
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadMovies(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovies(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))

//      Image Movie
        onView(withId(R.id.img_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.img_movie2)).check(matches(isDisplayed()))

        onView(withId(R.id.img_movie)).check(matches(withText(dummyMovie[0].movieImage)))
        onView(withId(R.id.img_movie2)).check(matches(withText(dummyMovie[0].movieImage)))
//      Title
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyMovie[0].movieTitle)))

//      Category
        onView(withId(R.id.tv_category)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_category)).check(matches(withText(dummyMovie[0].movieCategory)))

//      Release Date
        onView(withId(R.id.tv_releaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_releaseDate)).check(matches(withText(dummyMovie[0].releaseDate)))

//      Director
        onView(withId(R.id.tv_director)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_director)).check(matches(withText(dummyMovie[0].director)))

//      Age
        onView(withId(R.id.tv_age)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_age)).check(matches(withText(dummyMovie[0].age)))

//      Rating
        onView(withId(R.id.bx_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(withText(dummyMovie[0].rating.toString())))

//      Percent Like
        onView(withId(R.id.bx_like)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_percentLike)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_percentLike)).check(matches(withText("${dummyMovie[0].percentLike}%")))

//      Viewer
        onView(withId(R.id.bx_viewer)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_viewer)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_viewer)).check(matches(withText(dummyMovie[0].viewer.toString())))

//      Synopsis
        onView(withId(R.id.tv_synopsis)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_synopsis)).check(matches(withText(dummyMovie[0].sinopsis)))
    }

    @Test
    fun loadTvShow(){
        onView(withText("TV SHOW")).perform(ViewActions.click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }
}