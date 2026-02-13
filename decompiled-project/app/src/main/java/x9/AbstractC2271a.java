package x9;

import Db.o;
import ac.n;
import android.os.Build;
import kotlin.jvm.internal.l;
import wa.f;

/* renamed from: x9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2271a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f26274a = android.support.v4.media.session.b.z(new f(1));

    /* renamed from: b, reason: collision with root package name */
    public static final o f26275b = android.support.v4.media.session.b.z(new f(2));

    /* renamed from: c, reason: collision with root package name */
    public static final o f26276c = android.support.v4.media.session.b.z(new f(3));

    public static String a() {
        String MANUFACTURER = Build.MANUFACTURER;
        l.d(MANUFACTURER, "MANUFACTURER");
        String W10 = n.W("iMedia ({Manufacturer} {Model}; Android {OS_Version})", "{Manufacturer}", MANUFACTURER);
        String MODEL = Build.MODEL;
        l.d(MODEL, "MODEL");
        String W11 = n.W(W10, "{Model}", MODEL);
        String RELEASE = Build.VERSION.RELEASE;
        l.d(RELEASE, "RELEASE");
        return n.W(W11, "{OS_Version}", RELEASE);
    }
}
