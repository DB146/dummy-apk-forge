package p5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import n5.D;
import o5.o;

/* loaded from: classes.dex */
public final class l extends GLSurfaceView {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f23100z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f23101a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f23102b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f23103c;

    /* renamed from: d, reason: collision with root package name */
    public final C1853d f23104d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f23105e;

    /* renamed from: f, reason: collision with root package name */
    public final i f23106f;

    /* renamed from: u, reason: collision with root package name */
    public SurfaceTexture f23107u;

    /* renamed from: v, reason: collision with root package name */
    public Surface f23108v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23109w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23110x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f23111y;

    public l(Context context) {
        super(context, null);
        this.f23101a = new CopyOnWriteArrayList();
        this.f23105e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f23102b = sensorManager;
        Sensor defaultSensor = D.f21141a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f23103c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f23106f = iVar;
        k kVar = new k(this, iVar);
        View.OnTouchListener mVar = new m(context, kVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f23104d = new C1853d(windowManager.getDefaultDisplay(), mVar, kVar);
        this.f23109w = true;
        setEGLContextClientVersion(2);
        setRenderer(kVar);
        setOnTouchListener(mVar);
    }

    public final void a() {
        boolean z8 = this.f23109w && this.f23110x;
        Sensor sensor = this.f23103c;
        if (sensor == null || z8 == this.f23111y) {
            return;
        }
        C1853d c1853d = this.f23104d;
        SensorManager sensorManager = this.f23102b;
        if (z8) {
            sensorManager.registerListener(c1853d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c1853d);
        }
        this.f23111y = z8;
    }

    public InterfaceC1850a getCameraMotionListener() {
        return this.f23106f;
    }

    public o getVideoFrameMetadataListener() {
        return this.f23106f;
    }

    public Surface getVideoSurface() {
        return this.f23108v;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23105e.post(new k1.a(this, 5));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f23110x = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f23110x = true;
        a();
    }

    public void setDefaultStereoMode(int i7) {
        this.f23106f.f23084y = i7;
    }

    public void setUseSensorRotation(boolean z8) {
        this.f23109w = z8;
        a();
    }
}
