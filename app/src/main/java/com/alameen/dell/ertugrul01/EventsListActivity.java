package com.alameen.dell.ertugrul01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EventsListActivity extends AppCompatActivity {

    private List<EventClass> eventClass;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    private Bundle extras;
    private String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_events_list);


        extras = getIntent().getExtras();
        title = extras.getString("name");

        if(title.equals("Life"))
        {

            final ArrayList arrayList = new ArrayList();

            eventClass = new ArrayList<>();
            eventClass.add(new EventClass("Early Life:", "Father of Osman-I, the Founder of Great Ottoman Empire...", R.drawable.mosque));
            eventClass.add(new EventClass("Family:", "Details of Ertugrul Gazi's Family...", R.drawable.mosque1));
            eventClass.add(new EventClass("Who Were Ogouz Turks?", "The Great warriors, who once embraced Islam...", R.drawable.mosque2));
            eventClass.add(new EventClass("Who Were Kayis?", "A tribe of Oguz Turks, click for more details...", R.drawable.mosque3));
            eventClass.add(new EventClass("Death:", "Death of the Great Warrior...", R.drawable.mosque4));
            eventClass.add(new EventClass("Legacy:", "Legacy of Ertugrul Gazi...", R.drawable.mosque5));
            /*eventClass.add(new EventClass("Graphics Design", "Do You Love Graphic Designing?...", R.drawable.mosque6));
            eventClass.add(new EventClass("Online tutor", "Be an Online Tutor by Teaching Online...", R.drawable.mosque7));
            */

        }


        else if(title.equals("Wars"))
        {

            final ArrayList arrayList = new ArrayList();

            eventClass = new ArrayList<>();
            eventClass.add(new EventClass("Mongol Wars:", "Mongol invasions and conquests took place throughout the 13th century...", R.drawable.mosque));
            eventClass.add(new EventClass("Suljuks-Mongol Wars:", "Mongol Empire conquered Persia in 1230...", R.drawable.mosque1));
            eventClass.add(new EventClass("Turk Wars with Mongols:", "Turk in East came under Mongol oppressions...", R.drawable.mosque2));
            eventClass.add(new EventClass("The Final Battle:", "The War of Kose Dag...", R.drawable.mosque3));
            eventClass.add(new EventClass("The Fall of Suljuks:", "Fall of Suljuks after Kose Dag failure...", R.drawable.mosque4));
            eventClass.add(new EventClass("War & Defeat of Mongols:", "Mongol War with Mamluks...", R.drawable.mosque));
            eventClass.add(new EventClass("Fall of Byzantine Empire:", "After the 4th Crusade and specially after Truks presence in Anatolia...", R.drawable.mosque5));
            /*eventClass.add(new EventClass("Graphics Design", "Do You Love Graphic Designing?...", R.drawable.mosque6));
            eventClass.add(new EventClass("Online tutor", "Be an Online Tutor by Teaching Online...", R.drawable.mosque7));
            */
        }

        else if(title.equals("Empire"))
        {

            final ArrayList arrayList = new ArrayList();

            eventClass = new ArrayList<>();
            eventClass.add(new EventClass("The Oguz Turks State:", "Today the residents of Turkey, Turkmenistan...", R.drawable.mosque));
            eventClass.add(new EventClass("The Great Seljuk Sultanate of Rum:", "The rise of the Seljuk Empire turned out to be crucial for the Islamic world...", R.drawable.mosque1));
            eventClass.add(new EventClass("Sogut:", "Sultan, in recognition of the services of Ertugrul, granted him land in Sogut...", R.drawable.mosque2));
            eventClass.add(new EventClass("Rise of Osmanlis:", "Turkic peoples called themselves Osmanli until the dissolution of the...", R.drawable.mosque3));
            eventClass.add(new EventClass("Rise of Ottomans:", "The Ottoman ruler Osman-I was the first Turkish ruler who minted coins in his own name...", R.drawable.mosque4));
            eventClass.add(new EventClass("Fall of Byzantine Empire:", "Following a number of civil disputes in the Byzantine Empire...", R.drawable.mosque5));
            /*eventClass.add(new EventClass("Graphics Design", "Do You Love Graphic Designing?...", R.drawable.mosque6));
            eventClass.add(new EventClass("Online tutor", "Be an Online Tutor by Teaching Online...", R.drawable.mosque7));
            */
        }

        else if(title.equals("Companions"))
        {

            final ArrayList arrayList = new ArrayList();

            eventClass = new ArrayList<>();
            eventClass.add(new EventClass("Suliman Shah:", "He was a greatly respected figure of that time...", R.drawable.mosque5));
            eventClass.add(new EventClass("Osman-I:", "Osman-I was able to establish an Empire as the basis were already founded by Ertugrul...", R.drawable.mosque4));
            eventClass.add(new EventClass("Halime Sultan:", "She was a Seljuk Princess, very dedicated to her husband...", R.drawable.mosque3));
            eventClass.add(new EventClass("Hayme Mother:", "She was a mother of Kayis and Ertugrul Bay...", R.drawable.mosque3));
            eventClass.add(new EventClass("Turgut Bay:", "He was one of the greatest and most renown warriors...", R.drawable.mosque2));
            eventClass.add(new EventClass("Ibn-ul-Arabi:", "Ibn Arabi  As many of us know Ibn Arabi is a famous chronologist...", R.drawable.mosque1));
            eventClass.add(new EventClass("Artuk Bay:", "rtuk Bey  Known as Ertugrul Bey’s right hand man...", R.drawable.mosque));
            eventClass.add(new EventClass("Sultan Alā ad–Dīn Kayqubād bin Kaykāvūs:", "Great Sultan Ala ad-Din...", R.drawable.mosque4));
            eventClass.add(new EventClass("Ayyubids:", "The Sultanate of the great Salahuddin Al Ayubi...", R.drawable.mosque3));
            eventClass.add(new EventClass("Emir Al-Aziz of Aleppo:", "Emir Al-Aziz  of Aleppo  Al Aziz Muhammad ibn Gazi ...", R.drawable.mosque2));
            eventClass.add(new EventClass("Saddetin Kopek:", "addetin Kopek is considered an ambitious and evil  man...", R.drawable.mosque1));
            eventClass.add(new EventClass("Gundogdu & Sungurtekin - Brothers:", "They did not support Ertugrul path and as we know...", R.drawable.mosque5));
            eventClass.add(new EventClass("Dundar Bey:", "He was a brave and renown warrior...", R.drawable.mosque1));
            eventClass.add(new EventClass("Baycu Noyan:", "aycu Noyan was a Mongol commander in Persia,...", R.drawable.mosque8));
            /*
            eventClass.add(new EventClass("Ögedei Khan:", "The third son of Genghis Khan and second Great Khan of the Mongol Empire...", R.drawable.mosque7));
            eventClass.add(new EventClass("Hulagu Khan:", "Hulagu Khan, also known as Hülegü or Hulegu was a Mongol ruler who conquered much of Western Asia...", R.drawable.mosque6));
            eventClass.add(new EventClass("Graphics Design", "Do You Love Graphic Designing?...", R.drawable.mosque6));
            eventClass.add(new EventClass("Online tutor", "Be an Online Tutor by Teaching Online...", R.drawable.mosque7));
            */
        }

        else
        {

        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id_life);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(this, eventClass);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
