package I2;

import android.database.SQLException;
import java.util.Set;

/* loaded from: classes.dex */
public final class V extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f5089a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f5091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(c0 c0Var, Hb.d dVar) {
        super(2, dVar);
        this.f5091c = c0Var;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        V v10 = new V(this.f5091c, dVar);
        v10.f5090b = obj;
        return v10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((M) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        M m10;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f5089a;
        Eb.x xVar = Eb.x.f3893a;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                m10 = (M) this.f5090b;
                this.f5090b = m10;
                this.f5089a = 1;
                obj = m10.a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                    return (Set) obj;
                }
                m10 = (M) this.f5090b;
                com.bumptech.glide.c.c0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return xVar;
            }
            L l10 = L.f5058b;
            U u3 = new U(this.f5091c, null);
            this.f5090b = null;
            this.f5089a = 2;
            obj = m10.d(l10, u3, this);
            if (obj == aVar) {
                return aVar;
            }
            return (Set) obj;
        } catch (SQLException unused) {
            return xVar;
        }
    }
}
