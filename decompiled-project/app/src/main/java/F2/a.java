package F2;

import P4.B;
import android.content.Intent;
import android.content.IntentSender;
import android.util.Pair;
import c.C0865i;
import ea.C1111f;
import f.C1121e;
import f.InterfaceC1118b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m4.C1584n0;
import n5.i;
import n5.k;
import r4.C1941m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4036d;

    public /* synthetic */ a(Object obj, int i7, Object obj2, int i10) {
        this.f4033a = i10;
        this.f4035c = obj;
        this.f4034b = i7;
        this.f4036d = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i7, int i10) {
        this.f4033a = i10;
        this.f4035c = obj;
        this.f4036d = obj2;
        this.f4034b = i7;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [r4.n, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4033a) {
            case 0:
                ((b) this.f4035c).f4037a.j(this.f4034b, (Serializable) this.f4036d);
                return;
            case 1:
                Serializable serializable = (Serializable) ((R7.a) this.f4036d).f8927b;
                C0865i c0865i = (C0865i) this.f4035c;
                String str = (String) c0865i.f14031a.get(Integer.valueOf(this.f4034b));
                if (str == null) {
                    return;
                }
                C1121e c1121e = (C1121e) c0865i.f14035e.get(str);
                if ((c1121e != null ? c1121e.f16909a : null) == null) {
                    c0865i.g.remove(str);
                    c0865i.f14036f.put(str, serializable);
                    return;
                } else {
                    InterfaceC1118b interfaceC1118b = c1121e.f16909a;
                    if (c0865i.f14034d.remove(str)) {
                        interfaceC1118b.h(serializable);
                        return;
                    }
                    return;
                }
            case 2:
                ((C0865i) this.f4035c).a(this.f4034b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f4036d));
                return;
            case 3:
                n4.f fVar = (n4.f) ((C1584n0) ((C1111f) this.f4035c).f16838c).f20449i;
                Pair pair = (Pair) this.f4036d;
                fVar.x(((Integer) pair.first).intValue(), (B) pair.second, this.f4034b);
                return;
            case 4:
                Iterator it = ((CopyOnWriteArraySet) this.f4035c).iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!kVar.f21181d) {
                        int i7 = this.f4034b;
                        if (i7 != -1) {
                            kVar.f21179b.c(i7);
                        }
                        kVar.f21180c = true;
                        ((i) this.f4036d).invoke(kVar.f21178a);
                    }
                }
                return;
            default:
                C1941m c1941m = (C1941m) this.f4035c;
                c1941m.getClass();
                this.f4036d.x(c1941m.f23771a, c1941m.f23772b, this.f4034b);
                return;
        }
    }
}
