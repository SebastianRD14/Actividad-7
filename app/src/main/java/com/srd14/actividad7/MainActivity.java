package com.srd14.actividad7;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerProducts;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupProducts();
        setupRecyclerView();
    }

    private void initViews() {
        recyclerProducts = findViewById(R.id.recyclerProducts);
    }

    private void setupProducts() {
        productList = new ArrayList<>();
        productList.add(new Product(
                "🎮 Consola Playstation 5",
                "La consola de nueva generación de Sony con gráficos 4K, SSD ultrarrápido y mando DualSense inmersivo.",
                "https://m.media-amazon.com/images/I/51fM0CKG+HL._AC_SX679_.jpg",
                "https://www.amazon.com.mx/PlayStation®5-Digital-Slim-Renewed-Premium/dp/B0CW3QC1B8/ref=asc_df_B0CW3QC1B8?mcid=466cebd8063c35e39bb3091837fc9ed2&tag=gledskshopmx-20&linkCode=df0&hvadid=709846429626&hvpos=&hvnetw=g&hvrand=6314900258845626331&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9138212&hvtargid=pla-2379598048021&psc=1&language=es_MX&gad_source=1"
        ));
        productList.add(new Product(
                "📺 Televisor 4k Samsung",
                "Pantalla UHD de gran tamaño con colores vibrantes, HDR y conexión inteligente a tus apps favoritas.",
                "https://m.media-amazon.com/images/I/61TTDZiDz6L._AC_SX679_.jpg",
                "https://www.amazon.com.mx/SAMSUNG-Procesador-Volumen-Quantum-Samsung/dp/B0F4HK1WBT/ref=asc_df_B0F4HK1WBT?mcid=2830f2cdeacb3705ba11b5336dd0534e&tag=gledskshopmx-20&linkCode=df0&hvadid=709878789261&hvpos=&hvnetw=g&hvrand=17564337618388514964&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9138212&hvtargid=pla-2423885381987&language=es_MX&gad_source=1&th=1"
        ));
        productList.add(new Product(
                "🔋 Power Bank",
                "Batería portátil de alta capacidad para cargar tu smartphone, tablet o audífonos en cualquier lugar.",
                "https://m.media-amazon.com/images/I/51vN5HSukQL._AC_SY879_.jpg",
                "https://www.amazon.com.mx/UGREEN-10000mAh-Inalámbrico-Magnético-Compatible/dp/B0CH33F5P2/ref=asc_df_B0CH33F5P2?mcid=7900360630c2380b90a4b4392f66cc0b&tag=gledskshopmx-20&linkCode=df0&hvadid=709975802831&hvpos=&hvnetw=g&hvrand=16860148855396106774&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9138212&hvtargid=pla-2279531848509&language=es_MX&gad_source=1&th=1"
        ));
        productList.add(new Product(
                "🐉 Videojuego Dragon Ball: Sparking! ZERO",
                "Nuevo título de lucha con combates intensos, transformaciones épicas y gráficos espectaculares en 3D.",
                "https://m.media-amazon.com/images/I/81QsM5cNn5L._AC_SX679_.jpg",
                "https://www.amazon.com.mx/Bandai-Namco-Entertainment-13064-Dragon/dp/B0CPTBRK93/ref=asc_df_B0CPTBRK93?mcid=8874316c675833b3ae9a76235d18e70a&tag=gledskshopmx-20&linkCode=df0&hvadid=709846429626&hvpos=&hvnetw=g&hvrand=3915068879460883105&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9138212&hvtargid=pla-2273858121961&psc=1&language=es_MX&gad_source=4"
        ));
        productList.add(new Product(
                "🎶 JBL Bocina Portátil",
                "Altavoz compacto con sonido potente, conexión Bluetooth y resistencia al agua para llevar a todas partes.",
                "https://m.media-amazon.com/images/I/61qMO3TS2RL._AC_SX679_.jpg",
                "https://www.amazon.com.mx/JBL-Charge-5-JBL-Bocina-Portátil-Charge-5-Bluetooth-Negro/dp/B08X4YMTPM/ref=asc_df_B08X4YMTPM?mcid=caef77c2ad5134fd827578014e7cd65a&tag=gledskshopmx-20&linkCode=df0&hvadid=709953053678&hvpos=&hvnetw=g&hvrand=3344820055067847442&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9138212&hvtargid=pla-1230613384053&language=es_MX&gad_source=1&th=1"
        ));
    }

    private void setupRecyclerView() {
        productAdapter = new ProductAdapter(this, productList);
        recyclerProducts.setLayoutManager(new LinearLayoutManager(this));
        recyclerProducts.setAdapter(productAdapter);
    }
}