package com.example.a3.data

import androidx.annotation.DrawableRes
import com.example.a3.R

data class A3(
    @DrawableRes val imageResourceId: Int,
    val day: String,
    val verse: String,
    val reference: String,
    var isVerseVisible: Boolean = false // Default visibility is false
)



class Datasource {

    fun loadA3s(): List<A3> {
        return listOf(
            A3(R.drawable.day1,"Day 1", "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life.","- John 3:16"
            ),
            A3(
                R.drawable.day1,
                "Day 1",
                "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life.",
                "- John 3:16"
            ),
            A3(
                R.drawable.day2,
                "Day 2",
                "I can do all this through him who gives me strength.",
                "- Philippians 4:13"
            ),
            A3(
                R.drawable.day3,
                "Day 3",
                "Trust in the Lord with all your heart and lean not on your own understanding.",
                "- Proverbs 3:5"
            ),
            A3(
                R.drawable.day4,
                "Day 4",
                "Therefore go and make disciples of all nations, baptizing them in the name of the Father and of the Son and of the Holy Spirit…",
                "- Matthew 28:19"
            ),
            A3(
                R.drawable.day5,
                "Day 5",
                "Cast all your anxiety on him because he cares for you.",
                "- 1 Peter 5:7"
            ),
            A3(
                R.drawable.day6,
                "Day 6",
                "For the wages of sin is death, but the gift if God is eternal life in Christ Jesus our Lord.",
                "- Romans 6:23"
            ),
            A3(
                R.drawable.day7,
                "Day 7",
                "Start children off on the way they should go, and even when they are old they will not turn from it.",
                "- Proverbs 22:6"
            ),
            A3(
                R.drawable.day8,
                "Day 8",
                "Be strong and courageous. Do not be afraid or terrified because of them, for the Lord your God goes with you; he will never leave you nor forsake you.",
                "- Deuteronomy 31:6"
            ),
            A3(
                R.drawable.day9,
                "Day 9",
                "Come to me, all you who are weary and burdened, and I will give you rest.",
                "- Matthew 11:28"
            ),
            A3(
                R.drawable.day10,
                "Day 10",
                "Rejoice always, pray continually, give thanks in all circumstances; for this is God’s will for you in Christ Jesus.",
                "- 1 Thessalonians 5:16-18"
            ),
            A3(
                R.drawable.day11,
                "Day 11",
                "Be completely humble and gentle; be patient, bearing with one another in love.",
                "- Ephesians 4:2"
            ),
            A3(
                R.drawable.day12,
                "Day 12",
                "So do not fear, for I am with you; do not be dismayed, for I am your God. I will strengthen you and help you; I will uphold you with my righteous right hand.",
                "- Isaiah 41:10"
            ),
            A3(
                R.drawable.day13,
                "Day 13",
                "Surely God is my salvation; I will trust and not be afraid. The Lord, the Lord himself, is my strength and my defense; he has become my salvation.",
                "- Isaiah 12:2"
            ),
            A3(
                R.drawable.day14,
                "Day 14",
                "Yet to all who did receive him, to those who believed in his name, he gave the right to become children of God—children born not of natural descent, nor of human decision or a husband’s will, but born of God.",
                "- John 1:12-13"
            ),
            A3(
                R.drawable.day15,
                "Day 15",
                "Then God said, “Let us make mankind in our image, in our likeness, so that they may rule over the fish in the sea and the birds in the sky, over the livestock and all the wild animals, and over all the creatures that move along the ground.”",
                "- Genesis 1:26"
            ),
            A3(
                R.drawable.day16,
                "Day 16",
                "Jesus replied, “Very truly I tell you, no one can see the kingdom of God unless they are born again.”",
                "- John 3:3"
            ),
            A3(
                R.drawable.day17,
                "Day 17",
                "These commandments that I give you today are to be on your hearts. Impress them on your children. Talk about them when you sit at home and when you walk along the road, when you lie down and when you get up.”",
                "- Deuteronomy 6: 6-7"
            ),
            A3(
                R.drawable.day18,
                "Day 18",
                "Therefore, I tell you, whatever you ask for in prayer, believe that you have received it, and it will be yours.",
                "- Mark 11:24"
            ),
            A3(
                R.drawable.day19,
                "Day 19",
                "Do everything in love.",
                "- 1 Corinthians 16:14"
            ),
            A3(
                R.drawable.day20,
                "Day 20",
                "Let the morning bring me word of your unfailing love, for I have put my trust in you. Show me the way I should go, for to you I entrust my life.",
                "- Psalm 143:8"
            ),
            A3(
                R.drawable.day21,
                "Day 21",
                "…but those who hope in the Lord will renew their strength. They will soar on wings like eagles; they will run and not grow weary; they will walk and not be faint.",
                "- Isaiah 40:31"
            ),
            A3(
                R.drawable.day22,
                "Day 22",
                "For I know the plans I have for you,” declares the Lord, “plans to prosper you and not to harm you, plans to give you hope and a future.”",
                "- Jeremiah 29:11"
            ),
            A3(
                R.drawable.day23,
                "Day 23",
                "They replied, “Believe in the Lord Jesus, and you will be saved –you and your household.”",
                "- Acts 16:31"
            ),
            A3(
                R.drawable.day23,
                "Day 23",
                "They replied, “Believe in the Lord Jesus, and you will be saved –you and your household.”",
                "- Acts 16:31"
            ),
            A3(
                R.drawable.day24,
                "Day 24",
                "For we live by faith, not by sight.",
                "- 2 Corinthians 5:7"
            ),
            A3(
                R.drawable.day25,
                "Day 25",
                "Now faith is confidence in what we hope for and assurance about what we do not see.",
                "- Hebrews 11:1"
            ),
            A3(
                R.drawable.day26,
                "Day 26",
                "Trust in the Lord with all your heart and lean not on your own understanding; in all your ways submit to him, and he will make your paths straight.",
                "- Proverbs 3:5-6"
            ),
            A3(
                R.drawable.day27,
                "Day 27",
                "May he give you the desire of your heart and make all your plans succeed.",
                "- Psalm 20:4"
            ),
            A3(
                R.drawable.day28,
                "Day 28",
                "Jesus said to her, “I am the resurrection and the life. The one who believes in me will live, even though they die; and whoever lives by believing in me will never die. Do you believe this?”",
                "- John 11:25-26"
            ),
            A3(
                R.drawable.day29,
                "Day 29",
                "In the beginning was the Word, and the Word was with God, and the Word was God.",
                "- John 1:1"
            ),
            A3(
                R.drawable.day30,
                "Day 30",
                "All scripture is God-breathed and is useful for teaching, rebuking, correcting and training in righteousness…",
                "- 2 Timothy 3:16"
            )
        )
    }
}