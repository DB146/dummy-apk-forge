package A8;

import android.util.Log;
import fc.InterfaceC1162i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class H extends Jb.i implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    /* renamed from: b, reason: collision with root package name */
    public int f550b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ InterfaceC1162i f551c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Serializable f552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i7, Hb.d dVar, int i10) {
        super(i7, dVar);
        this.f549a = i10;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object[], java.io.Serializable] */
    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        InterfaceC1162i interfaceC1162i = (InterfaceC1162i) obj;
        switch (this.f549a) {
            case 0:
                H h10 = new H(3, (Hb.d) obj3, 0);
                h10.f551c = interfaceC1162i;
                h10.f552d = (Throwable) obj2;
                return h10.invokeSuspend(Db.q.f3365a);
            default:
                H h11 = new H(3, (Hb.d) obj3, 1);
                h11.f551c = interfaceC1162i;
                h11.f552d = (Object[]) obj2;
                return h11.invokeSuspend(Db.q.f3365a);
        }
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        m3.c cVar;
        m3.c cVar2;
        switch (this.f549a) {
            case 0:
                Ib.a aVar = Ib.a.f5345a;
                int i7 = this.f550b;
                if (i7 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    InterfaceC1162i interfaceC1162i = this.f551c;
                    Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f552d);
                    Q1.b bVar = new Q1.b(true);
                    this.f551c = null;
                    this.f550b = 1;
                    if (interfaceC1162i.emit(bVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                return Db.q.f3365a;
            default:
                Ib.a aVar2 = Ib.a.f5345a;
                int i10 = this.f550b;
                if (i10 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    InterfaceC1162i interfaceC1162i2 = this.f551c;
                    m3.c[] cVarArr = (m3.c[]) ((Object[]) this.f552d);
                    int length = cVarArr.length;
                    int i11 = 0;
                    while (true) {
                        cVar = m3.a.f19777a;
                        if (i11 < length) {
                            cVar2 = cVarArr[i11];
                            if (kotlin.jvm.internal.l.a(cVar2, cVar)) {
                                i11++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.f550b = 1;
                    if (interfaceC1162i2.emit(cVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                return Db.q.f3365a;
        }
    }
}
