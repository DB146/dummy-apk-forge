package p5;

import I2.C0330t;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* renamed from: p5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853d implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f23053a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23054b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f23055c = new float[16];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f23056d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final Display f23057e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1852c[] f23058f;
    public boolean g;

    public C1853d(Display display, InterfaceC1852c... interfaceC1852cArr) {
        this.f23057e = display;
        this.f23058f = interfaceC1852cArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i7;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f23053a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f23057e.getRotation();
        float[] fArr3 = this.f23054b;
        if (rotation != 0) {
            int i10 = 129;
            if (rotation != 1) {
                i7 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i10 = 130;
                    i7 = 1;
                }
            } else {
                i7 = 129;
                i10 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i10, i7, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f23056d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f4 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z8 = this.g;
        float[] fArr5 = this.f23055c;
        if (!z8) {
            C0330t.h(fArr5, fArr2);
            this.g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        InterfaceC1852c[] interfaceC1852cArr = this.f23058f;
        for (int i11 = 0; i11 < 2; i11++) {
            interfaceC1852cArr[i11].a(fArr2, f4);
        }
    }
}
