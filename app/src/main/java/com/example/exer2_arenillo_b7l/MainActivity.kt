package com.example.exer2_arenillo_b7l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { roll() }
    }
    private fun roll() {
        val randomInt = (1..10).random()
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val disneyImage : ImageView = findViewById(R.id.disney_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.Aurorapink
            2 -> R.drawable.Bo_Peep
            3 -> R.drawable.amelia
            4 -> R.drawable.ariel
            5 -> R.drawable.belle
            6 -> R.drawable.boo
            7 -> R.drawable.celia
            8 -> R.drawable.cinderella
            9 -> R.drawable.colette
            else -> R.drawable.unnamed
        }
        disneyImage.setImageResource(drawableResource)

        val resultText: TextView = findViewById(R.id.my_text)
        resultText.text = "You are"
        val description: TextView = findViewById(R.id.my_description)

        val desc = when (randomInt) {
            1 -> "Betrothed at birth to Prince Phillip, the infant Aurora is blessed with the gifts of beauty and song by the good fairies of the kingdom. However, fate's icy hand brings an uninvited guest to the christening and the evil fairy Maleficent curses the child to die by the prick of a spinning wheel's spindle before her 16th birthday. Struggling to prevent this catastrophe, the good fairies hide the princess in a secluded cottage in the glen. The years pass and Aurora blossoms into a lovely but lonely young woman unaware of her real name and birth right."
            2 -> "Bo is a sweet and lovable porcelain shepherdess figurine. Bo Peep and her sheep are adornments of Molly's bedside lamp, though Bo is sometimes considered to be , because Andy likes to make her the damsel in distress of his plays. Bo is the romantic interest of Woody, providing a calm and loving comfort whenever he is overwhelmed."
            3 -> "The feline first lady of the RLS Legacy is one of the strongest heroines ever seen on the silver screen. She's tough, no-nonsense, and has a vocabulary that dazzles the imagination. Her design is sleek and precise, and her British tones bequeath her character with a sterling presentation."
            4 -> "The tawny-haired mermaid is a girl in the process of becoming an attractive woman. One of her attractive qualities is that she is very definite about what she is doing and very confident about her own ability to succeed. Of course, a good deal of that confidence is ill-placed, as she is just a teenager. Although she is warned by her father, King Triton, that humans are dangerous, Ariel stubbornly believes otherwise and has an insatiable curiosity about them."
            5 -> "Belle is a young woman living in the French countryside with her father, an inventor. She's a lovely free-thinker who likes to read and go on adventures within her own imagination. She is not shy about and is not afraid to speak her mind, especially in tight situations. She is very compassionate and takes care of those in need. "
            6 -> "Boo is a three-year-old human child who has escaped from her room from which her scaring monster Randall intended to kidnap her. Much of the film's plot follows what happens as Mike Wazowski and Sulley try to get Boo back to safety. When she first appears, Boo is very attached to Sulley, calling him . Boo's curious and fun attitude follows her throughout the film."
            7 -> "Celia is Mike Wazowski's Cyclops-Medusa-like girlfriend. The snakes that make up her hair have a mind of their own; they make chirping noises when they're happy, rattle and hiss when they're mad. She often calls Mike  and Mike often calls her  Celia is very romantic and loves going on dates with Mike. "
            8 -> "Cinderella is initially made a servant in her home and is constantly derided by her evil stepmother Lady Tremaine and two stepsisters. Although she is abused and humiliated, she maintains hope through her dreams. She is faithful to the idea that someday her wishes of happiness will come true. "
            9 -> "Colette Tatou is the only female cook in Chef Skinner's kitchen. She is a capable cook, hard working, and very tough in able to enter the masculine world of cuisine. She had defended Linguini from being fired as a garbage boy when Skinner caught him  the soup in which Remy had made. She takes Linguini under her wing and teaches him the skills necessary to survive in the fast-paced kitchen. She is later shown to soften her  personality, becoming more romantic and idealistic."
            else -> "Alice is portrayed as being very curious. She's often seen daydreaming and gives herself advice instead of listening to the advice of others. "
        }

        description.text = desc

    }

}
