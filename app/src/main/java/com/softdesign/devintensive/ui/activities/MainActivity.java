package com.softdesign.devintensive.ui.activities;

import android.graphics.Color;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";

    protected EditText mEditText;
    protected Button mRedButton, mGreenButton;
    protected int mColorMode;

    /**
     * метод вызывается при создании активити (после изменения конфигураиии/возврата к текущей
     * активности после его уничтожения.
     * <p>
     * в данном методе инициализируются/производится:
     * - UI пользовательский интерфейс (статика)
     * - инициализация статичесхих данных активити
     * - связь данных со списками (инициализация адаптеров)
     * <p>
     * Не запускать длительные операции по работе с данными в OnCreate() !!!
     *
     * @param savedInstanceState - объект со значениями, сохраненными в Bundle-состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        if (savedInstanceState == null) {
            // активити запускается впервые
        } else {
            // активити уже создавалось
        }
    }

    /**
     * метод вызывается при старте активити перед моментом того как UI станет доступна пользователю,
     * как правило в данном методе происходит регистрация подписки на события, остановка которых была
     * произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * метод вызывается когда активити становится доступна пользователю для взаимодействия,
     * в данном методе как правило происходит запуск анимаций/аудио/видео/запуск BroadcastReceiver
     * необходимых для реализации UI логики/запуска выполнения потоков и т.д.
     * метод должен быть максимально легковесным для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * метод вызывается когда текущая активити теряет фокус, но остается видимой (всплытие
     * диалогового окна/частичное перекрытие другой активити/ и т.д.)
     * в данном методе реализуют сохранение легковесных UI данных/анимаций/аудио/видео и т.д.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * метод вызывается когда активити становится невидимым для пользователя.
     * в данном методе происходит отписка от событий, остановка сложных анимаций, сложные операции по
     * сохранению данных/прерывание запущенных потоков/и т.д.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * метод вызывается по окончании работы активити, когда это происходит системно или после вызова
     * метода finish()
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * метод вызывается при рестарте активити/возобновлении работы после вызова метода onStopO
     * в данном метод» реализуется специфическая бизнес логика которая должна быть реализована именно
     * при рестарте активности - например запрос к серверу грторые необходимо вызывать при возвращении
     * из другой активности (обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/специфическая бизнес логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
        }
        Log.d(TAG, "mColorMode = " + mColorMode);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
