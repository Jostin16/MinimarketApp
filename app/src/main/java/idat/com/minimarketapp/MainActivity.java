package idat.com.minimarketapp;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,PantallaInicioActivity.class);
                startActivity(intent); //para que se pase a la otra ventana
                finish(); //que se muestre solo al abrir la app
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,3000); //tiempo para que pase a la siguiente pantalla
    }
}
