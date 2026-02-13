package V4;

import Y5.B;
import android.net.Uri;
import android.os.SystemClock;
import i2.C1312U;
import java.util.HashMap;
import java.util.List;
import n5.D;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f10032a;

    public a(c cVar) {
        this.f10032a = cVar;
    }

    @Override // V4.q
    public final void a() {
        this.f10032a.f10051e.remove(this);
    }

    @Override // V4.q
    public final boolean b(Uri uri, A7.a aVar, boolean z8) {
        HashMap hashMap;
        b bVar;
        c cVar = this.f10032a;
        if (cVar.f10058z == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f10056x;
            int i7 = D.f21141a;
            List list = lVar.f10109e;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f10050d;
                if (i10 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((k) list.get(i10)).f10101a);
                if (bVar2 != null && elapsedRealtime < bVar2.f10040v) {
                    i11++;
                }
                i10++;
            }
            C1312U c1312u = new C1312U(1, 0, cVar.f10056x.f10109e.size(), i11);
            cVar.f10049c.getClass();
            D4.e c10 = B.c(c1312u, aVar);
            if (c10 != null && c10.f3224a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, c10.f3225b);
            }
        }
        return false;
    }
}
