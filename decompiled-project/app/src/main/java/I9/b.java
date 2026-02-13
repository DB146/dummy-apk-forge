package I9;

import java.util.List;
import jb.InterfaceC1392c;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import ob.C1838f;

/* loaded from: classes2.dex */
public final class b implements InterfaceC1393d, InterfaceC1394e, InterfaceC1392c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5312b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f5313c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f5314d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f5315e = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5316a;

    public /* synthetic */ b(int i7) {
        this.f5316a = i7;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f5316a) {
            case 0:
                Throwable it = (Throwable) obj;
                l.e(it, "it");
                return;
            default:
                Throwable it2 = (Throwable) obj;
                l.e(it2, "it");
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        List it = (List) obj;
        l.e(it, "it");
        return C1838f.f22215a;
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable t22) {
        l.e(t22, "t2");
        return num.intValue() < 3;
    }
}
