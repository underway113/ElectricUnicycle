package com.example.electricunicycle.data

import com.example.electricunicycle.R
import com.example.electricunicycle.model.EucModel
import com.example.electricunicycle.model.EucTypeEnum
import com.example.electricunicycle.model.SpecificiationModel

object DataSource {
    val eucList: List<EucModel> = listOf(
            EucModel(
                    "Gotway MTen3",
                    R.drawable.mten3,
                    "Gotway",
                    15403226,
                    EucTypeEnum.ENTRY,
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
                    "InMotion V5F",
                    R.drawable.v5f,
                    "InMotion",
                    9899000,
                    EucTypeEnum.ENTRY,
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
                    EucTypeEnum.HIGH,
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
                    "King Song KS-S18",
                    R.drawable.s18,
                    "King Song",
                    28256000,
                    EucTypeEnum.HIGH,
                    "Ultimate Off-Roader\nKS-S18 takes on a sports bike-inspired design with aggressive curvatures, applying aerodynamics with an air intake system like never before. With this S18, King Song focused in on the user experience to create an ergonomic design that seeks to improve the connection between wheel and rider.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            1110,
                            84,
                            48,
                            50,
                            2200,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "InMotion V11",
                    R.drawable.v11,
                    "InMotion",
                    31081600,
                    EucTypeEnum.HIGH,
                    "The First Ever Electric Unicycle with Built-In Adjustable Suspension\nuilt for professional riders, V11 has the world's first built-in air-spring pedal suspension design, with up to 3.3\" of vertical travel to absorb any bumps or dips. In addition, the V11 is fitted with a 18\" by 3\" tire, providing you with more stability. Take it on the road - potholes are no problem. Take it off the road - it's the smoothest experience you can have on unpaved ground.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            1500,
                            84,
                            48,
                            55,
                            2200,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "InMotion V12",
                    R.drawable.v12,
                    "InMotion",
                    32487700,
                    EucTypeEnum.HIGH,
                    "The First Ever Electric Unicycle with Built-In Adjustable Suspension\nBuilt for professional riders, V11 has the world's first built-in air-spring pedal suspension design, with up to 3.3\" of vertical travel to absorb any bumps or dips. In addition, the V11 is fitted with a 18\" by 3\" tire, providing you with more stability. Take it on the road - potholes are no problem. Take it off the road - it's the smoothest experience you can have on unpaved ground.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            1750,
                            100,
                            48,
                            46,
                            2500,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "King Song 14D",
                    R.drawable._4d,
                    "King Song",
                    12000000,
                    EucTypeEnum.ENTRY,
                    "COMPACT VALUE\nKing Song's 14D has stood the test of time as a reliable entry-level EUC that still holds its own against the competition today.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            420,
                            100,
                            32,
                            30,
                            800,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "King Song 16S",
                    R.drawable._6s,
                    "King Song",
                    17000000,
                    EucTypeEnum.ENTRY,
                    "COMPACT VALUE\nKing Song's 14D has stood the test of time as a reliable entry-level EUC that still holds its own against the competition today.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            840,
                            100,
                            64,
                            35,
                            1200,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "King Song 16X",
                    R.drawable._6x,
                    "King Song",
                    28240000,
                    EucTypeEnum.HIGH,
                    "THRUST NUGGET\nKS-16X offers a wildly powerful punch in a really interesting package. A 2200W motor powers this relatively small beast of a wheel and offers range that does not disappoint with its 1554Wh battery. ",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            1554,
                            84,
                            112,
                            50,
                            2200,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "Gotway HERO",
                    R.drawable.hero,
                    "Gotway",
                    50831000,
                    EucTypeEnum.HIGH,
                    "Units are expected to arrive to our facility in late November or early December 2021",
                    installmentOption = false,
                    spec = SpecificiationModel(
                            1800,
                            100,
                            100,
                            60,
                            2800,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "InMotion V8",
                    R.drawable.v8,
                    "InMotion",
                    17000000,
                    EucTypeEnum.ENTRY,
                    "The Most Popular EUC\nThe V8 (formerly known as Solowheel Glide 3) has been around for a couple years now, and there is a good reason this electric unicycle remains relevant with an ever growing popularity.",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            518,
                            84,
                            40,
                            35,
                            1000,
                            true,
                            true,
                            true
                    )
            ),
            EucModel(
                    "Gotway T3",
                    R.drawable.t3,
                    "Gotway",
                    31000000,
                    EucTypeEnum.HIGH,
                    "PERFECTLY BALANCED\nA revision on Gotway's popular Tesla 16\" line of wheels, the T3 adds a few features that make it a killer all-rounder. ",
                    installmentOption = true,
                    spec = SpecificiationModel(
                            1500,
                            84,
                            96,
                            50,
                            2000,
                            true,
                            true,
                            true
                    )
            )
    )

}