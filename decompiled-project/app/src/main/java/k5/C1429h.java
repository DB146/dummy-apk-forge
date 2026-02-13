package k5;

import N6.H;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import n5.AbstractC1705a;
import n5.D;

/* renamed from: k5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429h extends w {

    /* renamed from: A, reason: collision with root package name */
    public boolean f18895A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f18896B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f18897C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18898D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f18899E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18900F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f18901G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18902H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f18903I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f18904J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f18905K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f18906M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f18907N;

    /* renamed from: O, reason: collision with root package name */
    public final SparseArray f18908O;

    /* renamed from: P, reason: collision with root package name */
    public final SparseBooleanArray f18909P;

    public C1429h() {
        this.f18908O = new SparseArray();
        this.f18909P = new SparseBooleanArray();
        d();
    }

    public C1429h(Context context) {
        Point point;
        String[] split;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i7 = D.f21141a;
        if (i7 >= 19 && ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f18985t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f18984s = H.K(i7 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = (i7 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && D.L(context)) {
            String D10 = i7 < 28 ? D.D("sys.display-size") : D.D("vendor.display-size");
            if (!TextUtils.isEmpty(D10)) {
                try {
                    split = D10.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        c(point.x, point.y);
                        this.f18908O = new SparseArray();
                        this.f18909P = new SparseBooleanArray();
                        d();
                    }
                }
                AbstractC1705a.t("Util", "Invalid display size: " + D10);
            }
            if ("Sony".equals(D.f21143c) && D.f21144d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                c(point.x, point.y);
                this.f18908O = new SparseArray();
                this.f18909P = new SparseBooleanArray();
                d();
            }
        }
        point = new Point();
        if (i7 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i7 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        c(point.x, point.y);
        this.f18908O = new SparseArray();
        this.f18909P = new SparseBooleanArray();
        d();
    }

    public C1429h(i iVar) {
        b(iVar);
        this.f18895A = iVar.f18911O;
        this.f18896B = iVar.f18912P;
        this.f18897C = iVar.f18913Q;
        this.f18898D = iVar.f18914R;
        this.f18899E = iVar.f18915S;
        this.f18900F = iVar.f18916T;
        this.f18901G = iVar.f18917U;
        this.f18902H = iVar.f18918V;
        this.f18903I = iVar.f18919W;
        this.f18904J = iVar.f18920X;
        this.f18905K = iVar.f18921Y;
        this.L = iVar.f18922Z;
        this.f18906M = iVar.f18923a0;
        this.f18907N = iVar.f18924b0;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray2 = iVar.f18925c0;
            if (i7 >= sparseArray2.size()) {
                this.f18908O = sparseArray;
                this.f18909P = iVar.f18926d0.clone();
                return;
            } else {
                sparseArray.put(sparseArray2.keyAt(i7), new HashMap((Map) sparseArray2.valueAt(i7)));
                i7++;
            }
        }
    }

    @Override // k5.w
    public final w c(int i7, int i10) {
        super.c(i7, i10);
        return this;
    }

    public final void d() {
        this.f18895A = true;
        this.f18896B = false;
        this.f18897C = true;
        this.f18898D = false;
        this.f18899E = true;
        this.f18900F = false;
        this.f18901G = false;
        this.f18902H = false;
        this.f18903I = false;
        this.f18904J = true;
        this.f18905K = true;
        this.L = false;
        this.f18906M = true;
        this.f18907N = false;
    }

    public final void e(int i7) {
        this.f18991z.remove(Integer.valueOf(i7));
    }
}
