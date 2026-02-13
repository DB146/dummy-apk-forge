package O1;

import Db.q;
import Y5.C0660y;
import kotlin.jvm.internal.m;
import rc.z;
import y6.C2399e;

/* loaded from: classes.dex */
public final class e extends m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f7431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i7) {
        super(0);
        this.f7430a = i7;
        this.f7431b = fVar;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f7430a) {
            case 0:
                f fVar = this.f7431b;
                z zVar = (z) fVar.f7436c.invoke();
                if (sc.c.a(zVar) != -1) {
                    return C0660y.a(zVar.f24007a.E(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f7436c + ", instead got " + zVar).toString());
            default:
                C2399e c2399e = f.f7433f;
                f fVar2 = this.f7431b;
                synchronized (c2399e) {
                    f.f7432e.remove(((z) fVar2.f7437d.getValue()).f24007a.E());
                }
                return q.f3365a;
        }
    }
}
