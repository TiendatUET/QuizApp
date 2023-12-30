package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class playActivity extends AppCompatActivity {

    String[] question_list;
    String[] choose_list;
    String[] correct_list;
    TextView cpt_question , text_question;
    Button btn_choose1 , btn_choose2 , btn_choose3 , btn_choose4 , btn_next;


    int currentQuestion =  0  ;
    int scorePlayer =  0  ;
    boolean isclickBtn = false;
    String valueChoose = "";
    Button btn_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        int temp = extras.getInt("a");
        int diff = extras.getInt("difficulty");
        if (diff == 1) {
            if(temp == 1) {
                question_list = new String[]{"What is the largest mammal on Earth?",
                        "Which bird is known for its ability to imitate human speech? "
                        , "What is the primary diet of pandas? ",
                        "What do you call a group of wolves?",
                        "Which animal is known for its ability to change color to match its surroundings?"
                };
                choose_list = new String[]{"Elephant", "Blue Whale", "Giraffe", "Polar Bear",
                        "Penguin", "Owl", "Parrot", "Eagle",
                        "Bamboo", "Fish", "Ants", "Beries",
                        "Flock", "Herd", "Pack", "Swarm",
                        "Chameleon", "Zebra", "Peacock", "Kangaroo",
                };
                correct_list = new String[] {"Blue Whale", "Parrot", "Bamboo", "Pack", "Chameleon",};
            }
            if(temp == 2) {
                question_list = new String[]{"Which food comes from a cow?",
                        "Which fruit is typically yellow and known for its curved shape?"
                        , "What is a popular Italian dish made of thin, flat pasta strips?",
                        "What is the main ingredient in a sandwich with layers of peanut butter and jelly?",
                        "Which beverage is made by brewing roasted and ground coffee beans?"
                };
                choose_list = new String[]{"Chicken", "Beef", "Tofu", "Carrots",
                        "Apple", "Banana", "Orange", "Grape",
                        "Lasaga", "SPaghetti", "Macaroni", "Ravioli",
                        "Cheese", "Ham", "Peanut Butter", "Lettuce",
                        "Tea", "Lemonade", "Juice", "Coffee",
                };
                correct_list = new String[] {"Beef", "Banana", "Lasaga", "Peanut Butter", "Coffee",};
            }
            if(temp == 3) {
                question_list = new String[]{"Which country is known as the \"Land of the Rising Sun\"?",
                        "What is the capital city of France?"
                        , "Which river is the longest in the world?",
                        "In which continent is the Sahara Desert located?",
                        "Which global organization aims to maintain international peace and security?"
                };
                choose_list = new String[]{"China", "Japan", "India", "South Korea",
                        "Berlin", "London", "Paris", "Rome",
                        "Amazon River", "Nile River", "Mississippi River", "Yangtze River",
                        "Asia", "Europe", "Africa", "South America",
                        "World Health Organization (WHO)", "United Nations (UN)", "International Monetary Fund (IMF)", "World Trade Organization (WTO)",
                };
                correct_list = new String[] {"Japan", "Paris", "Nile River", "Africa", "United Nations (UN)",};
            }
            if(temp == 4) {
                question_list = new String[]{"Which of these is not a musical instrument?",
                        "Who composed the famous symphony known as \"Symphony No. 9\"?"
                        , "Which famous pop group performed \"Hey Jude\"?",
                        "Which of these is a wind instrument?",
                        "Which of these instruments is commonly used in traditional Vietnamese music?"
                };
                choose_list = new String[]{"Guitar", "Drum", "Easel", "Piano",
                        "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach", "Franz Schubert",
                        "The Rolling Stones", "The Beatles", "Queen", "Led Zeppelin",
                        "Violin", "Flute", "Cello", "Double bass",
                        "Pipa", "Đàn bầu", "Sitar", "Accordion",
                };
                correct_list = new String[] {"Easel", "Ludwig van Beethoven", "The Beatles", "Flute", "Đàn bầu",};
            }
        }
        if (diff == 2) {
            if(temp == 1) {
                question_list = new String[]{"Which organism is considered biologically immortal?",
                        "Which species of bat is known for having the longest tongue relative to its body size? "
                        , "What is the only mammal capable of flight? ",
                        "Which marine animal is considered a living fossil and has changed very little over the past 450 million years?",
                        "Which of the following animals is known for its ability to generate electric shocks for navigation and communication?"
                };
                choose_list = new String[]{"African Elephant", "Turritopsis dohrnii (Immortal Jellyfish)", "Greenland Shark", "Galápagos Tortoise",
                        "Greater Bulldog Bat", "Tube-lipped Nectar Bat", "Bumblebee Bat", "Indian Flying Fox",
                        "Flying Squirrel", "Bat", "Sugar Glider", "Lemur",
                        "Nautilus", "Coelacanth", "Horseshoe Crab", "Goblin Shark",
                        "Electric Ray", "Electric Eel", "Electric Catfish", "Electric Skate",
                };
                correct_list = new String[] {"Turritopsis dohrnii (Immortal Jellyfish)", "Tube-lipped Nectar Bat", "Bat", "Nautilus", "Electric Eel",};
            }
            if(temp == 2) {
                question_list = new String[]{"What is the main ingredient in bánh xèo, a Vietnamese savory pancake?",
                        "Which Vietnamese dish is a combination of rice vermicelli, fresh herbs, vegetables, and often includes grilled meat or seafood?"
                        , "What is the traditional Vietnamese soup that includes a complex broth, rice noodles, herbs, and meat, often served with a variety of garnishes?",
                        "Which Vietnamese dessert is made from glutinous rice and often filled with mung bean paste and meat, then wrapped in banana leaves and steamed?",
                        "What is the name of the Vietnamese dish that consists of marinated and grilled pork, served over rice with various accompaniments?"
                };
                choose_list = new String[]{"Tapioca flour", "Rice flour", "Wheat flour", "Corn flour",
                        "Phở", "Bánh mì", "Gỏi cuốn", "Bún thịt nướng",
                        "Bún riêu", "Phở bò", "Mì Quảng", "Cao lầu",
                        "Bánh chưng", "Bánh bò", "Bánh cam", "Bánh giò",
                        "Bánh xèo", "Bún chả", "Cơm tấm", "Bánh cuốn",
                };
                correct_list = new String[] {"Rice flour", "Gỏi cuốn", "Phở bò", "Bánh chưng", "Cơm tấm",};
            }
            if(temp == 3) {
                question_list = new String[]{"Which historical event led to the creation of the modern state of Israel in 1948?",
                        "What is the capital city of the Sahrawi Arab Democratic Republic, a partially recognized state in North Africa?"
                        , "Which country is not a member of the Group of Seven (G7)?",
                        "What is the official currency of Turkmenistan?",
                        "In which city is the Organization of American States (OAS) headquartered?"
                };
                choose_list = new String[]{"Treaty of Versailles", "Balfour Declaration", "Camp David Accords", "Yalta Conference",
                        "Rabat", "Laayoune", "Algiers", "Nouakchott",
                        "Canada", "Japan", "China", "Italy",
                        "Tenge", "Manat", "Somoni", "Lira",
                        "Washington, D.C.", "Buenos Aires", "Mexico City", "Brasília",
                };
                correct_list = new String[] {"Balfour Declaration", "Laayoune", "China", "Manat", "Washington, D.C.",};
            }
            if(temp == 4) {
                question_list = new String[]{"What is the lowest male singing voice?",
                        "What does \"piano\" mean in musical terms?"
                        , "Which region of Vietnam is famous for its \"Hát chầu văn,\" a traditional musical form connected with spiritual rituals?",
                        "Which term refers to a musical composition for solo instrument?",
                        "Which Vietnamese instrument has a single string and is played with a bamboo bow, creating a distinct sound?"
                };
                choose_list = new String[]{"Tenor", "Baritone", "Bass", "Alto",
                        "Play softly", "Play loudly", "Play quickly", "Play slowly",
                        "Mekong Delta", "Central Highlands", "Red River Delta", "Northern Mountains",
                        "Concerto", "Sonata", "Symphony", "Etude",
                        "Đàn nguyệt", "Đàn bầu", "Đàn tranh", "K'ni",
                };
                correct_list = new String[] {"Bass", "Play softly", "Northern Mountains", "Etude", "Đàn bầu",};
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        cpt_question = findViewById(R.id.cpt_question);
        text_question = findViewById(R.id.text_question);
        btn_choose1 = findViewById(R.id.btn_choose1);
        btn_choose2 = findViewById(R.id.btn_choose2);
        btn_choose3 = findViewById(R.id.btn_choose3);
        btn_choose4 = findViewById(R.id.btn_choose4);
        btn_next = findViewById(R.id.btn_next);

        findViewById(R.id.image_back).setOnClickListener(
                a-> finish()
        );
        remplirData();
        Intent intent2 = new Intent(playActivity.this,ResulteActivity.class);
        btn_next.setOnClickListener(
                view -> {
                    if (isclickBtn){
                        isclickBtn = false;

                        if(!valueChoose.equals(correct_list[currentQuestion])){
                            intent2.putExtra("Result" , scorePlayer);
                            startActivity(intent2);

                        }else {

                            scorePlayer++;
                        }
                        new Handler().postDelayed(() -> {
                            if(currentQuestion!=question_list.length-1){
                                currentQuestion = currentQuestion + 1;
                                remplirData();
                                valueChoose = "";
                                btn_choose1.setBackgroundResource(R.drawable.background_btn_choose);
                                btn_choose2.setBackgroundResource(R.drawable.background_btn_choose);
                                btn_choose3.setBackgroundResource(R.drawable.background_btn_choose);
                                btn_choose4.setBackgroundResource(R.drawable.background_btn_choose);

                            }else {
                                Intent intent  = new Intent(playActivity.this , ResulteActivity.class);
                                intent.putExtra("Result" , scorePlayer);
                                showResult(scorePlayer);
                                showResult1(scorePlayer);
                                startActivity(intent);
                                finish();
                            }

                        },2000);

                    }

                }
        );


    }

    void remplirData(){
        cpt_question.setText((currentQuestion+1) + "/" + question_list.length);
        text_question.setText(question_list[currentQuestion]);

        btn_choose1.setText(choose_list[4 * currentQuestion]);
        btn_choose2.setText(choose_list[4 * currentQuestion+1]);
        btn_choose3.setText(choose_list[4 * currentQuestion+2]);
        btn_choose4.setText(choose_list[4 * currentQuestion+3]);

    }

    public void ClickChoose(View view) {
        btn_click = (Button)view;

        if (isclickBtn) {
            btn_choose1.setBackgroundResource(R.drawable.background_btn_choose);
            btn_choose2.setBackgroundResource(R.drawable.background_btn_choose);
            btn_choose3.setBackgroundResource(R.drawable.background_btn_choose);
            btn_choose4.setBackgroundResource(R.drawable.background_btn_choose);
        }
        chooseBtn();


    }
    void chooseBtn(){

        btn_click.setBackgroundResource(R.drawable.background_btn_choose_color);
        isclickBtn = true;
        valueChoose = btn_click.getText().toString();
    }
    private void showResult(int scorePlayer) {
        Intent intent = new Intent(playActivity.this, ResulteActivity.class);
        intent.putExtra("score", scorePlayer);
        startActivity(intent);
        finish();
    }
    private void showResult1(int scorePlayer) {
        Intent intent = new Intent(playActivity.this, MainActivity_farme2.class);
        intent.putExtra("scorePlayer", scorePlayer);
        startActivity(intent);
        finish();
    }

}