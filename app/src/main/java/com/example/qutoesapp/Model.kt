package com.example.qutoesapp

class Model(
    val title : String? = "",
    val description : List<String>? = null
)

fun getList(): List<Model>{
    return listOf(
        Model("Love", listOf(
            "Love is composed of a single soul inhabiting two bodies. - Aristotle",
            "To love and be loved is to feel the sun from both sides. - David Viscott",
            "Love recognizes no barriers. It jumps hurdles, leaps fences, penetrates walls to arrive at its destination full of hope. - Maya Angelou"
        )),
        Model("Friendship", listOf(
            "Friendship is the only cement that will ever hold the world together. - Woodrow Wilson",
            "A friend is someone who knows all about you and still loves you. - Elbert Hubbard",
            "A real friend is one who walks in when the rest of the world walks out. - Walter Winchell"
        )),
        Model("Inspiration", listOf(
            "The best way to predict the future is to invent it. - Alan Kay",
            "Do not wait to strike till the iron is hot, but make it hot by striking. - William Butler Yeats",
            "Whether you think you can or you think you can’t, you’re right. - Henry Ford"
        )),
        Model("Wisdom", listOf(
            "The only true wisdom is in knowing you know nothing. - Socrates",
            "Wisdom is not a product of schooling but of the lifelong attempt to acquire it. - Albert Einstein",
            "Turn your wounds into wisdom. - Oprah Winfrey"
        )),
        Model("Success", listOf(
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Success usually comes to those who are too busy to be looking for it. - Henry David Thoreau",
            "The way to get started is to quit talking and begin doing. - Walt Disney"
        )),
        Model("Happiness", listOf(
            "Happiness is not something ready made. It comes from your own actions. - Dalai Lama",
            "For every minute you are angry you lose sixty seconds of happiness. - Ralph Waldo Emerson",
            "Happiness depends upon ourselves. - Aristotle"
        )),
        Model("Motivation", listOf(
            "The only way to do great work is to love what you do. - Steve Jobs",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "The secret of getting ahead is getting started. - Mark Twain"
        ))
    )
}