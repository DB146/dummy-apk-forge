package L7;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class u implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0385e f6397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6398c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f6399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterable f6400e;

    public /* synthetic */ u(z zVar, C0385e c0385e, Iterable iterable, long j, Iterable iterable2, int i7) {
        this.f6396a = i7;
        this.f6399d = zVar;
        this.f6397b = c0385e;
        this.f6398c = j;
        this.f6400e = iterable2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6396a) {
            case 0:
                C0385e c0385e = this.f6397b;
                z zVar = this.f6399d;
                E e2 = zVar.f6412b;
                long j = this.f6398c;
                Long valueOf = Long.valueOf(j);
                e2.getClass();
                O7.k.c(j > ((Long) e2.f6319c).longValue());
                ArrayList arrayList = (ArrayList) e2.f6318b;
                T7.s sVar = (T7.s) this.f6400e;
                arrayList.add(new D(j, c0385e, sVar));
                e2.f6317a = ((C0381a) e2.f6317a).b(c0385e, sVar);
                e2.f6319c = valueOf;
                return z.a(zVar, new M7.e(M7.d.f6826d, c0385e, sVar));
            default:
                C0385e c0385e2 = this.f6397b;
                z zVar2 = this.f6399d;
                E e10 = zVar2.f6412b;
                long j10 = this.f6398c;
                Long valueOf2 = Long.valueOf(j10);
                e10.getClass();
                O7.k.c(j10 > ((Long) e10.f6319c).longValue());
                ArrayList arrayList2 = (ArrayList) e10.f6318b;
                C0381a c0381a = (C0381a) this.f6400e;
                arrayList2.add(new D(j10, c0385e2, c0381a));
                e10.f6317a = ((C0381a) e10.f6317a).i(c0385e2, c0381a);
                e10.f6319c = valueOf2;
                return z.a(zVar2, new M7.c(M7.d.f6826d, c0385e2, c0381a));
        }
    }
}
