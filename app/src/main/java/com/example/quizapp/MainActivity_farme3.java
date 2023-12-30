package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.view.inputmethod.EditorInfo;
import android.view.KeyEvent;
import android.text.TextUtils;

public class MainActivity_farme3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questionlist);
        String[] questions = {"What is the largest mammal on Earth?",
                "Which bird is known for its ability to imitate human speech? "
                , "What is the primary diet of pandas? ",
                "What do you call a group of wolves?",
                "Which animal is known for its ability to change color to match its surroundings?",
                "Which food comes from a cow?",
                "Which fruit is typically yellow and known for its curved shape?"
                , "What is a popular Italian dish made of thin, flat pasta strips?",
                "What is the main ingredient in a sandwich with layers of peanut butter and jelly?",
                "Which beverage is made by brewing roasted and ground coffee beans?",
                "Which country is known as the \"Land of the Rising Sun\"?",
                "What is the capital city of France?"
                , "Which river is the longest in the world?",
                "In which continent is the Sahara Desert located?",
                "Which global organization aims to maintain international peace and security?",
                "Which of these is not a musical instrument?",
                "Who composed the famous symphony known as \"Symphony No. 9\"?"
                , "Which famous pop group performed \"Hey Jude\"?",
                "Which of these is a wind instrument?",
                "Which of these instruments is commonly used in traditional Vietnamese music?",
                "Which organism is considered biologically immortal?",
                "Which species of bat is known for having the longest tongue relative to its body size? "
                , "What is the only mammal capable of flight? ",
                "Which marine animal is considered a living fossil and has changed very little over the past 450 million years?",
                "Which of the following animals is known for its ability to generate electric shocks for navigation and communication?",
                "What is the main ingredient in bánh xèo, a Vietnamese savory pancake?",
                "Which Vietnamese dish is a combination of rice vermicelli, fresh herbs, vegetables, and often includes grilled meat or seafood?"
                , "What is the traditional Vietnamese soup that includes a complex broth, rice noodles, herbs, and meat, often served with a variety of garnishes?",
                "Which Vietnamese dessert is made from glutinous rice and often filled with mung bean paste and meat, then wrapped in banana leaves and steamed?",
                "What is the name of the Vietnamese dish that consists of marinated and grilled pork, served over rice with various accompaniments?",
                "Which historical event led to the creation of the modern state of Israel in 1948?",
                "What is the capital city of the Sahrawi Arab Democratic Republic, a partially recognized state in North Africa?"
                , "Which country is not a member of the Group of Seven (G7)?",
                "What is the official currency of Turkmenistan?",
                "In which city is the Organization of American States (OAS) headquartered?",
                "What is the lowest male singing voice?",
                "What does \"piano\" mean in musical terms?"
                , "Which region of Vietnam is famous for its \"Hát chầu văn,\" a traditional musical form connected with spiritual rituals?",
                "Which term refers to a musical composition for solo instrument?",
                "Which Vietnamese instrument has a single string and is played with a bamboo bow, creating a distinct sound?",};

        String[][] listAnswers = {
                {"Elephant", "Blue Whale", "Giraffe", "Polar Bear", "1", "2"},
                {"Penguin", "Owl", "Parrot", "Eagle","1", "3"},
                {"Bamboo", "Fish", "Ants", "Beries","1", "1"},
                {"Flock", "Herd", "Pack", "Swarm","1", "3"},
                {"Chameleon", "Zebra", "Peacock", "Kangaroo","1", "1"},
                {"Chicken", "Beef", "Tofu", "Carrots","1", "2"},
                {"Apple", "Banana", "Orange", "Grape","1", "2"},
                {"Lasaga", "SPaghetti", "Macaroni", "Ravioli","1", "2"},
                {"Cheese", "Ham", "Peanut Butter", "Lettuce","1", "2"},
                {"Tea", "Lemonade", "Juice", "Coffee","1", "2"},
                {"China", "Japan", "India", "South Korea","1", "2"},
                { "Berlin", "London", "Paris", "Rome","1", "2"},
                {"Amazon River", "Nile River", "Mississippi River", "Yangtze River","1", "2"},
                {"Asia", "Europe", "Africa", "South America","1", "2"},
                {"World Health Organization (WHO)", "United Nations (UN)", "International Monetary Fund (IMF)", "World Trade Organization (WTO)","1", "2"},
                {"Guitar", "Drum", "Easel", "Piano","1", "2"},
                {"Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Johann Sebastian Bach", "Franz Schubert","1", "2"},
                {"The Rolling Stones", "The Beatles", "Queen", "Led Zeppelin","1", "2"},
                {"Violin", "Flute", "Cello", "Double bass","1", "2"},
                {"Pipa", "Đàn bầu", "Sitar", "Accordion","1", "2"},
                {"African Elephant", "Turritopsis dohrnii (Immortal Jellyfish)", "Greenland Shark", "Galápagos Tortoise","2", "2"},
                {"Greater Bulldog Bat", "Tube-lipped Nectar Bat", "Bumblebee Bat", "Indian Flying Fox","2", "2"},
                {"Flying Squirrel", "Bat", "Sugar Glider", "Lemur","2", "2"},
                {"Nautilus", "Coelacanth", "Horseshoe Crab", "Goblin Shark","2", "1"},
                {"Electric Ray", "Electric Eel", "Electric Catfish", "Electric Skate","2", "2"},
                {"Tapioca flour", "Rice flour", "Wheat flour", "Corn flour","2", "2"},
                {"Phở", "Bánh mì", "Gỏi cuốn", "Bún thịt nướng","2", "2"},
                {"Bún riêu", "Phở bò", "Mì Quảng", "Cao lầu","2", "2"},
                {"Bánh chưng", "Bánh bò", "Bánh cam", "Bánh giò","2", "2"},
                {"Bánh xèo", "Bún chả", "Cơm tấm", "Bánh cuốn","2", "2"},
                {"Treaty of Versailles", "Balfour Declaration", "Camp David Accords", "Yalta Conference","2", "2"},
                {"Rabat", "Laayoune", "Algiers", "Nouakchott","2", "1"},
                { "Canada", "Japan", "China", "Italy","2", "2"},
                {"Tenge", "Manat", "Somoni", "Lira","2", "4"},
                {"Washington, D.C.", "Buenos Aires", "Mexico City", "Brasília","2", "3"},
                {"Tenor", "Baritone", "Bass", "Alto","2", "2"},
                {"Play softly", "Play loudly", "Play quickly", "Play slowly","2", "2"},
                {"Mekong Delta", "Central Highlands", "Red River Delta", "Northern Mountains","2", "4"},
                {"Concerto", "Sonata", "Symphony", "Etude","2", "1"},
                {"Đàn nguyệt", "Đàn bầu", "Đàn tranh", "K'ni","2", "4"},
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, setItem(questions, 0, questions.length-1));
        ListView listView = findViewById(R.id.questionListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity_farme3.this, DetailQuestion.class );
                Bundle bundle = new Bundle();
                bundle.putString("selectedItem", selectedItem);
                int index = getIndex(questions, selectedItem);
                bundle.putStringArray("answers", listAnswers[index]);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        String[] suggestions = {"Ẩm Thực", "Động Vật", "Địa Chính Trị", "Âm Nhạc"};

        ArrayAdapter<String> filterList = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, suggestions);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.searchView);
        autoCompleteTextView.setAdapter(filterList);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedText = (String) parent.getItemAtPosition(position);
                ArrayList<String> data = new ArrayList<>();
                switch(selectedText) {
                    case "Ẩm Thực":
                        data = setItem(questions, 0, 9);
                        break;
                    case "Động Vật":
                        data = setItem(questions, 10, 19);
                        break;
                    case "Địa Chính Trị":
                        data = setItem(questions, 20, 29);
                        break;
                    case "Âm Nhạc":
                        data = setItem(questions, 30, 39);
                        break;
                    case "":
                        data = setItem(questions, 0, 39);
                        break;
                }
                adapter.clear();
                for(String val: data) {
                    adapter.add(val);
                }
                listView.setAdapter(adapter);
            }
        });

        autoCompleteTextView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL) {
                    // Xử lý khi người dùng nhấn Enter trên bàn phím hoặc chọn một mục từ danh sách gợi ý
                    String enteredText = v.getText().toString();

                    ArrayList<String> data = new ArrayList<>();

                    switch(enteredText) {
                        case "Ẩm Thực":
                            data = setItem(questions, 0, 9);
                            break;
                        case "Động Vật":
                            data = setItem(questions, 10, 19);
                            break;
                        case "Địa Chính Trị":
                            data = setItem(questions, 20, 29);
                            break;
                        case "Âm Nhạc":
                            data = setItem(questions, 30, 39);
                            break;
                        case "":
                            data = setItem(questions, 0, 39);
                            break;
                    }
                    adapter.clear();
                    for(String val: data) {
                        adapter.add(val);
                    }
                    listView.setAdapter(adapter);

                    return true;  // Đã xử lý sự kiện
                }
                return false;
            }
        });

        findViewById(R.id.textViewTopic).setOnClickListener(
                a->finish()
        );
    }

    private static int getIndex(String[] array, String targetValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(targetValue)) {
                return i; // Trả về chỉ mục nếu giá trị được tìm thấy
            }
        }
        return -1; // Trả về -1 nếu giá trị không tồn tại trong mảng
    }

    private static ArrayList<String> setItem (String[] questions, int form, int to) {
        ArrayList<String> data = new ArrayList<>();
        for(int i = form; i <= to; i++)
        {
            data.add(questions[i]);
        }
        return data;
    }
}
