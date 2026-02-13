package q9;

import A4.s;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p9.r;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f23577m = 0;

    /* renamed from: a, reason: collision with root package name */
    public Camera f23578a;

    /* renamed from: b, reason: collision with root package name */
    public Camera.CameraInfo f23579b;

    /* renamed from: c, reason: collision with root package name */
    public C1908b f23580c;

    /* renamed from: d, reason: collision with root package name */
    public T8.b f23581d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23582e;

    /* renamed from: f, reason: collision with root package name */
    public String f23583f;

    /* renamed from: h, reason: collision with root package name */
    public s f23584h;

    /* renamed from: i, reason: collision with root package name */
    public r f23585i;
    public r j;
    public i g = new i();
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final g f23586l = new g(this);

    public h(Context context) {
    }

    public final int a() {
        int i7 = this.f23584h.f470a;
        int i10 = 0;
        if (i7 != 0) {
            if (i7 == 1) {
                i10 = 90;
            } else if (i7 == 2) {
                i10 = 180;
            } else if (i7 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f23579b;
        int i11 = cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i10) % 360)) % 360 : ((cameraInfo.orientation - i10) + 360) % 360;
        Log.i("h", "Camera Display Orientation: " + i11);
        return i11;
    }

    public final void b() {
        if (this.f23578a == null) {
            throw new RuntimeException("Camera not open");
        }
        try {
            int a9 = a();
            this.k = a9;
            this.f23578a.setDisplayOrientation(a9);
        } catch (Exception unused) {
            Log.w("h", "Failed to set rotation.");
        }
        try {
            d(false);
        } catch (Exception unused2) {
            try {
                d(true);
            } catch (Exception unused3) {
                Log.w("h", "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f23578a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.j = this.f23585i;
        } else {
            this.j = new r(previewSize.width, previewSize.height);
        }
        this.f23586l.f23575b = this.j;
    }

    public final void c() {
        int n6 = E6.b.n(this.g.f23587a);
        Camera open = n6 == -1 ? null : Camera.open(n6);
        this.f23578a = open;
        if (open == null) {
            throw new RuntimeException("Failed to open camera");
        }
        int n8 = E6.b.n(this.g.f23587a);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        this.f23579b = cameraInfo;
        Camera.getCameraInfo(n8, cameraInfo);
    }

    public final void d(boolean z8) {
        String str;
        Camera.Parameters parameters = this.f23578a.getParameters();
        String str2 = this.f23583f;
        if (str2 == null) {
            this.f23583f = parameters.flatten();
        } else {
            parameters.unflatten(str2);
        }
        if (parameters == null) {
            Log.w("h", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("h", "Initial camera parameters: " + parameters.flatten());
        if (z8) {
            Log.w("h", "In camera config safe mode -- most settings will not be honored");
        }
        this.g.getClass();
        int i7 = c.f23558a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a9 = c.a("focus mode", supportedFocusModes, "auto");
        if (!z8 && a9 == null) {
            a9 = c.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a9 != null) {
            if (a9.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(a9));
            } else {
                parameters.setFocusMode(a9);
            }
        }
        if (!z8) {
            c.b(parameters, false);
            this.g.getClass();
            this.g.getClass();
            this.g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new r(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new r(size.width, size.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f23585i = null;
        } else {
            s sVar = this.f23584h;
            int i10 = this.k;
            if (i10 == -1) {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
            boolean z10 = i10 % 180 != 0;
            r rVar = (r) sVar.f471b;
            if (rVar == null) {
                rVar = null;
            } else if (z10) {
                rVar = new r(rVar.f23215b, rVar.f23214a);
            }
            l lVar = (l) sVar.f472c;
            lVar.getClass();
            if (rVar != null) {
                Collections.sort(arrayList, new k(lVar, rVar));
            }
            Log.i("l", "Viewfinder size: " + rVar);
            Log.i("l", "Preview in order of preference: " + arrayList);
            r rVar2 = (r) arrayList.get(0);
            this.f23585i = rVar2;
            parameters.setPreviewSize(rVar2.f23214a, rVar2.f23215b);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb2 = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                str = "[]";
            } else {
                StringBuilder sb3 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb3.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb3.append(", ");
                    }
                }
                sb3.append(']');
                str = sb3.toString();
            }
            sb2.append(str);
            Log.i("CameraConfiguration", sb2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next = it2.next();
                    int i11 = next[0];
                    int i12 = next[1];
                    if (i11 >= 10000 && i12 <= 20000) {
                        iArr = next;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("h", "Final camera parameters: " + parameters.flatten());
        this.f23578a.setParameters(parameters);
    }

    public final void e(boolean z8) {
        String flashMode;
        Camera camera = this.f23578a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z8 != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    C1908b c1908b = this.f23580c;
                    if (c1908b != null) {
                        c1908b.c();
                    }
                    Camera.Parameters parameters2 = this.f23578a.getParameters();
                    c.b(parameters2, z8);
                    this.g.getClass();
                    this.f23578a.setParameters(parameters2);
                    C1908b c1908b2 = this.f23580c;
                    if (c1908b2 != null) {
                        c1908b2.f23552a = false;
                        c1908b2.b();
                    }
                }
            } catch (RuntimeException e2) {
                Log.e("h", "Failed to set torch", e2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, T8.b] */
    public final void f() {
        Camera camera = this.f23578a;
        if (camera == null || this.f23582e) {
            return;
        }
        camera.startPreview();
        this.f23582e = true;
        this.f23580c = new C1908b(this.f23578a, this.g);
        i iVar = this.g;
        ?? obj = new Object();
        obj.f9369a = this;
        obj.f9370b = new Handler();
        this.f23581d = obj;
        iVar.getClass();
    }
}
