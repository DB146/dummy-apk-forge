package A8;

import android.util.Log;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String str, Hb.d dVar) {
        super(2, dVar);
        this.f632b = str;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new b0(this.f632b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f631a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            B8.c cVar = B8.c.f2227a;
            this.f631a = 1;
            obj = cVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        Collection<v7.i> values = ((Map) obj).values();
        String str = this.f632b;
        for (v7.i iVar : values) {
            B8.e eVar = new B8.e(str);
            iVar.getClass();
            String str2 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            v7.h hVar = iVar.f25118b;
            synchronized (hVar) {
                if (!Objects.equals(hVar.f25116c, str)) {
                    v7.h.a(hVar.f25114a, hVar.f25115b, str);
                    hVar.f25116c = str;
                }
            }
            Log.d("SessionLifecycleClient", "Notified " + B8.d.f2229a + " of new session " + str);
        }
        return Db.q.f3365a;
    }
}
