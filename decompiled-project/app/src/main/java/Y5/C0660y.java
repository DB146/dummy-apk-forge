package Y5;

import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import com.google.android.gms.common.api.internal.InterfaceC0979u;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzrj;
import ea.C1111f;
import java.io.File;
import java.util.List;
import jb.InterfaceC1393d;
import o2.InterfaceC1780b;
import rc.C1967k;
import t.AbstractC2014b;
import t.C2013a;

/* renamed from: Y5.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0660y implements InterfaceC0650t, InterfaceC0979u, InterfaceC1780b, InterfaceC1393d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C0660y f11996b = new C0660y(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C0660y f11997c = new C0660y(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C0660y f11998d = new C0660y(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C0660y f11999e = new C0660y(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C0660y f12000f = new C0660y(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0660y f12001u = new C0660y(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0660y f12002v = new C0660y(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12003a;

    public /* synthetic */ C0660y(int i7) {
        this.f12003a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rc.h] */
    public static rc.z a(String str, boolean z8) {
        kotlin.jvm.internal.l.e(str, "<this>");
        C1967k c1967k = sc.c.f24359a;
        ?? obj = new Object();
        obj.r0(str);
        return sc.c.d(obj, z8);
    }

    public static rc.z b(File file) {
        String str = rc.z.f24006b;
        String file2 = file.toString();
        kotlin.jvm.internal.l.d(file2, "toString(...)");
        return a(file2, false);
    }

    public static Path c(float f4, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f4, f10);
        path.lineTo(f11, f12);
        return path;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th;
        if (th == null) {
            th = new NullPointerException();
        }
        com.bumptech.glide.d.t(new RuntimeException(str, th));
    }

    public void d(C1111f c1111f, float f4) {
        C2013a c2013a = (C2013a) ((Drawable) c1111f.f16837b);
        CardView cardView = (CardView) c1111f.f16838c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f4 != c2013a.f24405e || c2013a.f24406f != useCompatPadding || c2013a.g != preventCornerOverlap) {
            c2013a.f24405e = f4;
            c2013a.f24406f = useCompatPadding;
            c2013a.g = preventCornerOverlap;
            c2013a.b(null);
            c2013a.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c1111f.A(0, 0, 0, 0);
            return;
        }
        C2013a c2013a2 = (C2013a) ((Drawable) c1111f.f16837b);
        float f10 = c2013a2.f24405e;
        float f11 = c2013a2.f24401a;
        int ceil = (int) Math.ceil(AbstractC2014b.a(f10, f11, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC2014b.b(f10, f11, cardView.getPreventCornerOverlap()));
        c1111f.A(ceil, ceil2, ceil, ceil2);
    }

    @Override // Y5.InterfaceC0650t
    public /* synthetic */ Object zza() {
        switch (this.f12003a) {
            case 0:
                List list = F.f11304a;
                return zzoy.zzaw();
            case 1:
                List list2 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzX());
            case 2:
                List list3 = F.f11304a;
                return Boolean.valueOf(zzpq.zzc());
            case 3:
                List list4 = F.f11304a;
                return Boolean.valueOf(zzrj.zza());
            case 4:
                List list5 = F.f11304a;
                return Boolean.valueOf(zzql.zzg());
            case 5:
                List list6 = F.f11304a;
                return Boolean.valueOf(zzql.zzf());
            default:
                List list7 = F.f11304a;
                return Integer.valueOf((int) zzoy.zzan());
        }
    }
}
