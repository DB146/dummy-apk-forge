package s7;

import B7.d;
import Eb.p;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p5.j;
import x7.n;
import y8.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f24186a;

    public b(d dVar) {
        this.f24186a = dVar;
    }

    public final void a(y8.d dVar) {
        d dVar2 = this.f24186a;
        HashSet hashSet = dVar.f27429a;
        ArrayList arrayList = new ArrayList(p.S(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            y8.c cVar = (y8.c) ((e) it.next());
            String str = cVar.f27424b;
            String str2 = cVar.f27426d;
            String str3 = cVar.f27427e;
            String str4 = cVar.f27425c;
            long j = cVar.f27428f;
            R7.a aVar = n.f26273a;
            arrayList.add(new x7.b(str, str2, str3.length() > 256 ? str3.substring(0, 256) : str3, str4, j));
        }
        synchronized (((U7.a) dVar2.f2215f)) {
            try {
                if (((U7.a) dVar2.f2215f).d(arrayList)) {
                    ((w7.d) dVar2.f2212c).f25820b.a(new j(12, dVar2, ((U7.a) dVar2.f2215f).c()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
