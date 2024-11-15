// MainActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.utsandr.R;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Daftar item yang akan ditampilkan di RecyclerView
        List<String> itemList = Arrays.asList(
                "1. Hukum Nun Sukun dan Tanwin",
                "2. Hukum Mim Sukun",
                "3. Qolqolah",
                "4. Hukum Mim Tasydi & Nun Tasydid",
                "5. Hukum Lam Ta'rif",
                "6. Macam-macam Idghom"
        );

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TajwidAdapter(itemList));
    }
}
