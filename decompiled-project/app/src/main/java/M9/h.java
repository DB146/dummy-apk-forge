package M9;

import java.util.List;
import jb.InterfaceC1392c;
import jb.InterfaceC1394e;
import jb.InterfaceC1395f;

/* loaded from: classes2.dex */
public final class h implements InterfaceC1394e, InterfaceC1392c, InterfaceC1395f {

    /* renamed from: b, reason: collision with root package name */
    public static final h f6862b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f6863c = new h(1);

    /* renamed from: d, reason: collision with root package name */
    public static final h f6864d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f6865e = new h(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f6866f = new h(4);

    /* renamed from: u, reason: collision with root package name */
    public static final h f6867u = new h(5);

    /* renamed from: v, reason: collision with root package name */
    public static final h f6868v = new h(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6869a;

    public /* synthetic */ h(int i7) {
        this.f6869a = i7;
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        switch (this.f6869a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                return it;
            case 1:
                List it2 = (List) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                return it2;
            case 2:
                List it3 = (List) obj;
                kotlin.jvm.internal.l.e(it3, "it");
                return it3;
            case 3:
            default:
                Integer count = (Integer) obj;
                kotlin.jvm.internal.l.e(count, "count");
                return Boolean.valueOf(count.intValue() > 0);
            case 4:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                return gb.p.c(0);
        }
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        List it = (List) obj;
        kotlin.jvm.internal.l.e(it, "it");
        return !it.isEmpty();
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable th) {
        kotlin.jvm.internal.l.e(th, "<unused var>");
        return num.intValue() < 3;
    }
}
