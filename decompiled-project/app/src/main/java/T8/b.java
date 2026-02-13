package T8;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class b implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public q9.h f9369a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f9370b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z8 = false;
        float f4 = sensorEvent.values[0];
        if (this.f9369a != null) {
            if (f4 <= 45.0f) {
                this.f9370b.post(new a(0, this, true));
            } else if (f4 >= 450.0f) {
                this.f9370b.post(new a(0, this, z8));
            }
        }
    }
}
