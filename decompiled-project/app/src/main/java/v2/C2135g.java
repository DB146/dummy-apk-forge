package v2;

import W1.K;
import android.content.Context;
import java.util.Iterator;

/* renamed from: v2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2135g implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24975a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f24976b;

    public /* synthetic */ C2135g(u uVar, int i7) {
        this.f24975a = i7;
        this.f24976b = uVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Rb.a, kotlin.jvm.internal.j] */
    @Override // Rb.a
    public final Object invoke() {
        int i7;
        switch (this.f24975a) {
            case 0:
                u uVar = this.f24976b;
                K k = uVar.f25030f;
                boolean z8 = false;
                if (uVar.g) {
                    Eb.l lVar = uVar.f25026b.f26770f;
                    if (lVar == null || !lVar.isEmpty()) {
                        Iterator it = lVar.iterator();
                        i7 = 0;
                        while (it.hasNext()) {
                            if (!(((C2133e) it.next()).f24967b instanceof r) && (i7 = i7 + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 1) {
                        z8 = true;
                    }
                }
                k.f14068a = z8;
                ?? r02 = k.f14070c;
                if (r02 != 0) {
                    r02.invoke();
                }
                return Db.q.f3365a;
            default:
                u uVar2 = this.f24976b;
                uVar2.getClass();
                C2128B navigatorProvider = uVar2.f25026b.f26780s;
                Context context = uVar2.f25025a;
                kotlin.jvm.internal.l.e(context, "context");
                kotlin.jvm.internal.l.e(navigatorProvider, "navigatorProvider");
                return new Object();
        }
    }
}
