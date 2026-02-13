package B0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import kc.C1441d;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1839a;

    /* renamed from: b, reason: collision with root package name */
    public static final Y f1828b = new Y(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final Y f1829c = new Y(0, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final Y f1830d = new Y(0, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final Y f1831e = new Y(0, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final Y f1832f = new Y(0, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final Y f1833u = new Y(0, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final Y f1834v = new Y(0, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final Y f1835w = new Y(0, 7);

    /* renamed from: x, reason: collision with root package name */
    public static final Y f1836x = new Y(0, 8);

    /* renamed from: y, reason: collision with root package name */
    public static final Y f1837y = new Y(0, 9);

    /* renamed from: z, reason: collision with root package name */
    public static final Y f1838z = new Y(0, 10);

    /* renamed from: A, reason: collision with root package name */
    public static final Y f1811A = new Y(0, 11);

    /* renamed from: B, reason: collision with root package name */
    public static final Y f1812B = new Y(0, 12);

    /* renamed from: C, reason: collision with root package name */
    public static final Y f1813C = new Y(0, 13);

    /* renamed from: D, reason: collision with root package name */
    public static final Y f1814D = new Y(0, 14);

    /* renamed from: E, reason: collision with root package name */
    public static final Y f1815E = new Y(0, 15);

    /* renamed from: F, reason: collision with root package name */
    public static final Y f1816F = new Y(0, 16);

    /* renamed from: G, reason: collision with root package name */
    public static final Y f1817G = new Y(0, 17);

    /* renamed from: H, reason: collision with root package name */
    public static final Y f1818H = new Y(0, 18);

    /* renamed from: I, reason: collision with root package name */
    public static final Y f1819I = new Y(0, 19);

    /* renamed from: J, reason: collision with root package name */
    public static final Y f1820J = new Y(0, 20);

    /* renamed from: K, reason: collision with root package name */
    public static final Y f1821K = new Y(0, 21);
    public static final Y L = new Y(0, 22);

    /* renamed from: M, reason: collision with root package name */
    public static final Y f1822M = new Y(0, 23);

    /* renamed from: N, reason: collision with root package name */
    public static final Y f1823N = new Y(0, 24);

    /* renamed from: O, reason: collision with root package name */
    public static final Y f1824O = new Y(0, 25);

    /* renamed from: P, reason: collision with root package name */
    public static final Y f1825P = new Y(0, 26);

    /* renamed from: Q, reason: collision with root package name */
    public static final Y f1826Q = new Y(0, 27);

    /* renamed from: R, reason: collision with root package name */
    public static final Y f1827R = new Y(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i7, int i10) {
        super(i7);
        this.f1839a = i10;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Jb.i, Rb.e] */
    @Override // Rb.a
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f1839a) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    C1441d c1441d = cc.P.f14498a;
                    choreographer = (Choreographer) cc.F.F(hc.o.f17967a, new Jb.i(2, null));
                }
                C0182i0 c0182i0 = new C0182i0(choreographer, com.bumptech.glide.d.f(Looper.getMainLooper()));
                return E6.b.w(c0182i0, c0182i0.f1920z);
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 9:
                AbstractC0207v0.b("LocalAutofillManager");
                throw null;
            case 10:
                AbstractC0207v0.b("LocalAutofillTree");
                throw null;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                AbstractC0207v0.b("LocalClipboard");
                throw null;
            case 12:
                AbstractC0207v0.b("LocalClipboardManager");
                throw null;
            case 13:
                return Boolean.TRUE;
            case 14:
                AbstractC0207v0.b("LocalDensity");
                throw null;
            case 15:
                AbstractC0207v0.b("LocalFocusManager");
                throw null;
            case 16:
                AbstractC0207v0.b("LocalFontFamilyResolver");
                throw null;
            case 17:
                AbstractC0207v0.b("LocalFontLoader");
                throw null;
            case 18:
                AbstractC0207v0.b("LocalGraphicsContext");
                throw null;
            case 19:
                AbstractC0207v0.b("LocalHapticFeedback");
                throw null;
            case 20:
                AbstractC0207v0.b("LocalInputManager");
                throw null;
            case 21:
                AbstractC0207v0.b("LocalLayoutDirection");
                throw null;
            case 22:
                return null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return null;
            case 26:
                AbstractC0207v0.b("LocalTextToolbar");
                throw null;
            case 27:
                AbstractC0207v0.b("LocalUriHandler");
                throw null;
            default:
                AbstractC0207v0.b("LocalViewConfiguration");
                throw null;
        }
    }
}
