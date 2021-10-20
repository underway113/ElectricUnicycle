package com.example.electricunicycle.data

import com.example.electricunicycle.R
import com.example.electricunicycle.model.EucModel
import com.example.electricunicycle.model.SpecificiationModel

object DataSource {
    val eucList: List<EucModel> = listOf(
            EucModel(
                    "Gotway MTen3",
                    R.drawable.mten3,
                    "Gotway",
                    15403226,
                    "SMALL BUT (VERY) MIGHTY\nAlthough the MTen3 may be the smallest mass production EUC ever made, that certainly does not mean it's the least powerful.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            512,
                            84,
                            48,
                            37,
                            800,
                            false,
                            false,
                            true
                    )
            ),
            EucModel(
                    "Inmotion V5F",
                    R.drawable.v5f,
                    "Inmotion",
                    9899000,
                    "INMOTION TINY POWERHOUSE\nLike the V8, InMotion V5F (formerly Solowheel Glide 2) is a tried and true model that has been around quite for a few years now, and this entry level electric unicycle offers a great value starting point for many customers looking to learn to ride their first electric unicycle.",
                    installmentOption = false,
                    spec = SpecificiationModel(
                            320,
                            84,
                            40,
                            24,
                            550,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "King Song S20 Eagle",
                    R.drawable.s20,
                    "King Song",
                    45220000,
                    "Units are expected to leave the King Song factory in December 2021",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            2220,
                            126,
                            0,
                            70,
                            3300,
                            false,
                            false,
                            true
                    )
            ),
            EucModel(
                    "2Gotway MTen3",
                    R.drawable.mten3,
                    "Gotway",
                    15403226,
                    "SMALL BUT (VERY) MIGHTY\nAlthough the MTen3 may be the smallest mass production EUC ever made, that certainly does not mean it's the least powerful.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            512,
                            84,
                            48,
                            37,
                            800,
                            false,
                            false,
                            true
                    )
            ),
            EucModel(
                    "3Gotway MTen3",
                    R.drawable.mten3,
                    "Gotway",
                    15403226,
                    "SMALL BUT (VERY) MIGHTY\nAlthough the MTen3 may be the smallest mass production EUC ever made, that certainly does not mean it's the least powerful.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            512,
                            84,
                            48,
                            37,
                            800,
                            false,
                            false,
                            true
                    )
            )
    )

}