package A9;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.base.leanback.NavDrawerView;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.base.receiver.NetworkChangeReceiver;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.AbstractC1456G;
import o4.C1791e;

/* renamed from: A9.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0163z1 implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1489a;

    public /* synthetic */ C0163z1(int i7) {
        this.f1489a = i7;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, A9.F1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, A9.V2] */
    @Override // Rb.a
    public final Object invoke() {
        Method method = null;
        int i7 = 0;
        switch (this.f1489a) {
            case 0:
                Db.o oVar = NavDrawerView.f15958z;
                ?? obj = new Object();
                if (Build.VERSION.SDK_INT >= 26) {
                    throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
                }
                try {
                    method = ViewGroup.class.getDeclaredMethod("setDefaultFocus", View.class);
                } catch (Exception unused) {
                }
                obj.f822a = method;
                return obj;
            case 1:
                Db.o oVar2 = NavDrawerView.f15958z;
                return new LinkedHashMap();
            case 2:
                Db.o oVar3 = NavDrawerView.f15958z;
                return new AtomicBoolean();
            case 3:
                Db.o oVar4 = SearchView.f16055H;
                ?? obj2 = new Object();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
                }
                try {
                    Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                    obj2.f990a = declaredMethod;
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                    }
                } catch (NoSuchMethodException unused2) {
                }
                try {
                    Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                    obj2.f991b = declaredMethod2;
                    if (declaredMethod2 != null) {
                        declaredMethod2.setAccessible(true);
                    }
                } catch (NoSuchMethodException unused3) {
                }
                try {
                    Method method2 = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                    obj2.f992c = method2;
                    if (method2 != null) {
                        method2.setAccessible(true);
                    }
                } catch (NoSuchMethodException unused4) {
                }
                return obj2;
            case 4:
                C0098j c0098j = new C0098j();
                X x2 = new X();
                x2.c(C0151w1.class, new C0151w1());
                C0108l1 c0108l1 = new C0108l1(1);
                c0108l1.f1470b = null;
                x2.c(N9.a.class, c0108l1);
                c0098j.d(x2);
                return c0098j;
            case 5:
                SimpleDateFormat simpleDateFormat = Aa.w.f1546v2;
                return new LinkedHashMap();
            case 6:
                SimpleDateFormat simpleDateFormat2 = Aa.w.f1546v2;
                return new LinkedHashMap();
            case 7:
                return new AbstractC1456G();
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new AbstractC1456G();
            case 9:
                return new Handler(Looper.getMainLooper());
            case 10:
                C0151w1 c0151w1 = new C0151w1();
                c0151w1.g = false;
                return new C0098j(c0151w1);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new ArrayList();
            case 12:
                C0151w1 c0151w12 = new C0151w1();
                c0151w12.g = false;
                return new C0098j(c0151w12);
            case 13:
                return new LinkedHashMap();
            case 14:
                int i10 = Da.t.f3343y1;
                C0151w1 c0151w13 = new C0151w1();
                c0151w13.g = false;
                return new C0098j(c0151w13);
            case 15:
                return Eb.B.G(new Db.j("Accept", "*/*"));
            case 16:
                return new ArrayList();
            case 17:
                return new C1791e(2, 0, 1, Build.VERSION.SDK_INT >= 29 ? 3 : 1, 0);
            case 18:
                AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(3).setFlags(1).setUsage(1);
                if (Build.VERSION.SDK_INT >= 29) {
                    usage.setAllowedCapturePolicy(3);
                }
                return usage.build();
            case 19:
                int i11 = MobileMainActivity.f16227S;
                return new LinkedHashMap();
            case 20:
                int i12 = MobileMainActivity.f16227S;
                return new LinkedHashMap();
            case 21:
                int i13 = MobileMainActivity.f16227S;
                return fc.Q.c(Boolean.FALSE);
            case 22:
                return new Hc.e(i7);
            case 23:
                WeakReference weakReference = NetworkChangeReceiver.f16114b;
                return new HashMap();
            case 24:
                return Db.q.f3365a;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return Boolean.TRUE;
            case 26:
                return new AbstractC1456G();
            case 27:
                return new LinkedHashMap();
            case 28:
                return new AbstractC1456G();
            default:
                return new AbstractC1456G();
        }
    }
}
