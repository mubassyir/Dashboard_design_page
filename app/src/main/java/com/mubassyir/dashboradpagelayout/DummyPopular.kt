package com.mubassyir.dashboradpagelayout

object DummyPopular{

    fun getPopular():List<PopularEntity>{
        val listPopular = ArrayList<PopularEntity>()

        listPopular.add(PopularEntity("Indonesia", R.drawable.indonesia))

        listPopular.add(PopularEntity("Singapore", R.drawable.singapore))

        listPopular.add(PopularEntity("Australia", R.drawable.australia))

        listPopular.add(PopularEntity("Japan", R.drawable.japan))

        return listPopular
    }

}