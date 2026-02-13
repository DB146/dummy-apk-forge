package A8;

import M1.InterfaceC0394i;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class M extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n6, String str, Hb.d dVar) {
        super(2, dVar);
        this.f565b = n6;
        this.f566c = str;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new M(this.f565b, this.f566c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f564a;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                InterfaceC0394i interfaceC0394i = this.f565b.f568b;
                L l10 = new L(this.f566c, null);
                this.f564a = 1;
                if (interfaceC0394i.a(new Q1.i(l10, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
        } catch (IOException e2) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e2);
        }
        return Db.q.f3365a;
    }
}
