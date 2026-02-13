package v1;

import ea.C1111f;
import java.util.ArrayList;
import u.T;
import x1.InterfaceC2257a;

/* loaded from: classes.dex */
public final class e implements InterfaceC2257a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24946b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f24945a = i7;
        this.f24946b = obj;
    }

    @Override // x1.InterfaceC2257a
    public final void accept(Object obj) {
        switch (this.f24945a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((C1111f) this.f24946b).v(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f24951c) {
                    try {
                        T t5 = g.f24952d;
                        ArrayList arrayList = (ArrayList) t5.get((String) this.f24946b);
                        if (arrayList == null) {
                            return;
                        }
                        t5.remove((String) this.f24946b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((InterfaceC2257a) arrayList.get(i7)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
